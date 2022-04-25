import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

 class LoggerSpec extends AnyFlatSpec with should.Matchers{
val logger = Logger("hello")
  "function print" should "print msg from logger with log- prefix" in{
    logger.print() shouldBe "log-hello"
  }
}
