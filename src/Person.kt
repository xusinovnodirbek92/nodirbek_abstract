class Person(val name: String) : Walk {
    override fun Walk() {
        println("$name is walking")
    }

    override fun run() {
     println("$name is running")
    }
}