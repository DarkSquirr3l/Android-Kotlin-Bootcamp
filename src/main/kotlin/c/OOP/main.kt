package c.OOP

fun main() {
    //buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printSize()
    val towerTank1 = TowerTank(diameter = 25, height = 40)
    towerTank1.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}