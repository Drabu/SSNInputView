Setup
Step 1. Add it in your root build.gradle at the end of repositories:

allprojects {
    repositories {
 maven { url 'https://jitpack.io' }
    }
}
Step 2. Add the dependency:

dependencies {
         implementation 'com.github.guy-4444:SmartRateUsDialog-Android:1.00.02'
}
