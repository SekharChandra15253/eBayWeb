# eBay Automation Framework (BDD - Selenium + Cucumber + Java)

## Overview

This project is an end-to-end UI automation framework built using:

* Selenium WebDriver
* Java
* Cucumber (BDD)
* TestNG
* Maven

Automated the scenario of searching for a product on eBay and adding it to the cart.

---

## Features

* Page Object Model (POM) design
* BDD using Cucumber
* Thread-safe WebDriver (ThreadLocal)
* Explicit waits for stability

# Bitcoin API Automation Framework (RestAssured + TestNG)

## Overview

This project is an API automation framework built using:

* **Java**
* **RestAssured**
* **TestNG**
* **Maven**

It validates the Bitcoin API from CoinGecko:
https://api.coingecko.com/api/v3/coins/bitcoin

---

## Test Scenario

### Objective:

Validate Bitcoin API response data.

### Validations Performed:

1. Send GET request to `/coins/bitcoin`
2. Verify response status code = 200

### Response Validations:

* **Currencies present:**

    * USD
    * GBP
    * EUR

* **Market Data:**

    * Market Cap is available
    * Total Volume is available

* **Price Change:**

    * 24-hour price change percentage is present

* **Homepage Validation:**

    * Homepage URL is not empty




