import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AddtoCart {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));

        String[] itemName={"Cucumber","Brocolli","Beetroot","Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver,itemName);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        System.out.println("git practice");
        System.out.println("chages by gits stuff");

        System.out.println("for branches in github");
        System.out.println("checking");



    }

    public static void addItems(WebDriver driver, String[] itemName){
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        int j = 0;
        for (int i = 0; i < products.size(); i++)
        {
            //Brocoli-1 kg so we need to split and trim
            String[] name=products.get(i).getText().split("-");
            //namr[0]=Brocoli
            //name[1]= 1kg
            //space there so we to trim
            String formattedString  =  name[0].trim();

            //convert array into arraylist
            //then search and add

            List itemNamelist= Arrays.asList(itemName);

            //want to first roe item

            if(itemNamelist.contains(formattedString))
            {
                j++;
                //click to Add to Cart
                //driver.findElements(By.xpath("//[text()='ADD TO CART']")).get(i).click();
                //it is not recomeded to use text base locator when text is dynamic so
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==itemName.length)
                {
                    break;
                }
            }

        }
    }
}
