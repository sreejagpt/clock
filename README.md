# Clock
Shokunin Challenge - Draw an analogue clock face.

#Assumptions
- The time is supplied on stdin in the format hh:mm, followed by a single newline. Both hh and mm are padded with a leading 0 (zero) if they are less than 10.
- The analogue clock face representing that time, subject to the following rules, should be written on stdout.
- Each hour mark should be drawn with 'o' (Lower-case O).
- The hour mark representing the hour given in the input should be drawn with an 'h'.
- The hour mark representing the minute given in the input should be drawn with an 'm'.
- If the hour and the minute both fall on the same mark, then you should draw it with an 'x'.
- You should round down the minutes past the hour to the nearest 5 for the purposes of marking it on the clock (so 23 becomes 20, 39 becomes 35).

#Prerequisites
- JVM (Java 1.8)

#Build & Run
./go.sh
Program accepts input from stdin. Any formatting error detected in user input is printed out to stderr. 

#Clean
./clean.sh


#Example
Sreejas-MacBook-Pro:clock sreeja$ ./go.sh
Welcome! Enter a time in the form hh:mm
12:50
       h
   o       o
 m           o
o      .      o
 o           o
   o       o
       o
3:78
[ERR] Time must be in the form hh:mm. Try again!

