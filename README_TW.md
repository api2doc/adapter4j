adapater4j
===
[English](README.md)

adapter4j 是一個 Android 函式庫，提供在 Android 環境下可以使用部分同名於 `java.awt` and `javax` 的類別。

這些類具有完全相同的名稱，但不是來自 J2SE。


## 動機
部分我所開發的函式庫有個主有需求，需要能在 Desktop 或 Android 平台上使用，這些函式庫使用到 J2SE 內 `java.awt` 和 `javax` 下的類別例如 __Font__, __Color__, __Graphics__ 等等，但這些類別不存在於 Android 環境內。

為了讓這些函式庫在不需要被更改的情況下能正常工作在兩個平台上，我建立和 J2SE 類別同名的類別。這些類別會調用 Android 環境下的原生類別，產生和在 Desktop 上直接調用 J2SE 類別相同的結果。

注意：只有我使用到的 J2SE 類別有實作到此函式庫中，屬性跟方法也只有部分實作。

## 如何使用
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
