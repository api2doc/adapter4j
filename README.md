adapater4j
===
The adapter4j implements some classes of `java.awt` and `javax` for Android envrionment.

## Motivation
Some of the libraries I develop have a major requirement which is need to be deployed to the both desktop and Android, but these libraries use classes such as __Font__, __Color__, __Graphics__, etc. which are part of `java.awt` and `javax` and don't exist in Android envrionment.

I hope these libraries can work well without any modifing, so I try to create classes with same package and name, which call native classes of Android to simulate same result on the desktop and be integreated seamlessly at last.

Note: Only the classes I use are implemented in the adapter, and the properties and methods in the class are not all implemented either.

## How to Use
