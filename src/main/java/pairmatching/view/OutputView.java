package pairmatching.view;

import pairmatching.constant.message.InputMessage;
import pairmatching.constant.message.OutputMessage;

public class OutputView {
    public void printFunctionInput() {
        System.out.println(InputMessage.getOptionMessage());
    }

    public void printError(String message) {
        System.out.println(message);
    }

    public void printMatchingOption() {
        System.out.println(OutputMessage.getOptionInfo());
        System.out.println(InputMessage.getSelectMessage());
    }
}
