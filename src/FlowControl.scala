import scala.util.control.Breaks.{break, breakable}

class FlowControl {

  def conditionalStatements(): Unit = { // Unit here is same as void return type in java and C
    var input = readLine("Enter a number : ");
    var number = input.toInt;
    print(getNumType(number))
  }

  def getNumType(num: Int) = {
    if (num % 2 == 0) "even" else "odd"
  }

  def printEvenInRange(start: Int, end: Int) = { // Shows using break as continue
    for (i <- start to end) {
      breakable {
        if (getNumType(i) == ("odd")) {
          println("Skiping the number as it is odd")
          break;
        }
        println(i)
      }
    }
  }


  def gameGuessNum() = {
    val rnd = new scala.util.Random
    var num = 1 + rnd.nextInt(50)
    var numberOfTries = 0
    println("Guess a number between 1 and 50")
    breakable {
      while (numberOfTries <= 5) {
        var guess = readLine("Enter your guess").toInt
        if (guess == num) {
          println("Bingo you are right!!")
          break
        } else if (guess > num) {
          println("Greater than the number")
        } else {
          println("Smaller than the number")
        }

        numberOfTries = numberOfTries + 1
      }
    }

    if (numberOfTries == 5) println("You have exhausted all tries. Exiting....\nThe number was : " + num)
  }
}

object something extends FlowControl {
  def main(args: Array[String]): Unit = {
    conditionalStatements()
  }
  //  gameGuessNum()
  printEvenInRange(1, 10)
}
