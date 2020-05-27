package org.example.schoology.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Courses {

	private WebDriver driver;

	@FindBy(css = "a.create-course-btn")
	WebElement createCourseButton;

	public Courses(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public CreateCourseModal openCourseModal(){

		createCourseButton.click();
		return new CreateCourseModal(driver);

	}

}