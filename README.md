# Automation Test Framework

📌 **Overview**

Automation test framework ini dibuat untuk menguji Web UI dan API dalam satu repository menggunakan:

Web UI Testing: Selenium, Cucumber, Page Object Model

API Testing: Rest Assured, Cucumber

Build & Dependency Management: Gradle

Reporting: Cucumber HTML & JSON Reports

CI/CD: GitHub Actions

🏗 **Project Structure**

* automation-test-framework
* ├── src
* │   ├── main/java
* │   │   ├── web (Page Object Model untuk Web UI)
* │   │   ├── api (Helper class untuk API test)
* │   ├── test/java
* │   │   ├── stepdefinitions/web
* │   │   ├── stepdefinitions/api
* │   │   ├── runners (Test runner)
* │   ├── test/resources
* │   │   ├── features/web
* │   │   ├── features/api
* ├── .github/workflows/test.yml (GitHub Actions workflow)
* ├── build.gradle
* ├── README.md

📦 **Dependencies**

Framework ini menggunakan:

Selenium: Web UI automation

Rest Assured: API testing

Cucumber: BDD test framework

JUnit: Test execution

Gradle: Build tool

🚀 **Menjalankan Test**

1️⃣ Menjalankan API Test

gradle testApi

2️⃣ Menjalankan Web UI Test

gradle testWeb

3️⃣ Menjalankan Semua Test

gradle test

📊 **Test Reports**

Setelah menjalankan test, report dapat ditemukan di:

HTML Report: build/reports/tests/test/index.html

JSON Report: build/cucumber-reports/cucumber.json

🔄 **GitHub Actions**

Test akan berjalan otomatis saat:

Pull Request dibuat.

Manual Trigger dijalankan dari tab Actions di GitHub.

🎯 **Target Testing**

Web UI: DemoBlaze

API: DummyAPI

🛠 **Konfigurasi Tambahan**

Pastikan ChromeDriver sudah terinstal untuk Web UI test.

Untuk API test, gunakan app-id dari DummyAPI.