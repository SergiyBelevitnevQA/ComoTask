
public class DataProvider {

    @org.testng.annotations.DataProvider(name = "statement")
    public static Object[][] testData() {

        final String INVALID_INPUT = "GFJSLAL";
        final String VALID_INPUT_INVALID_STATE = "XXXXXXXXX";
        final String RESULT_IS_TIE = "XXOOOXXOX";
        final String GAME_OVER_X_WON = "XXXOOXOOX";
        final String GAME_OVER_O_WON = "XXOOOXOXX";
        final String GAME_STILL_GOING_X_TO_PLAY = "XX--O--O-";
        final String GAME_STILL_GOING_O_TO_PLAY = "OOXX----X";

        return new Object[][]{
                {INVALID_INPUT, Data.StateResult.invalidInput.getStateResultName(), 1},
                {VALID_INPUT_INVALID_STATE, Data.StateResult.validInputInvalidState.getStateResultName(), 2},
                {RESULT_IS_TIE, Data.StateResult.gameOverResultIsTie.getStateResultName(), 3},
                {GAME_OVER_X_WON, Data.StateResult.gameOverWonX.getStateResultName(), 4},
                {GAME_OVER_O_WON, Data.StateResult.gameOverWonO.getStateResultName(), 5},
                {GAME_STILL_GOING_X_TO_PLAY, Data.StateResult.gameStillGoingXToPlay.getStateResultName(), 6},
                {GAME_STILL_GOING_O_TO_PLAY, Data.StateResult.gameStillGoingOToPlay.getStateResultName(), 7},
        };
    }
}
