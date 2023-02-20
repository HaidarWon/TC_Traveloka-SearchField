package com.newtravelokarentcar_withoutdriver
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class sewatanpasupir {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("The Traveloka Rent Car URL")
	def the_Traveloka_RentCar_URL() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("I click button Tanpa Supir")
	def i_ClickButton_TanpaSupir() {
		WebUI.click(findTestObject('objform_withoutdriver/radioBtn_Rental_Mobil_Nosupir'))
	}

	@Then("I input Lokasi Rental")
	def i_Input_Lokasi_Rental() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Lokasi_Rental'))
		WebUI.click(findTestObject('objform_withoutdriver/div_Lokasi_chooseSurabaya'))
	}
	@And ("I input Tanggal Mulai Rental")
	def i_Input_Tanggal_Mulai_Rental() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Tanggal_MulaiRental'))
		WebUI.click(findTestObject('objform_withoutdriver/div_TglSewa_27'))
	}
	@Then("I input Waktu Mulai")
	def i_Input_Waktu_Mulai() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Waktu_Awal'))
		WebUI.click(findTestObject('objform_withoutdriver/div_JamSewa_10'))
		WebUI.click(findTestObject('objform_withoutdriver/div_MenitSewa_30'))
		WebUI.click(findTestObject('objform_withoutdriver/btn_SelesaiPilihJamSewa'))
		WebUI.delay(3)
	}
	@And ("I input Tanggal Selesai")
	def i_Input_Tanggal_Selesai() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Tanggal_SelesaiSewa'))
		WebUI.click(findTestObject('objform_withoutdriver/div_tglSelesaiSewa_6'))
	}
	@Then("I input Waktu Selesai")
	def i_Input_Waktu_Selesai() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Waktu_Selesai'))
		WebUI.click(findTestObject('objform_withoutdriver/div_JamKembali_12'))
		WebUI.click(findTestObject('objform_withoutdriver/div_MenitKembali_30'))
		WebUI.click(findTestObject('objform_withoutdriver/btn_Selesai_KembalikanSewa'))
		WebUI.delay(3)
	}
	@And ("I click button Cari Mobil")
	def i_Click_BtnCariMobil() {
		WebUI.click(findTestObject('objform_withoutdriver/btn_PencarianMobil'))
		WebUI.delay(10)
	}
	@When ("I click Kapasitas Penumpang")
	def i_Click_KapasitasPenumpang() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Kapasitas_Penumpang'))
		WebUI.click(findTestObject('objform_withoutdriver/div_Kapasitas_Penumpang_5-6'))
	}
	@And ("I click Transmisi")
	def i_Click_Transmisi() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Transmisi'))
		WebUI.click(findTestObject('objform_withoutdriver/div_Transmisi_Otomatis'))
	}
	@Then ("I click Tipe Mobil")
	def i_Click_TipeMobil() {
		WebUI.click(findTestObject('objform_withoutdriver/input_TipeMobil'))
		WebUI.click(findTestObject('objform_withoutdriver/div_TipeMobil_Minivan'))
	}
	@Then ("I click Penyedia")
	def i_Click_Penyedia() {
		WebUI.click(findTestObject('objform_withoutdriver/input_Penyedia'))
		WebUI.click(findTestObject('objform_withoutdriver/div_Penyedia_mCCSurabaya10.0'))
	}
	@When ("I click Urutkan")
	def i_Click_Urutkan() {
		WebUI.click(findTestObject('objform_withoutdriver/div_Urutkan'))
		WebUI.click(findTestObject('objform_withoutdriver/div_Urutkan_HargaTerendah'))
		WebUI.click(findTestObject('objform_withoutdriver/div_Urutkan'))
	}
	@Then ("Taking Screenshot Full Page")
	def taking_Screenshot_FullPage() {
		WebUI.takeFullPageScreenshot()
		WebUI.closeBrowser()
	}
}