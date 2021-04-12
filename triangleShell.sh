#!/bin/bash
echo "entrez la longueur du cote a:"
read a
echo "entrez la longueur du cote b:"
read b
echo "entrez la longueur du cote c:"
read c
if [ $a -eq $b ] && [ $b -eq $c ] && [ $c -eq $b ]
then
echo " le triangle est Equilateral" 
fi

if  [ $a -ne $b ] && [ $b -ne $c ] && [ $c -ne  $a ]
then
echo " le triangle est scalène "
fi

if [ $a -eq $b ] && [ $b -ne $c ]
 then
 echo " le triangle est isoscèle "
fi

if [ $a -ne $b ] && [ $a -eq $c ]
then
echo " le triangle est isoscèle "
fi

if [ $c -eq $b ] && [ $a -ne $c ]
then
echo " le triangle est isoscèle "
fi

