import org.testng.annotations.Test;

public class RunTicTacToeProgram extends StatementLogic{

    String INPUT_STRING = "XXXOOOXXX";

    @Test
    public void runTicTacToeProgram (){
        System.out.println("Tictactoe string length must be only 9 symbols (only X, O, - symbols, '-' - means an empty cell)");
        int code = statementCode(INPUT_STRING);
        System.out.println("The statement code of given string is "+code);
        System.out.println(statementMessage(code));
    }
}
