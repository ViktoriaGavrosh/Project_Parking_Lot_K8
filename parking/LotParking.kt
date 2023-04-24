package parking

class LotParking(countSpot: Int){
    private val parkingPlaces = mutableListOf<Spot>()
    init {
        for (i in 0 until countSpot) {
            parkingPlaces.add(Spot(i + 1))
        }
        println("Created a parking lot with $countSpot spots.")
    }

    internal fun park(number: String, color: Color) {
        var isCarParked = false
        for (i in parkingPlaces) {
            if (i.isFree) {
                i.car = Car(number, color)
                i.isFree = false
                isCarParked = true
                println("${i.car!!.color.nameColor} car parked in spot ${i.number}.")
                break
            }
        }
        if (!isCarParked) println("Sorry, the parking lot is full.")
    }

    internal fun leave (number: Int) {
        val i = parkingPlaces[number - 1]
        if (i.isFree) {
            println("There is no car in spot ${i.number}.")
        } else {
            i.car = null
            i.isFree = true
            println("Spot ${i.number} is free.")
        }
    }

    internal fun showStatus() {
        var isEmpty = true
        for (i in parkingPlaces) {
            if (!i.isFree) {
                println("${i.number} ${i.car!!.number} ${i.car!!.color.nameColor}")
                isEmpty = false
            }
        }
        if (isEmpty) println("Parking lot is empty.")
    }

    internal fun showCars(color: Color, output: String) {
        var isFirst = true
        for (i in parkingPlaces) {
            if (!i.isFree && i.car!!.color == color) {
                if (!isFirst) print(", ")
                print(
                    when(output) {
                        "reg" -> i.car!!.number
                        else -> i.number
                    })
                isFirst = false
            }
        }
        println( if (isFirst) "No cars with color ${color.name} were found." else "")
    }

    internal fun showSpotCar(number: String) {
        var isCarFound = false
        for (i in parkingPlaces) {
            if (!i.isFree && i.car!!.number == number) {
                println(i.number)
                isCarFound = true
                break
            }
        }
        if (!isCarFound) println("No cars with registration number $number were found.")
    }
}