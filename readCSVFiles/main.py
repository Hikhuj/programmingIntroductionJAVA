#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Python 3 version

##### MAIN #####

import csv

separator_symbol = ', '
inicializador = 0

with open('testFile.csv', newline='') as csvfile:
	leerCSV = csv.reader(csvfile, delimiter=' ', quotechar='|')
	for row in leerCSV:
		print("Linea ")
		print(separator_symbol.join(row))

with open('testFileWriter.csv', newline='') as csvfile:
	escribir = csv.writer()



"""
#### Example of Calculate Formula ####
print "*---------------------------------------------*"
print "|                                             |"
print "|             Calculus of formula             |"
print "|                                             |"
print "*---------------------------------------------*"
print " "

# Request of numbers
firstNumber = input("Please provide the first number (Integer): ")
secondNumber = input("Please provide the second number (Integer): ")

# Assign the function to a variable to be printed
resultOfCalculateFormula = calculateFormula(firstNumber,secondNumber)

# Print the result
print resultOfCalculateFormula
print " "
print "*---------------------------------------------*"
print " "
print " "


#### Calculate Average of Grades
print "*---------------------------------------------*"
print "|                                             |"
print "|      Calculate the average of X notes       |"
print "|                                             |"
print "*---------------------------------------------*"
print " "
amountOfGrades = int(input("How many grades would you like to calculate?: "))

# Initialization of array for grades to be collected
gradesList = []


for grade in range(amountOfGrades):
	grade = int(input("Add a grade: "))
	gradesList.append(grade)

averageOfTotalGrades = averageOfGrades(amountOfGrades, gradesList)
# averageOfTotalGrades = averageOfGrades(amountOfGrades, gradesList)

print averageOfTotalGrades
print " "
print "*---------------------------------------------*"
print " "
print " "


#### Calculate Square of a number
print "*---------------------------------------------*"
print "|                                             |"
print "|         Calculate Square of a number        |"
print "|                                             |"
print "*---------------------------------------------*"
print " "
numberToSquare = int(input("Please add the number: "))

	
if numberToSquare >= 0:

		resultOfNumberToSquare = calculateSquareOfNumber(numberToSquare)
		resultOfNumberToCube = calculateCubeOfNumber(numberToSquare)
		
		print "The number " + str(numberToSquare) + " to square is: " + str(resultOfNumberToSquare)
		print "The number " + str(numberToSquare) + " to cube is: " + str(resultOfNumberToCube)

else:
	print "You did not add a valid number to calculate"

"""







