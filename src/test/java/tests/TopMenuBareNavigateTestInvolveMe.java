package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.TopMenuBarInvolveMe;
import pageobjects.MyWorkspacePageInvolveMe;
import pageobjects.OrganizationAnalyticsPage;
import pageobjects.TemplatesPageInvolveMe;
import pageobjects.AffiliateProgramPage;
import pageobjects.IntegrationsPage;

public class TopMenuBareNavigateTestInvolveMe extends BaseTest {

	@Test(description = "Open Projects tab")
	public void tc02_openProjectsTab() {
		TopMenuBarInvolveMe tmbn = new TopMenuBarInvolveMe(driver);
		tmbn.clickProjects();
//		Navigating to"Workspace" page after log in
		MyWorkspacePageInvolveMe wsp = new MyWorkspacePageInvolveMe(driver);
		String actual = wsp.validateWorkspacePageName();
		String expected = "Workspaces";
		Assert.assertEquals(actual, expected);

	}

	@Test(description = "Open Templates tab")
	public void tc03_openTemplatesTab() {
		TopMenuBarInvolveMe tmbn = new TopMenuBarInvolveMe(driver);
		tmbn.clickTemplates();
//		Navigating  to "Templates" page Validation
		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		String actual = tp.validateTemplatesPageName();
		String expected = "Templates";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Open Organization Analytics tab")
	public void tc04_openAnalyticsTab() {
		TopMenuBarInvolveMe tmbn = new TopMenuBarInvolveMe(driver);
		tmbn.clickAnalytics();
//		Navigating  to "Organization Analytics" page Validation
		OrganizationAnalyticsPage oa = new OrganizationAnalyticsPage(driver);
		String actual = oa.validateOrganizationAnalyticsPageName();
		String expected = "Organization Analytics";
		Assert.assertEquals(actual, expected);

	}

	@Test(description = "Open integrations tab")
	public void tc05_openIntegrationsTab() {
		TopMenuBarInvolveMe tmbn = new TopMenuBarInvolveMe(driver);
		tmbn.clickIntegrations();
//		Navigating  to "Integrations" page Validation
		IntegrationsPage intp = new IntegrationsPage(driver);
		String actual = intp.validateIntegrationsPageName();
		String expected = "Integrations";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Open AffiliateProgram tab")
	public void tc06_openAffiliateProgramTab() {
		TopMenuBarInvolveMe tmbn = new TopMenuBarInvolveMe(driver);
		tmbn.clickAffiliateProgram();
//		Navigating  to "Affiliate Program" page Validation
		AffiliateProgramPage ap = new AffiliateProgramPage(driver);
		String actual = ap.validateAffiliateProgramPageName();
		String expected = "Affiliate Program";
		Assert.assertEquals(actual, expected);
	}

}