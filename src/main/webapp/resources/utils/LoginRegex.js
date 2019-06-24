
/**
 * @author zzdd1558@gmail.com
 *
 * @description 회원가입 검증 관련 Regex
 * */
class LoginRegex {

    constructor (){}

    /**
     * @description id 검증 Regex
     *
     * @param {String} id 값
     *
     * @return {Boolean} 검증 관련 true or false
     * */
    isValidId(value){

        let idReg = /^[a-zA-Z]+[a-zA-Z0-9-_]{4,10}$/;
        return this.isValid(idReg , value)
    }

    /**
     * @description Email 검증 Regex
     *
     * @param {String} Email 값
     *
     * @return {Boolean} 검증 관련 true or false
     * */
    isValidEmail (value) {

        let emailReg = /^([a-z0-9_\.-])+@[a-zA-Z]+[\d]*\.(([a-zA-Z]){3}|([a-zA-Z]{2,4}\.[a-zA-Z]{2,4}){1}){1}$/;
        return this.isValid( emailReg , value)
    }

    /**
     * @description 대소문자 , 숫자 ,특수문자 !@#$%^&*()_+-= 까지만 포함되는 8 ~ 16 자리 비밀번호
     *
     * @param {String} password 값
     *
     * @return {Boolean} 검증 관련 true or false
     * */
    isValidPassword(value){

        let passwordReg = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+=-]).{8,16}$/;
        return this.isValid(passwordReg , value)
    }

    /**
     * @description value가 사용 가능한 값인지 정규표현식은 통과되었는지에대한 여부
     *
     * @param {RegExp} 해당되는 정규 표현식
     * @param {String} 정규표현식으로 검사할 값
     *
     * @return {Boolean} 검증 여부 true or false
     * */
    isValid(regex , value) {
        return this.isSet(value) && regex.test(value)
    }

    /**
     * @description parameter value가 undefined인지 길이가 0 인지 체크
     *
     * @param {String} 검사할 value
     *
     * @return {Boolean} 검증 여부 true or false
     * */
    isSet(value){
        return !this.isUndefined(value) && (value.length > 0  || value > 0)
    }

    /**
     * @description value 가 undefined 인지 체크
     *
     * @param {String} 검사할 value
     *
     * @return {Boolean} 검증 여부 true or false
     * */
    isUndefined(value){
        return value === "undefined";
    }
}

