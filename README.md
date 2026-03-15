# Queue
Linear Queue class 
Queue Application in Java

This project demonstrates the implementation of a Queue data structure in Java and shows practical examples of how queues can be used in simple applications.

The program includes:

A custom Queue class implementation

A fruit translation system (Turkish → English)

A random number generator that finds missing numbers in a range

Project Structure
project-folder
│
├── Main.java
└── Queue.java
Main.java

Contains the main program logic:

Creates queue objects

Performs translation between Turkish and English fruits

Generates random numbers and finds missing numbers

Queue.java

Contains a custom queue implementation with the following operations:

enqueue() → Add an element to the queue

dequeue() → Remove an element from the queue

peek() → View the front element

isEmpty() → Check if the queue is empty

isFull() → Check if the queue is full

size() → Get the number of elements

Features
1️⃣ Fruit Translation System

The program stores fruits in two queues:

Turkish	English
elma	apple
armut	pear
kiraz	cherry
muz	banana
kavun	melon
kaysi	apricot

The user enters a fruit in Turkish, and the program prints the English translation.

Example:

enter a fruit in Turkish :
elma
apple

If the fruit is not found:

fruit not found
2️⃣ Missing Number Finder

The program:

Generates 10 random numbers between 1 and 20

Stores them in a queue

Prints the numbers

Displays which numbers from 1 to 20 are missing

Example output:

3 5 7 10 12 14 15 18 2 9
1 4 6 8 11 13 16 17 19 20
How to Run the Project
1️⃣ Compile the program
javac Main.java
2️⃣ Run the program
java Main
Concepts Demonstrated

Queue Data Structure

FIFO (First In First Out)

Object arrays

Random number generation

Basic search algorithm using queues

Queue rotation technique
