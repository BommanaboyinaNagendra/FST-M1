# Import webdriver from selenium
from _ast import Assert

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

   # driver.get("https://alchemy.hguy.co/lms/")
    #Assert.assertEquals("Alchemy LMS – An LMS Application",driver.title(),"Not matched with expected result");
   #print()
    #assert "Alchemy LMS – An LMS Application"== driver.title
    #driver.close();

    example_list = ["apple", "banana", "cherry"]
    #example_list.pop();
    print(example_list)
    print(example_list.pop())
    #print(example_list.pop(1))
    example_list_1={"as":"as","as":"as"}
    example_list_1.popitem();
    print(example_list_1)
    print(2**2**3**1)
    print(2**2)
    print(2**3)