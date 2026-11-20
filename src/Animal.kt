//kalit soz abstract
abstract class Animal(val name: String) {
//    abstract bo'lganda tanasiz yozilishi shatrt
//    bola har doim foydalanishi shart
abstract fun sound()


fun sleep(){
    println("$name is sleeping")
}
}