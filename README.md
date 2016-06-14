# MockitoExample
Sample code for the talk "Testing made sweet with a Mockito" that I gave at Droidcon Berlin 2016.

slides: https://speakerdeck.com/jeroenmols/testing-made-sweet-with-a-mockito

# Interesting code parts
- `build.gradle` file indicating how to configure Mockito
  - testCompile: for tests run on your computer in a JVM (src/test folder)
  - androidTestCompile: for tests run on an Android device (src/androidTest folder)
- `UserTest` class demonstrating Mockito usage
- `UserTestAndroid` class demonstrating Mockito usage on Android device
- `HandlerWrapper` class indicating how to test final methods
