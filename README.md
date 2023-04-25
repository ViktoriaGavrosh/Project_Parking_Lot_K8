# Project_Parking_Lot_K8
This project created during the learning process

This program is a parking management program 
that keeps track of free spaces and parked cars.

It can place your car in a parking lot and 
free the lot when the car leaves.

"create" - command that allows the user to 
specify the number of spots. For example, 
the command create 3 makes a parking lot 
with three spots. 

The parking lot should allow the user to 
park the car. This is implemented using the 
"park" command. After the user has entered 
this command, the registration number and 
the color of the car should be specified. 
For example, park KA-01-HH-1234 Blue. 
The registration number should not contain 
spaces. The color can be written in either 
uppercase or lowercase letters.

To pick up the car, the user should print 
the command "leave" and then the number of 
the parking spot, for example, leave 1.

The command "status" prints all occupied spots 
in ascending order. 

The command "reg_by_color" prints all 
registration numbers of cars of a particular 
color, taking color as a parameter. 

The command "spot_by_color" is similar to 
the previous one, but it prints the parking 
space numbers of all the cars of a particular 
color.

The command "spot_by_reg" returns you the 
number of the spot where a car is located 
based on its registration number, for example, 
spot_by_reg KA-01. 

The user can write commands  repeatedly and 
type "exit" to end the program.

☝️ The program does not check for valid input ☝️
