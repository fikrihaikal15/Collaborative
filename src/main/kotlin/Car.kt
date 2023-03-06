class Car(brand : String, model : String, year : Int) {
    val brand : String = "Honda"
    val model : String = "Yaris"
    val year : Int = 2023

    fun startEngine(){
        println("The $brand $model $year engine has started!")
    }
}