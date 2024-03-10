package workspacesetting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserFieldsPage {

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
										

				//click on email field
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='email-field']")).click();
							
								
				//enter valid email address
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='email-field']")).sendKeys("deepa.nayak@gamma.klaar.team");
								
				//click on password field
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='password-field']")).click();
								
								
				//enter valid password 
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Klaar2021");
								
				//click on Login button
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//button[@id='login-btn']")).click();
						
						
						
				//click on setting module
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//body[1]/div[2]/app-root[1]/app-layout[1]/nz-layout[1]/nz-sider[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[7]/button[1]/li[1]")).click();
			
				
				//click on user list sub-module
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[normalize-space()='User List']")).click();
					
				
			
				
				//click on custome fields tab
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//div[contains(text(),'Custom Fields')]")).click();
				
			
		        //click on Add field button
		      	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		        driver.findElement(By.xpath("//span[normalize-space()='Add Field']")).click();
		        
		        
		        //click on name placeholder
		      	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		      	driver.findElement(By.xpath("//input[@placeholder='Enter field name...']")).click();
		        
		        //enter valid field name
		        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		       	driver.findElement(By.xpath("//input[@placeholder='Enter field name...']")).sendKeys("Date1");
		        
		        //click on field type dropdown
		       	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		        driver.findElement(By.xpath("//input[@class='ant-select-selection-search-input ng-untouched ng-pristine ng-valid']")).click();
		        
		       //select dropdown option
		      	WebElement optionToSelect = driver.findElement(By.xpath("//nz-option-item[@title='Date']"));
		      	optionToSelect.click();
		      		
		      		
		        //click on submit button
		      	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		       	 driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		       	
		       	 
		       	 //refresh page
		       	 driver.navigate().refresh();

		        
		        //click on any one of user
		      	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		      	driver.findElement(By.xpath("//td[normalize-space()='klaar-internal.17089322@klaar.test.live']")).click();
		        
		       //click on company tab
		       	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		      	driver.findElement(By.xpath("//div[contains(text(),'Company')]")).click();   
		      	
		        
		      	
		      	//scroll down
		      	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		      	JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,1000)");
		      	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		      	
		      	
		      	driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		        WebElement myElement = driver.findElement(By.xpath("//nz-date-picker[@class='ng-tns-c179-800 ant-picker ng-untouched ng-pristine ng-valid ng-star-inserted']"));
		        Actions actions = new Actions(driver);
		        actions.moveToElement(myElement).click().perform();


		        //click on date field
		      	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		      	driver.findElement(By.xpath("//nz-date-picker[@class='ng-tns-c179-800 ant-picker ng-untouched ng-pristine ng-valid ng-star-inserted']")).click();
		      	
		     
		      
		      	
		      	
		      	
		      	
			}
			

		
	}


