package TestAuto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String titrePage = driver.getTitle();
		if(titrePage.equals("Test Login | Practice Test Automation"))
		{System.out.println("test ok");

	}
		else
		{
			System.out.println("test KO");
		}

	}}
