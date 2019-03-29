package tests
import org.scalatest._
import demo.functionsss
class Testfunction extends FunSuite {

  test("0 to 2 Equipments") {
    val string1: String = "A"
    val string2: String = "B"
    val string3: String = "C"
    val string4: String = "D"
    // Good with time less than 15 sec
    assert(functionsss.timeout(1500000L) == "Still Counting Down")
    // Should able to submit on 15th second
    assert(functionsss.timeout(15000000000L) == "Still Counting Down")
    //Good with time more than 15 second
    assert(functionsss.timeout(1500000000000000L) == "Expired")

    // Answers that are not A B C or D will fail, moreover, should be received
    // Will be hard to test will random position, so set answer position to A
    assert(functionsss.correctness("W") == false)
    assert(functionsss.correctness("Z") == false)
    assert(functionsss.correctness(string4) == false)
    assert(functionsss.correctness(string3) == false)
    assert(functionsss.correctness(string2) == false)
    assert(functionsss.correctness(string1) == true)
    assert(functionsss.correctness("AA") == false)
    var list1: List[Boolean] = List(true, true, false)
    var list2: List[Boolean] = List(true, false, false)
    var list3: List[Boolean] = List(true, true, true)
    var Map1: Map[String, List[Boolean]] = Map("Player1" -> list1, "Player2" -> list2, "Player3" -> list3)

    assert(functionsss.winner(Map1) == "Player3")


    var list4: List[Boolean] = List(true, true, true)
    var list5: List[Boolean] = List(true, false, false)
    var list6: List[Boolean] = List(true, true, false)
    var list7: List[Boolean] = List(false, false, false)
    var Map2: Map[String, List[Boolean]] = Map("Player1" -> list4, "Player2" -> list5, "Player3" -> list6,"Player4"->list7)

    assert(functionsss.winner(Map2) == "Player1")


  }

}
