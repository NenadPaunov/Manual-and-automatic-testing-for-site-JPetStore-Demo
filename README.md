# Manual-and-automation-testing-for-website-JPetStore-Demo

The following project was the final project on IT Bootcamp course. It was done in Java, version 8 and with Selenium WebDriver and Apache Poi libraries. 
Project tasks were:

Test the following site: https://petstore.octoperf.com/.

Create the following Class objects in package page.objects: 
HomePage - represents POM Class Object for home page. Click the linked text to enter the store.
PetStoreMenu – Class to access elements for selecting group of animals through menu on the left, top and center part of the page with images, together with sign in elements.
SignIn – Elements of interest are: registration link, user name and password fields and registration button.
Registration – Elements of interest are all elements required of a successful user registration.

In page.tests package conduct the following:
➔	Test entering the store (clickable Enter the store).
➔	Test PetStoreMenu page:
◆	Check if click on every menu element opens the correct page 
◆	Check if click on sign in opens correct page
➔	Test registration. Use data for:
◆	1 user
◆	From given .xlsx file
◆	Bonus: Explore how to generate data for testing
➔	Test login feature (using data from the .xlsx file).
➔	Test the feature to update data of a logged in user
➔	Enable addition of a chosen item to the Cart
◆	Bonus challenge: Check if the Cart contains previously added item.

