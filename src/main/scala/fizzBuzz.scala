object FizzBuzz {

	def calculate(number: Int): String = {
		var result = ""

		if (number == 3) {
			result = "fizz"
		} else {
			result = number.toString
		}

		result
	}
	
}