package parking

class Attendant(private val lotParking: LotParking) {
    fun talk() {
        readCommands()
    }

    private fun readCommands() {
        var command: List<String>
        while (true) {
            command = readln().split(" ")
            when(command[0]) {
                "park" -> lotParking.park(command[1], Color.valueOf(command[2].uppercase()))
                "leave" -> lotParking.leave(command[1].toInt())
                "exit" -> break
                else -> continue
            }
        }
    }
}