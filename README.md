# Appium Testing

This is an example of an automated test framework for studying both programming and automated testing.

The objective of this work was to learn how to use the best tools to create our automated test
and be able to create our test framework in the best way possible.

### How will execute the tests:
- Appium

### A way to check the results
- Junit5

### Programming language:
- Java

### Additional tools:

  ### Reports and dependencies
  - Gradle
  
  ### Driver
  - UiAutomator 2
  
  ### Capture the sreenshot
  - UiAutomatorViewer

### Requirements

Download and install [INTELIJ](https://www.jetbrains.com/idea/)

Download and install [Appium](https://appium.io/)

Download and install [AndroidSDK](https://developer.android.com/studio)

Download and install JDK, I'm using the version 1.8.0_231 [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)


### Configuration AVD Manager

Open the Android Studio, click on More Actions > AVD Manager.

AVD Name:
- appium_tester

Choose Device:
- Nexus 4

Android Version:
- 9

Release Name:
- Pie


### Running by IntelliJ

Open your emulator (AVD Manager).

After importing this project into IntelliJ, navigate to the /src/java/com.igordias.appium folder and open the FeatureCadastro class.

A green button (a play) should appear next to the class name on line 13, just press it.

The tests will be compiled and the results will be displayed on the Intellij run screen.


### Reports

Test results are displayed on the screen of the Intellij or terminal.
 
In addition, we generate an .html report on each run.

This report is in the folder

    build -> reports -> tests -> test -> index.html
