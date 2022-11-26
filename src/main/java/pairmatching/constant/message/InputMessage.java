package pairmatching.constant.message;

public enum InputMessage {
    INPUT("기능을 선택하세요.")
    ,SELECT("과정, 레벨, 미션을 선택하세요.\n" +
                   "ex) %s, %s, %s")
    ;

    private String message;

    InputMessage(String message) {
        this.message = message;
    }
}
