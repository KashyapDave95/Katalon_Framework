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

WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'), 'Bag')

WebUI.click(findTestObject('Object Repository/Page_Search results for Bag/img'))

WebUI.setText(findTestObject('Object Repository/Page_Home Page/input_Search_q'), 'tefggg')

WebUI.click(findTestObject('Object Repository/Page_Home Page/li_hero1'))

WebUI.click(findTestObject('Object Repository/Page_Search results for hero/img_Set Ascending Direction_product-image-photo'))

WebUI.click(findTestObject('Object Repository/Page_Hero Hoodie/div_S'))

WebUI.click(findTestObject('Object Repository/Page_Hero Hoodie/div_Color_option-label-color-93-item-49'))

WebUI.click(findTestObject('Object Repository/Page_Hero Hoodie/a_Add to Wish List'))

