package pairmatching.util;

import pairmatching.constant.Option;

import java.util.List;

import static pairmatching.constant.Option.*;
import static pairmatching.constant.message.ErrorMessage.WRONG_FUNCTION;

public class InputValidation {

    private final List<String> optionNames;

    public InputValidation() {
        this.optionNames = List.of(OPTION1.getOptionNum(), OPTION2.getOptionNum(), OPTION3.getOptionNum(), QUIT.getOptionNum());
    }

    public String validateFuncInput(String userInput) {
        if (!optionNames.contains(userInput)) {
            throw new IllegalArgumentException(String.format(WRONG_FUNCTION.getMessage()));
        }
        return userInput;
    }

}
