package parking

class Attendant(private val lotParking: LotParking) {
    internal fun talk():List<String> {
        var command: List<String>
        while (true) {
            command = readln().split(" ")
            when(command[0]) {
                "park" -> lotParking.park(command[1], Color.valueOf(command[2].uppercase()))
                "leave" -> lotParking.leave(command[1].toInt())
                "status" -> lotParking.showStatus()
                "exit", "create" -> break
                else -> continue
            }
        }
        return command
    }
}