


	





	//对象
	// var obj = {username:"a",password:"123",score:1000}
	// console.log(obj.username);
	//先获取所有用户的对象//变成数组
	if(window.localStorage.userArr){//判断是否存在
		var array = JSON.parse(window.localStorage.userArr);
	}else{
		array = [];//创建一个新数组
	}




	//登录
	document.getElementById('login').onclick = function(){
		var username = document.getElementById('username1').value;
		var password = document.getElementById('password1').value;


       if(username=="scoyi" && password=="scoyi")
       {
       	location.href="../PROJECT/scoyi.html"
       }
		else{

		if(username=="admin"){
  if(password== "admin"){
   alert("管理员登陆成功");
  location.href="../PROJECT/themain/index.html";//条件表达式1和2为真时，执行该处代码
 }else{
   alert("密码错误")//条件表达式1为真，2为假时，执行该处代码
 }
}else{
 //条件表达式1为假时，执行该处代码





		

		var isHad = false;//定义一个开关变量
		var index = 0 ; //定义一个下标确定用户
		//遍历数组进行匹配
		for(var i =0;i<array.length;i++){
			if(username==array[i].username){//有这个账号
				isHad=true;
				index=i;
 
			}
		}
		if(isHad){//如果存在
			if(password==array[index].password){
				alert("登录成功");
				location.href="../PROJECT/themain/elements.html";
			}else{
				alert("密码错误");
			}
		}
		else{//账号不存在或输入错误
			alert('账号不存在或输入错误');
	
		}
	}
}
	}
 


	//注册
	document.getElementById('regist').onclick = function(){


         var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;


             if(username == "admin" ){
             	alert("该账号已注册");
             }


             else{

              if(username.trim() == "") {
	
               
                alert('用户名要好好写哦(-.-)');
                return false;
            } else if(password.trim() == "") {
                alert('密码要写的啦【；。；】');
                return false;
            } else{
		

          
          

              
		//遍历数组进行匹配
		for(var i =0;i<array.length;i++){
			//判断是否有相同账号
			if(username==array[i].username){
				alert("该账号已存在");
				return;
			}
		}





		//创建对象
		var obj = {username:username,password:password,score:0}
		array.push(obj);
		window.localStorage.userArr=JSON.stringify(array);
		alert("用户创建成功");
 
	}

}
	
 }


 









 
  

          
                     
           

     
                
        
        
   
    


 
          



            



          
            

   
      


    


/*
function cambiar_login() {
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_login";  
document.querySelector('.cont_form_login').style.display = "block";
document.querySelector('.cont_form_sign_up').style.opacity = "0";               

setTimeout(function(){  document.querySelector('.cont_form_login').style.opacity = "1"; },100);  
  
setTimeout(function(){    
document.querySelector('.cont_form_sign_up').style.display = "none";
},400);  

  }








function cambiar_sign_up(at) {
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_sign_up";
  document.querySelector('.cont_form_sign_up').style.display = "block";
document.querySelector('.cont_form_login').style.opacity = "0";
  
setTimeout(function(){  document.querySelector('.cont_form_sign_up').style.opacity = "1";
},100);  

setTimeout(function(){   document.querySelector('.cont_form_login').style.display = "none";
},400);  









}    


//退出登录界面
function ocultar_login_sign_up() {

document.querySelector('.cont_forms').className = "cont_forms";  
document.querySelector('.cont_form_sign_up').style.opacity = "0";               
document.querySelector('.cont_form_login').style.opacity = "0"; 

setTimeout(function(){
document.querySelector('.cont_form_sign_up').style.display = "none";
document.querySelector('.cont_form_login').style.display = "none";
},300);  
  
  }
*/



 



    


        
   

  



 






  
  

    


















    



