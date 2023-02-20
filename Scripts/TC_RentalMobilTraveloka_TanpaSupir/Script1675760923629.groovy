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

WebUI.click(findTestObject('objform_withoutdriver/radioBtn_Rental_Mobil_Nosupir'))

WebUI.click(findTestObject('objform_withoutdriver/input_Lokasi_Rental'))

WebUI.click(findTestObject('objform_withoutdriver/div_Lokasi_chooseSurabaya'))

WebUI.click(findTestObject('objform_withoutdriver/input_Tanggal_MulaiRental'))

WebUI.click(findTestObject('objform_withoutdriver/div_TglSewa_27'))

WebUI.click(findTestObject('objform_withoutdriver/input_Waktu_Awal'))

WebUI.click(findTestObject('objform_withoutdriver/div_JamSewa_10'))

WebUI.click(findTestObject('objform_withoutdriver/div_MenitSewa_30'))

WebUI.click(findTestObject('objform_withoutdriver/btn_SelesaiPilihJamSewa'))

WebUI.delay(2)

WebUI.click(findTestObject('objform_withoutdriver/input_Tanggal_SelesaiSewa'))

WebUI.click(findTestObject('objform_withoutdriver/div_TglSelesaiSewa_6'))

WebUI.click(findTestObject('objform_withoutdriver/input_Waktu_Selesai'))

WebUI.click(findTestObject('objform_withoutdriver/div_JamKembali_12'))

WebUI.click(findTestObject('objform_withoutdriver/div_MenitKembali_30'))

WebUI.click(findTestObject('objform_withoutdriver/btn_Selesai_KembalikanSewa'))

WebUI.delay(2)

WebUI.click(findTestObject('objform_withoutdriver/btn_PencarianMobil'))

WebUI.click(findTestObject('objform_withoutdriver/input_Kapasitas_Penumpang'))

WebUI.click(findTestObject('objform_withoutdriver/div_Kapasitas_Penumpang_5-6'))

WebUI.click(findTestObject('objform_withoutdriver/input_Transmisi'))

WebUI.click(findTestObject('objform_withoutdriver/div_Transmisi_Otomatis'))

WebUI.click(findTestObject('objform_withoutdriver/input_TipeMobil'))

WebUI.click(findTestObject('objform_withoutdriver/div_TipeMobil_Minivan'))

WebUI.click(findTestObject('objform_withoutdriver/input_Penyedia'))

WebUI.click(findTestObject('objform_withoutdriver/div_Penyedia_mCCSurabaya10.0'))

WebUI.click(findTestObject('objform_withoutdriver/div_Urutkan'))

WebUI.click(findTestObject('objform_withoutdriver/div_Urutkan_HargaTerendah'))

WebUI.click(findTestObject('objform_withoutdriver/div_Urutkan'))

//WebUI.delay(10)
WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

