package generalstore.pages;

import generalstore.utils.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormSayfasi {
    public FormSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    private WebElement ulkeMenusu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement isimAlani;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
    private WebElement cinsiyetFemale;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
    private WebElement cinsiyetMale;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    private WebElement letsShopButonu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    private WebElement sayfaBasligi;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private WebElement hataMesaji;

}
