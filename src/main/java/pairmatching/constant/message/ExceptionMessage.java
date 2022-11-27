package pairmatching.constant.message;

public enum ExceptionMessage {
    ERROR("[ERROR] ")
    , WRONG_FUNCTION(ERROR + "올바른 기능 번호를 입력해 주세요.")
    , NOT_FOUND_MATCHING(ERROR + "매칭 이력이 없습니다.")
    ;

    private String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
