package glue;

public class Scenario3{

private static Logger Log = LogManager.getLogger(Scenario1.class.getName());
wrapperUtil wrap = new WrapperUtil();
String browserprop = SetupPropertiesLoader.getProperty("browser","directory");
String urlprop = SetupPropertiesLoader.getProperty("URL","directory");


Basepage basepage = null;
public Webdriver driver;
public WebDriverWait wait;
WrapperUtil wrapper = new WrapperUtil();
public static String parentwindow = "";

@Given("^navigating to the International url Country (.*) and select (.*))
public void channelnews(String Country , String Option) throws Exception {

try{
	BaseTestsetup.driver.get(urlProp);
	log.info("Navigated to URL");
	basepage = new Basepage(BaseTestSetup.driver, BaseTestSetup.wait);
	BaseTestSetup.wait.until(ExpectedConditions.presenceofElementLocaed( ));
	wrapper.clickperform(driver.findelement(By.xpath("//span[contains(@class,'+ All Sections'));
	for(int i = 1;;i++)
	{
		
		Webelement listofoption = driver.findelement(By.xpath(//*[@id="all-section-menu-modal"]/div/div/div/div[1]/div[2]/ul/li[i]/a);
		String x = listofoption.getText();
		if (x == Option)
		{
			wrapper.clickperform(listofoption);
			break();
		}
	}

	WebElement newpage = driver.findelement(By.xpath("//*[@id="block-mc-cna-theme-mainpagecontent"]/article/div[1]/div[2]/div/section/div/h2")
	BaseTestSetup.wait.until(ExpectedConditions.presenceofElementLocaed(newpage));
	String MainHeadline = newpage.getText();
	if (MainHeadline == "Weather")
	{
		log.info("Navigated to the correct headline");
	}
	else 
	{
		throw new Excpetion("Error: navigated to wrong headlines");
	}
	
	for(int j=1 ; ; j++)
	{
		
		Webelement listofcountry = driver.findelement(By.xpath(//*[@id="weather-block"]/div/div[2]/div/ul/li[1]/ul/li[j]/div[1]/div[1]);
		String y = listofcountry.getText();
		if (y == Country)
		{
			String weathercountry = driver.findelement(By.xpath(//*[@id="weather-block"]/div/div[2]/div/ul/li[1]/ul/li[j]/div[1]/div[1]).getText()
			String weathercoundition = driver.findelement(By.xpath(//*[@id="weather-block"]/div/div[2]/div/ul/li[1]/ul/li[j]/div[1]/div[2]).getText()
			break();
		}
	log.info("The weather condition of the country:" + weathercountry + "is" + weathercoundition)
   }
catch (Exception e)
   {
	log.error(e.getMessage());
	throw new Exception("Execution failed due to error :" +e.getMessage());
   }

	
