# Argon2

[![Release](https://jitpack.io/v/com.zylquinal/argon2.svg)](https://jitpack.io/#com.zylquinal/argon2)

An argon2 binding using Java Foreign Function & Memory API. Inspired from
[argon2-jvm](https://github.com/phxql/argon2-jvm) binding using JNA.

# How to use

```java

import com.zylquinal.argon2.Argon2;

public class Example {

    public static void main(String[] args) {
        Argon2 argon2 = Argon2.create(2, 65536, 1);
        
        byte[] rawHash = argon2.hashRaw("password".getBytes(), "randomsalt".getBytes());
        String encodedHash = argon2.hashEncoded("password".getBytes(), "randomsalt".getBytes());
    }
    
}
```

# Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.zylquinal:argon2:VERSION'
}
```

# License

```text
MIT License

Copyright (c) 2023 Zylquinal

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```