#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Python 3 version


file_path = '/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/studentNames.txt'
file_path2 = '/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/testFile.txt'
# file_path = '/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/testFile.csv'

# Titulo a utilizar
header_name = 'Nombres de Alumnos\n'

# Se abre el archivo y se almacena todo lo que contenga en una variable
student_names = open(file_path, 'r')

# Se almacena el contenido de un archivo en una variable
students = student_names.read()

# Abrir el archivo para escribir en el
header_names = open(file_path2, 'w')

header_names.write(students)
print(students)











