# Lockation
Lockation is an Android application that automatically unlocks your apps based on your Location or WiFi.

Checkout the store listing for screenshots and more info.

[Play Store](https://play.google.com/store/apps/details?id=com.taj.lockation)

## Features
- Monitors when an app opens to show the lock screen if necessary.
- Automatically unlocks your apps if you are within a certain area (`Safe Location`), or connected to a known WiFi (`Safe WiFi`).
- Conversely, automatically locks your apps if the device is not within a `Safe Location` or not connected to a `Safe WiFi`.
- Ads using Google AdMob
- Premium Subscription Management using Android Billing Client

## Permissions Required
Due to the nature of this app, it requires some special/sensitive permissions in order to work:

- `Location` - Required to get information about your current Location and connected WiFi to un/lock apps.
- `Background Location` - Required to be able to monitor Location and WiFi changes to un/lock the apps.
- `Notifications` - Required to inform you about the applock status and any important actions needed.
- `Usage Stats` - Access to device's usage statistics is required to monitor when an app opens to show the lock screen if necessary.
- `Overlay` - Required to show the lock screen, while Lockation is in the background, when you open a locked app.

## Technologies and Services used
- Java/Kotlin
- Jetpack Compose
- Gradle
- AndroidX Room Database
- Android Billing Client
- Google AdMob

## Building the Project
1. Clone the repository.
2. Open the project in `Android Studio`.
3. Sync the Gradle files and build the project.

## License

The project is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).
