object FizzBuzz {

	def calculate(number: Int): String = {
		var result = ""

		if (number % 3 == 0) {
			result = "fizz"
		} else {
			result = number.toString
		}

		result
	}

}