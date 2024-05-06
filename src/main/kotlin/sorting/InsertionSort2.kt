package sorting

fun insertionSort2(n: Int, arr: Array<Int>)  {
    for(i in 1..n-1){
        var count = i

        if(arr[i] < arr[i-1]){
            while(arr[count] < arr[count-1]){
                val temp = arr[count]
                arr[count] = arr[count-1]
                arr[count-1] = temp
                count-=1

                if(count == 0) break
            }
            showOutput(arr)
        } else {
            showOutput(arr)
        }
    }
}

private fun showOutput(arr: Array<Int>) = println(arr.joinToString(" "))

fun main() {
    val n = readln().trim().toInt()
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    insertionSort2(n, arr)
}
