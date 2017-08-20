$(function(){
	switch (menu) {
	case 'About us':
		$('#about').addClass('active');
		break;
	case 'Contact us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listP').addClass('active');
		break;	
	default:
		$('#listP').addClass('active');
	    $('#a_'+menu).addClass('active');
		break;
	}
});