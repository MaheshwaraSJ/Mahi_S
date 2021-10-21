import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004957\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		//System.out.println(driver.getTitle());
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	  	System.out.println(driver.getTitle());

	}

}
