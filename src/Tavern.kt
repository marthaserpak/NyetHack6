const val TAVERN_NAME = "Taernyl's Folly"

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

//    placeOrder("shandy, Dragon's Breath, 5.91")
    placeOrder("elixir, Shirlie's Temple, 4.12")

}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Adler speaks with $tavernMaster about their order. ")

    val(type, name, price) = menuData.split(',')
    val message = "Adler buys a $name ($type) for $price."
    println(message)

    val phrase = if (name == "Dragon's Breath") {
        "Adler exclaims ${toDragonSpeak("Ah, delicious $name!")}"
    } else {
        "Adler says: Thanks for the $name."
    }
    println(phrase)
}

private fun toDragonSpeak(phrase: String) =
        phrase.replace(Regex("[aeiou]")) {
            when (it.value) {
                "a" -> "4"
                "e" -> "3"
                "i" -> "1"
                "o" -> "0"
                "u" -> "|_|"
                else -> it.value
            }
        }

