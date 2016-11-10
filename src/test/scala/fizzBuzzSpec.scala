import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

	"A FizzBuzz" should "print a number not divisible by three" in {
		FizzBuzz.calculate(1) should be ("1")
		FizzBuzz.calculate(2) should be ("2")
	}

	it should "print 'fizz' for numbers divisible by three" in {
		FizzBuzz.calculate(3) should be ("fizz")
		FizzBuzz.calculate(6) should be ("fizz")
	}

}