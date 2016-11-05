# MockitoExample
Sample code for the talk "Testing made sweet with a Mockito" that I gave at Droidcon Berlin 2016.

slides: https://speakerdeck.com/jeroenmols/testing-made-sweet-with-a-mockito

# Interesting code parts
- [build.gradle](https://github.com/JeroenMols/MockitoExample/blob/master/app/build.gradle) file indicating how to configure Mockito
  - testCompile: for tests run on your computer in a JVM (src/test folder)
  - androidTestCompile: for tests run on an Android device (src/androidTest folder)
- [UserTest](https://github.com/JeroenMols/MockitoExample/blob/master/app/src/test/java/com/jeroenmols/mockitoexample/UserTest.java) class demonstrating Mockito usage
  - TLDR: JVM unit tests with mockito are easy to read and write
- [UserTestAndroid](https://github.com/JeroenMols/MockitoExample/blob/master/app/src/androidTest/java/com/jeroenmols/mockitoexample/UserTestAndroid.java) class demonstrating Mockito usage on Android device
  - TLDR: Mockito can be used on Android, but need to use V1 and dexmaker
- [HandlerWrapper](https://github.com/JeroenMols/MockitoExample/blob/master/app/src/main/java/com/jeroenmols/mockitoexample/HandlerWrapper.java) class indicating how to test final methods
  - TLDR: Wrap final or statics methods with a different non static/final method
- [TestUserData](https://github.com/JeroenMols/MockitoExample/blob/master/app/src/test/java/com/jeroenmols/mockitoexample/TestUserData.java) class indicating how to provide testing data for POJO objects
  - TLDR: Override all methods with default values instead of creating a mock and stubbing them out
- [Custom matchers](https://github.com/JeroenMols/MockitoExample/tree/master/app/src/test/java/com/jeroenmols/mockitoexample/matchers) classes indicating how to create your own custom Mockito matchers
  - TLDR: Implement ArgumentMacher interface and provide [static methods](https://github.com/JeroenMols/MockitoExample/blob/master/app/src/test/java/com/jeroenmols/mockitoexample/matchers/ListMatchers.java) for easy access
- [Mocking final methods](https://github.com/JeroenMols/MockitoExample/blob/master/app/src/test/resources/mockito-extensions/org.mockito.plugins.MockMaker) How to configure Mockito 2.+ to mock final methods
  - TLDR: Recreate one file (exact content and location) and you can mock final methods in jvm tests
