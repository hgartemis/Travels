package pages.travels;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class travels_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='s2id_autogen16']/a/span[1]")
    WebElement inputDestino;

    @FindBy(xpath = "*[@id='s2id_autogen16']/a/span[1]")
    WebElement inputDestino1;


    @FindBy(id = "checkin")
    WebElement fechaCheckIn;

    @FindBy(id = "checkout")
    WebElement fechaCheckOut;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]")
    WebElement btnAsignaAdult;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]")
    WebElement btnAsignaNinos;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[4]/button")
    WebElement btnBusqueda;

    public travels_page(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setDestino(String buscar) throws InterruptedException {

        System.out.println(buscar);
        Driver.explicitWait(inputDestino);
        inputDestino.click();

        //Driver.implicitWaitEspecial();
        //inputDestino.sendKeys(buscar);
    }

    public void setDestino1(String buscar) throws InterruptedException {

        System.out.println("Destino1");

        Driver.implicitWaitEspecial();

        Actions builder = new Actions(driver);
        builder.moveToElement(inputDestino1).sendKeys(buscar).build().perform();
        //builder.moveToElement(inputDestino1).click();
        //builder.moveToElement(inputDestino1).sendKeys(postContent).perform();
        //inputDestino1.sendKeys(buscar);

    }

    public void setCheckIn(String fechaIn)
    {
        fechaCheckIn.sendKeys(fechaIn);
    }

    public void setCheckOut(String fechaOut)
    {
        fechaCheckOut.sendKeys(fechaOut);
    }

    public void setCantidadAdulto(Integer cantidad)
    {
        for (int i=1; i<cantidad; cantidad++)
        {
            btnAsignaAdult.click();
        }
    }

    public void setCantidadNino(Integer cantidad)
    {
        for (int i = 1; i<cantidad; cantidad++)
        {
            btnAsignaNinos.click();
        }
    }

    public void botonBusqueda()
    {
        btnBusqueda.click();
    }

}
