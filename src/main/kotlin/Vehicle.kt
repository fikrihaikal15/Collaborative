open class Vehicle (val merk : String,    val warna : String){
}

class Car (merk : String, warna : String): Vehicle(merk, warna){    fun drive(){
    println("Driving $merk")    }
}
class MotorCycle(merk : String, warna : String): Vehicle(merk, warna){    fun drive(){
    println("Driving $merk")    }
}