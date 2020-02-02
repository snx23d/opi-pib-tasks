# opi-pib-tasks

Main entry point to run both tasks is 

opi\src\test\java\tasks\acceptancetests\TestRunner.java

which runs tests from both tasks.

Project is created using Google Chrome and chromedriver.exe which is present in

opi\dependencies\chromedriver.exe


I used VS Code IDE that I had at hand. Idea InteliJ or Eclipse probably would be
better suitted for the job, but VS Code was perfectly fine here.

Project is created with maven from cucumber-selenium-archetype, that's whi it's
somewhat messy - I was experimenting with running tasks with Cucumber
but I decided to stop since I was running out of time to complete the project.
Most of that code is commented out.

For som reason new ChromeDriver() creates 2 separate instances of the browser 
where only one of them is controlled by selenium. 
Also chromedriver doesn't quit when process ends. I tried to fix this
but was unable to do so. This doesn't happen with JS Selenium
(selenium-webdriver npm package).

Tested page is mean - it contains lots of traps to fall into like for example:
* multiple iframes when a single one is expected (I fell into that one)
* dynamic name and id on an iframe
* spaces in DOM element classes when there is just a single class added
* trailing spaces inside some labels
* no "display: none" in style attribute ininvisible/hidden elements
* few others that I missed

This was my first Java code ever. I'm sure most things could be done easier
and better (for example using @FindBy and PageFactory - I experimented
with these here too).
