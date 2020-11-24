import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should

class GreetTest extends AnyFunSuite with should.Matchers {
  test("apply") {
    Greet("World") shouldEqual "Hello, World!"
  }
}
