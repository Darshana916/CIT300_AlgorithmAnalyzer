CIT300 - Algorithm Analyzer: Measuring Performance & Complexity

🌟 Overview

This repository contains the source code and analysis for the CIT300 Graded Practical Assignment 3: Algorithm Analyzer. The objective of this project was to "implement and measure the execution time"" of various search and sort algorithms on different input sizes (100, 500, and 1,000 integers) to practically demonstrate their time complexity.

The project was implemented in "Java" and uses "System.nanoTime()" for precise performance measurement.



🎯 Algorithms Analyzed & Time Complexity

The team was divided into four members, each responsible for implementing and analyzing a specific algorithm:


MEMBER       TASK  
Member 1     Implement Linear Search — measure time for finding an element in arrays of sizes 100, 500, and 1000. 
Member 2     Implement Binary Search — sort the array first, then measure search time for the same input sizes 100, 500 and 	     1000. 
Member 3     Implement Bubble Sort — measure sorting time for input sizes 100, 500, and 1000. 
Member 4     Implement Quick Sort — measure sorting time for input sizes 100, 500, 



🚀 Execution & Results

The code was executed for the specified input sizes, and the time taken was recorded in milliseconds (ms). The analysis successfully validated the theoretical time complexities of each algorithm.



📊 Sample Output (Time in ms)

*(Note: The actual output table for your merged code will replace this section.)*

| Input Size (N) | Linear Search (O(n)) | Binary Search (O(log n)) | Bubble Sort (O(n²)) | Quick Sort (O(n log n)) |

|      100       |        0.005 ms      |          0.001 ms        |       0.125 ms      |          0.009 ms       |
|      500       |        0.021 ms      |          0.003 ms        |       1.520 ms      |          0.051 ms       |
|      1000      |        0.035 ms      |          0.006 ms        |       5.870 ms      |          0.110 ms       |



🛠️ Project Structure 



The project includes the main analysis file and supporting materials:

AlgorithmAnalyzer.java 	 : The primary Java file containing the implementations of all four algorithms (timeLinearSearch, 			   timeBinarySearch , timeBubbleSort , timeQuickSort) and the main execution logic to generate the 			   tables.
MemberX_Algorithm.java	 : (If files were split per member) Individual files demonstrating the code contribution of each team 			   member.
REPORT.pdf		 : (If applicable) The final report containing detailed findings, analysis, and discussion.



🤝 Team Contribution

This project was a collaborative effort demonstrating our ability to use Git for version control.

|     Member Name    |  Student ID  | Task Completed | Contribution Details (Optional) 

| [Member 1 Punsara] | [22UG3-0434] |  Linear Search | Implemented search and contributed to array generation. 
| [Member 2 Suranga] | [22UG3-0382] |  Binary Search | Implemented search and ensured pre-sorting of data. 
| [Member 3 Sanura]  | [22UG3-0551] |   Bubble Sort  | Implemented sorting and time analysis functions. 
| [Member 4 Supun]   | [22UG3-0378] |   Quick Sort   | Implemented recursive Quick Sort and final data consolidation. 



