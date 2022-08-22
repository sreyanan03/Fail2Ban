# Fail2Ban
Fail2Ban.java

This program takes two command line arguments: the name of a single log file nad the name of an output file. In this project, I create a program that takes a file, extracts the IP address from each line, and returns whether the line is a failed login attempt or valid login attempt

* Program is divided into three sections: 

1) To read user input and extract the IP address if it is Invalid and place the extracted values in an array
    a) Created a while loop that reads a line in the file if it exists through the (in.hasNextLine) condition
    b) Created an Array to store all the input of the given line and the split method divides the line into Strings and will store in the array
    c) Used if condition which essentially states that if theh 6th word equals Invalid, then it will store the 10th word of the array which would be the IP address and 

2) Declare and instantialized an arraylist called moreThanThree which stores the Invalid IP addresses that show up more than 3 times
    a) Created a for loop to run through the entire invalid ArrayList
        i) the if statement first checks if element from invalid already exists in the moreThanThree ArrayList &if so, it continues through the next iteration
        ii) there is a counter variable that count the number of times an invalid address appeears in the invalid array and will count through every iteration
        ii) finally if the counter variable is equla to or greater than 3, the invalid element gets added to the moreThanThree array and the counter variable will be reset through every comparision
        
3) Once the moreThanThree arraylist is created, the last objective to to print the elements of this array
    a) use the size function to display number of IP addresses in the array and use an enhanced for loop to display all elements
    b) this is all printed to the output file through the PrintWriter class and methods
        
The imported packages include: Scanner, File, FileNotFoundException, PrintWriter 
The program runs in a main method - taking 2 arguments from command line and placing in array
Commands will be the one that we read: (logs_processed.txt) + the one that we write(output.txt))
To Read File, we will use the Scanner class and create an instance called in which is used through the program
To Write File, we will use the PrintWriter class and create an instance called out which is used through the program
The File package and FileNotFoundException packages will define classes to access files and file systems and will throw a checked exception when a file path doesn’t exist or is not accessible
