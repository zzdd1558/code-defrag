is29Days = [4, 6 , 9 ,11];

/**
 * @author zzdd1558@gmail.com
 *
 * @description 윤년이 계산되어 나오는 현재 시간 및 날짜 .

 * */
class DateUtil {

    constructor() {
        this.dateObj = new Date();
        this.year = this.dateObj.getFullYear();
        this.month = this.dateObj.getMonth() + 1;
        this.day = this.dateObj.getDate();
        this.maxYear = 120;
    }

    /**
     * @method isLeapYear
     * @description 윤년인지 아닌지 확인
     *
     * @param {Number} selectYear
     *
     * @return {Boolean} true or false
     * */
    isLeapYear(selectYear = this.year) {
        return selectYear % 4 === 0 && selectYear % 100 !== 0 || selectYear % 400 === 0;
    }


    /**
     * @method getYear
     * @description 현재 년도와 최소 년도를 가져옴
     *
     * @return {Object} key : currYear : 현재 년도
     *                        minYear : 회원가입시 사용할 최소 년도
     * */
    getYear() {
        return {"currYear": this.year, "minYear": this.year - this.maxYear}
    }


    /**
     * @method getDays
     * @description 윤년과 월에따른 일 계산
     *
     * @param {Number} selectYear 년
     * @param {Number} selectMonth 월
     *
     * @return {Number} 일
     * */
    getDays(selectYear = this.year, selectMonth = this.month) {

        selectYear = Number(selectYear);
        selectMonth = Number(selectMonth);

        if (selectMonth === 2) {
            if (this.isLeapYear(selectYear)) {
                return 29;
            } else {
                return 28;
            }
        }

        if (is29Days.includes(selectMonth)) {
            return 30;
        } else {
            return 31;
        }
    }

    /**
     * @method getCurrentDate
     * @description 객체가 만들어진 시점에서의 CurrentDate
     *
     * @return {Object} 년 월 일
     * */
    getCurrentDate() {
        return {
            "currYear": this.year,
            "currMonth": this.month,
            "currDays": this.day
        }
    }

    /**
     * @method getCurrentTime
     * @description 현재 시분초를 반환
     *
     * @return {Object} 시 분 초
     * */
    getCurrentTime() {
        let currDate = new Date();
        return {
            "currHour": currDate.getHours(),
            "currMinute": currDate.getMinutes(),
            "currTime": currDate.getSeconds()
        }
    }

    /**
     * @method getCurrentDateAndTime
     * @description 년 월 일 시 분 초
     *
     * @return {Object} 년 월 일 시 분 초
     * */
    getCurrentDateAndTime() {
        return Object.assign(this.getCurrentDate(), this.getCurrentTime())
    }
}

