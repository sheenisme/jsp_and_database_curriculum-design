function checkusername(username){
	var Expression1=/[^\u4E00-\u9FA5]/;     //3-10个 字母数字下划线 组成
	var objExp1=new RegExp(Expression1);
	if(objExp1.test(username)==true){
		return true;
	}else{
		return false;
	}
}
	
function checkpassword(password){
	var Expression4=/^[A-Za-z]{1}([A-Za-z0-9]|[._]){5,19}$/; //6-20位字母数字下划线和点“.”组成
	var objExp4=new RegExp(Expression4);
	if(objExp4.test(password)==true){
		return true;
	}else{
		return false;
	}
}

function checkregister(){
	var username=document.getElementById("username");
	var password=document.getElementById("password");
	var repck=document.getElementById("repck");
	//alert("开始检查");
	if(username.value==""){
		alert("请输入您的账号!");
		username.focus();
		return false;
	}
	if(!checkusername(username)){
		alert("您输入的账号不正确！");
		username.focus();
		return false;
	}
	if(password.value==""){
		alert("请输入密码！");
		password.focus();
		return false;
	}
	if(password.value != repck.value){
		alert("两次输入的密码不一致！");
		password.focus();
		return false;
	}
	//alert("检查完成");
	return true;
}