fun main() {
    val playerName = "David"
    val healthPoints = 100
    val isBlessed = true
    val isImmortal = true

    val healthStatus = healthStatus(healthPoints, isBlessed, isImmortal)

    val auraColor = auraColor(healthPoints)

    val race = "ali"
    val fraction = when (race) {
        "orc" -> "Free people of Rolling Hills."
        "human" -> "Free people of Rolling Hills."
        else -> "Aliens from Space."
    }

    printPlayerStatus(healthPoints, auraColor, race, playerName, healthStatus)
    castFireball(23, playerName)

}

//Health Status
private fun healthStatus(healthPoints: Int, isBlessed: Boolean, isImmortal: Boolean) =
    when (healthPoints) {
        100 -> if (isImmortal) {
            "is immortal!"
        } else "is in excellent condition"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quickly!"
        } else "has some minor wounds."
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

//Aura
private fun auraColor(healthPoints: Int): String {
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) *
            20).toInt()

    return when (karma) {
        in 0..5 -> {
            "Red"
        }
        in 6..10 -> {
            "Orange"
        }
        in 11..15 -> {
            "Purple"
        }
        else -> "Green"
    }
}

//Player Status
private fun printPlayerStatus(healthPoints: Int,
                              auraColor: String,
                              race: String,
                              playerName: String,
                              healthStatus: String) {
    val statusFormattingString = "(HP: $healthPoints) \n(Aura: $auraColor) \n(Race: $race)" +
            "\n$playerName $healthStatus"
    println(statusFormattingString)
}

//castFireball
private fun castFireball(numFireballs: Int, playerName: String) {
    val stupefyingResult = when(numFireballs) {
        in 1..5 -> 10..19
        in 6..8 -> 20..29
        in 9..15 -> 30..39
        in 16..20 -> 40..49
        else -> 50
    }

    val condition =  when (stupefyingResult) {
        in 1..10 -> "Tipsy"
        in 11..20 -> "Sloshed"
        in 21..30 -> "Soused"
        in 31..40 -> "Stewed"
        else -> "..t0aSt3d"
    }

    println(/*"A glass of Fireball springs into existence. " +*/
        "$playerName stupefied on $stupefyingResult%, he " +
                "drunk x$numFireballs fireballs. \nHis condition $condition.")
}

