package pairmatching.constant.message;

import static pairmatching.domain.Course.BACKEND;
import static pairmatching.domain.Course.FRONTEND;
import static pairmatching.domain.Level.*;

public final class OutputMessage {
    private final static String SEPARATOR = "#############################################\n";
    private final static String COURSE = "과정: %s | %s\n`";
    private final static String MISSION = "미션:\n";

    private final static String MATCHING_RESULT = "페어 매칭 결과입니다.";

    private final static String MATCHING_INFO = "%s : %s";

    public static String getOptionInfo() {
        return SEPARATOR +
                String.format(COURSE, BACKEND.getValue(), FRONTEND.getValue()) +
                MISSION + LEVEL1 + LEVEL2 + LEVEL3 + LEVEL4 + LEVEL5 +
                SEPARATOR;
    }
}
