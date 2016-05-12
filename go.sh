#!/bin/sh
mkdir -p out
javac -d out/ -cp src/ src/com/sreeja/shokunin/*.java
java -cp out/ com.sreeja.shokunin.Main
