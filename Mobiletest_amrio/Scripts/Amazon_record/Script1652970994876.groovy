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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory


'Aperture Playstore'
Mobile.startExistingApplication('com.android.vending')

driver = MobileDriverFactory.getDriver()

'Dowload App Amazon'
Mobile.tap(findTestObject('Object Repository/Test_playstore/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Test_playstore/android.widget.Button - Installa (2)'), 0)

Mobile.delay(25)


'Accesso ad Amazon'
Mobile.startExistingApplication('com.amazon.mShop.android.shopping')


Mobile.tap(findTestObject('Object Repository/Test_playstore/android.widget.Button - Non effettuare laccesso (1)'), 0)

//Mobile.tap(findTestObject('Object Repository/Test_playstore/android.widget.TextView - Cerca su Amazon.it'), 0)
//
//Mobile.setText(findTestObject('Object Repository/Test_playstore/android.widget.EditText - Cerca su Amazon.it'), 'orologi',
//	0)
//
//Mobile.tap(findTestObject('Object Repository/Test_playstore/android.widget.ImageView'), 0)


'Registrazione account'
Mobile.tap(findTestObject('Object Repository/Test_playstore/androidx.appcompat.app.ActionBarTab'), 0)

def Crea_Account = Mobile.getText(findTestObject('Object Repository/Test_playstore/android.view.ViewGroup'), 0)

Mobile.verifyMatch(Crea_Account ,'Crea Account', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Test_playstore/android.view.ViewGroup'), 0)








driver.resetApp()


