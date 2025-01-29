import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shopee.co.id/')

WebUI.setText(findTestObject('Object Repository/Page_Login sekarang untuk mulai berbelanja _a6a865/input_Log in dengan QR_loginKey'), 
    'feriyaldy@@@@')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login sekarang untuk mulai berbelanja _a6a865/input_Log in dengan QR_password'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_Login sekarang untuk mulai berbelanja _a6a865/svg_Log in dengan QR_adOaXi'))

WebUI.click(findTestObject('Object Repository/Page_Login sekarang untuk mulai berbelanja _a6a865/input_Log in dengan QR_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login sekarang untuk mulai berbelanja _a6a865/input_Log in dengan QR_password'), 
    'e3YiesqOritndowqhzsGcw==')

WebUI.click(findTestObject('Object Repository/Page_Login sekarang untuk mulai berbelanja _a6a865/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login sekarang untuk mulai berbelanja _a6a865/div_Gagal log in, mohon coba lagi nanti ata_5985bd'), 
    0)

WebUI.closeBrowser()

