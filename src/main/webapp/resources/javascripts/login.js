let dateUtil = new DateUtil();

window.onload = () => {

    let userId = document.getElementById("userId");
    let userPassword = document.getElementById("userPasswd");
    let userPasswordConfirm = document.getElementById("userPasswdConfirm");
    let userName = document.getElementById("userName");
    let userYear = document.getElementById("userYear");
    let userMonth = document.getElementById("userMonth");
    let userDays = document.getElementById("userDay");
    let userPhone = document.getElementById("userPhone");
    let loginSubmit = document.getElementById("login-submit");
    let loginReset = document.getElementById("login-reset");

    let {currYear , minYear} =  dateUtil.getYear();
    let {currMonth , currDays} = dateUtil.getCurrentDate();
    
    setYear(userYear ,currYear , minYear);
    setDays(userDays , currMonth)
    userYear.value = currYear;
    userMonth.value = currMonth;
    userDays.value = currDays;
    
    

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

            for (let i = 0; i <=  days ; i++){
                let option = optionsForm(i , i);
                userDays.append(option);
            }
        }
    })

    loginSubmit.addEventListener("click" ,formSubmit);
    loginReset.addEventListener("click" , resetForm);
};

let formSubmit = (event) => {
    event.preventDefault();
};

let resetForm = (event) => {
	event.preventDefault();
}

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
}

let optionsForm = (text , value) => {
    let option = document.createElement("option");
    option.text = text;
    option.value = value;
    return option;
};