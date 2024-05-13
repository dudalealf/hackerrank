package sorting

fun quickSort(arr: Array<Int>, n: Int): Array<Int> {
    val left: MutableList<Int> = mutableListOf()
    val right: MutableList<Int> = mutableListOf()
    val equal: MutableList<Int> = mutableListOf()
    val pivot = arr[0]

    for(i in 0..n-1) {
        if(arr[i] < pivot) {
            left.add(arr[i])
        } else if(arr[i] > pivot) {
            right.add(arr[i])
        } else {
            equal.add(arr[i])
        }
    }

    return (left + equal + right).toTypedArray()
}

fun main() {
    val n = readln().trim().toInt()
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = quickSort(arr, n)

    println(result.joinToString(" "))
}