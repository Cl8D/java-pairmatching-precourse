package pairmatching.constant.message;

// separator
public enum OutputMessage {
    SEPARATOR("#############################################")
    , COURSE_INFO("과정: %s | %s")
    , MISSION("미션:\n" +
            "  - %s: %s | %s | %s\n" +
            "  - %s: %s | %s | %s\n" +
            "  - %s: \n" +
            "  - %s: %s | %s\n" +
            "  - %s: ")
    , MATCHING_RESULT("페어 매칭 결과입니다.")
    , MATCHING_INFO("%s : %s")
    ;

    private String message;

    OutputMessage(String message) {
        this.message = message;
    }
}
