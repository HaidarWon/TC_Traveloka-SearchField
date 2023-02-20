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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('objform_withdriver/btn_DenganSupir'))

WebUI.click(findTestObject('objform_withdriver/input_Lokasi_Rental'))

WebUI.click(findTestObject('objform_withdriver/div_chooseJakarta'))

WebUI.click(findTestObject('objform_withdriver/input_TglMulaiRental'))

WebUI.click(findTestObject('objform_withdriver/div_TglMulai27'))

WebUI.click(findTestObject('objform_withdriver/input_durasiSewaaa'))

WebUI.click(findTestObject('objform_withdriver/div_DurasiSewa_2hari'))

WebUI.delay(3)

WebUI.click(findTestObject('objform_withdriver/input_WaktuJemput'))

WebUI.click(findTestObject('objform_withdriver/div_Jam8Jemput'))

WebUI.click(findTestObject('objform_withdriver/div_Menit15Jemput'))

WebUI.click(findTestObject('objform_withdriver/div_SelesaiPilihJamJemput'))

WebUI.delay(3)

WebUI.click(findTestObject('objform_withdriver/div_Cari_Mobil'))

WebUI.click(findTestObject('objform_withdriver/input_KapasitasPenumpang'))

WebUI.click(findTestObject('objform_withdriver/div_KapasitasPenumpang_LebihDari6'))

WebUI.click(findTestObject('objform_withdriver/input_TipeMobil'))

WebUI.click(findTestObject('objform_withdriver/div_TipeMobil_Minibus'))

//WebUI.click(findTestObject('objform_withdriver/input_Penyedia'))
//
//WebUI.click(findTestObject('objform_withdriver/div_Penyedia_ChawanTrans Jakarta9.6'))
WebUI.click(findTestObject('objform_withdriver/input_Urutkan'))

WebUI.click(findTestObject('objform_withdriver/div_Urutkan_HargaTertinggi'))

WebUI.click(findTestObject('objform_withdriver/input_Urutkan'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

