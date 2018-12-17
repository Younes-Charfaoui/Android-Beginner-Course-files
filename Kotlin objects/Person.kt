class Person(private var name: String,
             internal var age: Int) {

    open fun setAge(age: Int) {
        this.age = age
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = this.name

}