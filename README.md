# Mobile-Barcode-Scanner-Application

>This is a ReadMe to understand project info.

---

### Table Of Contents

- [Description](#description)
- [Process](#process)
- [Mobile User Interfaces](#mobile-user-interfaces)
- [Languages & Techonologies](#languages-techonologies)



---

## Description

A barcode supported price comparison application has been developed.A mobile barcode scanner application has been developed that can identify the product in your hand using the barcode and compare prices, where the stocks are, how many stocks are available over the internet.Listed by app search and price shown by app for online and offline outlets.


### [Back To The Top](#Mobile-Barcode-Scanner-Application)

---

## Process

Two APIs were used in a barcode-supported price comparison application.The first api; It was used by google vision to detect the data in the barcode via machine learning and convert it as a number.The second api is Ebay's Rapidapi which is barcode data requirement is available.With this barcode data, it shows whether the product in the barcode data is available on e-bay and amazon.

The process works as follows:
After the user gives the camera permissiob to the application, the barcode image of the product you have is sent to the google vision api with the help of scanning.This API converts this data to barcode number.Later, users want to continue with the number of barcodes offered to them, e-bay's rapid api provides a list that compares the prices of that product, where its stocks are, how many stocks are available on the internet.This list also includes access to websites with the product.If the users do not want to continue with the barcode number provided to them, the process that took place at the beginning will be repeated.

In this barcode supported price comparison application, the only number added to the database is the data of the barcode number.This is because when the application is closed and opened, the past barcode must be kept. 



### [Back To The Top](#Mobile-Barcode-Scanner-Application)

---


## Mobile User Interfaces

Interfaces are given below:

![XD]()

---


## Languages & Techonologies

- Java (implementation)
- Rapid API from E-bay
- Google vision API


### [Back To The Top](#Mobile-Barcode-Scanner-Application)

---



