#!/bin/bash -x
shopt -s extglob

read -p "Enter your first name " name

pat="^[A-Z]{1}[a-zA-Z]{3}$"

if [[ $name =~ $pat ]]
then
   echo valid
else
   echo invalid
fi
