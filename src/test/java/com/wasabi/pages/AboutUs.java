package com.wasabi.pages;

import com.wasabi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {

    public AboutUs() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='About  Us']")
    public WebElement AboutUsHeader;


    @FindBy(xpath = "//a[.='About  Us']")
    public WebElement AboutUsDropDown;


    @FindBy(xpath = "//li[2]/a[@href='/about-us/the-company/']")
    public WebElement TheCompany;

    @FindBy(xpath = "//li[3]/a[@href='/about-us/the-company/company-history/']")
    public WebElement TheTeam;

    @FindBy(xpath = "//li[4]/a[@href='/about-us/the-company/company-history/']")
    public WebElement TheCompanyHistory;

    @FindBy(xpath = "//li[4]/a[@href='/about-us/the-company/community-commitment/']")
    public WebElement TheCompanyCommunity;


}



