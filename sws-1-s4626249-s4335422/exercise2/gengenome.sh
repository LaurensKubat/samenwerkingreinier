i=1
while [ "$i" -le 500  ]
do
    j=1    
    while [ "$j" -le 100 ]
    do
		 OUTPUT=$(shuf -i 1-4 -n 1)
		 if [ $OUTPUT = 1 ]
		 then
		     echo -n 'A'
		 fi
		 if [ $OUTPUT = 2 ]
		 then
		     echo -n 'C'
		 fi
		 if [ $OUTPUT = 3 ]
		 then
		     echo -n 'T'
		 fi
		 if [ $OUTPUT = 4 ]
		 then
		     echo -n 'G'
		 fi
		 j=$(( j + 1 ))
    done
    echo
    i=$(( i + 1 ))
done
