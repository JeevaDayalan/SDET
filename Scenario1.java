package glue;

public class Scenario1{

private static Logger Log = LogManager.getLogger(Scenario1.class.getName());
wrapperUtil wrap = new WrapperUtil();
String browserprop = SetupPropertiesLoader.getProperty("browser","directory");
String urlprop = SetupPropertiesLoader.getProperty("URL","directory");


Basepage basepage = null;
public Webdriver driver;
public WebDriverWait wait;
WrapperUtil wrapper = new WrapperUtil();
public static String parentwindow = "";

@Given("^navigating to the url and clicking headlines)
public void channelnews() throws Exception {

try{
	BaseTestsetup.driver.get(urlProp);
	log.info("Navigated to URL");
	basepage = new BasePage(BaseTestSetup.driver, BaseTestSetup.wait);
	WebElement Headline = driver.findelement(By.xpath("//*[@id="block-mc-cna-theme-mainpagecontent"]/article/div[1]/div[2]/div/section/div/h1")
	BaseTestSetup.wait.until(ExpectedConditions.presenceofElementLocaed(Headline));
	String MainHeadline = Headline.getText();
	wrapper.clickperform(Headline);
	String Newheadline = nulls
	Newheadline = driver.findelement(By.xpath("//*[@id="block-mc-cna-theme-mainpagecontent"]/article/div[1]/div[2]/div/section/div/h1").getText();
	if (MainHeadline == Newheadline)
	{
		log.info("Navigated to the correct headline");
	}
	else 
	{
		throw new Excpetion("Error: navigated to wrong headlines");
	}
		
   }
catch (Exception e)
   {
	log.error(e.getMessage());
	throw new Exception("Execution failed due to error :" +e.getMessage());
   }

@Then("^scrolling to headlines number (.*)")
public void scroll(int number) throws Exception {

try{
	BaseTestsetup.driver.get(urlProp);
	log.info("Navigated to URL");
	basepage = new Basepage(BaseTestSetup.driver, BaseTestSetup.wait);
	WebElement Headline = driver.findelement(By.xpath("//*[@id="block-mc-cna-theme-mainpagecontent"]/article/div[1]/div[2]/div/section/div/h1")
	BaseTestSetup.wait.until(ExpectedConditions.presenceofElementLocaed(Headline));
	wrapper.clickperform(Headline);
	int article = number + 1;
	String scroll = "window.scrollto(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));";
	for(int i=0;i<number;i++)
	String MainHeadline = null;
	{
		WebElement NewHeadline = driver.findelement(By.xpath("//*[@id="block-mc-cna-theme-mainpagecontent"]/article[i]/div[1]/div[2]/div/section/div/h1")
		((JavascriptExecutor)driver).executeScript(scroll);
		BaseTestSetup.wait.until(ExpectedConditions.presenceofElementLocaed(NewHeadline);
		MainHeadline = driver.findelement(NewHeadline).getText();
	}	 
	WebElement expandnews = driver.findelement(By.xpath("//*[@id="block-mc-cna-theme-mainpagecontent"]/article[article]/div[2]/div/a");
	BaseTestSetup.wait.until(ExpectedConditions.presenceofElementLocaed(expandnews));
	wrapper.clickperform(expandnews);
	String expandMainHeadline = driver.findelement(By.xpath("//*[@id="block-mc-cna-theme-mainpagecontent"]/article[article]/div[1]/div[2]/div/section/div/h1").getText();
	if (expandMainHeadline == MainHeadline)
	{
		log.info("Expanded the correct headline");
	}
	else 
	{
		throw new Excpetion("Error: Expanded the wrong headlines");
	}
  }

catch (Exception e)
   {
	log.error(e.getMessage());
	throw new Exception("Execution failed due to error :" +e.getMessage());
   }		
