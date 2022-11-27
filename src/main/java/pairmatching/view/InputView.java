package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.util.InputValidation;

public class InputView {

    private final InputValidation inputValidation = new InputValidation();

    public String getUserFuncInput() {
        String userInput = Console.readLine();
        return inputValidation.validateFuncInput(userInput);
    }

}
