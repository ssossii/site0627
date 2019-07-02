<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
addEventListener("load", function(){
	var bt= document.querySelector("button");
	
	bt.addEventListener("click", function(){
		alert("aa");
		send();
	});
});

function send(){
	var form=document.querySelector("form");
	form.action="/temp";
	form.method="post";
	form.submit();
}
</script>
</head>
<body>
	
	<form>
		<input type="text" name="user" id="" placeholder="이름입력" />
		<br>
		<input type="text" name="phone" id="" placeholder="연락처 입력" />
	</form>
	<button>전송</button>
</body>
</html>