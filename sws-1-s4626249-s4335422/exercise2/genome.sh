cp $1 ~/sws-1-s4626249-s4335422/exercise2/newgenome.txt #a new file is made where changes will be made in
tr -d '\n' < newgenome.txt #the endline characters are removed from the new file
grep -c $2 newgenome.txt #the occurences of the second argument are searched for
rm newgenome.txt #the newfile is deleted so that only the original file remains
