import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

	"A FizzBuzz" should "print 1" in {
		FizzBuzz.calculate(1) should be ("1")
	}

	it should "print 2" in {
		FizzBuzz.calculate(2) should be ("2")
	}
}