package pairmatching.constant;

import java.util.List;

import static pairmatching.constant.Mission.*;

public enum Level {
    LEVEL1("레벨1", List.of(CAR, LOTTO, BASEBALL)),
    LEVEL2("레벨2", List.of(BUCKET, PAYMENT, SUBWAY)),
    LEVEL3("레벨3", null),
    LEVEL4("레벨4", List.of(IMPROVEMENT, DEPLOY)),
    LEVEL5("레벨5", null);

    private String name;

    private List<Mission> missions;

    Level(String name, List<Mission> missions) {
        this.name = name;
        this.missions = missions;
    }
}
