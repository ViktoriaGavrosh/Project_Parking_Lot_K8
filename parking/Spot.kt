package parking

class Spot(val number: Int) {
    var car: Car? = null
    var isFree = true
}