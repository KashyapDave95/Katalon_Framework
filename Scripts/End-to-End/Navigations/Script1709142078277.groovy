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

WebUI.navigateToUrl('https://qa.magentoprojects.net/')

WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'), 'hero')

WebUI.click(findTestObject('Object Repository/Page_Home Page/button_Search'))

WebUI.waitForElementClickable(findTestObject("Object Repository/Page_Search results for hero/span_Women"), 10)
WebUI.click(findTestObject("Object Repository/Page_Search results for hero/span_Women"))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_Women/a_Tees'))

WebUI.click(findTestObject('Object Repository/Page_Tees - Tops - Men/span_Hoodies  Sweatshirts'))

WebUI.click(findTestObject('Object Repository/Page_Hoodies  Sweatshirts - Tops - Women/span_Hoodies  Sweatshirts'))

WebUI.click(findTestObject('Object Repository/Page_Hoodies  Sweatshirts - Tops - Men/a_Page                        Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hoodies  Sweatshirts - Tops - Men/select_12                                  _9bc359'), 
    '24', true)

