import java.lang.Exception
import java.lang.IllegalStateException

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordsJuggling = 2
    }

    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
        println("You juggle $swordsJuggling swords!")
    } catch (e: Exception) {
        println(e)
    }

    println("You juggle $swordsJuggling swords!")

}

fun proficiencyCheck(swordsJuggling: Int?) {
    /*swordsJuggling ?: throw UnskilledSwordJugglerException()*/

    /*checkNotNull проверяет равенство swordsJuggling значению null после
    определенной точки в коде. Если checkNotNull получит null
    она возбудит IllegalStateException.*/
   /* checkNotNull(swordsJuggling, {"Player cannot juggle swords!"})*/

}

fun juggleSwords(swordsJuggling: Int){
    require(swordsJuggling >=3) {"Juggle at least 3 words to" +
            " be exciting."}
}

/*UnskilledSwordJugglerException - это пользовательское исключение, которое
работает так же как IllegalStateException, но с определенным сообщением.*/
class UnskilledSwordJugglerException() :
        IllegalStateException("Player cannot juggle swords")

