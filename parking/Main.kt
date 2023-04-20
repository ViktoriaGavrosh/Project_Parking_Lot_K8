package parking

fun main() {
    var numberSpots = readNumberSpots()
    var lotParking: LotParking
    var message: List<String>
    while (true) {
        if (numberSpots < 0) break
        lotParking = LotParking(numberSpots)
        message = Attendant(lotParking).talk()
        if (message[0] == "create") numberSpots = message[1].toInt() else break
    }
}

private fun readNumberSpots(): Int {
    var listText: List<String>
    while (true) {
        listText = readln().split(" ")
        when (listText[0]) {
            "create" -> return listText[1].toInt()
            "exit" -> return -1
        }
        println("Sorry, a parking lot has not been created.")
    }
}
