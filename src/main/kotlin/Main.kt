fun main(args: Array<String>) {
    println("введите строку:")
    val testStr = readln()
    var resultStr = ""
    var count = 1
    var currentChar = testStr[0]
    for (item in testStr.substring(1)) {
        if (currentChar == item) {
            count++
        } else {
            if (count > 1) {
                resultStr += "$currentChar$count"
            } else { resultStr += currentChar }
               count = 1
                currentChar = item
            }
    }
 if (count>1)
 { resultStr += "$currentChar$count"}
    else {resultStr += currentChar}
    println("Количество букв: $resultStr")
}