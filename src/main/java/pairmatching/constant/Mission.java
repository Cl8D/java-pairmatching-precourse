package pairmatching.constant;

public enum Mission {
    CAR("자동차경주")
    , LOTTO("로또")
    , BASEBALL("숫자야구게임")
    , BUCKET("장바구니")
    , PAYMENT("결제")
    , SUBWAY("지하철노선도")
    , IMPROVEMENT("성능개선")
    , DEPLOY("배포")
    ;

    private String name;

    Mission(String name) {
        this.name = name;
    }
}
