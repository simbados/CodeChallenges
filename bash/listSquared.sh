#!/bin/bash
listSquared () {
  var=$1
  var2=$2
  result=()
  echo "$var, $var2"
  for ((i = var; i <= var2; i++)); do
    innerArray=()
    sumOfDivisors=0
    counter=$((i%2))
    startValue=$((counter+2))
    echo "Start value is $startValue"
    for ((j = 1; j <= i; j=j+1)); do
      tmp=$((i % j))
      echo "tmp is, $tmp, i is $i, j is $j"
      if [[ tmp -eq 0 ]]; then
        echo "In innerloop, j = $j, sumOfDivisors before = $sumOfDivisors"
        sumOfDivisors=$(($sumOfDivisors + $(($j * $j))))
        echo "sumOfDivisiors is $sumOfDivisors"
      fi
      if [[ j -eq i ]]; then
        if [[ $sumOfDivisors -ne 0 ]]; then
          sqrRoot=$(bc <<< "scale=20; sqrt($sumOfDivisors)")
          echo "sumOfDivisiors is $sumOfDivisors, sqrRoot is $sqrRoot"
          if [[ $(echo "$sqrRoot" | grep "^[0-9]*[.][0]*$") || $sqrRoot == 1 ]]; then
            echo "Master if"
            innerArray=("$i" "$sumOfDivisors")
            echo "InnerArray ${innerArray[*]}"
          fi
        fi
      fi
    done
    if [[ ${#innerArray[@]} -ne 0 ]]; then
      result+=("[${innerArray[0]}, ${innerArray[1]}],")
    fi
  done
#  unset 'result[${#result[@]}-1]'
#  echo "length second is ${#result[@]}"
#  unset 'result[${#result[@]}-1]'
#  echo "length third is ${#result[@]}"
  if [[ ${#result[@]} == 0 ]]; then
    echo "[]"
  else
  lastElement=${result[${#result[@]}-1]}
  echo "test before is $lastElement"
  lastElement=${lastElement:0:$((${#lastElement}-1))}
  echo "Changed to: $lastElement"
  result[${#result[@]}-1]=$lastElement
  echo "[${result[*]}]"
  fi
}
listSquared "$1" "$2"
