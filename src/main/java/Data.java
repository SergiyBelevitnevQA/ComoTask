public class Data {

    public enum StateResult {
        invalidInput("Invalid input"),
        validInputInvalidState("Valid input, invalid state"),
        gameOverResultIsTie("Valid state, game is over, result is a tie"),
        gameOverWonX("Valid state, game is over, 'X' won"),
        gameOverWonO("Valid state, game is over, 'O' won"),
        gameStillGoingXToPlay("Valid state, game is still going, 'X' to play"),
        gameStillGoingOToPlay("Valid state, game is still going, 'O' to play"),
        somethingWentWrong("Something went wrong, please check");

        private final String stateResultName;
        StateResult(String stateResultName) {
            this.stateResultName = stateResultName;
        }
        public String getStateResultName() {
            return stateResultName;
        }
    }
}
