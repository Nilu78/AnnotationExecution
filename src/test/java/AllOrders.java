import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AllOrders extends TestBase{




        @Test
        public void testDeleteAllButton(){

            WebDriver driver = null;
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
            driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
            driver.findElement(By.className("button")).click();

            driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
            driver.findElement(By.name("ctl00$MainContent$btnDelete")).click();

            Assert.assertTrue(driver.getPageSource().contains("List of orders is empty."));
        }



        @Test
        public void testDeleteAllButton2(){



                WebDriver driver = null;
                driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
                driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
                driver.findElement(By.className("button")).click();

                driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
                driver.findElement(By.name("ctl00$MainContent$btnDelete")).click();

                Assert.assertTrue(driver.getPageSource().contains("List of orders is empty."));


            }
        }

