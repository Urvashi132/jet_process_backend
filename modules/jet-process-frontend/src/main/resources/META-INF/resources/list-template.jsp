

<!-- templates  -->
<script id="jf-text-template" type="text/x-handlebars-template">          
  <div class="form-group">
    <label for="{{name}}" class="form-label">{{label}}</label>
    <input type="{{type}}" class="form-control" name="{{name}}" placeholder="{{placeHolder}}" id="{{name}}" value="{{value}}" {{#if required}}required{{/if}}>
  </div>
</script>

<script id="jf-date-template" type="text/x-handlebars-template">
  <div class="form-group">
    <label for="{{name}}" class="form-label">{{label}}</label>
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}">
  </div>
</script>

<script id="jf-email-template" type="text/x-handlebars-template">
  <div class="form-group">
    <label for="{{name}}" class="form-label">{{label}}</label>
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}">
  </div>
</script>

<script id="jf-password-template" type="text/x-handlebars-template">
  <div class="form-group">
    <label for="{{name}}" class="form-label">{{label}}</label>
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}"  minlength="{{minLength}}">
  </div>
</script>

<script id="jf-number-template" type="text/x-handlebars-template">
  <div class="form-group">
    <label for="{{name}}" class="form-label">{{label}}</label>
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}" maxlength="{{maxlength}}">
  </div>
</script>


<script id="jf-radio-template" type="text/x-handlebars-template">
  <div class="form-group" id="{{name}}-form-group">
    <label class="form-label">{{label}}</label>
	{{#each options}}
    	<div class="form-check">
      		<input type="radio" name="{{../name}}" value="{{value}}" checked="checked"> <label class="form-check-label" for="{{../name}}">{{label}}</label>
    	</div>
	 {{/each}}
  </div>
</script>

<script id="jf-checkbox-template" type="text/x-handlebars-template">
  <div class="form-group" id="{{name}}-form-group">
    <label for="{{name}}" class="form-label">{{label}}</label>
	{{#each options}}
    	<div class="form-check">
      		<input type="checkbox" name="{{../name}}" value="{{value}}" checked="checked"> <label class="form-check-label" for="{{../name}}">{{label}}</label>
    	</div>
	 {{/each}}
  </div>
</script>

<script id="jf-select-template" type="text/x-handlebars-template">
	<div class="form-group">	
		<label for="{{name}}" class="form-label">{{label}}</label>
		<select name="{{name}}" id="{{name}}" class="form-control">
			<option value="-1">Select {{label}}</option>
			{{#each options}}
            	<option value="{{value}}">{{label}}</option>
            {{/each}}
		</select>
	</div>
</script>

<script id="jf-file-template" type="text/x-handlebars-template">
	<div class="form-group">	
		<label for="{{name}}" class="form-label">{{label}}</label>
		<input type="file" id="{{name}}" name="{{name}}" class="form-control" accept="{{accept}}"/>
	</div>
</script>

<script id="jf-field-group-template" type="text/x-handlebars-template">
	<div class="row" id="{{name}}">
			
	</div>
</script>

<script id="jf-form-actions-template" type="text/x-handlebars-template">
	<div class="container mt-3">
		<div class="row" id="action-row">
			<div class="col-md-12">
				<div class="float-right">
					{{#each []}}
						{{#if_ne applyTo "form"}}
							{{#if_eq handler.type "javascript"}}
								<button name="{{name}}" id="{{name}}" type="{{type}}" applyto="{{applyTo}}" class="btn {{cssClass}}" onclick="{{handler.func}}">{{label}}</button>
							{{/if_eq}}
					
							{{#if_ne handler.type "javascript"}}
	  							<button name="{{name}}" id="{{name}}" type="{{type}}" applyto="{{applyTo}}" class="btn {{cssClass}}" onclick="actionOnClick(event)">{{label}}</button>
							{{/if_ne}}
						{{/if_ne}}
					{{/each}}
				</div>
			</div>
		</div>
	</div>
</script>

<script id="jf-list-actions-template" type="text/x-handlebars-template">
	<div class="container mt-3">
		<div class="row" id="action-row">
			<div class="col-md-12">
				<div class="float-end">
					{{#each []}}
						{{#if_eq applyTo "list"}}
							{{#if_eq type "button"}}
								{{#if_eq handler.type "javascript"}}
									<button name="{{name}}" id="{{name}}" type="{{type}}" applyto="{{applyTo}}" class="btn {{cssClass}}" onclick="{{handler.func}}">{{label}}</button>
								{{else}}
	  								<button name="{{name}}" id="{{name}}" type="{{type}}" applyto="{{applyTo}}" class="btn {{cssClass}}" onclick="{{name}}OnClick(event)">{{label}}</button>
								{{/if_eq}}
							{{/if_eq}}
							{{#if_eq type "link"}}
								{{#if_eq handler.type "javascript"}}
									<a name="{{name}}" id="{{name}}" applyto="{{applyTo}}" class="{{cssClass}}" onclick="{{handler.func}}">{{label}}</a>
								{{else}}
									<a name="{{name}}" id="{{name}}" applyto="{{applyTo}}" class="{{cssClass}}" onclick="{{name}}OnClick(event)">{{label}}</a>
								{{/if_eq}}
							{{/if_eq}}
						{{/if_eq}}
					{{/each}}
				</div>
			</div>
		</div>
	</div>
</script>

<script id="jf-row-actions-template" type="text/x-handlebars-template">
	{{#each []}}
		{{#if_eq applyTo "row"}}
			{{#if_eq type "button"}}
				{{#if_eq handler.type "javascript"}}
					<button name="{{name}}" id="{{name}}" type="{{type}}" applyto="{{applyTo}}" class="btn {{cssClass}}" onclick="{{handler.func}}">{{label}}</button>
				{{else}}
					<button name="{{name}}" id="{{name}}" type="{{type}}" applyto="{{applyTo}}" class="btn {{cssClass}}" onclick="{{name}}OnClick(event)">{{label}}</button>
				{{/if_eq}}
			{{/if_eq}}
			{{#if_eq type "link"}}
				{{#if_eq handler.type "javascript"}}
					<a name="{{name}}" id="{{name}}" applyto="{{applyTo}}" class="{{cssClass}}" onclick="{{handler.func}}">{{label}}</a>
				{{else}}
					<a name="{{name}}" id="{{name}}" applyto="{{applyTo}}" class="{{cssClass}}" onclick="{{name}}OnClick(event)">{{label}}</a>
				{{/if_eq}}
			{{/if_eq}}
		{{/if_eq}}
	{{/each}}
</script>

<script id="jf-button-template" type="text/x-handlebars-template">
  <button name="{{name}}" id="{{name}}" type="{{type}}" class="btn btn-primary" onclick="submitForm(event)">{{label}}</button>
</script>

<script id="jf-link-template" type="text/x-handlebars-template">
  <a name="{{name}}" id="{{name}}" onclick="submitForm(event)"><i class="fa {{label}}" aria-hidden="true"></i></a>
</script>

<script id="jf-list-header-template" type="text/x-handlebars-template">
	<h3>{{title}}</h3>
</script>

<script id="jf-list-template" type="text/x-handlebars-template">
	<div class="form-group">
		<table class="table table-bordered" id="<%=request.getParameter("listId")%>">
			<thead>
				<tr>
					{{#each []}}
						{{#if_ne type 'group'}}
							{{#if_ne type 'list'}}
								{{#if_ne listable false}}
									<td>{{label}}</td>
								{{/if_ne}}
							{{/if_ne}}
						{{/if_ne}}
					{{/each}}
					<td>Actions</td>
				</tr>
			</thead>
			<tbody id="{{name}}">
				
			</tbody>
		</table>
	</div>
</script>

<script id="jf-list-field-template" type="text/x-handlebars-template">
	<tr>
		{{#each fields as | field}}
			<td>{{>textField}}</td>
		{{/each}}
	</tr>
</script>

<!--  List sub field elements -->
<!-- templates  -->
<script id="list-text-template" type="text/x-handlebars-template">          
    <input type="{{type}}" class="form-control" name="{{name}}" placeholder="{{placeHolder}}" id="{{name}}" value="{{value}}" {{#if required}}required{{/if}}>
</script>

<script id="list-date-template" type="text/x-handlebars-template">
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}">
</script>

<script id="list-email-template" type="text/x-handlebars-template">
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}">
</script>

<script id="list-password-template" type="text/x-handlebars-template">
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}"  minlength="{{minLength}}">
</script>

<script id="list-number-template" type="text/x-handlebars-template">
    <input type="{{type}}" class="form-control" name="{{name}}" id="{{name}}" value="{{value}}" maxlength="{{maxlength}}">
</script>


<script id="list-radio-template" type="text/x-handlebars-template">
	{{#each options}}
      	<input type="radio" name="{{../name}}" value="{{value}}" checked="checked"> <label class="form-check-label" for="{{../name}}">{{label}}</label>
	 {{/each}}
  </div>
</script>

<script id="list-checkbox-template" type="text/x-handlebars-template">
	{{#each options}}
      	<input type="checkbox" name="{{../name}}" value="{{value}}" checked="checked"> <label class="form-check-label" for="{{../name}}">{{label}}</label>
	 {{/each}}
  </div>
</script>

<script id="list-select-template" type="text/x-handlebars-template">
	<select name="{{name}}" id="{{name}}" class="form-control">
		<option value="-1">Select {{label}}</option>
		{{#each options}}
        	<option value="{{value}}">{{label}}</option>
		{{/each}}
	</select>
</script>

<script id="list-file-template" type="text/x-handlebars-template">
	<input type="file" id="{{name}}" name="{{name}}" class="form-control" accept="{{accept}}"/>
</script>
