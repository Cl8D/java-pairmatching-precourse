package pairmatching.view;

import pairmatching.constant.message.OutputMessage;

import static pairmatching.constant.Option.*;
import static pairmatching.constant.message.InputMessage.INPUT;
import static pairmatching.constant.message.OutputMessage.*;

public class OutputView {
    public void printFunctionInput() {
        System.out.printf((INPUT.getMessage()) + "%n", OPTION1.getOptionMsg(), OPTION2.getOptionMsg(), OPTION3.getOptionMsg(), QUIT.getOptionMsg());
    }

    public void printError(String message) {
        System.out.println(message);
    }

}
