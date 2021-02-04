package test;

import driver.driver;
//import driver.manageWindowsdriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import logic.travel.Landing_logic;
import logic.travel.travels_logic;

public class TravelsTest_anotations {

    driver Driver = null;
    Landing_logic paginaInicial = null;
    travels_logic paginaTravels = null;

    @BeforeClass
    public void  setupEnv() {

        Driver = new driver();
        paginaInicial = new Landing_logic(Driver);
        paginaTravels = new travels_logic(Driver);


    }

    @Test(priority = 1, testName = "Escenario2")
    public void testEscenario2() throws InterruptedException{

        Driver.goto_url("https://phptravels.com/demo/");
        String aux = Driver.windowParent();

        //manageWindowsdriver mwd = new manageWindowsdriver(Driver.returnDriver());
        Driver.implicitwait2();
        Driver.scroll(400);

        paginaInicial.IrTravel();
        Driver.scroll(400);

        //mwd.StoreAllWindows();
        //mwd.switchnexwindow();

        Driver.switchWindows();
        paginaTravels.BusquedaDestino("tria hotel istambul","03/02/2021","15/02/2021",2,0);



    }

    @AfterClass
    public void teardown() {

        //Driver.teardown();
    }

}
