let dateUtil = new DateUtil();
let loginRegex = new LoginRegex();

window.onload = () => {

    let userId = document.getElementById("userId");
    let userPassword = document.getElementById("userPasswd");
    let userPasswordConfirm = document.getElementById("userPasswdConfirm");
    let userName = document.getElementById("userName");
    let userNickname = document.getElementById("userNickname");
    let userEmail = document.getElementById("userEmail");
    let userYear = document.getElementById("userYear");
    let userMonth = document.getElementById("userMonth");
    let userDays = document.getElementById("userDay");
    let userSex = document.getElementById("userSex");
    let userPhone = document.getElementById("userPhone");
    let loginSubmit = document.getElementById("login-submit");
    let loginReset = document.getElementById("login-reset");

    let {currYear , minYear} =  dateUtil.getYear();
    let {currMonth } = dateUtil.getCurrentDate();

    userYear.addEventListener("change" , () => {
        userMonth.children[0].selected = true;
        userDays.children[0].selected = true;
    });

    userMonth.addEventListener("change" , (e) => {
        let selectYear = userYear.options[userYear.selectedIndex].value;
        let {value} = e.target;

        if (selectYear > 0 && value > 0){
            let days = dateUtil.getDays(selectYear , value);

            let dayLength = userDays.options.length;
            for(let i=1; i<dayLength; i++) {
                userDays.options.remove(1);
            }

            for (let i = 1; i <=  days ; i++){
                let option = optionsForm(i , i);
                userDays.append(option);
            }
        }
    });

    // 종류별 input이 focus를 잃었을떄 발생시키는 Event 유효성 체크 .
    userId.addEventListener("blur" , ()=>{ checkId(userId); } );
    userPassword.addEventListener("blur" , ()=>{ checkPassword(userPassword); });
    userPasswordConfirm.addEventListener("blur" , () => { checkPasswordConfirm(userPasswordConfirm , userPassword)});
    userName.addEventListener("blur" , () => {checkName(userName)});

    let formSubmit = (event) => {
        event.preventDefault();

        let idCheckFlag = checkId(userId);
        let passwordCheckFlag  = checkPassword(userPassword);
        let passwordConfirmCheckFlag = checkPasswordConfirm(userPasswordConfirm , userPassword);
        let nameCheckFlag = checkName(userName);
        let birthCheckFlag = checkBirth(userYear , userMonth , userDays);

        if (idCheckFlag &&  passwordCheckFlag &&  passwordConfirmCheckFlag  && nameCheckFlag  &&   birthCheckFlag ){
            // Login Form
            let loginForm = document.getElementById("login-form");

            // Server 로 전송할 full Birth 정보 .  type = hidden
            let fullBirth = `${userYear.value}${userMonth.value}${userDays.value}`;
            document.getElementById("fullBirth").value = fullBirth;

            // 서버 세팅후 전송
            loginForm.action = "/membership/membershipTrans";
            loginForm.method = "POST";
            loginForm.submit();
        }
    };

    let resetForm = (event) => {
        event.preventDefault();
    };


    setYear(userYear ,currYear , minYear);
    setDays(userDays , currMonth);

    loginSubmit.addEventListener("click" ,formSubmit);
    loginReset.addEventListener("click" , resetForm);
};

let checkId = (idObj , msg = '') => {
    let {value : idValue} = idObj;
    let idMsgObj = document.getElementById("idMsg");
    let check = false;

    if (!loginRegex.isSet(idValue)) {
        msg = LOGIN_MSG.REQUIREED;
    }else if(!loginRegex.isValidId(idValue)){
        msg = LOGIN_MSG.ID_MSG;
    }else {
        check = true;
    }

    check ? idMsgObj.style.display = "none" : idMsgObj.style.display = "inline";
    idMsgObj.textContent = msg;
    return check;
};

let checkPassword = (passwordObj , msg = '' ) => {
    let {value : passwordValue} = passwordObj;
    let passwordMsgObj = document.getElementById("passwordMsg");
    let check = false;

    if (!loginRegex.isSet(passwordValue)){
        msg = LOGIN_MSG.REQUIREED;
    }else if (!loginRegex.isValidPassword(passwordValue)){
        msg = LOGIN_MSG.PASS_MSG;
    }else {
        check = true;
    }
    check ? passwordMsgObj.style.display = "none" : passwordMsgObj.style.display = "inline";
    passwordMsgObj.textContent = msg;
    return check;
};

let checkPasswordConfirm = (passwordConfirmObj , passwordObj ,  msg='') => {
    let {value : passwordValue} = passwordObj;
    let {value : passwordConfirmValue} = passwordConfirmObj;
    let passwordConfirmMsgObj = document.getElementById("passwordConfirmMsg");
    let check = false;

    if (!loginRegex.isSet(passwordConfirmValue)){
        msg = LOGIN_MSG.REQUIREED;
    }else if (!loginRegex.isValidPassword(passwordConfirmValue)){
        msg = LOGIN_MSG.PASS_MSG;
    }else if (!(passwordConfirmValue === passwordValue)){
        msg = LOGIN_MSG.PASS_NOT_CONFIRM;
        passwordConfirmObj.value = '';
    } else{
        check = true;
    }
    check ? passwordConfirmMsgObj.style.display = "none" : passwordConfirmMsgObj.style.display = "inline";
    passwordConfirmMsgObj.textContent = msg;
    return check;
};

let checkName = (userNameObj , msg='') => {
    let {value : userName} = userNameObj;
    let nameMsgObj = document.getElementById("nameMsg");
    let check = false;

    if (!loginRegex.isSet(userName)){
        msg = LOGIN_MSG.REQUIREED;
    }else {
        check = true;
    }

    check ? nameMsgObj.style.display = "none" : nameMsgObj.style.display = "inline";
    nameMsgObj.textContent = msg;
    return check;
};

let checkBirth = (userYear , userMonth , userDays , msg='') => {
    let {value : year} = userYear;
    let {value : month} = userMonth;
    let {value : days} = userDays;
    let check = false;
    let birthMsgObj = document.getElementById("birthMsg");

    if (year !== '-1' && month !== '-1' && days !== '-1'){
        check  = true;
    }else {
        msg = LOGIN_MSG.REQUIREED;
    }

    check ? birthMsgObj.style.display = "none" : birthMsgObj.style.display = "inline";
    birthMsgObj.textContent = msg;
    return check;
};

let setYear = (yearSelectBox , currYear , minYear) => {
    for (let i = currYear; i > minYear; i--) {
        let option = optionsForm(i , i);
        yearSelectBox.append(option);
    }
};

let setDays = (monthSelectBox , currMonth) => {
    let days = dateUtil.getDays(currMonth);

    for (let i = 1; i <= days; i++){
        let option = optionsForm(i , i);
        monthSelectBox.append(option)
    }
};

let optionsForm = (text , value) => {
    let option = document.createElement("option");
    option.text = text;

    value = value < 10 ? `0${value}` : value;
    option.value = value;
    return option;
};