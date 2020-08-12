package game

fun main() {

    val player = Player("Phics")

    player.castFireball(2)

    val healthStatus = player.healthStatus1()

    val auraColor = player.auraColor1()

    printPlayerStatus1(player)
}

//game.Player Status
private fun printPlayerStatus1(player: Player) {
    val statusFormattingString = "(HP: ${player.healthPoints}) \n(Aura: ${player.auraColor1()}) \n(Race: ${player.race})" +
            "\n${player.name} ${player.healthStatus1()}"
    println(statusFormattingString)
}



