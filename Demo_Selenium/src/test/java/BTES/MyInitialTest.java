package BTES;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.example.BTES.HomePage;
import org.example.BTES.LoginPage;
import org.example.BTES.ParticipantDetailPage;
import org.example.BTES.Participants;
import org.example.Excel.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class MyInitialTest {

    @Test
    public void main() throws IOException, InvalidFormatException {
        LoginPage loginPage=new LoginPage();
        HomePage homePage=new HomePage();
        Participants participants=new Participants();
        ParticipantDetailPage participantsDetailpage=new ParticipantDetailPage();

        loginPage.openUrl("https://online.btes.co.in/login/index.php").enterUser("").enterPassword("").selectRememberMe().clickLoginButton().clickOnCourse("SDET");

        //This code is for read data from Excel
        /* DataReader reader=new DataReader();
        reader.DataReadTest();*/
    }
}