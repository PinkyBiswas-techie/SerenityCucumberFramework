/**
 * 
 */
package com.orangehrm.pages;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.StringEnsure;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.pages.PageObject;

/**
 * @author Pinky Biswas
 *
 */
public class DashboardPage extends PageObject {

	private By dashBoardPageTitleBy = By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
	private By adminMenuLink = By.xpath("//a[contains(@id,'viewAdminModule')]/b");
	private By userManagementLink = By.xpath("//a[contains(@id,'UserManagement')]");
	private By systemUserlink = By.xpath("//div[contains(@id,'systemUser')]");

	public String getDashboardTitle() {

		return $(dashBoardPageTitleBy).getText();

	}

	public StringEnsure getCurrentURL() {

		StringEnsure currentURL = Ensure.thatTheCurrentPage().currentUrl();
		return currentURL;
	}

	public void clickOnAdminMenu() {
		$(adminMenuLink).click();
	}

	public void mouseHoverAndClickAdminMenu() {

		withAction().moveToElement($(adminMenuLink)).click().build().perform();
	}

	public void mouseHoverAndClickUserManagementMenu() {
		withAction().moveToElement($(userManagementLink)).click().build().perform();
	}
	
	public String getUserMgmtPageHeader() {
		
		return $(systemUserlink).getAttribute("id");
	}

}
