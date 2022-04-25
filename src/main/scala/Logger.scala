case class Logger (s: String){
  val msg = s
  def print()={
   println(s"log-$msg")
    "log-"+msg
  }
}
