package base;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows {
	@Test
	public void url() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");

		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphones");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
		for(int i=0; i<5;i++) {
			li.get(i).click();
	
		
				List<WebElement> text=driver.findElements(By.xpath("//*[@class='a-price-whole']"));
				String str= text.get(i).getAttribute("innerText");
				System.out.println(str);
				//driver.close();
		

		
		
		
	}

	}
}
