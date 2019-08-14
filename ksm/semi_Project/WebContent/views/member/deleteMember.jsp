<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			
			비밀번호 입력란
			
			<input type="button" onclick="checkPassword();">		
		</div>
		
		<div>
		
			승인창
			
			<input type="button" onclick="deleteMember();">
		
		</div>
	</div>
	
	<script>
		function checkPassword() {
			//세션이랑 비밀번호가 같으면 확인창 띄우기
		}
		
		function deleteMember() {
			location.href="<%= request.getContextPath() %>/delete.me"
		}
		
		
		
		
	
	</script>
</body>
</html>