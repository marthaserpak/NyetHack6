import kotlin.math.roundToInt

const val TAVERN_NAME = "Taernyl's Folly"
var playerGold = 10
var playerSilver = 10
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
//val readOnlyPatronList = patronList.toList()

fun main() {
    /* Оператор безопасного вызова  "let"
    var beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Buttered Ale"
        }
    }

    println(beverage)
*/
    /* Проверка на равенство null
      var beverage = readLine()
      if (beverage != null) {
          beverage = beverage.capitalize()
      } else {
          println("I can't  do that without crashing - beverage was null!")
      }
      println(beverage)*/
    /*     Оператор ?:
    var beverage = readLine()
    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - " +
                "beverage was null!!")
    }
    val beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed) */

    patronList.forEachIndexed {index, patron ->
        println("Good evening, $patron - you're №${index + 1} in line.")
        placeOrder(patron, "shandy, Dragon's Breath,  5.91")
    }

    /*if(patronList.contains("Eli")) {
        println("The tavern master says: Eli's in the back playing cards.")
    } else {
        println("The tavern master says: Eli isn't here.")
    }

    if (patronList.containsAll(listOf("Mordoc", "Sophie"))) {
        println("The tavern master says: Yea, they're seated by the stew kettle.")
    } else {
        println("The tavern master says: No, they departed hour ago.")
    }*/

}

private fun placeOrder(patronName: String, menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("$patronName speaks with $tavernMaster about their order. ")

    val (type, name, price) = menuData.split(',')
    val message = "$patronName buys a $name ($type) for $price."
    println(message)

    //performPurchase(price.toDouble())

    /*    val phrase = if (name == "DRAGON BREATH") {
        "Adler exclaims ${toDragonSpeak("$name : IT'S GOT WHAT " +
                " ADVANTURES CRAVE")}"
    } else {
        "Adler says: Thanks for the $name."
    }
    println(phrase)*/
    val phrase = if (name == "Dragon's Breath") {
        "$patronName exclaims: ${toDragonSpeak("Ah, delicious $name!")}"
    } else {
        "$patronName says: Thanks for the $name"
    }
    println(phrase)
    println()
}

/*fun performPurchase(price: Double) {
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100.0)
    //val totalPurse = (playerDracoin * oneGoldCoin)
    if (totalPurse >= 5.91) {
        println("Total purse:  ${"%.2f".format(totalPurse)}")
        println("Purchasing  item for $price")

        val remainingBalance = totalPurse - price
        println("Remaining balance: ${"%.2f".format(remainingBalance)}")

        // playerDracoin = remainingBalance.toInt()

        val remainingGold = remainingBalance.toInt()
        val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
        playerGold = remainingGold
        playerSilver = remainingSilver
        displayBalance()
    } else {
        println("Adler haven't got enough  money.")
    }
    //val totalPurse = (playerDracoin * oneGoldCoin).toDouble()
}*/

/*fun displayBalance() {
    println("Player's purse balance:  Gold: $playerGold, Silver: $playerSilver")
    *//*" Dracoin: $playerDracoin"
}*/

private fun toDragonSpeak(phrase: String) =
        phrase.replace(Regex("[aeiouAEIOU]")) {
            when (it.value) {
                "a" -> "4"
                "e" -> "3"
                "i" -> "1"
                "o" -> "0"
                "u" -> "|_|"
                "A" -> "4"
                "E" -> "3"
                "I" -> "1"
                "O" -> "0"
                "U" -> "|_|"
                else -> it.value
            }
        }




