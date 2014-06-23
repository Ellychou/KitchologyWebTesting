package kitchologywebtesting;

public class Main {

    public Main() {
        locateDrivers();
        Navigation nav = new Navigation("http://sausage.kitchology.com:8080/kitchology/");
    }

    private void locateDrivers(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "drivers/iedriver.exe");
        //TODO: SafariDriver
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
