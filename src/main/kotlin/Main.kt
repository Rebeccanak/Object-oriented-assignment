fun main() {

//    Create a class called Human with these attributes: name, age, weight. It has
//    the following functions:
//    - eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//    and increments the human’s weight by the weight of the food eaten
//    - speak(speech: String) :Prints the string passed to it
//    - birthday( ) :Increments the human’s age by 1
//    Create an instance of this human class and invoke all its functions
    val person = Human("Nakachwa",23,57)
    person.eat(3)
    person.weight
println(person.weight)
    person.speak("I am beautiful")
    person.birthday()
    println(person.age)
    var list= User("Nakachawa","Rebecca","rebeccanakachwaaa@gmail.com",754597478,"becky",)

    println(list.firstName)
    println(list.email)



}
class Human(var name:String, var age:Int, var weight:Int) {
    fun eat(foodweight:Int) {
        println("I am eating $foodweight kgs of food")
        weight += foodweight
    }
   fun speak(speech:String){
       println(speech)
   }

fun birthday(){
    age++

}


    }

//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes






    data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: Int, var passWord: String ){



}