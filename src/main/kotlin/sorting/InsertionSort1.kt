package sorting

fun insertionSort1(n: Int, arr: Array<Int>): Unit {
    val unorderedNumber = arr[n-1]

    for(i in n-1 downTo 1) {
        if(arr[i-1] > unorderedNumber){
            arr[i] = arr[i-1]
            showOutput(arr)
        } else {
            arr[i] = unorderedNumber
            showOutput(arr)
            break
        }
    }

    if(arr[0] > unorderedNumber){
        arr[0] = unorderedNumber
        showOutput(arr)
    }
}

fun showOutput(arr: Array<Int>): Unit = println(arr.joinToString())

fun main() {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    insertionSort1(n, arr)
}