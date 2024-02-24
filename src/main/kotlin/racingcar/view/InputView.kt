package racingcar.view

import racingcar.model.Cars
import racingcar.model.RoundNumber

object InputView {
    private const val COMMA = ","

    fun readCarNames(): List<String> {
        val namesString = readln()
        val names = namesString.split(COMMA)

        Cars.fromInput(names)
        return names
    }

    fun readRoundNumber(): String {
        val roundNumber = readln()

        RoundNumber(roundNumber)
        return roundNumber
    }
}
