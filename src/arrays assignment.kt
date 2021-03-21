
import java.util.*

fun main(){

 countries()
    cities()
    sum()
name("mary","marie","loyce")
}
fun countries(){
    var countries= arrayOf("kenya","uganda","nigeria","namibia")
    println(Arrays.toString(countries))
    println(countries)

}
fun cities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    var sortedCities=cities.sortedArray()
    println(Arrays.toString(sortedCities))
    println(cities)
}
fun sum () {
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
var total=numbers[1 ].plus(numbers[4])
println(total)
var index=numbers.indexOf(158)
    println(index)
    var sortedNumbers=numbers.sortedArray()
    println(Arrays.toString(sortedNumbers))
    println(sortedNumbers)

}
fun name(name1:String,name2:String,name3:String):Array<String>{
    var namesArray= arrayOf(name1,name2,name3)
    println(Arrays.toString(namesArray))
    return namesArray




}