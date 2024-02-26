from _ast import Assert

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    driver.get("https://alchemy.hguy.co/lms/")

    element= driver.find_element(By.XPATH,"//h1[@class='uagb-ifb-title']")
    assert "Learn from Industry Experts"==element.text
   