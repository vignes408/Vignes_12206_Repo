package com.vickee.restapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ViewTest {

	@Test
	void viewTest1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("div2"));
		assertSame("Add Employee", "Add Employee");
	}
	
	@Test
	void viewTest2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("div2"));
		assertSame("View Payroll", "View Payroll");
	}
	
}
