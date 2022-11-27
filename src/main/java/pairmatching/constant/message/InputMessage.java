package pairmatching.constant.message;

import pairmatching.domain.Mission;

import static pairmatching.constant.Option.*;
import static pairmatching.domain.Course.BACKEND;
import static pairmatching.domain.Level.LEVEL1;

public final class InputMessage {

    private static final String INPUT = "기능을 선택하세요.\n%s\n%s\n%s\n%s";

    private static final String SELECT = "과정, 레벨, 미션을 선택하세요.\nex) %s, %s, %s";

    public static String getOptionMessage() {
        return String.format(INPUT, OPTION1.getOptionMsg(), OPTION2.getOptionMsg(), OPTION3.getOptionMsg(), QUIT.getOptionMsg());
    }

    public static String getSelectMessage() {
        return String.format(SELECT, BACKEND.getValue(), LEVEL1.getMessage(), Mission.CAR.getValue());
    }

}
