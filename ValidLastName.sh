#!/bin/bash -x
shopt -s extglob

read -p "Enter your last name " name

pat="^[A-Z]{1}[a-z]{3}$"

if [[ $name =~ $pat ]]
then
   echo valid
else
   echo invalid
fi
