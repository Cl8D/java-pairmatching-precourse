package pairmatching.constant;

public enum Option {
    OPTION1("1. 페어 매칭", "1")
    , OPTION2("2. 페어 조회", "2")
    , OPTION3("3. 페어 초기화", "3")
    , QUIT("Q. 종료", "Q")
    ;

    private final String optionMsg;

    private final String optionNum;

    Option(String optionMsg, String optionNum) {
        this.optionMsg = optionMsg;
        this.optionNum = optionNum;
    }

    public String getOptionMsg() {
        return optionMsg;
    }

    public String getOptionNum() {
        return optionNum;
    }
}
