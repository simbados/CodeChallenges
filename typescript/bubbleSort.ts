function bubbleSort(arrayToSort: Number[]) {
        let switchedValue = true;
        let whileLoopCount = 0;
        let forLoopCount = 0;
        while (switchedValue) {
                switchedValue = false
                for (let i = 1; i < arrayToSort.length; i++) {
                        if (arrayToSort[i - 1] > arrayToSort[i]) {
                                let temp = arrayToSort[i];
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

(() => {
        const { arrayToSort, whileLoopCount, forLoopCount } = bubbleSort([5, 1, 3, 5, 6, 7, 5123, 6, 1, 66]);
        console.log(`Sorted array: ${arrayToSort}, ${whileLoopCount}, ${forLoopCount}`);
})();
