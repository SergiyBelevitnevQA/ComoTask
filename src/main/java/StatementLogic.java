public class StatementLogic extends MethodsForString {

    /**
     * Method returns statement code as int from given string
     * @param input - given string
     * @return
     */
    public int statementCode(String input) {
        if (isInputValid(input)) {
            if (isStateValid(input)) {
                if (isResultTie(input)) {
                    return 3;
                } else {
                    if (isSomebodyWin(input, 'X')) {
                        return 4;
                    } else if (isSomebodyWin(input, 'O')) {
                        return 5;
                    } else {
                        if (gameIsGoingXToPlay(input)) {
                            return 6;
                        } else {
                            return 7;
                        }
                    }
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    /**
     * Method returns statement message  from given statement code
     * @param statementCode - statement code
     * @return
     */
    public String statementMessage(int statementCode) {
        String message;
        switch (statementCode) {
            case (1):
                message = Data.StateResult.invalidInput.getStateResultName();
                break;
            case (2):
                message = Data.StateResult.validInputInvalidState.getStateResultName();
                break;
            case (3):
                message = Data.StateResult.gameOverResultIsTie.getStateResultName();
                break;
            case (4):
                message = Data.StateResult.gameOverWonX.getStateResultName();
                break;
            case (5):
                message = Data.StateResult.gameOverWonO.getStateResultName();
                break;
            case (6):
                message = Data.StateResult.gameStillGoingXToPlay.getStateResultName();
                break;
            case (7):
                message = Data.StateResult.gameStillGoingOToPlay.getStateResultName();
                break;
            default:
                message = Data.StateResult.somethingWentWrong.getStateResultName();;
                break;
        }
        return message;
    }
}
