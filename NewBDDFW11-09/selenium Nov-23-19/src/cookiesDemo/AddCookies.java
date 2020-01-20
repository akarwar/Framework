package cookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Set<Cookie> cookies=driver.manage().getCookies();// cupture all the cookies from the browser
		System.out.println("Size of cookies:" +cookies.size());  //print size of cookies
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());  //prints name an value of cookies
		}
		
		Cookie cookieObj = new Cookie("MyCookies123", "123654");
		driver.manage().addCookie(cookieObj);
		System.out.println("size of cookies: " +cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());  //prints name an value of cookies
		}
		//to delete the cookie
		driver.manage().deleteCookie(cookieObj);
		driver.manage().deleteAllCookies();
		
//		driver.manage().addCookie(cookieObj);
		System.out.println("size of cookies: " +cookies.size());
		driver.quit();
		
	}

}
