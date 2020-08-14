#!/bin/bash -x
shopt -s extglob

read -p "Enter your Phone Number " pnum

pat="^[+]?(91)[ ]?[6-9]{1}[0-9]{9}$"

if [[ $pnum =~ $pat ]]
then
   echo valid
else
   echo invalid
fi
