class Student(name: String,
              age: Int,
              private var card : Int)  : Person(name , age) , Fly{

    override fun fly() {

    }

    override fun setAge(age: Int) {
        val age = age * 3
        super.setAge(age)

    }

}