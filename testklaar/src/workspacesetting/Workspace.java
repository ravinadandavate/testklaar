package workspacesetting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workspace {

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
				
				
				//click on Workspace Name placeholder
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='Organization name']"));
				
				String currentValue = inputField.getAttribute("value");

				for(int i = 0; i < currentValue.length(); i++) {
				    inputField.sendKeys(Keys.BACK_SPACE);
				}
				
				
				//enter data into Workspace Name placeholder 
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@placeholder='Organization name']")).sendKeys("ravina.sawant");
						
				//click on Save changes button
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//button[@data-cy='settings-workspace-save-changes-button']")).click();
						
				
								
				
				
				//click on Select head of Org Chart placeholder
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		        driver.findElement(By.xpath("//nz-select-top-control[@class='ant-select-selector ng-tns-c144-5']")).click();
				
		    
		        //select dropdown option
		        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		        WebElement myElement = driver.findElement(By.cssSelector("nz-option-item:nth-child(10) div:nth-child(1) div:nth-child(1) p:nth-child(1)"));
		        Actions actions = new Actions(driver);
		        actions.moveToElement(myElement).click().perform();

		      		
				//click on save button
				driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		        driver.findElement(By.xpath("//button[@data-cy='settings-organization-save-button']")).click();
		          
		        
		       //click on choose file button 
		       // WebElement element = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']"));
		      //  element.sendKeys("C:\\Users\\LENOVO\\Desktop\\SampleJPGImage.jpg");
		      //  Actions actions1 = new Actions(driver);
		      //  actions1.moveToElement(element).click().perform();
		        
		        
		        
		        
		         driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		         //driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']")).click();
		        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		        WebElement chooseFile = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ng-star-inserted']"));
		        chooseFile.sendKeys("C:\\Software\\SampleJPGImage.jpg");
		       
		       
			}

		

	}


