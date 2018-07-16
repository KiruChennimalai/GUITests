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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import custom.killProcess as killProcess
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

'To log messages'
KeywordLogger log = new KeywordLogger()

'Open a browser'
WebUI.openBrowser('')

'Open dev showhub url'
WebUI.navigateToUrl('https://dev.showhub.eu.meteorapp.com/')

'Login the user'
WebUI.click(findTestObject('a_Log in'))

'Input email address which is blocked'
WebUI.setText(findTestObject('input_userEmail'), 'kiru.chennimalai@freemanco.com')

'Enter password'
WebUI.setText(findTestObject('input_password'), 'Crazyplant86')

'Click \'Login\' button'
WebUI.click(findTestObject('button_Log in'))

String errorMsg = WebUI.getText(findTestObject('div_Your account has been bloc'))

'Check for account blocked message'
if (errorMsg.equalsIgnoreCase('Your account has been blocked after multiple consecutive login attempts. We’ve sent you an email with instructions on how to unblock it.')) {
    log.logInfo('Account blocked message displayed')
} else {
    KeywordUtil.markFailed('Account blocked message does not match expected')
}

WebUI.setText(findTestObject('input_userEmail'), 'kiru.chennimalai+1@freemanco.com')

'Enter a wrong password'
WebUI.setText(findTestObject('input_password'), 'password123')

'Click \'Login\' button'
WebUI.click(findTestObject('button_Log in'))

String errorMsg1 = WebUI.getText(findTestObject('div_Wrong email or password.'))

'Check for wrong password message'
if (errorMsg1.equalsIgnoreCase('Wrong email or password.')) {
    log.logInfo('Incorrect password message displayed')
}

WebUI.setText(findTestObject('input_userEmail'), 'kiru.')

'Enter a wrong password'
WebUI.setText(findTestObject('input_password'), 'password123')

'Click \'Login\' button'
WebUI.click(findTestObject('button_Log in'))

String errorMsg2 = WebUI.getText(findTestObject('div_Please enter valid usernam'))

'Check for wrong password message'
if (errorMsg2.equalsIgnoreCase('Please enter valid username and password')) {
    log.logInfo('Invalid username message displayed')
}

'Click \'Forgot password\' link'
WebUI.click(findTestObject('a_Forgot the password'))

'Input invalid email address'
WebUI.setText(findTestObject('input_userEmail'), 'kiru')

'Click \'submit\' button'
WebUI.click(findTestObject('button_Submit'))

String successMsg = WebUI.getText(findTestObject('div_Please enter a valid email'))

'Check for enter valid email address message'
if (successMsg.equalsIgnoreCase('Please enter a valid email address')) {
    log.logInfo('Enter valid email address message shown.')
}

'Input valid email address on the forgot password link'
WebUI.setText(findTestObject('input_userEmail'), 'kiru.chennimalai@freemanco.com')

WebUI.click(findTestObject('button_Submit'))

String successMsg1 = WebUI.getText(findTestObject('div_You have successfully subm'))

WebUI.click(findTestObject('a_Log in'))

WebUI.setText(findTestObject('input_userEmail'), 'kiru.chennimalai+1@freemanco.com')

WebUI.setText(findTestObject('input_password'), 'Passworde123')

WebUI.click(findTestObject('button_Log in'))

'Check if forgot password request sent successfully'
if (successMsg1.equalsIgnoreCase('You have successfully submitted a password reset request.')) {
    log.logInfo('Forgot password request sent successfully.')
}

WebUI.click(findTestObject('a_Log in'))

WebUI.setText(findTestObject('input_userEmail'), 'kiru.chennimalai+1@freemanco.com')

'Enter the correct password'
WebUI.setText(findTestObject('input_password'), 'Password123')

WebUI.click(findTestObject('button_Log in'))

'Check that the user is logged in (user with super admin rights) by checking for the presence of settings menu '
if (WebUI.verifyElementPresent(findTestObject('span_Show'), 10)) {
    log.logInfo('User successfully logged in')
}

WebUI.closeBrowser()

