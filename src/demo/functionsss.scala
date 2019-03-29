package demo

object functionsss {
  // Generate Random Number to determine the position of the answer.
  def randomChar():String={
    var x = Math.random()*10
    if (x<2.5){
      return "A"
    }
    else if (x>2.5||x<5){
      return "B"
    }
    else if (x>5||x<7.5){
      return "C"
    }
    else {
      return "D"
    }
  }

  // Instead of compare the answers, take the button player clicked, and determine if the position match.
  // Should use randomChar, but use A for test case
  def correctness(userAns:String):Boolean= {
    if(userAns == "A"  /** randomChar**/){
      return true
    }
    else {
      return false
    }
  }
  // Should come up with a way to put questions into a loop, the loop proceed every 15 second
  // This function counts the times for 15 second
  def timeout(time:Long):String={
    var lastUpdateTime: Long = System.nanoTime()
    val timebefore:Int = (lastUpdateTime/1000000000).toInt
    val timenow:Int = (time/1000000000).toInt
    var timepass: Int = timenow - timebefore

    if(timepass > 15){
      return "Expired"
    }

    else {

      "Still Counting Down"
    }
  }
  // the function should take userID and the correctness(boolean) as a list
  // Need to fix the problem of more than one winner (Same Score)
def winner(input:Map[String,List[Boolean]]):String={
  var name : String =""
  var count : Int = 0
  var compare : Int = 0
  var winner : String = ""
  var winners : List[String] = List()
  input.keys.foreach{ i =>
    name = i
    for(x <- input(i)){

      if(x == true){

        count += 1
      }
    }

    if(count>compare){
      compare = count
      winner = name

    }
    /**
    else if(count >= compare){
      winners + winner
    }
      **/
    count = 0

  }
  return  winner
}

}
