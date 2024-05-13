package sorting

fun main() {
    val s = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.toMutableList()
    sortArray(s, arr)
}

fun sortArray(s: Int, arr: MutableList<Int>) {
    for(i in 1..s-1){
        var count = i
        while(arr[count] < arr[count-1]) {
            val temp = arr[count]
            arr[count] = arr[count-1]
            arr[count-1] = temp
            count--

            if(count == 0) break
        }
    }
    print(arr.joinToString(" "))
}
