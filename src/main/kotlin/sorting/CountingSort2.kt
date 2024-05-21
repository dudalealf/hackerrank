package sorting

private fun countingSort(arr: Array<Int>, n: Int): Array<Int> {
    val countingArray = Array<Int>(100) { 0 }
    val orderedArray = Array<Int>(n) { 0 }
    var count = 0

    for(i in 0..n-1) {
        countingArray[arr[i]] += 1
    }

    for(i in 0..countingArray.size-1) {
        for(j in 1..countingArray[i]){
            orderedArray[count] = i
            count++
        }
    }
    return orderedArray
}

fun main() {
    val n = readln().trim().toInt()
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr, n)

    println(result.joinToString(" "))
}
