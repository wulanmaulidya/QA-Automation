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


//membuka browser
WebUI.openBrowser("")

//masuk ke website testing
WebUI.navigateToUrl(GlobalVariable.BASEURL)

//akses menu
WebUI.click(findTestObject('Page/Home/Component/a_CURA Healthcare_menu-toggle'))

//akses menu home
WebUI.click(findTestObject('Page/Home/Component/a_Home'))

//pastikan card social media bisa terlihat (visible)
WebUI.verifyElementVisible(findTestObject('Page/Home/Component/div_CURA Healthcare ServiceAtlanta 550 Pharr Road NE Suite 525Atlanta, GA 30305(678) 813-1KMSinfokatalon.com'))

//akses email 
WebUI.click(findTestObject('Page/Home/Social Media/Email/a_infokatalon.com'))

//delay
WebUI.delay(GlobalVariable.DELAY)

//tutup browser
WebUI.closeBrowser()