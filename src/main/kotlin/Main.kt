fun main() {
    var s1 = "\n"
    var s2 = "THING"

    var result = s1.compareTo(s2,true)

    if (result == 0){
        println("They are the same")
    } else {
        println("They are NOT the same")
    }

    println(s2.toLowerCase().decapitalize())

    if (s1.isEmpty()){
        println("Empty")
    }
    if (s2.isEmpty()){
        println("Blank")
    }

    println("The length of this String is: ${s2.length}")
    println("The first character is ${s2[0]}")
    println("The first character is ${s2.first()}")
    println("The last character is ${s2.last()}")
    println("The last character is ${s2[s2.length - 1]}")

    var result1 =  s2.indexOf('H')
    println("The index of 'H' is $result1")
    println(s2.substring(result1,3))
    println(s2.contains("hi",true))
    println(s2.replace("thing","other thing",true))
}