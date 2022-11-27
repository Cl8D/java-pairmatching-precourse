package pairmatching.domain;

import java.util.List;
import java.util.stream.Collectors;

import static pairmatching.domain.Mission.*;

public enum Level {

    LEVEL1("레벨1", List.of(CAR, LOTTO, BASEBALL)) {
        @Override
        public String toString() {
            List<String> missionNames = LEVEL1.missions.stream().map(Mission::getValue).collect(Collectors.toList());
            return "  - " + LEVEL1.message + ": " + String.join(" | ", missionNames) + "\n";
        }
    },
    LEVEL2("레벨2", List.of(BUCKET, PAYMENT, SUBWAY)) {
        @Override
        public String toString() {
            List<String> missionNames = LEVEL2.missions.stream().map(Mission::getValue).collect(Collectors.toList());
            return "  - " + LEVEL2.message + ": " + String.join(" | ", missionNames) + "\n";
        }
    },
    LEVEL3("레벨3", null) {
        @Override
        public String toString() {
            return "  - " + LEVEL3.message + ": \n";
        }
    },
    LEVEL4("레벨4",  List.of(IMPROVEMENT, DEPLOY)) {
        @Override
        public String toString() {
            List<String> missionNames = LEVEL4.missions.stream().map(Mission::getValue).collect(Collectors.toList());
            return "  - " + LEVEL4.message + ": " + String.join(" | ", missionNames)+ "\n";
        }
    },
    LEVEL5("레벨5", null) {
        @Override
        public String toString() {
            return "  - " + LEVEL5.message + ": \n";
        }
    };

    private final String message;

    private final List<Mission> missions;

    Level(String message, List<Mission> missions) {
        this.message = message;
        this.missions = missions;
    }

    public String getMessage() {
        return message;
    }
}
