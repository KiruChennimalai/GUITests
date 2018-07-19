import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'To log messages'
KeywordLogger log = new KeywordLogger()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.showhub.eu.meteorapp.com')

WebUI.click(findTestObject('a_Log in'))

WebUI.setText(findTestObject('input_userEmail'), 'kiru.chennimalai+1@freemanco.com')

WebUI.setText(findTestObject('input_password'), 'Password123')

WebUI.click(findTestObject('button_Log in'))

if (WebUI.verifyElementPresent(findTestObject('span_Show'), 10)) {
    log.logInfo('User successfully logged in')
}

WebUI.click(findTestObject('span_Icon'))

WebUI.click(findTestObject('span_Show'))

WebUI.selectOptionByValue(findTestObject('select_English (GB)English (US'), 'en-GB', true)

WebUI.selectOptionByValue(findTestObject('select_Feet (ft)Meters (m)'), 'M', true)

WebUI.selectOptionByValue(findTestObject('select_Pound Sterling - GBP ()'), 'GBP', true)

WebUI.click(findTestObject('button_Save'))

WebUI.delay(10)

WebUI.setText(findTestObject('input_settings.profile.name'), 'Customized Archive Expo 2019 test')

WebUI.setText(findTestObject('input_settings.profile.venueNa'), 'test venue name')

WebUI.setText(findTestObject('textarea_test address'), 'test address')

WebUI.setText(findTestObject('input_settings.profile.zipcode'), 'gu52 6lu')

WebUI.click(findTestObject('button_Save'))

WebUI.closeBrowser()


