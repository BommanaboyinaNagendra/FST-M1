# Set up the Firefox Driver with WebDriverManger
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://alchemy.hguy.co/lms")

    # Print the title of the page
    print("Page title:- ", driver.title)
    Actual_title = driver.title
    Expected_title = "Alchemy LMS – An LMS Application"

    # Print the title of the new page
    print("New page title i:- ", driver.title)
    assert Actual_title == Expected_title, "Title mismatch"
    MyAccount = driver.find_element(By.XPATH, "//div[@class='main-navigation']/ul//li[@id='menu-item-1507']/a")
    ExpectedMyAccount = "My Account"
    print("New heading is:- ", MyAccount.text)

    assert MyAccount.text == ExpectedMyAccount, "Heading mismatch"

    loginBtn = driver.find_element(By.XPATH, "//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")
    loginBtn.click()
    username = driver.find_element(By.ID, "user_login")
    password = driver.find_element(By.ID, "user_pass")
    submitBtn = driver.find_element(By.ID, "wp-submit")
    username.send_keys("root")
    password.send_keys("pa$$w0rd")
    submitBtn.click()
    assert "My Account" == driver.find_element(By.TAG_NAME, "h1").text, "Heading mismatch"

    driver.quit()
