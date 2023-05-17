var templates;
function loadTemplates(){
	if(templates == undefined){
		templates = {            //object for mapping object to id
		    text: '#jf-text-template',
		    textarea: '#jf-textarea-template',
		    hidden: '#jf-hidden-template',
		    date: '#jf-date-template',
		    submit: '#jf-button-template',
		    email: '#jf-email-template',
		    password: '#jf-password-template',
		    number: '#jf-number-template',
		    select : '#jf-select-template',
		    radio: '#jf-radio-template',
		    checkbox : '#jf-checkbox-template',
		    file : '#jf-file-template',
		    list : '#jf-list-template',
		    datatable: '#jf-datatable-template',
		    form : '#jf-form-template',
			list_header : '#jf-list-header-template',
			list_actions : '#jf-list-actions-template',
			row_actions : '#jf-row-actions-template',
		    list_text: '#list-text-template',
		    list_textarea: '#list-textarea-template',
		    list_date: '#list-date-template',
		    list_email: '#list-email-template',
		    list_password: '#list-password-template',
		    list_number: '#list-number-template',
		    list_select : '#list-select-template',
		    list_radio: '#list-radio-template',
		    list_checkbox : '#list-checkbox-template',
		    list_file : '#list-file-template',
		    group : '#jf-field-group-template',
		    button : '#jf-button-template',
		    form_actions : '#jf-form-actions-template',
		    link : '#jf-link-template',
		    modal : '#jf-modal-template',
		    confirm : '#jf-confirm-template'
		};
	}
}

function JetForm (config) {
	let jetForm = Object.create(JetForm.prototype)
	jetForm.form = config.form;
	jetForm.form.id=config.id;
	jetForm.form.parentId=config.parentId;
	jetForm.form.data={};
	jetForm.form.idField = findIdField(jetForm.form);
  	if(config.data != undefined){
		jetForm.form.data=config.data;
	}
	
	if(config.redirections!=undefined){
		jetForm.form.redirections=config.redirections;
  	}
  
  	window[config.id]=jetForm;
  	return jetForm;
}

JetForm.prototype.setDataKey = function(value) {
	var form = this.form;
	setDataKey(form, value);
}

JetForm.prototype.setDialogMode = function(dialogMode) {
	this.form.dialogMode = (dialogMode == 'true' || dialogMode == 'TRUE');
}
	
JetForm.prototype.render = function() {
	var _this = this;
	var form = _this.form;
	//var data = form.data;
	loadTemplates();
	
	if($('#'+form.id).length==0){
		_this.renderForm();
	}
	
	if(form.idField != undefined && form.idField.value != undefined && form.idField.value != ''){
		_this.readObjectValues();
	}else{
		_this.renderFields();
		_this.renderGroups();
	    _this.renderLists();
	    _this.renderActions();
		_this.loadOptionsFields();
		_this.bindEvents();
		_this.bindValidations();
	}
    
    _this.renderModal();
}

JetForm.prototype.renderModal = function() {
	renderModal(this.form);
}

JetForm.prototype.readObjectValues = function() {
	var field;
	var target;

	var form = this.form;
	var provider = form.providers.selector;
	if(provider != undefined && provider.ajax != undefined){
		callAjax(form, field, target, provider, setFieldValues, console.log);
    }else if(provider != undefined && provider.script != undefined){
		var scriptParams = (provider.scriptParams != undefined? provider.scriptParams: {});
		var data = executeFunctionByName(provider.script, window, scriptParams);
		this.setFieldValues(form, field, target, data);
	}
}

//JetForm.prototype.
function setFieldValues(form, field, action, data){
	//var _this = this;
	//var form = _this.form;
	//console.log(data);
	//console.log(form);
	form.fields.forEach(fld => {
		if(fld.type != 'group' && fld.type != 'list'){
			//console.log(fld.name + " -- "+ data[fld.name]);
			fld.value = data[fld.name];
		}else if(fld.type == 'group'){
			fld.fields.forEach(subfield => {
				subfield.value = data[subfield.name];
			});
		}
	});
	//console.log(form);
	var _this = window[form.id];
	_this.renderFields();
	_this.renderGroups();
    _this.renderLists();
    _this.renderActions();
	_this.loadOptionsFields();
	_this.bindEvents();
	_this.bindValidations();
	
}

JetForm.prototype.renderForm = function() {
	var form = this.form;
	const template = $(templates['form']).html();
    const compiledTemplate = Handlebars.compile(template);
    const html = compiledTemplate(form);
    $('#' + form.parentId).append(html);
}

JetForm.prototype.renderFields = function() {
	var form = this.form;
	// Loop through fields array
    form.fields.forEach(field => {
        if (!(field.group && field.group != '')) {
			var autoWidth=true;
			if(field.type=='group'){
				if(field.auto==undefined || field.auto==true){
					if(field.col==undefined){
						field.col="12";
					}
				}else{
					autoWidth=false;
				}
			}
			if(autoWidth){
	            const template = $(templates[field.type]).html();
	            const compiledTemplate = Handlebars.compile(template);
	            const html = compiledTemplate(field);
	            //console.log(html);
	            $('#' + form.id).append(html);
            }
        }
    });

    // Loop through fields array
    form.fields.forEach(field => {
        if (field.group != undefined && field.group != '') {
            const template = $(templates[field.type]).html();
            const compiledTemplate = Handlebars.compile(template);
            $('<div />', {class:'col'}).append(compiledTemplate(field)).appendTo($('#' + field.group));
        }
    });
}

JetForm.prototype.renderGroups = function() {
	var form = this.form;
	form.fields.forEach(field => {
        if (field.type == "group") {
			
			/*var row;
			var col;
			var colCssClass='col-md-'+(12/field.fields.length);
			if(field.col != undefined){
				colCssClass='col-md-'+field.col;
				col=$('<div />', {class:colCssClass});
				row=$('<div />', {class:'row'});
			}*/
			
			var colClass='col-md-'+(12/field.fields.length);
			
            field.fields.forEach(subfield => {
                const template = $(templates[subfield.type]).html();
                const compiledTemplate = Handlebars.compile(template);
                if(subfield.col != undefined){
					colClass='col-md-'+subfield.col
				}
				//if(col==undefined){
            	$('<div />', {class:colClass}).append(compiledTemplate(subfield)).appendTo($('#' + field.name))
                //}else{
				//	$('<div />', {class:colCssClass}).append(compiledTemplate(subfield)).appendTo(row);
				//}
            });
            /*
            if(row!=undefined){
				row.appendTo(col);
				col.appendTo($('#' + field.name));
			}
			*/
        }
    });
}

JetForm.prototype.renderLists = function() {
	var _this = this;
	var form = this.form;
    form.fields.forEach(field => {
		if (field.type == "list") {
        	_this.renderList(field);
        }
        if(field.type=="group"){
			field.fields.forEach(subfield => {
				if (subfield.type == "list") {
					_this.renderList(subfield);
				}
			});
		}
    });
}

JetForm.prototype.renderList = function(field) {
	var _this = this;
    if (field.type == "list") {
    	if(field.editMode == "inline"){
       		_this.addListRow(field);
       		var td=$('#'+field.name).find('tr').find('td').last();
       		$(td).children('a[name="deleteRow"]').hide();

       	}else if(field.editMode == 'dialog'){
       		_this.initListTable(field, true);
       	}
/*        	}else if(field.editable != '' && !field.editable){
        		initListTable(field, false);
        	}*/
	}
}


JetForm.prototype.renderActions = function() {
	var form = this.form;
    if(form.actions.length>0){
		form.actions.forEach(action => {
			action['formId']=form.id;
		});
	    const template = $(templates['form_actions']).html();
	    const compiledTemplate = Handlebars.compile(template);
	    const html = compiledTemplate(form.actions);
	    
	    $('#' + form.id).append(html);
    }
}

JetForm.prototype.loadOptionsFields = function() {
	var _this = this;
	var form = this.form;
    form.fields.forEach(field => {
    	if(field.type!='group'){
    		if (field.provider != undefined) {
    			_this.loadOptionsField(field);
    		}
    	}else{
    		field.fields.forEach(grpfield => {
    			if (grpfield.provider != undefined) {
        			_this.loadOptionsField(grpfield);
        		}
    		});
    	}
    });
}

JetForm.prototype.loadOptionsField = function(field) {
	//console.log(field.name);
	//console.log(field.provider);
	var form = this.form;
	var target;
	$('#'+field.name).empty();
	$("#" + field.name).append(new Option("Select "+field.label, "-1"));

    if (field.provider != undefined && field.provider.ajax !=undefined) {
		callAjax(form, field, target, field.provider, this.populateOptions);
    	//callAjax(form, field, target, field.provider, this.populateOptions, console.log);
    }
}

JetForm.prototype.populateOptions = function(form, field, target, data){
	
	var provider = field.provider;
	var select=(field.type == "select");
    
    var i=0;
     
    $.each(data, function(key, item) {
         	
     	var value;
     	var label;
     	
     	if(provider.value!=undefined && provider.value!='' && provider.label!=undefined && provider.label!=''){
     		value=item[provider.value];
			if(provider.label.indexOf("{")<0){
     			label=item[provider.label];
     		}else{
				label=formatMessage(provider.label, item);
			}
     	}else{
     		value=key;
     		label=item;
     	}
     	
     	if(select){
     		$("#" + field.name).append(new Option(label, value));
     	}else{
     		var div=$('<div>', {
				class: 'form-check'
			});

         	$('<input />', { 
         		type: field.type, 
         		id: field.name+(i++), 
         		name: field.name,
         		value: value }).appendTo(div);
         	
			$('<label />', {
				class:'form-check-label ms-1',
				for:field.name,
				text: label }).appendTo(div);

			$("#" + field.name+"-form-group").append(div);
     	}
	});
}

/*JetForm.prototype.getIdField = function(){
	var _this = this;
	var form = _this.form;
	return form.idField;
	//return findIdField(form);
}*/

function findAction (event){
	 var target = getEventTarget(event);
	 
	 var actionName=$(target).attr("name");
	 var actionType=$(target).attr("type");
	 var applyTo=$(target).attr("applyto");
	 console.log(actionName+" - "+actionType+" - "+applyTo);
	 //console.log("formId - " +$(target).attr('formId'));
	 
	 var _this = window[$(target).attr('formId')];
	 //console.log(_this);
	 
	 var form = _this.form;
	 
	 //console.log(form);
	 var action;
	 form.actions.forEach(a => {
		 if(a.name==actionName && a.type==actionType && a.applyTo==applyTo){
			 action=a;
		 }
	 });
	 
	 //console.log(action);
	 return action;
}

function submitForm(event) {
	event.preventDefault();
	var target = getEventTarget(event);
	var _this = window[$(target).attr('formId')];
	var form = _this.form;
	
	if(!$('#'+form.id).valid()){
		return;	
	}
		
	var action = findAction(event);
	
	console.log($(target).attr("name"));
	var redirects=action.redirects;
	var success = redirects.success;
	var failure = redirects.failure;
	
	alert("submit form called");
//    var action=_this.findAction(event);
    
 //   var handler=action.handler;
    //console.log(handler);
    
    var formData = $('#'+form.id).toJSON();
    
    console.log(formData);
    var provider=form.providers.create;
    if(provider != undefined && provider.ajax != undefined){
	    // make AJAX request
	    var url = provider.ajax;
		var method = (provider.method != undefined ? provider.method : "GET");
		//var dataType = (provider.dataType != undefined ? provider.dataType : "json");
		//var contentType = (provider.contentType != undefined ? provider.contentType : "application/json");
		
	    $.ajax({
	        url: url,
	        type: method,
	        data: JSON.stringify(formData),
	        contentType: 'application/json',
	        success: function(response) {
	            onSaveSuccess(target, response, success)
	        },
	        error: function(error) {
				onSaveFailure(target, error, failure)
	        }
	    });
    }
}

function addRow(event){
	//event.preventDefault();
	var field;
	var table;

	var target = getEventTarget(event);
	var _this = window[$(target).attr('formId')];

	if($(target).parents('table').length>0){
		table=$(target).parents('table');
	}
	
	if (table != undefined){
		field=_this.findFieldByNameAndType($(table).attr('id'), "list");
	}else{
		wrapper=$(target).siblings('.dataTables_wrapper');
		table=$(wrapper).find('.dataTable');
		field=_this.findFieldByNameAndType($(table).attr('id'), "list");
	}	
	
	if(field.editMode == "inline"){
		$(target).hide();
		$(target).siblings().show();
		
		/*if(elementType=='a' || elementType=='button'){
			$(target).hide();
			$(target).siblings().show();
		}else{
			$(target).parent().hide();
			$(target).parent().siblings().show();
		}*/
		
		_this.addListRow(field);
	}else if(field.editMode == "dialog"){
		$('#'+formId+'Modal').modal('show').find('.modal-body').load('http://localhost:8081/jetform-renderer/form-template.jsp');
	}
}

function deleteRow(event){
	var target = $( event.target);
	if(confirm('Are you sure to delete the row?')){
		var tbody=$(target).parents('tbody');
		if($(tbody).find('tr').length>1){
			$(target).closest('tr').remove();

			if($(tbody).find('tr').length==1){
				var td=$(tbody).find('tr').find('td').last();
				$(td).children('a[name="deleteRow"]').hide();
				$(td).children('a[name="addRow"]').show();
			}else{
				var td=$(tbody).find('tr').last().find('td').last();
				$(td).children('a[name="deleteRow"]').show();
				$(td).children('a[name="addRow"]').show();
			}
		}
	}
}

JetForm.prototype.addListRow = function(field){
	var _this = this;
   	var tr=$('<tr />');
    field.fields.forEach(subfield => {
        const template = $(templates["list_"+subfield.type]).html();
        const compiledTemplate = Handlebars.compile(template);
        var html=compiledTemplate(subfield)
        $('<td />').append(html).appendTo(tr);
    });
    
    if(field.actions.length>0){
    	var td=$('<td />');
    	field.actions.forEach(action => {
			action['formId']=_this.form.id;
	    	const template = $(templates[action.type]).html();
	    	const compiledTemplate = Handlebars.compile(template);
	    	$(td).append(compiledTemplate(action));
    	});
    }
    
    $(td).appendTo(tr);
   	$(tr).appendTo($('#' + field.name).find('tbody'));
}

JetForm.prototype.initListTable = function(field, editable){
	var form = this.form;
	var table= $('#'+field.name).DataTable({
		filter: false,
		paging: false,
        ordering: false,
        info: false,
        responsive: true
	});
	
	var tableWrapper=$('#'+field.name).parents('#'+field.name+'_wrapper');
	field.actions.forEach(action => {
		if(action.applyTo=='list'){
	    	const template = $(templates[action.type]).html();
	    	const compiledTemplate = Handlebars.compile(template);
	    	action["formId"]=form.id;
	    	console.log(action);
	    	var html=compiledTemplate(action)
	    	$(html).addClass('float-end list-action').insertBefore(tableWrapper);
		}
	});
}

JetForm.prototype.findFieldByNameAndType = function(name, type){
	var form = this.form;
	var field;
	form.fields.forEach(f => {
		if(f.name==name && f.type==type){
			field=f;
		}
	});
	
	if(field==undefined){
		form.fields.forEach(f => {
			if(f.type=='group'){
				f.fields.forEach(f1 => {
					if(f1.name==name && f1.type==type){
						field=f1;
					}
				})
			}
		});
	}
	
	return field;
}

JetForm.prototype.findFieldByName = function(name){
	var form = this.form;
	var field;
	form.fields.forEach(f => {
		if(f.name==name){
			field=f;
		}
	});
	if(field==undefined){
		form.fields.forEach(f => {
			if(f.type=="group"){
				f.fields.forEach(f1 => {
					if(f1.name==name){
						field=f1;
					}
				})
			}
		});
	}
	return field;
}

JetForm.prototype.bindEvents = function(){
	var _this = this;
	var form = this.form;
	form.fields.forEach(field => {
		if(field.type!='group' && field.type!='list'){
			var events=field.events;
			if(events!=undefined){
				//var keys=Object.keys(events);
				$.each(events, function(key, receivers) {
					$('#'+field.name).bind(key, function(){
						_this.bindEventReceivers(field, receivers);
					});
				});
			}
		}else if(field.type=='group'){
			field.fields.forEach(subfield => {
				var events=subfield.events;
				if(events!=undefined){
					//var keys=Object.keys(events);
					$.each(events, function(key, receivers) {
						$('#'+subfield.name).bind(key, function(){
							_this.bindEventReceivers(subfield, receivers);
						});
					});
				}
			});
		};
	});
}

JetForm.prototype.bindEventReceivers = function(eventSource, receivers){
	var _this = this;
	receivers.forEach(receiver => {
		if(receiver.type=="field"){
			if(receiver.trigger=="refill"){
				_this.refillField(receiver.receiver);
			}else{
				var result=true;
				if(receiver.criterias!=undefined){
					$.each(receiver.criterias, function(key, criteria) {
						if($(key).val()==criteria){
							result=result?true:false;
						}else{
							result=false
						}
					});
				}
				
			 	if(receiver.trigger=="hide"){
					if(result){
						$('#'+receiver.receiver).closest("div").hide();
					}else{
						$('#'+receiver.receiver).closest("div").show();
					}
				}else if(receiver.trigger=="show"){
					if(result){
						$('#'+receiver.receiver).closest("div").show();
					}else{
						$('#'+receiver.receiver).closest("div").hide();
					}
				}else if(receiver.trigger=="enable"){
					$('#'+receiver.receiver).prop("disabled", !result);
				}else if(receiver.trigger=="disable"){
					$('#'+receiver.receiver).prop("disabled", result);
				}
			}
		}else if(receiver.type=="javascript"){
			executeFunctionByName(receiver.receiver, window, eventSource);
		}
	});
}

JetForm.prototype.refillField = function(fieldName){
	var _this = this;
	var field=_this.findFieldByName(fieldName);
	_this.loadOptionsField(field);
}

JetForm.prototype.bindValidations = function(){
	var form = this.form;
	if(form.validations!=undefined){
		$("#"+form.id).validate(form.validations);
	}else{
		var rules={};
		var messages={};
		form.fields.forEach(field => {
			if(field.type!="group"){
				
				if(field.validations!=undefined){
					rules[field.name]=field.validations.rules;
					messages[field.name]=field.validations.messages;
				}
			}else{
				field.fields.forEach(f => {
					if(f.validations!=undefined){
						rules[f.name]=f.validations.rules;
						messages[f.name]=f.validations.messages;
					}
				});
			}
		});
		
		$("#"+form.id).validate({"rules":rules, "messages":messages});
	}
}

JetForm.prototype.transientFields = function(){
	var form = this.form;
	var tranzients=[];
	var ctr=0;
	form.fields.forEach(field => {
		if(field.type!='group' && field.type!='list'){
			if(field.tranzient!=undefined && field.tranzient==true){
				tranzients[ctr++]=field.name;
			}
		}else if(field.type=='group'){
			field.fields.forEach(subfield => {
				if(subfield.type!='group' && subfield.type!='list'){
					if(subfield.tranzient!=undefined && subfield.tranzient==true){
						tranzients[ctr++]=subfield.name;
					}
				}
			});
		}
	});
	return tranzients;
}

JetForm.prototype.listFields = function(){
	var form = this.form;
	var list=[];
	var ctr=0;
	form.fields.forEach(field => {
		if(field.type!='group'){
			if(field.type=='list'){
				list[ctr++]=field.name;
			}
		}else{
			field.fields.forEach(subfield => {
				if(subfield.type=='list'){
					list[ctr++]=subfield.name;
				}
			});
		}
	});
	return list;
}

JetForm.prototype.isListField = function(name){
	var form = this.form;
	var isList = false;
	form.fields.forEach(field => {
		if(isList == false ){
			if(field.type!='group'){
				if(field.name == name && field.type=='list'){
					isList=true;
				}
			}else{
				field.fields.forEach(subfield => {
					if(subfield.name == name &&  subfield.type=='list'){
						isList=true;
					}
				});
			}
		}
	});
	return isList;
}
	
function actionOnClick(event){
	 event.preventDefault();
	 invokeUrl(event);
}

function saveOnClick(event){
	event.preventDefault();
	submitForm(event);
}

function onSaveSuccess(form, field, data, redirect){
	console.log(data);
	
	alert("Success! Record saved successfully.");
	
    if(redirect != undefined){
        if(redirect.href != undefined){
			window.location.href=redirect.href;
		}else if(redirect.script != undefined){
			executeFunctionByName(redirect.script, window, data);
		}
	}
}

function onSaveFailure(form, field, error, redirect){
	console.log(error);
	
	alert("Error! Record could not be saved.");
	
    if(redirect != undefined){
        if(redirect.href != undefined){
			window.location.href=redirect.href;
		}else if(redirect.script != undefined){
			executeFunctionByName(redirect.script, window, error);
		}
	}
}

function cancelOnClick(event){
	event.preventDefault();
	
	var form = getEventForm(event);
	var action = findAction(event);
	
	if(action.handler != undefined){
		var handler = action.handler;
		if(handler.href != undefined){
			window.location.href=handler.href;
		}else if(handler.ajax != undefined){
			$.ajax({
		        url: handler.ajax,
		        type: (handler.method != undefined? handler.method: "GET"),
		        contentType: 'application/json'
		        })
		        .done(function(response) {
					console.log(response);
		        })
		        .fail(function(data) {
             		console.log(data);
         		});
		}else if(handler.script != undefined){
			executeFunctionByName(success, window, event);
		}else{
			alert('No action defined for Cancel.');
		}
	}else{
		//alert("before calling hide - "+form.id);
		//var modal = window[form.id+'Modal'];
		//$('.modal').modal('dispose');
		$('.modal').modal('hide');
//		$('.modal').hide();
		//modal.dispose();
		//$('#'+form.id+'Modal').modal('hide');
		//$('#'+form.id+'Modal').modal('dispose');
		//alert("after calling hide");
		//history.go(-1);
	}

}

function invokeUrl(event){
	var target = getEventTarget(event);
	console.log(target);
	var _this=getTargetFormParent(target);
	var form = _this.form;
	console.log(target);
	//var idField =findIdField(form);
	var idField =form.idField;
	var action = findAction(event)
	console.log(target);
	var dataKey = $(target).attr('datakey');
	var handler=action.handler;
	//console.log(handler);
	
	var param = {};
	if(dataKey != undefined){
		param[idField.name] = dataKey;
	}
	
	console.log(param);
	if(handler.href != undefined && handler.href != ''){
		var url = handler.href;
		url = formatMessage(url, param);
		url = appendQueryParam(url, param);
		alert(url);
		window.location.href=url;
	}else if(handler.ajax !=undefined && handler.ajax != ''){
	    $.ajax({
	        url: handler.ajax,
	        type: handler.method,
	        data: JSON.stringify(param),
	        contentType: 'application/json',
	        success: function(response) {
	            alert('URL is called..');
	        },
	        error: function(error) {
	            alert('Error: URL call failed..');
	        }
	    });
	 }
}

function executeFunctionByName (functionName, context, args) {
	//var args = Array.prototype.slice.call(arguments, 2);
    var namespaces = functionName.split(".");
    var func = namespaces.pop();
    for (var i = 0; i < namespaces.length; i++) {
        context = context[namespaces[i]];
    }
    return context[func].apply(context, args);
}

(function ($) {
    $.fn.toJSON = function () {
		var jetform = window[$(this).attr('id')];
		var tranzients=jetform.transientFields();
		
        var fd = {};
        var sn = {};
        var lst = {};
        var raw = this.serializeArray();
        //console.log(a);
        $.each(raw, function () {
			var istrans=false;
			var name=this.name;
			$.each(tranzients, function (i, t) {
				if(t==name){
					istrans=true;
				}
			});
			
			if(!istrans){
				if(this.name.indexOf(".")>0){
					
					var name=this.name.substring(this.name.lastIndexOf(".")+1);
					
					var keys = this.name.substring(0, this.name.lastIndexOf(".")).split(".");
					
					/*var si = 0;
					while(tmp.indexOf(".")>=0){
						var li = tmp.indexOf(".",si+1);
						keys[keys.length++] = tmp.substring (si, li);
						tmp=tmp.substring(li+1, tmp.length);
					}*/
					//console.log(this.name+" - key[0] : "+keys[0]+" - tmp : "+tmp);
					
					if(!jetform.isListField(keys[0])){
					
						var ob = {};
						
						if(keys.length>=1){
							if(sn[keys[0]] == undefined ){
								sn[keys[0]]={};
							}
							ob=sn[keys[0]];
						}
						if(keys.length>=2){
							if(sn[keys[0]][keys[1]] == undefined ){
								sn[keys[0]][keys[1]]={};
							}
							ob=sn[keys[0]][keys[1]];
						}
						
						if(keys.length>=3){
							if(sn[keys[0]][keys[1]][keys[2]] == undefined ){
								sn[keys[0]][keys[1]][keys[2]]={};
							}
							ob=sn[keys[0]][keys[1]][keys[2]];
						}
						ob[name]=this.value;
					}else{
						//console.log(keys +" -- "+name+" -- "+this.value);
						if(lst[keys[0]] == undefined){
							lst[keys[0]] = [];
						}
						
						var listFld = lst[keys[0]];
						//console.log(listFld);
						//console.log("listFld.length : "+listFld.length);
						var vset = false;
						for(var i=0; i<listFld.length; i++){
							//console.log(i+" ====");
							e=listFld[i];
							//console.log(e);
							if(e[name] == undefined){
								e[name] = this.value;
								vset = true;
								break;
							}	
						}
						
						if(!vset){
							//console.log("inserting "+name+ " -- "+ this.value+" -- at "+listFld.length);
							listFld[listFld.length] = {};
							listFld[listFld.length-1][name] = this.value;
						}
					}
				}else{
		            if (fd[this.name]) {
		                if (!fd[this.name].push) {
		                    fd[this.name] = [fd[this.name]];
		                }
		                fd[this.name].push(this.value || '');
		            } else {
		                fd[this.name] = this.value || '';
		            }
            	}
            }
        });
        //console.log(lst);
        $.each(sn, function (key, item) {
			fd[key]=item;
		});
		$.each(lst, function (key, item) {
			fd[key]=item;
		});
        return fd;
    };
})(jQuery);

Handlebars.registerHelper('if_eq', function(a, b, opts) {
    if(a === b) // Or === depending on your needs
        return opts.fn(this);
    else
        return opts.inverse(this);
});

Handlebars.registerHelper('if_ne', function(a, b, opts) {
    if(a === b) // Or === depending on your needs
    	return opts.inverse(this);
    else
    	return opts.fn(this);
});
Handlebars.registerPartial('textField', Handlebars.compile('#jf-text-template'));

Handlebars.registerHelper('replace', function(s1, s2, s3) {
    return s1.replace(s2, s3);
});


/**************JetList***********************/
/********************************************/

function JetList (config) {
  let jetList = Object.create(JetList.prototype)
  jetList.form = config.form;
  jetList.form.id = config.id;
  jetList.form.parentId = config.parentId;
  jetList.form.idField=findIdField(jetList.form);
  jetList.showIndex =  config.showIndex;
  jetList.selectable =  config.selectable;
  window[config.id]=jetList;
  
  return jetList;
}

JetList.prototype.setDataKey = function(value) {
	var form = this.form;
	setDataKey(form, value);
}

JetList.prototype.render = function(){
	loadTemplates();
	this.renderListHeader();
	this.renderListActions();
	this.renderList();
	this.renderModal();
}
JetList.prototype.renderListHeader = function() {
	var _this = this;
	var form = _this.form;
	const template = $(templates['list_header']).html();
    const compiledTemplate = Handlebars.compile(template);
    const html = compiledTemplate(form);
    $('#'+form.parentId).append(html);
}

JetList.prototype.renderListActions = function() {
	var _this = this;
	var form = _this.form;
	
    form.actions.forEach(action => {
		action['formId']=form.id;
	});

	const template = $(templates['list_actions']).html();
    const compiledTemplate = Handlebars.compile(template);
    
    const html = compiledTemplate(form.actions);
    $('#'+form.parentId).append(html);
}

JetList.prototype.renderList = function() {
	var _this = this;
	var form = _this.form;
	
	const template = $(templates['datatable']).html();
    const compiledTemplate = Handlebars.compile(template);
    const html = compiledTemplate(form);
    $('#'+form.parentId).append(html);
    
    var provider=form.providers.collection;

    $.fn.dataTable.ext.errMode = 'none';

    $.ajax({
        url: provider.ajax,
        type: "GET",
        contentType: 'application/json',
        success: function(response) {
        	//console.log(response);
        	var columns=[];
        	var colCtr=0;
        	var colDefCtr=0;
        	var columnDefs =[];
			var selectable = {};
        	columns[colCtr++]= { "title":''};

        	if(_this.selectable != undefined && _this.selectable == true){
	        	columnDefs[colDefCtr++] = {
		            orderable: false,
		            className: 'select-checkbox',
		            targets:   0
	        	};
	        	
	        	selectable = {
		            style: 'multi',
		            selector: 'td:first-child'
		        };
			}else{
				_this.showIndex = true;
			}

        	form.fields.forEach(field => {
        		if(field.type!='hidden'){

					if(field.view != undefined){
						//var renderFun;
						if(field.type == 'file'){
							if(field.view == 'thumbnail'){
								//renderFun = _this.renderThumbnailView;
								 columnDefs[colDefCtr] = {
				        		   'render': function (data, type, row, meta){
				        		        return _this.renderThumbnailView(data, type, row, meta);
				        		    }
								}
							}else if(field.view == 'download'){
								//renderFun = _this.renderDownloadView;
								columnDefs[colDefCtr] = {
									/*'targets': colCtr,
				        		    'searchable': false,
				        		    'orderable': false,
				        		    'className': 'dt-body-nowrap',*/
				        		    'render': function (data, type, row, meta){
				        		        return _this.renderDownloadView(data, type, row, meta);
				        		    }
								}
							}else if(field.view == 'filelink'){
								//renderFun = _this.renderDownloadView;
								columnDefs[colDefCtr] = {
									/*'targets': colCtr,
				        		    'searchable': false,
				        		    'orderable': false,
				        		    'className': 'dt-body-nowrap',*/
				        		    'render': function (data, type, row, meta){
				        		        return _this.renderFileLinkView(data, type, row, meta);
				        		    }
								}
							}
						}else if(field.type == 'text'){
							if(field.view == 'folder'){
								//renderFun = _this.renderFolderView;
								columnDefs[colDefCtr] = {
				        		    'render': function (data, type, row, meta){
				        		        return _this.renderFolderView(data, type, row, meta);
				        		    }
								}
							}
						}
						
				        /*console.log(columnDefs[colDefCtr]);
				        console.log("colCtr : "+colCtr);*/
				        if(columnDefs[colDefCtr] != undefined){		    
							columnDefs[colDefCtr]['targets'] = colCtr;
		        		    columnDefs[colDefCtr]['searchable'] = false;
		        		    columnDefs[colDefCtr]['orderable'] = false;
		        		    columnDefs[colDefCtr]['className'] = 'dt-body-nowrap';
	        		    	colDefCtr++;
	        		    }
	        		    
	        		    
					}
					columns[colCtr++]= { "data": field.name, "title":field.label};
				}
        		
        	});
        	columnDefs[colDefCtr]={
    		    'targets': colCtr,
    		    'title': 'Actions',
    		    'searchable': false,
    		    'orderable': false,
    		    'className': 'dt-body-center dt-body-nowrap',
    		    'render': function (data, type, full, meta){
    		        return _this.renderRowActions(full);
    		    }
			};
        	
        	//console.log(columnDefs);
        	var data;
        	
        	if(provider.dataNode != undefined && provider.dataNode != ''){
				data = response[provider.dataNode];	
			}else{
				data = response;
			}
			
        	//console.log(columns);
        	//console.log(data);
        	
        	var table= $('#'+form.id).DataTable({ 
        		responsive: true,
        		data: data,
        		columns: columns,
        		columnDefs: columnDefs,
        	});
        	if(_this.showIndex != undefined && _this.showIndex == true){
	        	table.on('order.dt search.dt', function () {
			        let i = 1;
			 
			        table.cells(null, 0, { search: 'applied', order: 'applied' }).every(function (cell) {
			            this.data(i++);
			        });
	    		}).draw();
    		}
        },
        error: function(error) {
            alert('Error in fetching data');
        }
    });
}

JetList.prototype.renderThumbnailView = function(data, type, row, meta) {
	return "<img src='"+data+"'>";
}

JetList.prototype.renderDownloadView = function(data, type, row, meta) {
	return "<a href='"+data+"' target='_blank'><i class='fa fa-cloud-download' aria-hidden='true'></i></a>";
}

JetList.prototype.renderFolderView = function(data, type, row, meta) {
	return "<i class='fa fa-folder-o' aria-hidden='true'></i>&nbsp;"+data;
}

JetList.prototype.renderFileLinkView = function(data, type, row, meta) {
	//console.log(data);
	var fileName=(data.lastIndexOf("/")>=0? data.substring(data.lastIndexOf("/")+1): data);
	fileName=(fileName.lastIndexOf("\\")>=0? fileName.substring(fileName.lastIndexOf("\\")+1): fileName);
	var extn=fileName.substring(fileName.lastIndexOf(".")).toLowerCase();
	var icon=getFaFileIcon(extn);
	
	return "<a href='"+data+"' target='_blank' style='text-decoration:none;'><i class='fa "+icon+"' aria-hidden='true'></i>&nbsp;"+fileName+"</a>";
}

JetList.prototype.renderRowActions = function(data) {
	var _this = this;
	var form = _this.form;
	var html='';
	//var idField = findIdField(form);
	var idField = form.idField;
	if(form.actions.length>0){
    	form.actions.forEach(action => {
			
			action['formId']=form.id;
			//action['dataKey']="{'"+idField.name+"':"+"'"+data[idField.name]+"'}";
			action['dataKey']=data[idField.name];
    	});
    	const template = $(templates['row_actions']).html();
    	const compiledTemplate = Handlebars.compile(template);
    	html=compiledTemplate(form.actions);
    }
    			

    //console.log(html);
	return html;
}

JetList.prototype.renderModal = function() {
	renderModal(this.form);
}
/*JetList.prototype.getIdField = function(){
	var _this = this;
	var form = _this.form;
	var idField = form.idField;
	//return findIdField(form);
	return idField;
}*/

function findIdField (form) {
	var idField;
	form.fields.forEach(field => {
		if(field.id != undefined && field.id == true){
			idField = field;
		}else if(field.type == 'group'){
			field.fields.forEach(subfield => {
				if(subfield.id != undefined && subfield.id == true){
					idField = subfield;
				}
			});
		}
	});
	form.idField = idField;
	return idField;
}

function addOnClick(event){
	event.preventDefault();
	
	var action = findAction(event);

	console.log(action);
	var handler=action.handler
	if(handler != undefined){
		
		if(handler.href != undefined){
			window.location.href=handler.href;
		}else if(handler.dialog != undefined){
			openDialog(event);
		}else if(handler.ajax != undefined){
			$.ajax({
		        url: handler.ajax,
		        type: (handler.method != undefined? handler.method: "GET"),
		        contentType: 'application/json'
		    }).done(function(response) {
				console.log(response);
		    }).fail(function(error) {
             	console.log(error);
         	});
		}else if(handler.script != undefined){
			executeFunctionByName(handler.script, window, event);
		}
	}else{
		executeFunctionByName('handleAddOnClick', window, event);
	}
}

function formatMessage(message, params){
	var tmp=message;
	while(tmp.indexOf("{")>=0){
		var si = tmp.indexOf("{");
		var li = tmp.indexOf("}");
		var key = tmp.substring (si+1, li);
		var value;
		
		if(params !=undefined){
			value = params[key];
		}
		tmp=tmp.replace(tmp.substring(si, li+1), value);
	}
	
	return tmp;
}

function appendQueryParam(message, params){
	var tmp = message+(message.indexOf("?")>0?"&":"?");
	
	$.each(params, function(key, item) {
		tmp+= (key+"="+item+"&")
	});
	
	return tmp;
}


function editOnClick(event){
	event.preventDefault();
	editData(event);
}

function deleteOnClick(event){
	event.preventDefault();
	var form = getEventForm(event);
	
	var options = {
		"title": "Delete "+form.title,
		"body":"Are you sure you want to delete?",
		"confirmLabel" :"Yes",
		"cancelLabel" : "No",
		"showFooter" : true
		//"confirmFunc" : deleteData
	}
	
	openConfirmDialog(event, options, deleteData);
	/*if(confirm("Are you sure you want to delete the record!")){
		deleteData(event);
	}*/
}

function editData(event){
	var target = getEventTarget(event);
	var action = findAction(event);
		
	if(action.handler !=undefined){
		var handler = action.handler;
		
		redirectUrl(event, target, handler);

	}
}

function deleteData(event){
	var target = getEventTarget(event);
	var _this=getTargetFormParent(target);
	var form = _this.form;
	
	if(form.providers != undefined && form.providers.delete != undefined){
		provider = form.providers.delete;
	
		if(provider.ajax != undefined){
			
			var field; //For delete data undefined field to be declared
			
			callAjax(form, field, target, provider, onDeleteSuccess, onDeleteFailure);
		}
	}
	//console.log(form);
}

function onDeleteSuccess(form, field, target, data){
	alert("Success! Record deleted successfully.");
	
	var _this=getTargetFormParent(target);
	
	_this.updateList(field, data);
}

function onDeleteFailure(form, field, target, error){
	alert("Error! Record deletion failed.");
	console.log(error);
}


function getEventTarget(event){
	var target = $( event.target);
	var nodeName = $(target).prop('nodeName').toLowerCase();
	
	if(nodeName!='a' && nodeName!='button'){
		target=$(target).parent();
	}
	return target;
}

function getEventForm(event){
	var target = getEventTarget(event);
	var form = getTargetForm(target);
	return form;
}

function getTargetForm(target){
	var form = window[$(target).attr('formId')].form;
	return form;
}

function getEventFormParent(event){
	var target = getEventTarget(event);
	var jet = getTargetFormParent(target);
	return jet;
}
function getTargetFormParent(target){
	var jet = window[$(target).attr('formId')];
	return jet;
}

JetList.prototype.updateList = function() {
	var _this = this;
	var form = _this.form;
	if ($.fn.dataTable.isDataTable('#'+form.id)) {
        $('#'+form.id).DataTable().clear().destroy();
    }
    
    _this.renderList();
}

function callAjax(form, field, action, provider, successFunc, failureFunc){
	var dataKey;

	var idField = form.idField;	
	/*console.log("Entering callAjax.........");
	console.log(field);
	console.log(action);
	console.log(provider);
	console.log(successFunc);
	console.log(failureFunc);
	console.log(idField);*/
	
	if(action != undefined){
		//var _this=getTargetFormParent(action);
		
		dataKey = $(action).attr('datakey');
	}else{
		dataKey = idField.value;
	}
	
	if(provider != undefined && provider.ajax != undefined){
		var url = provider.ajax;
		var method = (provider.method != undefined ? provider.method : "GET");
		var dataType = (provider.dataType != undefined ? provider.dataType : "json");
		var contentType = (provider.contentType != undefined ? provider.contentType : "application/json");
		
    	var pathParams = {};
		
		if(provider.pathParams != undefined){
        	//var keys=Object.keys(params);
        	$(provider.pathParams).each(function(key,param){
        		var value=param.value;
        		
        		//console.log ("key -- "+key+" typeof value: "+(typeof value)+" -- "+value);
        		//console.log ("key -- "+key);
        		//console.log(param)
        		if(value != undefined){
					if(value.startsWith('.') || value.startsWith('#')){
						if($(value).length>0){
	        				value=$(value).val();
	        			}else{
							value='';
						}
    	    		}
					pathParams[param.name]=value;
				}
        	});
        }

		if(idField != undefined && dataKey != undefined && dataKey !=''){
			pathParams[idField.name] = dataKey;
		}

        var queryParams={};
		
        if(provider.queryParams != undefined){
        	//var keys=Object.keys(params);
        	$(provider.queryParams).each(function(key,param){
        		var value=param.value;
        		
        		console.log ("key -- "+key+" typeof value: "+(typeof value)+" -- "+value);
        		if(value != undefined){
	        		if(value.startsWith('.') || value.startsWith('#')){
	        			if($(value).length>0){
	        				value=$(value).val();
	        			}else{
							value='';
						}
	        		}
	       			queryParams[param.name]=value;
       			}

        	});
        } 
        
        if(idField != undefined && queryParams[idField.name] != undefined && dataKey != undefined && dataKey !=''){
			queryParams[idField.name] = dataKey;
		}
		
		var requestParams={};
		
        if(provider.requestParams != undefined){
        	//var keys=Object.keys(params);
        	$(provider.requestParams).each(function(key,param){
        		var value=param.value;
        		
        		console.log ("key -- "+key+" typeof value: "+(typeof value)+" -- "+value);
        		if(value != undefined){
	        		if(value.startsWith('.') || value.startsWith('#')){
	        			if($(value).length>0){
	        				value=$(value).val();
	        			}else{
							value='';
						}
	        		}
	        		requestParams[param.name]=value;
				}
        	});
        } 
        
        if(idField != undefined && requestParams[idField.name] != undefined && dataKey != undefined && dataKey !=''){
			requestParams[idField.name] = dataKey;
		}
        
        if(url.indexOf("{") > 0){
			url = formatMessage(url, pathParams);
		}else{
			url = appendQueryParam(url, pathParams);
		}
		
		url = appendQueryParam(url, queryParams);
		
		$.ajax({
	         url: url,
	         type: method,
	         data: requestParams,
	         dataType: dataType,
	         contentType: contentType
	     }).done(function(response) {
			if(successFunc != undefined){
				var data = (provider.dataNode == undefined? response: response[provider.dataNode] );
				successFunc(form, field, action, data);
			}
		
		}).fail(function(error) {
			if(failureFunc != undefined){
				failureFunc(form, field, action, error);
			}
		});
	}else{
		console.log("Provider is undefined or provider.ajax is undefined.");
	}
}

function redirectUrl(event, action, handler){
	var form;
	var idField;
	var dataKey;
	
	if(action != undefined){
		var _this=getTargetFormParent(action);
		form = _this.form;
		idField =findIdField(form);
		dataKey = $(action).attr('datakey');
	}
	
	if(handler.script != undefined){
		executeFunctionByName();
	}else{
		var url = (handler.href != undefined? handler.href : handler.dialog);
		
		var pathParams = handler.pathParams;
		if(pathParams == undefined){
			pathParams = {};
		}
		
		if(idField != undefined && dataKey != undefined){
			pathParams[idField.name] = dataKey;
		}
	
	    if(url.indexOf("{") > 0){
			url = formatMessage(url, pathParams);
		}else{
			url = appendQueryParam(url, pathParams);
		}
		
		if(handler.queryParams != undefined){
			url = appendQueryParam(url, handler.queryParams);
		}
		
		alert(url);
		if(handler.href != undefined){
			window.location.href=url;
		}else{
			openDialog(event);
		}
	}
}

function setDataKey(form, value){
	if(form.idField == undefined){
		form.idField = findIdField(form);
	}
	
	if(form.idField != undefined){
		form.idField.value = value;
		if(form.providers == undefined){
			form.providers = {};
		}
		
		if(form.providers.selector == undefined){
			form.providers.selector = {};
		}
		
		if(form.providers.selector.pathParams == undefined){
			form.providers.selector.pathParams = {};
		}
		
		form.providers.selector.pathParams[form.idField.name]=form.idField.value;
	}else{
		console.log("No id field defined for the form");
	}
}

function getFaFileIcon(extn){
	var icon = 'fa-file-o';
	if(extn == ".pdf"){
		icon = 'fa-file-pdf-o';
	}else if(extn == ".doc" || extn == ".docx"){
		icon = 'fa-file-word-o';
	}else if(extn == ".xls" || extn == ".xlsx"){
		icon = 'fa-file-excel-o';
	}else if(extn == ".ppt" || extn == ".pptx"){
		icon = 'fa-file-powerpoint-o';	
	}else if(extn == ".txt"){
		icon = 'fa-file-text';	
	}else if(extn == ".jpg" || extn == ".jpeg" || extn == ".png" || extn == ".jpg" || extn == ".gif"){
		icon = 'fa-file-image-o';
	}else if(extn == ".zip" || extn == ".rar" || extn == ".7z" || extn == ".zipx" || extn == ".tar" || extn == ".gz"){
		icon = 'fa-file-archive-o';
	}else if(extn == ".mp3" || extn == ".mp4" || extn == ".wav" || extn == ".wma" || extn == ".aac" || 
		extn == ".flac" || extn == ".m4a" || extn == ".m4b" || extn == ".m4p" || extn == ".au"){
		icon = 'fa-file-audio-o';	
	}else if(extn == ".mov" || extn == ".wmv" || extn == ".avi" || extn == ".flv" || extn == ".f4v" || 
		extn == ".swf" || extn == ".webm" || extn == ".mkv" || extn == ".m4p" || extn == ".au"){
		icon = 'fa-file-video-o';	
	}
	return icon;
}

function renderModal(form){
	if($('.modal').length<=0){
		const template = $(templates['modal']).html();
	    const compiledTemplate = Handlebars.compile(template);
	    const html = compiledTemplate(form);
	    $('body').append(html);
    }
}  

function openDialog(event){
	var target = getEventTarget(event);
	//var _this=getTargetFormParent(target);
	var form = getTargetForm(target);
	var action = findAction(event);

	var handler=action.handler
	var title = action.label+" "+form.title;
	configureModal(title, '', '', '', false);
	$('.modal').modal('show').find('.modal-body').load(handler.dialog);
}

function openConfirmDialog(event, options, confirmFunc, cancelFunc){
	/*const template = $(templates['confirm']).html();
    const compiledTemplate = Handlebars.compile(template);
    const html = compiledTemplate(options);*/
    //alert(options.title);
   	configureModal(options.title, options.body, options.confirmLabel, options.cancelLabel, (options.showFooter != undefined && options.showFooter ==true));
    
    $('.modal').find('.modal-footer').find('.btn-confirm').click(()=>{
		alert("Confirm clicked");
		configureModal('', '', 'Cancel', 'OK', false);
		$('.modal').modal('hide');
		var m = bootstrap.Modal.getInstance($(".modal"));
		//$('.modal').dispose();
		confirmFunc(event);
	});
	
	$('.modal').find('.modal-footer').find('.btn-cancel').click(()=>{
		alert("Cancel clicked");
		configureModal('', '', 'Cancel', 'OK', false);
		cancelFunc(event);
		$('.modal').modal('hide').dispose();
	});
    $('.modal').modal('show');
}

function configureModal(title, body, confirmLabel, cancelLabel, showFooter){
	$('.modal').find('.modal-title').html(title);
    $('.modal').find('.modal-body').html(body);
    $('.modal').find('.btn-confirm').html(confirmLabel);
    $('.modal').find('.btn-cancel').html(cancelLabel);
    
    var modalFooter=$('.modal').find('.modal-footer');
    
    if(showFooter){
    	$(modalFooter).removeClass('d-none');
    }else{
		$(modalFooter).addClass('d-none');
	}
	
	$(modalFooter).find('.btn-confirm').unbind('click');
	$(modalFooter).find('.btn-cancel').unbind('click');
}