#!/bin/bash

rm -rf src/main/resources

# check if archive.zip exists
if [ ! -f archive.zip ]; then
    echo "Downloading archive.zip"
    wget https://github.com/Zylquinal/phc-winner-argon2/releases/download/latest/archive.zip
fi

unzip -o archive.zip -d phc-winner-argon2

mkdir -p src/main/resources
mkdir -p src/main/resources/darwin-aarch64
mkdir -p src/main/resources/darwin-x86-64
mkdir -p src/main/resources/linux-aarch64
mkdir -p src/main/resources/linux-x86-64
mkdir -p src/main/resources/windows-aarch64
mkdir -p src/main/resources/windows-x86-64

cp phc-winner-argon2/aarch64-apple/libargon2.1.dylib src/main/resources/darwin-aarch64/libargon2.dylib
cp phc-winner-argon2/x86_64-apple/libargon2.1.dylib src/main/resources/darwin-x86-64/libargon2.dylib
cp phc-winner-argon2/aarch64-linux/libargon2.so.1 src/main/resources/linux-aarch64/libargon2.so
cp phc-winner-argon2/x86_64-linux/libargon2.so.1 src/main/resources/linux-x86-64/libargon2.so
cp phc-winner-argon2/aarch64-windows/libargon2.dll src/main/resources/windows-aarch64/libargon2.dll
cp phc-winner-argon2/x86_64-windows/libargon2.dll src/main/resources/windows-x86-64/libargon2.dll

rm -rf phc-winner-argon2

