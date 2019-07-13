<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src='./resources/utils/DateUtil.js'></script>
    <script src='./resources/javascripts/login.js'></script>
    <link href="./resources/stylesheets/login.css" rel="stylesheet"/>
</head>
<body>
<div class="wrap">
    <div class="header"></div>
    <div class="content">
        <div class="login">
            <form id='login-form'>
                <div>
                    <p><label for="userId">아이디</label></p>
                    <input id='userId' type="text">
                </div>
                <div>
                    <p><label for="userPasswd">비밀번호</label></p>
                    <input id='userPasswd' type="password">
                </div>
                <div>
                    <p><label for="userPasswdConfirm">비밀번호 확인</label></p>
                    <input id='userPasswdConfirm' type="password">
                </div>
                <div>
                    <p><label for="userName">이름</label></p>
                    <input id='userName' type="text">
                </div>
                <div id="birth">
                    <p><label userPhone="userYear">생년 월일</label></p>
                    <select name="year" id="userYear">
                        <option value= -1>년</option>
                    </select>

                    <select name="month" id="userMonth">
                        <option value = -1 selected>월</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                        <option>7</option>
                        <option>8</option>
                        <option>9</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                    </select>

                    <select name="day" id="userDay">
                        <option value = -1>일</option>
                    </select>
                </div>
                <div>
                    <span> <label for="userPhone">휴대폰 번호 </label></span>
                    <input id='userPhone' type="text">
                </div>
                <div>
                	<button id="login-submit">가입</button>
                	<button id="login-reset">취소</button>
                </div>
            </form>
        </div>
    </div>
    <div class="footer"></div>

</div>
</body>
</html>