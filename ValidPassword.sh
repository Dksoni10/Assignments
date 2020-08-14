#!/bin/bash -x
shopt -s extglob

read -p "Enter your Password " pw

pat="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{10}$"

if [[ $pw =~ $pat ]]
then
   echo valid
else
   echo invalid
fi
