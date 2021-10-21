import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004957\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Website Tite :"+ driver.getTitle());

		WebElement dropDownElement = driver.findElement(By.cssSelector("[title='Search in']"));
		Select dropDown = new Select(dropDownElement);

		dropDown.selectByIndex(4);
		String variable = dropDown.getFirstSelectedOption().getText();
		System.out.println(variable);

	}

}
