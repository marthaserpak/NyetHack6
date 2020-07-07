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

    /* Оператор ?:
    var beverage = readLine()
    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - " +
                "beverage was null!!")
    }
    val beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed)*/
}
