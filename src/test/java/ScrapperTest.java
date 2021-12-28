import agh.miak.Scrapper;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ScrapperTest {
    private static final String WEB_REQUESTER = String.format("class WebRequester {static request = new XMLHttpRequest();static parser = new DOMParser();static getRequest(address) {this.request.open('GET', address, false);this.request.send(null);return this.parser.parseFromString(this.request.responseText, 'text/html');}}%n%n");

    @DataProvider(name = "data")
    public Object[][] dataProv() {
        return new Object[][]{
                {"xar SET 'tekst';", String.format("xar = 'tekst'%n")},
                {"CREATE xar SET 15;", String.format("let xar = 15%n")},
                {"CREATE xar SET 15 + 12;", String.format("let xar = 15 + 12%n")},
                {"CREATE sar SET '15' + 12;", String.format("let sar = '15' + 12%n")},
                {"CREATE arr SET 18.2 + \"12.12ar\";", String.format("let arr = 18.2 + \"12.12ar\"%n")},
                {"xar SET 15 + 12 + 11 + 15;", String.format("xar = 15 + 12 + 11 + 15%n")},
                {"xar SET 15 + 12 + 11 + 15;xar SET xar + 12;", String.format("xar = 15 + 12 + 11 + 15%nxar = xar + 12%n")},
                {"CREATE X SET GET ELEMENTS BY CLASS NAME \"classname\";", String.format("let X = document.getElementsByClassName(\"classname\")%n")},
                {"X SET GET ELEMENTS BY TAG NAME \"tag\";", String.format("X = document.getElementsByTagName(\"tag\")%n")},
                {"X SET 'lol' + GET ELEMENTS BY TAG NAME \"tag\";", String.format("X = 'lol' + document.getElementsByTagName(\"tag\")%n")},
                {"X SET GET ELEMENTS BY TAG NAME \"tag\" + 'lol';", String.format("X = document.getElementsByTagName(\"tag\") + 'lol'%n")},
                {"LOG x;", String.format("console.log(x)%n")},
                {"LOG underSite GET ELEMENTS BY CLASS NAME \"page__description\";;", String.format("console.log(underSite.getElementsByClassName(\"page__description\"))%n")},
                {"LOG GET ELEMENTS BY TAG NAME 'tag';", String.format("console.log(document.getElementsByTagName('tag'))%n")},
                {"x SET 12 + PARSE '12' TO INT;", String.format("x = 12 + parseInt('12')%n")},
                {"x SET PARSE 12.5 + '11' TO STRING + 12;", String.format("x = String(12.5 + '11') + 12%n")},
                {"x SET PARSE '11.2' TO FLOAT;", String.format("x = parseFloat('11.2')%n")},
                {"x SET bercik[2] + 12 + bercik[3];", String.format("x = bercik[2] + 12 + bercik[3]%n")},
                {"x SET bercik[2 + PARSE '112' TO INT];", String.format("x = bercik[2 + parseInt('112')]%n")},
                {"x SET bercik[2 + PARSE '112' TO INT] INNER TEXT;", String.format("x = bercik[2 + parseInt('112')].innerText%n")},
                {"a[2] SET 5;", String.format("a[2] = 5%n")},
                {"a[2] SET 'cos' REPLACE 's' WITH 'nieco';", String.format("a[2] = 'cos'.replace('s', 'nieco')%n")},
                {"CREATE st SET arr[2 + 3] REPLACE 'ora' WITH 'aro';", String.format("let st = arr[2 + 3].replace('ora', 'aro')%n")},
                {"x SET something LENGTH;", String.format("x = something.length%n")},
                {"x SET GET WEB 'https://www.youtube.com/';", String.format(WEB_REQUESTER + "x = WebRequester.getRequest('https://www.youtube.com/')%n")},
                {"x SET GET WEB variable GET ELEMENTS BY CLASS NAME 'someclass';", String.format(WEB_REQUESTER + "x = WebRequester.getRequest(variable).getElementsByClassName('someclass')%n")},
                {"CREATE x SET 5;FOR LOOP i FROM 1 TO 5 x SET x + 1; END FOR;", String.format("let x = 5%nfor( let i = 1; i < 5; i++){%n\tx = x + 1%n}%n")},
        };
    }

    @Test(dataProvider = "data")
    public void setTest(String input, String expectedOutput) {
        CodePointCharStream charStream = CharStreams.fromString(input);
        Scrapper letter = new Scrapper(charStream);
        String output = letter.parse();
        Assert.assertEquals(
                output,
                expectedOutput);
    }
}
