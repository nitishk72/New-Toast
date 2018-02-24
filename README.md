# New Toast Library

[![](https://jitpack.io/v/nitishk72/New-Toast.svg)](https://jitpack.io/#nitishk72/New-Toast)


## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	compile 'com.github.nitishk72:New-Toast:0.1.0'
}
```


## Configuration

This step is optional, but if you want you can configure some Toasty parameters. Place this anywhere in your app:

```java
NewToast.makeToast(MainActivity.this,
                        "THIS IS TOAST MESSAGE ",
                        NewToast.LENGTH_SHORT,
                ).show();
```
## NewToast comes with 5 different flavour
For DEFAULT
```java
NewToast.makeToast(MainActivity.this,
                        "THIS IS TOAST MESSAGE ",
                        NewToast.LENGTH_SHORT,
                        NewToast.DEFAULT
                ).show();
```
For Success
```java
NewToast.makeToast(MainActivity.this,
                        "THIS IS TOAST MESSAGE ",
                        NewToast.LENGTH_SHORT,
                        NewToast.SUCCESS
                ).show();
```
For INFO
```java
NewToast.makeToast(MainActivity.this,
                        "THIS IS TOAST MESSAGE ",
                        NewToast.LENGTH_SHORT,
                        NewToast.INFO
                ).show();
```
For Success
```java
NewToast.makeToast(MainActivity.this,
                        "THIS IS TOAST MESSAGE ",
                        NewToast.LENGTH_SHORT,
                        NewToast.SUCCESS
                ).show();
```
For WARNING
```java
NewToast.makeToast(MainActivity.this,
                        "THIS IS TOAST MESSAGE ",
                        NewToast.LENGTH_SHORT,
                        NewToast.WARNING
                ).show();
```
For DANGER
```java
NewToast.makeToast(MainActivity.this,
                        "THIS IS TOAST MESSAGE ",
                        NewToast.LENGTH_SHORT,
                        NewToast.DANGER
                ).show();
```


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/nitshk72/New-Toast/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2017 Nitish Kumar Singh

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
