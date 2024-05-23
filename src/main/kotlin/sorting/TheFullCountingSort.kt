package sorting

fun countSort(arr: Array<Array<String>>, n: Int): String {
    var result = ""

    for(i in 0..<n/2){
        arr[i] =  arrayOf(arr[i].first(), arr[i].last().replace(arr[i].last(), "-"))
    }
    arr.groupBy({ it.first() }, { it.last() }).toSortedMap(compareBy { it.toInt() }).values.forEach {
        result += it.joinToString(separator= " ", postfix= " ")
    }

    return result
}

fun main() {
    val n = readln().trim().toInt()
    val arr = Array(n) { Array(2) { "" } }

    for (i in 0..<n) {
        arr[i] = readln().trimEnd().split(" ").toTypedArray()
    }

    println(countSort(arr, n))
}