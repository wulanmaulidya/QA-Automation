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

//klik tombol make Appointment
WebUI.click(findTestObject('Page/Appointment/a_Make Appointment'))

//pastikan card dari konten login terlihat
WebUI.verifyElementVisible(findTestObject('Page/Appointment/content_login'))

//masukan username
WebUI.setText(findTestObject('Page/Appointment/input_Username'), GlobalVariable.USERNAME)

//masukan password
WebUI.setText(findTestObject('Page/Appointment/input_Password'), GlobalVariable.PASSWORD)

//klik tombol login
WebUI.click(findTestObject('Page/Appointment/btn_Login'))

//assertion tidak bisa login karena password dan username invalid
WebUI.getAttribute(findTestObject('Object Repository/Page/Appointment/p_Login failed Please ensure the username and password are valid'), GlobalVariable.FAILED_LOGIN )

//delay untuk menampilkan konten lebih lama
WebUI.delay(GlobalVariable.DELAY)

//tutup browser
WebUI.closeBrowser()
