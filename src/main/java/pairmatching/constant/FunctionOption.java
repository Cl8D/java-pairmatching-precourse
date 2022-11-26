package pairmatching.constant;

public enum FunctionOption {
    OPTION1("1. 페어 매칭", "3")
    , OPTION2("2. 페어 조회", "2")
    , OPTION3("3. 페어 초기화", "3")
    , QUIT("Q. 종료", "Q")
    ;

    private String optionMsg;

    private String optionNum;

    FunctionOption(String optionMsg, String optionNum) {
        this.optionMsg = optionMsg;
        this.optionNum = optionNum;
    }
}
