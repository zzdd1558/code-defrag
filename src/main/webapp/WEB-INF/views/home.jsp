<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src='${pageContext.request.contextPath}/resources/utils/DateUtil.js'></script>
    <script src='${pageContext.request.contextPath}/resources/utils/LoginRegex.js'></script>
    <script src='${pageContext.request.contextPath}/resources/javascripts/login.js'></script>
    <link href="${pageContext.request.contextPath}/resources/stylesheets/login.css" rel="stylesheet"/>
</head>
<body>
	<div class="wrap">
	    <div class="header"></div>
	    <div class="content">
	        <div class="login">
	            <form id='login-form' autocomplete="off">
	                <div>
	                    <p ><label for="userId">아이디</label></p>
	                    <input id='userId' type="text" name="id">
	                    <span id="idMsg" class="errorMsg"></span>
	                </div>
	                <div>
	                    <p><label for="userPasswd">비밀번호</label></p>
	                    <input id='userPasswd' type="password" name="pass">
	                    <span id="passwordMsg" class="errorMsg"></span>
	                </div>
	                <div>
	                    <p><label for="userPasswdConfirm">비밀번호 확인</label></p>
	                    <input id='userPasswdConfirm' type="password">
	                    <span id="passwordConfirmMsg" class="errorMsg"></span>
	                </div>
	                <div>
	                    <p><label for="userName">이름</label></p>
	                    <input id='userName' type="text" name="name">
	                    <span id="nameMsg" class="errorMsg"></span>
	                </div>
	                <div>
	                    <p><label for="userNickname">닉네임</label></p>
	                    <input id='userNickname' type="text" name="nickName">
	                    <span id="nicknameMsg" class="errorMsg"></span>
	                </div>
	                <div>
	                    <p><label for="userEmail">이메일</label></p>
	                    <input id='userEmail' type="text" name="email">
	                    <span id="emailMsg" class="errorMsg"></span>
	                </div>
	                <div id="birth">
	                    <p><label for="userYear">생년 월일</label></p>
	                    <select name="year" id="userYear">
	                        <option value= -1>년</option>
	                    </select>
	                    <select name="month" id="userMonth">
	                        <option value = -1 selected>월</option>
	                        <option value="01">1</option>
	                        <option value="02">2</option>
	                        <option value="03">3</option>
	                        <option value="04">4</option>
	                        <option value="05">5</option>
	                        <option value="06">6</option>
	                        <option value="07">7</option>
	                        <option value="08">8</option>
	                        <option value="09">9</option>
	                        <option value="10">10</option>
	                        <option value="11">11</option>
	                        <option value="12">12</option>
	                    </select>
	                    <select name="day" id="userDay">
	                        <option value = -1>일</option>
	                    </select>
	                    <span id="birthMsg" class="errorMsg"></span>
	                    <input type="hidden" id="fullBirth" />
	                </div>
	                <div>
	                	<p><label for="userSex">성별</label></p>
	                    <select name="sex" id="userSex">
	                        <option value="0" selected>남성</option>
	                        <option value="1">여성</option>
	                    </select>
	                </div>
	                <div>
	                    <span> <label for="userPhone">휴대폰 번호 </label></span>
	                    <input id='userPhone' type="text" name="phone">
	                    <span id="phoneMsg" class="errorMsg"></span>
	                </div>
	                <div class="center">
	                    <button id="login-submit" class="positive">가입</button>
	                    <button id="login-reset" class="negative">취소</button>
	                </div>
	            </form>
	        </div>
	    </div>
	    <div class="footer"></div>
	
	</div>
</body>
</html>