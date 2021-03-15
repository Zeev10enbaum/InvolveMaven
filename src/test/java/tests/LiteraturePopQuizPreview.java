package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import LiteraTurePopQuizTemplate.LiteraturePopQuizPage1;
import LiteraTurePopQuizTemplate.LiteraturePopQuizPage2;
import LiteraTurePopQuizTemplate.LiteraturePopQuizPage3;
import LiteraTurePopQuizTemplate.LiteraturePopQuizPage4;
import LiteraTurePopQuizTemplate.LiteraturePopQuizPage5;
import LiteraTurePopQuizTemplate.LiteraturePopQuizPage6;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobjects.TemplatesPageInvolveMe;
import pageobjects.ChooseProjectTypeInvolveMe;
import pageobjects.MyWorkspacePageInvolveMe;

public class LiteraturePopQuizPreview extends BaseTest {

	@Test(description = "Create new porject")
	@Description ("Create new porject")
	@Severity(SeverityLevel.CRITICAL)
	public void tc02_CreateNewProject() {
		MyWorkspacePageInvolveMe wsp = new MyWorkspacePageInvolveMe(driver);
		wsp.clickCreateProjectBtn();
//		Navigating  to "Choose project type" page Validation
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		String actual = cpt.validateChooseProjectTypePageName();
		String expected = "Choose project type";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Choose project type (Quiz)")
	@Description ("Choose project type (Quiz)")
	@Severity(SeverityLevel.NORMAL)
	public void tc03_ChooseProjectTypeQuiz() {
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.QuizBtn();
		cpt.sleep(2000);
//		Navigating  to "Templates" page Validation
		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		String actual = tp.validateTemplatesPageName();
		String expected = "Templates";
		Assert.assertEquals(actual, expected);
	}
 
	@Test(description = "Choose Example")
	@Description ("Choose Example (Literature Pop Quiz)")
	@Severity(SeverityLevel.NORMAL)
	public void tc04_ChooseExample() {
		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		tp.chooseExampleList("Literature Pop Quiz");
//		Quiz name Validation
		String actual = tp.validaQuizName();
		String expected = "Literature Pop Quiz";
		Assert.assertEquals(actual, expected);
	}
 
	@Test(description = "Open Preview")
	@Description ("Select open prewview Option ")
	@Severity(SeverityLevel.NORMAL)
	public void tc05_openPreview() {
		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		tp.openPreview();
		// Open preview Validation
		LiteraturePopQuizPage1 ltpq1 = new LiteraturePopQuizPage1(driver);
		String actual = ltpq1.literaturePopQuizPage1Validation();
		String expected = "Literature Pop Quiz";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Start Literature Pop Quiz")
	@Description ("Start Literature Pop Quiz")
	@Severity(SeverityLevel.NORMAL)
	public void tc06_StarLiteraturePopQuiz() {
		LiteraturePopQuizPage1 ltpq = new LiteraturePopQuizPage1(driver);
		ltpq.startQuizBtn();
//		Open preview Validation
		LiteraturePopQuizPage2 ltpq2 = new LiteraturePopQuizPage2(driver);
		String actual = ltpq2.literaturePopQuizPage2Validation();
		String expected = "Shakespeare did NOT write:";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Answer first Question Literature Pop Quiz")
	@Description ("Answer first Question Literature Pop Quiz")
	@Severity(SeverityLevel.NORMAL)
	public void tc07_AnswerfirstQuestion() {
		LiteraturePopQuizPage2 ltpq2 = new LiteraturePopQuizPage2(driver);
		ltpq2.chooseAnswerList("The Merry Adventures of Robin Hood");
//		Feedback is Correct Validation
		String actual = ltpq2.feedbackTextCorrectPag2();
		String expected = "This 1883 novel was written by American illustrator and writer Howard Pyle.";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Using the next button after answering first Question ")
	@Description ("Using the next button after answering first Question)")
	@Severity(SeverityLevel.NORMAL)
	public void tc08_NextBtn() {
		LiteraturePopQuizPage2 ltpq2 = new LiteraturePopQuizPage2(driver);
		ltpq2.clickigNextButton();
//		CLicking the next button 
		LiteraturePopQuizPage3 ltpq3 = new LiteraturePopQuizPage3(driver);
		String actual = ltpq3.literaturePopQuizPage3Validation();
		String expected = "Which novel belongs to realism?";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Answer secound Question Literature Pop Quiz")
	@Description ("Answer secound Question Literature Pop Quiz")
	@Severity(SeverityLevel.NORMAL)
	public void tc09_AnswerSecoundQuestion() {
		LiteraturePopQuizPage3 ltpq3 = new LiteraturePopQuizPage3(driver);
		ltpq3.chooseAnswerList("The Lone Ranger and Tonto Fistfight in Heaven");
//		Feedback is Correct Validation
		String actual = ltpq3.feedbackTextCorrectPag3();
		String expected = "Lone Ranger and Tonto belong to contemporary American tribal literature.";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Using the next button after answering secound Question ")
	@Description ("Using the next button after answering secound Question")
	@Severity(SeverityLevel.NORMAL)
	public void tc10_NextBtn() {
		LiteraturePopQuizPage3 ltpq3 = new LiteraturePopQuizPage3(driver);
		ltpq3.clickigNextButton();
//		CLicking the next button validation
		LiteraturePopQuizPage4 ltpq4 = new LiteraturePopQuizPage4(driver);
		boolean expected = ltpq4.literaturePopQuizPage4Validation("How is Elroy's ");
		Assert.assertTrue(expected, "Sorry didn't the String  ");
	}

	@Test(description = "Answer Third Question Literature Pop Quiz")
	@Description ("Answer Third Question Literature Pop Quiz")
	@Severity(SeverityLevel.NORMAL)
	public void tc11_AnswerThirdQuestion() {
		LiteraturePopQuizPage4 ltpq4 = new LiteraturePopQuizPage4(driver);
		ltpq4.chooseAnswerList("He decides to go to Vietnam");
//		Feedback is Correct Validation
		String actual = ltpq4.feedbackTextCorrectPag4();
		String expected = "The novel describes soldiers' lives during the Vietnam war so a decision to join the army is most significant for the plot.";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Using the next button after answering third Question ")
	@Description ("Using the next button after answering third Question")
	@Severity(SeverityLevel.NORMAL)
	public void tc12_AnswerfirstQuestion() {
		LiteraturePopQuizPage4 ltpq4 = new LiteraturePopQuizPage4(driver);
		ltpq4.clickigNextButton();
//		CLicking the next button validation
		LiteraturePopQuizPage5 ltpq5 = new LiteraturePopQuizPage5(driver);
		String actual = ltpq5.literaturePopQuizPage5Validation();
		String expected = "Where should I send the results?";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Get Results form")
	@Description ("Get Results form")
	@Severity(SeverityLevel.NORMAL)
	public void tc13_getResults() {
		LiteraturePopQuizPage5 ltpq5 = new LiteraturePopQuizPage5(driver);
		ltpq5.getResults("ZAZI", "Ten", "ZAZI@gmail.com");
//		CLicking get results button validation
		LiteraturePopQuizPage6 ltpq6 = new LiteraturePopQuizPage6(driver);
		String actual = ltpq6.literaturePopQuizPage6Validation();
		String expected = "You shall not pass!";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Open facebook and twitter")
	@Description ("Open facebook and twitter ")
	@Severity(SeverityLevel.NORMAL)
	public void tc14_facebookAndTwitter() {
		LiteraturePopQuizPage6 ltpq6 = new LiteraturePopQuizPage6(driver);
		ltpq6.facebook();
		ltpq6.twitter();
	}

	@Test(description = "Close the quiz")
	@Description ("Close the quiz")
	@Severity(SeverityLevel.NORMAL)
	public void tc15_getResults() {
		LiteraturePopQuizPage6 ltpq6 = new LiteraturePopQuizPage6(driver);
		ltpq6.closeQuiz();
//		CLicking close quiz
		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		String actual = tp.validateTemplatesPageName();
		String expected = "Templates";
		Assert.assertEquals(actual, expected);
	}
}