import pytest

# Additon test
def test_sumOfTwoNumbers():

    # Initialize two numbers
    num1 = 10
    num2 = 15

    # Add them
    sum = num1 + num2

    # Assertion
    assert sum == 25

# Subtraction test
def test_subOfTwoNumbers():

    # Initialize two numbers
    num1 = 50
    num2 = 35

    # Subtract them
    diff = num1 - num2

    # Assertion
    assert diff == 15

# Multiplication test
@pytest.mark.number
def test_mulOfTwoNumbers():

    # Initialize two numbers
    num1 = 5
    num2 = 20

    # Multiply them
    prod = num1 * num2

    # Assertion
    assert prod == 100

# Division test
@pytest.mark.number
def test_divOfTwoNumbers():

    # Initialize two numbers
    num1 = 100
    num2 = 5

    # Divide them
    quot = num1 / num2

    # Assertion
    assert quot == 20