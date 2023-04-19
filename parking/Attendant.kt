package parking

class Attendant(private val lotParking: LotParking) {
    fun talk() {
        readCommand()
    }

    private fun readCommand() {
        val command = readln().split(" ")
        when(command[0]) {
            "park" -> lotParking.park(command[1], Color.valueOf(command[2].uppercase()))
            "leave" -> lotParking.leave(command[1].toInt())
            else -> println("")
        }

    }
}