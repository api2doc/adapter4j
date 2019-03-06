adapater4j
===
The adapter4j is a Android library which implements some classes of `java.awt` and `javax` for Android envrionment.

## Motivation
Some of the libraries I develop have a major requirement which is need to be deployed to both desktop and Android, but these libraries use J2SE classes such as __Font__, __Color__, __Graphics__, etc. which are part of `java.awt` and `javax` and don't exist in Android envrionment.

I hope these libraries can work well without any modification, so I try to create classes with same package and name, which call native classes of Java in Android environment to produce same results on desktop environment.

Note: Only the classes I use are implemented in the adapter, and the properties and methods in the class are not all implemented either.

## How to Use
### Android Studio
1. Add `j2a-0.1.aar` to build path.

2. Configuration
```java
Env2a.link(this);                         // Link to the your application
Env2a.configPaintAntiAliasFlag(true);     // Paint setting
```
