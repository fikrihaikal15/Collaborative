open class Animal5(val name : String, var gender : String ){

    class Cat(name:String, gender:String): Animal5(name,gender){
        fun makeSound() : String {
            return "Meow"
        }
    }

    class Dog(name:String, gender: String): Animal5(name,gender){

        fun makeSound():String{
            return "Guguk"
        }
    }


}
