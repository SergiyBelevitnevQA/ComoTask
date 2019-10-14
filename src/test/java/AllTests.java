import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTests extends StatementLogic {

    @Test(dataProvider = "statement", dataProviderClass = DataProvider.class)
    public void allTests(String input, String expectedMessage, int expectedStatementCode) {
        int actualStatementCode = statementCode(input);
        System.out.println("Assert that result of the program with input string '" + input + "' is code: '" +
                expectedStatementCode + "' with message '" + expectedMessage + "'");
        Assert.assertEquals(actualStatementCode, expectedStatementCode);
        Assert.assertEquals(statementMessage(actualStatementCode), expectedMessage);
    }
}
