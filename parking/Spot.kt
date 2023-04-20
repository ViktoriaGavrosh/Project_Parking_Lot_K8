package parking

class Spot(internal val number: Int) {
    internal var car: Car? = null
    internal var isFree = true
}