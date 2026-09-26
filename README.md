# alkalinekats patch

To add a sound:

1. Add `sound_name.ogg` to `src/main/resources/assets/alkalinekats-patch/sounds`
2. Add an entry to `src/main/resources/assets/alkalinekats-patch/sounds.json` (note the `,` that was added):
```diff
{
  "alkaline": {
    "sounds": [
      "alkalinekats-patch:alkaline"
    ]
-  }
+  },
+ "sound_name": {
+   "sounds": [
+       "alkalinekats-patch:sound_name"
+   ]
+ }  
}
```
3. Register the sound in `src/main/java/com/skycatdev/alkalinekatspatch/AlkalinekatsPatch.java`:
```diff
@Override
public void onInitialize() {
    makeSound("alkalinekats");
+   makeSound("sound_name");
}
```
4. Build - either on your computer with `./gradlew build` or `./gradlew.bat build`, or on GitHub actions by pushing changes (or commiting via the web interface).
