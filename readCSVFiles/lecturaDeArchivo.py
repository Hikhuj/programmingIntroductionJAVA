#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Python 3 version


file_path = '/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/studentNames.txt'
# file_path = '/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/testFile.csv'

student_names = open(file_path, 'r')

# Imprimiria todo de un archivo
# print(student_names.read())

# Imprimira el primer elemento unicamente de un archivo
# print(student_names.readline())

# Imprime una lista de lineas en el archivo
print(student_names.readlines())