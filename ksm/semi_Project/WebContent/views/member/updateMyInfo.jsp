<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import = "myPage.model.vo.Member" %>
	
<% 

	Member m = (Member)session.getAttribute("loginUser");

	String userId = m.getUserId();
	String userPwd = m.getUserPwd();
	String userName = m.getUserName();
	String email = m.getEmail();
	String phone = m.getPhone();
	String address = m.getAddress();
	
	String emailCheck = "off";
	String phoneCheck = "off";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
        #background {
            width: 100%;
            height: 1200px;
            background: linear-gradient(rgb(129, 200, 177), rgb(255, 236, 189));
        }
        
        .outline {
            background: rgba(40, 51, 102, 0.363);
            position: absolute;
            left: 30%;
            top: 10%;
            padding-bottom: 1%;
            box-shadow: -3px -3px 5px 3px rgba(129, 200, 177), 3px 0px 5px 3px rgba(129, 200, 177), 0px 3px 5px 3px rgba(255, 236, 189);
            width:35%;
        
        }
        .outline h1{
            text-align:center;
        }
        
        table {
            margin-left: 5%;
            border-spacing: 2em 2em;
        }
        
        .table1 {
            margin-left: 50%;
        }
        
        .enter {
            background-color: transparent;
            padding: 0;
            border: none;
            z-index: 2;
            border-bottom: 2px solid rgba(98, 32, 124, 0.527);
            width: 250px;
        }
        
        .subtable {
            width: auto;
        }
        
        input::-webkit-input-placeholder {
            color: rgba(34, 34, 34, 0.534);
            font-weight: bolder;
        }
        
        .btns {
            padding-left: 20%;
            padding-top: 5%;
        }
        
        .btns input {
            font-weight: bold;
            font-family: Arial;
            background: transparent;
            text-indent: 0px;
            line-height: 0.5em;
            border-radius: 71px;
            text-align: center;
            font-size: 1.5em;
            color: #0d636e;
            width: 176px;
            height: 40px;
            padding: 8px;
            border-width: 2px;
            margin-right: 10%;
        }
    </style>

</head>
<body>

	<div id="background">
		<div class="outline">
			<h1>회원관리 수정</h1>
			<form action="<%= request.getContextPath() %>/updateMember.me" method="post" onsubmit="return updateMember();">
				<table>
					<tr>
						<td class="table1"><label for="joinId">아이디</label></td>
						<td><input type="text" maxlength="15"
							placeholder="영문, 숫자 최대 15글자" id="joinId" class="enter" readonly></td>
						</tr>
					<tr>
						<td class="table1"><label for="password">비밀번호</label></td>
						<td>
							<div class="table2">
								<input type="password" maxlength="15"
									placeholder="영문, 숫자, 특수문자포함 최대 15글자" id="password"
									class="enter">
							</div>
						</td>
					</tr>

					<tr>
						<td class="table1"><label for="joinId">비밀번호 확인</label></td>
						<td>
							<div class="table2">
								<input type="password" maxlength="15"
									placeholder="영문, 숫자 최대 15글자" id="password2" class="enter">
							</div>
						</td>
						<td class="subtable"><label>비밀번호 확인</label></td>
					</tr>
					<tr>
						<td class="table1"><label for="joinId">이름</label></td>
						<td>
							<div class="table2">
								<input type="text" maxlength="5" id="joinId" class="enter" readonly>
							</div>
						</td>
					</tr>
					<tr>
						<td class="table1"><label for="joinId">생년월일</label></td>
						<td>
							<div class="table2">
								<input type="text" maxlength="6" id="joinId"
									placeholder="숫자만 6자리" class="enter" readonly>
							</div>
						</td>
					</tr>
					<tr>
						<td class="table1"><label for="joinId">이메일</label></td>
						<td>
							<div class="table2">
								<input type="email" maxlength="50" placeholder="@포함" id="joinId"
									class="enter">
							</div>
						</td>
						<td class="emailPass"><label id="emailPass">이메일확인</label></td>
					</tr>
					<tr>
						<td class="table1"><label for="joinId">전화번호</label></td>
						<td>
							<div class="table2">
								<input type="tel" maxlength="13" placeholder="-없이" id="joinId"
									class="enter">
							</div>
						</td>
						<td class="emailPass"><label id="emailPass">본인인증</label></td>
					</tr>
					<tr>
						<td class="table1"><label for="joinId">주소</label></td>
						<td>
							<div class="table2">
								<input type="text" maxlength="15" placeholder="이 부분은 찾아야함"
									id="joinId" class="enter">
							</div>
						</td>
					</tr>
					<tr>
						<td class="table1"></td>
						<td>
							<div class="table2">
								<input type="text" maxlength="15" placeholder="이 부분은 찾아야함"
									id="joinId" class="enter">
							</div>
						</td>
					</tr>

				</table>


				<div class="btns">
					<input type="submit" value="수정하기" > 
					<input type="button" value="취소하기" onclick="goMyPage();">
					<input type="button" value="탈퇴하기" onclick="deleteMember();">
				</div>
		
			</form>
		</div>

	</div>
	
	<script>
		function goMyPage() {
			location.href = "<%= request.getContextPath() %>/myMainPage.jsp";
		}
		
		function updateMember() {
			if($("#password").val().trim.length() == 0) {
				alert("비밀번호를 입력해주세요.");
				$("#password").focus();
				return false;
			}
			
			if($("#password2").val().trim.length() == 0 ) {
				alert("비밀번호를 입력해주세요.");
				$("#password2").focus();
				return false;
			}
			
			if(!(emailCheck.equals("on"))) {
				alert("이메일 인증을 해주세요.")
				return false;
			}
			
			if(!(phoneCheck.equals("on"))) {
				alert("휴대폰 인증을 해주세요")
				return false;
			}
			
			return true;
			
			
		}
		
		function emailCheck() {
			// 이메일 체크하는 기능 구현
		}
		
		function phoneCheck() {
			// 핸드폰 변경체크하는 기능 구현
		}
		
		function deleteMember() {
			
			location.href = "<%= request.getContextPath()%>/deleteMember.me"
		}
		
	
	
	
	</script>


</body>
</html>