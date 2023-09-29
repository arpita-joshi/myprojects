package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {

	public static void main(String[] args) {
		
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://docs.python.org/3/tutorial/");
				String title = driver.getTitle();
				System.out.println("the title is: " +title);
				
				String url = driver.getCurrentUrl();
				System.out.println("the url is: " +url);
				
				driver.close();

			}

	


	}

