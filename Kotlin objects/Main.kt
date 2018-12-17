fun main(args: Array<String>) {
    val data = "younes 1 Charfaoui"
    print(data.doesContainsOne())
}

fun Person.isKid(): Boolean {
    return this.age < 15
}


class CustomString : String() {

    fun doesContainsOne(): Boolean {
        return this.contains("1")
    }
}

interface Fly {
    fun fly()
}