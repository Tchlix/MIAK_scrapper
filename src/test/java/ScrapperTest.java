import agh.miak.Scrapper;
import org.antlr.v4.runtime.CharStreams;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ScrapperTest {

    @DataProvider(name = "data")
    public Object[][] dataProv() {
        return new Object[][]{
                {"xar SET 'tekst';", String.format("xar = 'tekst'%n")},
                {"CREATE xar SET 15;", String.format("var xar = 15%n")},
                {"CREATE xar SET 15 + 12;", String.format("var xar = 15 + 12%n")},
                {"CREATE sar SET '15' + 12;", String.format("var sar = '15' + 12%n")},
                {"CREATE arr SET 18.2 + \"12.12ar\";", String.format("var arr = 18.2 + \"12.12ar\"%n")},
                {"xar SET 15 + 12 + 11 + 15;", String.format("xar = 15 + 12 + 11 + 15%n")},
                {"xar SET 15 + 12 + 11 + 15;xar SET xar + 12;", String.format("xar = 15 + 12 + 11 + 15%nxar = xar + 12%n")},
                {"CREATE X SET GET ELEMENTS BY CLASS NAME \"classname\";", String.format("var X = document.getElementsByClassName(\"classname\")%n")},
                {"X SET GET ELEMENTS BY TAG NAME \"tag\";", String.format("X = document.getElementsByTagName(\"tag\")%n")},
                {"X SET 'lol' + GET ELEMENTS BY TAG NAME \"tag\";", String.format("X = 'lol' + document.getElementsByTagName(\"tag\")%n")},
                {"LOG x;", "console.log(x)"},
        };
    }

    @Test(dataProvider = "data")
    public void setTest(String input, String expectedOutput) {
        var charStream = CharStreams.fromString(input);
        Scrapper letter = new Scrapper(charStream);
        var output = letter.parse();
        Assert.assertEquals(
                output,
                expectedOutput);
    }
}
