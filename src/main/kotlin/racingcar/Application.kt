package racingcar

import racingcar.controller.Race
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    Race(
        OutputView,
        InputView,
    ).start()
}
