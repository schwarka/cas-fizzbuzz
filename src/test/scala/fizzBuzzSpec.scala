import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

	"A FizzBuzz" should "print 1" in {
		FizzBuzz.calculate(1) should be ("1")
	}
}