package pairmatching.domain;

public enum Course implements enumModel {
    BACKEND("백엔드")
    , FRONTEND("프론트엔드")
    ;

    private final String name;

    Course(String name) {
        this.name = name;
    }


    @Override
    public String getKey() {
        return name();
    }

    @Override
    public String getValue() {
        return name;
    }
}
