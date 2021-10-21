import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\00004957\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");

}
}
