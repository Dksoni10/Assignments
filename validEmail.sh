#!/bin/bash -x
shopt -s extglob

read -p "Enter your Email " email

pat="^[a-zA-Z0-9]+([._+#][a-zA-Z0-9]+)*@[a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-z]{2,2})?$"

if [[ $email =~ $pat ]]
then
   echo valid
else
   echo invalid
fi
