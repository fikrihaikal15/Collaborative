interface Animal{//Yang ISP
    fun eat()
    fun sleep()
}

interface FlyingAnimal{
    fun fly()
}

abstract class Cat :Animal{
    override fun eat() {
        println("Kucing Suka Makan ikan")
    }

    override fun sleep() {
        println("Kucing suka tidur")
    }
}

class PanggilAnimal :Cat(){

}

fun main(){
    val tampilkan = PanggilAnimal()
    tampilkan.eat()
    tampilkan.sleep()
}