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

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'kashyap.dave+29@krishtechnolabs.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'dm7VE3JXRq/aw0bf5i8RFQ==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/img_Add to Compare_product-image-photo'))

WebUI.click(findTestObject('Object Repository/Page_Hero Hoodie/div_S'))

WebUI.click(findTestObject('Object Repository/Page_Hero Hoodie/div_Color_option-label-color-93-item-53'))

WebUI.click(findTestObject('Object Repository/Page_Hero Hoodie/span_Add to Cart'))
println('Hello, Product added into cart successfully!')

