$("#header-info").click(function(){
	if($(".dropdown-menu-personal-menu").hasClass("show")){
		$(".dropdown-menu-personal-menu").removeClass("show");
	}else{
		$(".dropdown-menu-personal-menu").addClass("show");	
	}
});

