package racingcar.model

import racingcar.controller.Race

class Cars(
    cars: List<Car>,
) {
    init {
        require(cars.isNotEmpty()) { Race.ERROR_REQUEST_INPUT }
        require(cars.size >= MIN_NAMES_SIZE) { ERROR_CAR_LESS_THAN_TWO }
        require(cars.size <= MAX_NAMES_SIZE) { ERROR_CAR_GREATER_THAN_TWENTY }
    }

    companion object {
        const val ERROR_CAR_LESS_THAN_TWO = "[Error] 자동차 이름은 2대 이상 입력해 주세요."
        const val ERROR_CAR_GREATER_THAN_TWENTY = "[Error] 자동차 이름은 20대 이하로 입력해 주세요."
        private const val ERROR_NAME_DUPLICATION = "[Error] 중복된 자동차 이름은 작성할 수 없습니다."

        const val MIN_NAMES_SIZE = 2
        const val MAX_NAMES_SIZE = 20

        private fun List<String>.validateDuplicate(): List<String> {
            require(this.distinct().size == this.size) { ERROR_NAME_DUPLICATION }
            return this
        }

        fun fromInput(input: List<String>): Cars {
            val cars = input.validateDuplicate().map { Car(it) }
            return Cars(cars)
        }
    }
}
