package com.java.FileHandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class pracMaps {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","D:\\NagaveniWorkSpace\\JavaPractice2019\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("Browser", "Chrome");
		mp.put("url", "www.google.com");
		mp.put("Search", "Selenium");
		System.out.println(mp.get("url"));
		Map<String, String> mp1 = new HashMap<String, String>();
		mp1.putAll(mp);
		Iterator<Map.Entry<String, String>> entry = mp1.entrySet().iterator();
		while(entry.hasNext()) {
			Map.Entry<String, String> e = entry.next();
			System.out.println("Key "+e.getKey()+" Value "+e.getValue());
		}
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
	}
	

}
