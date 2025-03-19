import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Tablesorting117 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        //click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();

        //capture all webeliment into list
        List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));

        //capture text of all webeliment into new(original) list// asssuming get in sorted order
        List<String> orignalList= elementList.stream().map(s->s.getText()).collect(Collectors.toList());

        //sort  the original list of step 3 - > sorted list
        List<String> sortedList = orignalList.stream().sorted().collect(Collectors.toList());

        //compare original with sorted list
        Assert.assertTrue(orignalList.equals(sortedList));

        //scan the name column with gettax->Beans->print the price of Beans
//        List<String> price= elementList.stream().filter(s->s.getText().contains("Beans"))
//                .map(s->getPriceVeggies(s)).collect(Collectors.toList());
//        //print price of beans veggies
//        price.forEach(a-> System.out.println(a));

        ////scan the name column with gettax->Rice->print the price of Rice which is on forth page
        List<String> price;
        do
        {
            List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));
            price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggies((s))).collect(Collectors.toList());
            price.forEach(a-> System.out.println(a));
            if(price.size()<1)
            {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }while (price.size()<1);
    }

    private static String getPriceVeggies(WebElement s) {
        String priceValue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
