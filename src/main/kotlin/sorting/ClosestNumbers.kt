package sorting

fun closestNumbers(arr: Array<Int>, n: Int): Array<Int> {
    arr.sort()

    var smallerDifference: Int = Int.MAX_VALUE
    val mapList: MutableMap<Int, List<Int>> = mutableMapOf()

    for(i in 0..n-2) {
        val subtraction = arr[i+1] - arr[i]

        if(subtraction <= smallerDifference) {
            smallerDifference = subtraction
            mapList.merge(subtraction, listOf(arr[i], arr[i + 1]), List<Int>::plus)
        }
    }
    return mapList.filterKeys { it == smallerDifference }.values.flatten().toTypedArray()
}

fun main() {
    val n = readln().trim().toInt()
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = closestNumbers(arr, n)

    println(result.joinToString(" "))
}