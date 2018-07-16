package custom

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class killProcess{
	@Keyword
	def killProcess() {
		Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f")
		Runtime.getRuntime().exec("taskkill /im chrome.exe /f")
	}
}
