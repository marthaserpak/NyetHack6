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

    placeOrder("shandy, Dragon's Breath, 5.91")
}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Adler speaks with $tavernMaster about their order. ")

    val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]
    val message = "Adler buys a $name ($type) for $price."
    println(message)
}
