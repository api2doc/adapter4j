adapater4j
===
[中文說明](README_TW.md)

The adapter4j is an Android library that provides some classes of `java.awt` and `javax` to be used in Andorid environment.

These classes have exactly the same names, but not from J2SE.

## Motivation
Some of the libraries I develop have a major requirement which is need to be used on both desktop and Android. These libraries use J2SE classes such as __Font__, __Color__, __Graphics__, etc. which are part of `java.awt` and `javax` and don't exist in Android envrionment.

In order for these libraries to work well on both platforms without any modification, I create some classes which names are the same as classes in J2SE. These classes call native classes of Android environment to produce same results as calling the J2SE classes in the desktop environment.

Note: Only the classes of J2SE I use are implemented in this library, and the properties and methods are only partially implemented.

## How to Use
### Android Studio Project
1. Add __j2a-x.x.x.aar__ dependency in the __build.gradle__ of the application.
``` yaml
dependencies {
    implementation(name:'j2a-0.1.1-release', ext:'aar')

    // or
    compile(name:'j2a-0.1.1-release', ext:'aar')
}
```

2. Integrate with your application
```java
Env2a.link(this);                         // Link to the your application
Env2a.configPaintAntiAliasFlag(true);     // Paint setting
```
