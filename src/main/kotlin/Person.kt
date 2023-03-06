open class Person2(val name : String, val age :Int) {

}
//class child
class Student(name : String, age : Int, val kelas : String, val score : Double) : Person2(name,age){

    fun getDetails():String{
        return "Name: $name \nAge : $age \nClass : $kelas \nScore : $score"
    }
}