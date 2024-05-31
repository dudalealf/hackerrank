package sorting

fun findMedian(arr: Array<Int>, n: Int): Int {
    arr.sort()
    val op: Int = (n.toDouble() / 2).toInt()

    return if (n % 2 == 1) {
        arr[op]
    } else {
        (arr[op] + arr[op + 1])/2
    }
}

fun main() {
    val n = readln().trim().toInt()
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = findMedian(arr, n)

    println(result)
}