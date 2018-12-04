// This File Contains the Basics By Kotlin REPL

val data = 4

print(data)
4

print("Hello world")
Hello world

print("hello world")
hello world

val data = 7

data = 8
error: val cannot be reassigned

data = 8

^

var sign = 67

sign = 66

print(sign)
66

val data  : Int  = 8

val hello : String = "Hello world"

print(hello)
Hello world

val data : String = null
error: null can not be a value of a non-null type String

val data : String = null

                    ^

val data : String? = null

val data = 8

if (data < 8) {
    print("Hawchta")
}else {
    print("Wach")
}
Wach

if (data =< 8) {
    print("Hawchta")
}else {
    print("Wach")
}
error: expecting an element

if (data =< 8) {

          ^

error: expecting ')

if (data =< 8) {

           ^

error: unexpected tokens (use ';' to separate expressions on the same line)

if (data =< 8) {

             ^

error: unexpected tokens (use ';' to separate expressions on the same line)

}else {

 ^

if (data <= 8) {
    print("Hawchta")
}else {
    print("Wach")
}
Hawchta

for (i in 1..10){
    println(i)
}
12345678910

for (i in 1 until 10){
    println(i)
}
123456789

for (i in 10..1){
    print(i)
}

for (i in 10 downTo 1){
    print(i)
}
10987654321

val i = 0

while(i < 10){
    print(i)
    i++
}
error: val cannot be reassigned

    i++

    ^

var i = 0

while(i < 10){
    print(i)
    i++
}
0123456789

val i = 6

val i = 3

when(i){
    1 -> print(1)
    2 -> print(2)
    3 -> print(3)
}
3

val i = 1

when(i){
    1 -> print(1)
    2 -> print(2)
    3 -> print(3)
}
1

val i = 5

when(i){
    1 -> print(1)
    2 -> print(2)
    3 -> print(3)
}

when(i){
    1 -> print(1)
    2 -> print(2)
    3 -> print(3)
    else -> print(i)
}
5

when(i){
    1 , 2 , i < 8 -> print(1)
    2 -> print(2)
    3 -> print(3)
    else -> print(i)
}
error: incompatible types: Boolean and Int

    1 , 2 , i < 8 -> print(1)

            ^

when {
     8 < 3  -> print("Ok")
    3 < 10 -> print("Not Ok")
}
Not Ok

var t = "Hello"

t = t + " World"

print(t)
Hello World

var t = "Hello"

t = t + "World"

print(t)
HelloWorld

print("Hello my age is " + 21)
Hello my age is 21

val age = 21

print("Hello my age is " + age)
Hello my age is 21

print("Hello my age is $age")
Hello my age is 21

print("Hello my age is \$age")
Hello my age is $age

print("Hello my age is $age")
Hello my age is 21

val name = "Youns"

print("Hello my age is $age and my name is $name")
Hello my age is 21 and my name is Youns

if(3 < 8){
    print("My Age is 21")
}else {
    print("My AGe is 22")
}
My Age is 21

print("Hello my age is ${if (3 < 8) 21 else 22}")
Hello my age is 21

fun sum(x : Int, y : Int) : Int  {
    return x + y
}

sum(3,4)
7

fun sum(x : Int, y : Int)  {
    return x + y
}
error: type mismatch: inferred type is Int but Unit was expected

    return x + y

           ^

fun sum(x : Int, y : Int)  : Int {
    return x + y
}

fun sum(x : Int, y : Int) = x + y

sum(3,4)
7

fun nothing(x : Int, y : Int) : Unit  {
    print("Im Usless Functions")
}

nothing(2,3)
Im Usless Functions

fun nothing(x : Int, y : Int) {
    print("Im Usless Functions")
}

nothing(2,3)
Im Usless Functions

val array = arrayOf<Int>()

val array = mutableListOf<Int>()

array.add(5)
true

array.add("Hell")
error: type mismatch: inferred type is String but Int was expected

array.add("Hell")

          ^

val use = readLine()
"Hello world"

use
"Hello world"
