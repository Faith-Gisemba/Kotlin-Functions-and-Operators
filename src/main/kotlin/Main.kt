fun main(){

    greetPerson("Gisemba")
    var modulus = division(65,24)
    println(modulus)
    var sum = addition(567775, 890323,6758,12826)
    println(sum)
    aboutMe("Curious")

}

//Greetings
fun greetPerson(name: String){
    println("Hello, $name")
}

//Division
fun division(num1: Int,num2: Int): Int {
    val modulus = num1 % num2
    return (modulus)
}

//Addition
fun addition(num1: Long,num2: Long,num3: Long,num4: Long): Long{
    val sum = num1 + num2
    return(sum)
}

//An Interesting fact about me
fun aboutMe(name: String){
    println("I'm Super $name")

}






