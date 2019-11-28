function removeCharacter() {
   input=$1
   charLength=$((${#input} -2 ))
   result=${input:1:$charLength}
   echo "$result"
}
removeCharacter "$1"
