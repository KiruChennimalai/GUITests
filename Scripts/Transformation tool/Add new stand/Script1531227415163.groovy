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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.showhub.eu.meteorapp.com/')

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/a_Log in'))

WebUI.setText(findTestObject('Page_Showhub - 2PointRalph (1)/input_userEmail'), 'kiru.chennimalai+1@freemanco.com')

WebUI.setText(findTestObject('Page_Showhub - 2PointRalph (1)/input_password'), 'Password123')

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/button_Log in'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/i_0.1114747652410697'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/canvas_FloorplanEditorMap'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/canvas_FloorplanEditorMap'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/i_0.247086533502215'))

WebUI.setText(findTestObject('Page_Showhub - 2PointRalph (1)/input_FloorplanDetailModalStan'), '1007')

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/button_Save stand to Draft'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/span_Changes'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/button_Publish'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/canvas_FloorplanEditorMap'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/i_0.4258985089346248'))

WebUI.click(findTestObject('Page_Showhub - 2PointRalph (1)/button_Publish'))

WebUI.closeBrowser()

