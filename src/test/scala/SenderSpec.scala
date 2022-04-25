import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SenderSpec extends AnyFlatSpec with should.Matchers{
  val sender = Sender("hello")
  "function send " should "send msg from sender with header -msg" in{
    sender.send() shouldBe "hello-msg"
  }
}
