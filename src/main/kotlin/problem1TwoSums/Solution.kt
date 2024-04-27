package problem1TwoSums

fun problem1TwoSums() : IntArray {
    val numbers = listOf(2,7,11,15).toIntArray()
    val target = 9
    return solution(numbers = numbers, target = target)
}

private fun solution(numbers: IntArray, target: Int): IntArray {

    val complements = mutableMapOf<Int, Int>()
    numbers.forEachIndexed { index, value ->
        val complement = target - value
        val complementIndex = complements[complement]

        if (complementIsAlreadySeen(complementIndex))
            return intArrayOf(index, complementIndex!!)

        complements[value] = index
    }
    return intArrayOf()
}

private fun complementIsAlreadySeen(value: Int?): Boolean = value != null