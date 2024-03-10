package workspacesetting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnsuccessfulLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Login with email
				System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe");
				WebDriver driver = new ChromeDriver ();
				driver.get("https://dev.klaarhq.com");
				driver.manage().window().maximize();
						
					
						
				//click on login with klaar
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//div[@data-cy='login-with-klaar-button']//div[@class='tw-flex-col tw-self-center tw-justify-center lg:tw-items-start xl:tw-flex xl:tw-items-start 2xl:tw-items-start ant-col']")).click();
						

				//verify when entering invalid email address/phone number & password
						
				//click on email field
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='email-field']")).click();
						
						
				//enter invalid email address
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='email-field']")).sendKeys("dpa.nayak@gamma.klaar.team");
						
				//click on password field
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='password-field']")).click();
						
						
				//enter invalid password 
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Klr2021");
						
				//click on Login button
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//button[@id='login-btn']")).click();
						
				
				
			}

		

	}


