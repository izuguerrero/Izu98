# Izu 98 Android Icon Pack

This is the Android Studio source project for the custom Izu 98 icon pack.

## What is included
- 51 retro PNG icons
- `drawable.xml` so compatible launchers can browse the icon library
- `appfilter.xml` with starter automatic mappings for common apps
- icon-pack discovery intents for common third-party launchers

## Build
1. Open this folder in Android Studio.
2. Let Gradle sync/download the Android build tools.
3. Build > Build APK(s).
4. Install the generated APK on the phone.
5. In Lawnchair: Home settings > General > Icon style > choose Izu 98.

The automatic app mappings are intentionally conservative because Android package/activity
names can differ by app version. Even when an app does not auto-map, its Izu 98 icon should
remain available from the installed pack for manual selection in compatible launchers.
