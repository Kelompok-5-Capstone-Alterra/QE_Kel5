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

int x = findTestData('NoHP').getRowNumbers()

for (i = 1; i <= x; i++) {
    Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\app-release (2).apk', true)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.view.View'), 0)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.view.View'), 0)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.view.View'), 0)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.widget.ImageView - Masukan email'), 0)

    Mobile.setText(findTestObject('Object Repository/BuyPulsa.01/android.widget.ImageView - Masukan email (1)'), 'alterra5capstone@gmail.com', 
        0)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.widget.EditText -'), 0)

    Mobile.setText(findTestObject('Object Repository/BuyPulsa.01/android.widget.EditText - (1)'), 'Capstonealterra54321111', 
        0)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.view.View (1)'), 0)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.widget.ImageView'), 0)

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.widget.EditText - 62, Contoh  08571287123'), 0)

    //Mobile.setText(findTestObject('Object Repository/BuyPulsa.01/android.widget.EditText - 62, Contoh  08571287123 (1)'), '+628123456789', 
    //    0)
    Mobile.sendKeys(findTestObject('Object Repository/BuyPulsa.01/android.widget.EditText - 62, Contoh  08571287123 (1)'), 
        findTestData('NoHP').getValue(1, i))

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.view.View (2)'), 0)
}


Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/BuyPulsa.01/android.widget.ImageView (1)'), 0)

Mobile.tapAndHold(findTestObject('BuyPulsa.01/android.view.View (4)'), 0, 0)

