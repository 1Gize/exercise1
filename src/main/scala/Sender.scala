case class Sender (s: String){
  val msg = s
  def send(): String={
    println(s"$msg-msg")
    msg+"-msg"
  }
}
