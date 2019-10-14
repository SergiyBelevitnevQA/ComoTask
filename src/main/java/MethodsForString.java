public class MethodsForString {

    /**
     * Method returns counter of repeated items in given string
     * @param input - given string
     * @param charToCompare - char that we have to count
     * @return
     */
    long countOfRepeatedItemsInString(String input, char charToCompare) {
        return input.chars().filter(currentChar -> currentChar == charToCompare).count();
    }

    /**
     * Method returns true if game is still going and next step will make 'X'
     * @param input - given string
     * @return
     */
    boolean gameIsGoingXToPlay(String input) {
        return countOfRepeatedItemsInString(input, 'X') == countOfRepeatedItemsInString(input, 'O');
    }

    /**
     * Method returns true if given Sting is valid (length is 9 symbols, and contains only X,O,-
     * @param input - given string
     * @return
     */
    boolean isInputValid(String input) {
        return input.matches("^[XO-]{9}$");
    }

    /**
     * Method returns true if given Sting contains correct state (quantity of 'X' equals quantity or 1 more, and sting
     * doesn't contain statement when 'X' won and 'O' won at the same time)
     * @param input - given string
     * @return
     */
     boolean isStateValid(String input) {
        long xCount = countOfRepeatedItemsInString(input, 'X');
        long OCount = countOfRepeatedItemsInString(input, 'O');
        boolean b = !(isSomebodyWin(input, 'X') & isSomebodyWin(input, 'O'));
        long diffXO = xCount - OCount;
        return (diffXO == 0 | diffXO == 1) & b;
    }

    /**
     * Method returns true if game is over and result is tie(String contains only X,O  and nobody won)
     * @param input - given string
     * @return
     */
    boolean isResultTie(String input) {
        return input.matches("^[XO]{9}$") & (!isSomebodyWin(input, 'X')) & (!isSomebodyWin(input, 'O'));
    }

    /**
     * Method returns two-dimensional array of indexes for winning combinations
     * @return
     */
    private static int[][] winningCombinationsIndexes() {
        return new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
    }

    /**
     * Method returns true if somebody ('X' or 'O' as param) won
     * @param input - given string
     * @param xOrO - 'X' or 'O'
     * @return
     */
    boolean isSomebodyWin(String input, char xOrO) {
        boolean isSomebodyWinByGivenChar = false;
        for (int i = 0; i < 8; i++) {
            isSomebodyWinByGivenChar =
                        input.charAt(winningCombinationsIndexes()[i][0])==xOrO &
                        input.charAt(winningCombinationsIndexes()[i][1])==xOrO &
                        input.charAt(winningCombinationsIndexes()[i][2])==xOrO;
            if (isSomebodyWinByGivenChar) {
                break;
            }
        }
        return isSomebodyWinByGivenChar;
    }
}
