package game

class Player {
    var name = "Adam"
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    val healthPoints = 100
    val isBlessed = true
    val isImmortal = false

    val race = "ali"
    val fraction = when (race) {
        "orc" -> "Free people of Rolling Hills."
        "human" -> "Free people of Rolling Hills."
        else -> "Aliens from Space."
    }

    //Health Status
    fun healthStatus1() =
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
    fun auraColor1(): String {
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

    //castFireball
    fun castFireball(numFireballs: Int) {
        val stupefyingResult = when(numFireballs) {
            in 1..5 -> 20
            in 6..8 -> 30
            in 9..15 -> 50
            in 16..20 -> 70
            else -> 100
        }

        val condition =  when (stupefyingResult) {
            20 -> "Tipsy"
            30 -> "Sloshed"
            50 -> "Soused"
            70 -> "Stewed"
            else -> "..t0aSt3d"
        }

        println(/*"A glass of Fireball springs into existence. " +*/
                "$name stupefied on $stupefyingResult%, he " +
                        "drunk x$numFireballs fireballs. \nHis condition ${condition.toLowerCase()}.")
    }
}