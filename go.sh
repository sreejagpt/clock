#!/bin/sh
mkdir -p out
javac -d out/ -cp src/ src/io/github/scyptnex/*.java
java -cp out/ io.github.scyptnex.Main
