object Main extends App{
 val sender = new Sender("hello")
  val logger = new Logger("hello")
  sender.send()
  logger.print()
}
