object FizzBuzz {

	def calculate(number: Int): String = number % 3 match {
		case (0) => "fizz"
		case _ => number.toString
	}

}