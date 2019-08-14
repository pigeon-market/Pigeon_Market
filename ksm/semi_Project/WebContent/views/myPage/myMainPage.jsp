<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	div {
		border: 1px solid blue;
		display: inline-flex;
	}
	
	.mainform {
		width: 100%;
	}
	
	.btndiv {
		width: 25%;
		border: 1px solid green;
		min-height: 200px;
		text-align: center;
		justify-content: space-around;
		margin: 0px 10px 0px 10px;
		align-items: center;
	}
</style>
</head>
<body>
	<div class="mainform">

		<div class="btndiv" id="구매정보" onclick="buyinfo();">구매정보</div>
		<div class="btndiv" id="판매정보" onclick="sellinfo();">판매정보</div>
		<div class="btndiv" id="배송정보" onclick="delivinfo();">배송정보</div>
		<div class="btndiv" id="회원정보수정" onclick="myinfo();">회원정보 수정</div>

	</div>
	<script>
		function buyinfo() {
				location.href="<%= request.getContextPath() %>/buyinfo.me"
		}
		
		function sellinfo(){
				location.href="<%= request.getContextPath() %>/sellinfo.me"
	
		}
		
		function delivinfo() {
				location.href="<%= request.getContextPath() %>/delivinfo.me"
		}
		
		function myinfo() {
				location.href="<%= request.getContextPath() %>/MyInfo.me"
		}
	
	</script>

</body>
</html>