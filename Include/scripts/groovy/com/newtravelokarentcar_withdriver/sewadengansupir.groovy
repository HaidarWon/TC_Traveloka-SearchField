package com.newtravelokarentcar_withdriver
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



class sewadengansupir {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("Traveloka Rent Car URL")
	def TravelokaRentCar_URL() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("I click Rent Car With Driver")
	def I_click_RentCar_WithDriver() {
		WebUI.click(findTestObject('objform_withdriver/btn_DenganSupir'))
	}
	@Then("I click Rental Location")
	def I_click_Rental_Location() {
		WebUI.click(findTestObject('objform_withdriver/input_Lokasi_Rental'))
		WebUI.click(findTestObject('objform_withdriver/div_chooseJakarta'))
	}
	@And("I Input Start Date Rental")
	def I_Input_StartDateRental() {
		WebUI.click(findTestObject('objform_withdriver/input_TglMulaiRental'))
		WebUI.click(findTestObject('objform_withdriver/div_TglMulai27'))
	}
	@Then("I Input Start Rent Time")
	def I_Input_Start_RentTime() {
		WebUI.click(findTestObject('objform_withdriver/input_durasiSewaaa'))
		WebUI.click(findTestObject('objform_withdriver/div_DurasiSewa_2hari'))
		WebUI.delay(3)
	}
	@And("I Input Finish Date Rental")
	def I_Input_FinishDateRental() {
		WebUI.click(findTestObject('objform_withdriver/Input_WaktuJemput'))
		WebUI.click(findTestObject('objform_withdriver/div_Jam8Jemput'))
		WebUI.click(findTestObject('objform_withdriver/div_Menit15Jemput'))
		WebUI.click(findTestObject('objform_withdriver/div_SelesaiPilihJamJemput'))
		WebUI.delay(3)
	}
	@Then("I click Search Car")
	def I_click_SearchCar() {
		WebUI.click(findTestObject('objform_withdriver/div_Cari_Mobil'))
		WebUI.delay(15)
	}
	@When ("I click Filter Kapasitas Penumpang")
	def i_Click_Filter_KapasitasPenumpang() {
		WebUI.click(findTestObject('objform_withdriver/input_KapasitasPenumpang'))
		WebUI.click(findTestObject('objform_withdriver/div_KapasitasPenumpang_LebihDari6'))
	}
	@Then ("I click Filter Tipe Mobil")
	def i_Click_Filter_TipeMobil() {
		WebUI.click(findTestObject('objform_withdriver/input_TipeMobil'))
		WebUI.click(findTestObject('objform_withdriver/div_TipeMobil_Minibus'))
	}
	//	@And ("I click Filter Penyedia")
	//	def i_Click_Filter_Penyedia() {
	//		WebUI.click(findTestObject('objform_withdriver/input_Penyedia'))
	//		WebUI.click(findTestObject('objform_withdriver/div_Penyedia_ChawanTrans Jakarta9.6'))
	//	}
	@When ("I click Filter Urutkan")
	def i_Click_Filter_Urutkan() {
		WebUI.click(findTestObject('objform_withdriver/input_Urutkan'))
		WebUI.click(findTestObject('objform_withdriver/div_Urutkan_HargaTertinggi'))
		WebUI.click(findTestObject('objform_withdriver/input_Urutkan'))
	}
	@Then("Taking Screenshot Full Pages")
	def TakingScreenshot_FullPages() {
		WebUI.delay(5)
		WebUI.takeFullPageScreenshot()
		WebUI.closeBrowser()
	}
}