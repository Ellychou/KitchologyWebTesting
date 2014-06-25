package kitchologywebtesting;

public class Main {

    //For now, the base URL will be stored as a global variable
    //Accessible in all classes as *Main.baseURL*
    public static final String baseURL = "http://sausage.kitchology.com:8080/kitchology/";

    //Constructor (Main logic for this class)
    //***CALL TEST METHODS HERE***
    public Main() {
        //Identify the various driver.exe files
        //locateDrivers();

        //Initialize an instance of Navigation
        Navigation nav = new Navigation();
        //Initialize an instance of Login
        Login log = new Login();

        nav.clickLinksChrome();
        
        //TODO: Access methods of nav ( nav.methodExample() )
        //TODO: Access methods of log ( log.exampleMethod() )
        
    }

    //Identifies the location of all necesary webdriver.exe files
    private void locateDrivers(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "drivers/iedriver.exe");
        //TODO: SafariDriver
    }

    //Main method
    //***FLOW OF CONTROL BEGINS HERE***
    public static void main(String[] args) {
        //Initialize a new instance of Main class (call constructor)
        Main m = new Main();
    }
}
