package baseball.domain;

public enum UserChoice {

    RETRY("1"),
    QUIT("2");

    private final String value;

    UserChoice(String value) {
        this.value = value;
    }

    public static UserChoice from(String input) {
        for (UserChoice userChoice : UserChoice.values()) {
            if (userChoice.value.equals(input)) {
                return userChoice;
            }
        }
        throw new IllegalArgumentException("잘못된 입력입니다.");
    }
}
