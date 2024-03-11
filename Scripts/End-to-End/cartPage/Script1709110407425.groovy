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

WebUI.click(findTestObject('Object Repository/Page_Customer Login/div_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'kashyap.dave+29@krishtechnolabs.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'dm7VE3JXRq/aw0bf5i8RFQ==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Home Page/img_Add to Compare_product-image-photo'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Fusion Backpack/input_Qty_qty'), '5')

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/div_Qty_control'))

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/a_Reviews 3'))
WebUI.delay(3)

//WebUI.setText(findTestObject('Object Repository/Page_Fusion Backpack/input_nickname_field'), 'KD')

WebUI.setText(findTestObject('Object Repository/Page_Fusion Backpack/input_Summary_title'), 'Well product')

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/input_Summary_title'))

WebUI.setText(findTestObject('Object Repository/Page_Fusion Backpack/textarea_Review_detail'), 'Well for now..')

//WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/span_Submit Review'))
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/label_1 star'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/label_5 stars'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/span_Submit Review'))

WebUI.setText(findTestObject('Object Repository/Page_Fusion Backpack/input_Qty_qty'), '5')

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/a_My Cart                    8             _486149'))

WebUI.click(findTestObject('Object Repository/Page_Fusion Backpack/span_View and Edit Cart'))

WebUI.setText(findTestObject('Object Repository/Page_Shopping Cart/input_Qty_cart726qty'), '5')

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Update Shopping Cart'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Proceed to Checkout'))
println('Hello, User checkout successfully!')
println('Verify cart total items!')

