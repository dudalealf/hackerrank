package sorting

fun runningTime(arr: Array<Int>, n: Int): Int {
    var shifts = 0

    for(i in 1..n-1) {
        var count = i
        while(arr[count] < arr[count-1]) {
            val temp = arr[count]
            arr[count] = arr[count-1]
            arr[count-1] = temp

            shifts++
            count--

            if(count == 0) break
        }
    }

    return shifts
}

fun main() {
    val n = readln().trim().toInt()
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = runningTime(arr, n)

    println(result)
}