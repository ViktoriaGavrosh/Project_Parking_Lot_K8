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
                "reg_by_color" -> lotParking.showCars(Color.valueOf(command[1].uppercase()), "reg")
                "spot_by_color" -> lotParking.showCars(Color.valueOf(command[1].uppercase()), "spot")
                "spot_by_reg" -> lotParking.showSpotCar(command[1])
                "exit", "create" -> break
                else -> continue
            }
        }
        return command
    }
}