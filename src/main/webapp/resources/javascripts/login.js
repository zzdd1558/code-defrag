window.onload = () => {

    let userId = document.getElementById("userId");
    let userPassword = document.getElementById("userPasswd");
    let userPasswordConfirm = document.getElementById("userPasswdConfirm");
    let userName = document.getElementById("userName");
    let userYear = document.getElementById("userYear");
    let userMonth = document.getElementById("userMonth");
    let userDay = document.getElementById("userDay");
    let userPhone = document.getElementById("userPhone");
    let Date = new DateUtil();
    let {currYear , minYear} =  Date.getYear();

    setYear(userYear ,currYear , minYear);

    userYear.addEventListener("change" , () => {
        userMonth.children[0].selected = true;
        userDay.children[0].selected = true;
    });

    userMonth.addEventListener("change" , (e) => {
        let selectYear = userYear.options[userYear.selectedIndex].value;
        let {value} = e.target;

        if (selectYear > 0 && value > 0){
            let days = Date.getDays(selectYear , value);

            let dayLength = userDay.options.length;
            for(let i=1; i<dayLength; i++) {
                userDay.options.remove(1);
            }

            for (let i = 0; i <=  days ; i++){
                let option = optionsForm(i , i);
                userDay.append(option);
            }
        }
    })
};

let setYear = (selectObj , currYear , minYear) => {
    for (let i = currYear; i > minYear; i--) {
        let option = optionsForm(i , i);
        selectObj.append(option);
    }
};

let optionsForm = (text , value) => {
    let option = document.createElement("option");
    option.text = text;
    option.value = value;
    return option;
};