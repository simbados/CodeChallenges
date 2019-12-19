function bubbleSort(arrayToSort) {
    var switchedValue = true;
    var whileLoopCount = 0;
    var forLoopCount = 0;
    while (switchedValue) {
        switchedValue = false;
        for (var i = 1; i < arrayToSort.length; i++) {
            if (arrayToSort[i - 1] > arrayToSort[i]) {
                var temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i - 1];
                arrayToSort[i - 1] = temp;
                switchedValue = true;
            }
            forLoopCount++;
        }
        whileLoopCount++;
    }
    return { arrayToSort: arrayToSort, whileLoopCount: whileLoopCount, forLoopCount: forLoopCount };
}
(function () {
    var _a = bubbleSort([5, 1, 3, 5, 6, 7, 5123, 6, 1, 66]), arrayToSort = _a.arrayToSort, whileLoopCount = _a.whileLoopCount, forLoopCount = _a.forLoopCount;
    console.log("Sorted array: " + arrayToSort + ", " + whileLoopCount + ", " + forLoopCount);
})();
