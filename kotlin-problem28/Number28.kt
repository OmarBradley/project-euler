package lee.eulerproject.problem

fun getNumber28Answer(matrixNumber: Int): Int {

    var sumValue = 0
    var index = 0
    for (number in getPlusNumbers(matrixNumber)) {
        sumValue += getPlusNumbers(matrixNumber).subList(0, index + 1).sum()
        index++
    }
    return sumValue
}

fun getPlusNumbers(matrixNumber: Int): List<Int> {

    val plusNumbers = mutableListOf<Int>()

    if (matrixNumber == 1)
        plusNumbers.add(1)
    else if (matrixNumber % 2 == 0) {
        generateSequence(2) { it + 2 }
                .takeWhile { it <= matrixNumber }
                .forEach {
                    for (j in 1..4)
                        plusNumbers.add(it - 1)
                }
    } else {
        plusNumbers.add(1)
        generateSequence(3) { it + 2 }
                .takeWhile { it <= matrixNumber }
                .forEach {
                    for (j in 1..4)
                        plusNumbers.add(it - 1)
                }
    }
    return plusNumbers
}


fun getPlusNumber(matrixNumber: Int): Int =
        if (matrixNumber <= 0)
            0
        else if (matrixNumber == 1)
            1
        else
            matrixNumber - 1


