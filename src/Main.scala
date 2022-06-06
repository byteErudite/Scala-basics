
object Main {
  def main(args:Array[String]) = {
    val immutableVariable = "password"; // val keyword makes the variable immutable
    var greetingPrefix = "Hello" // normal variable
    var greetingSuffix = "world"
    var username = readLine("Input username : ")// taking user input
    var greeting = greetingPrefix.concat(", ").concat(if(!username.isBlank)  username else greetingSuffix)
    println(greeting)
  }
}