package parking

class LotParking(countSpot: Int){
    private val parkingPlaces = mutableListOf<Spot>()
    init {
        for (i in 0 until countSpot) {
            parkingPlaces.add(Spot(i + 1))
        }
        park("RA-01-UU-1234", Color.YELLOW)
    }

    fun park(number: String, color: Color) {
        for (i in parkingPlaces) {
            if (i.isFree) {
                i.car = Car(number, color)
                i.isFree = false
                if (i.number != 1) println("${i.car!!.color.nameColor} car parked in spot ${i.number}.")
                break
            }
        }
    }

    fun leave (number: Int) {
        val i = parkingPlaces[number - 1]
        if (i.isFree) {
            println("There is no car in spot ${i.number}.")
        } else {
            i.car = null
            i.isFree = true
            println("Spot ${i.number} is free.")
        }
    }
}