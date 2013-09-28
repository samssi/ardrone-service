package client

//AT*COMWDG=1

abstract class Command {
  def commandCode: String
}

object Takeoff extends Command { def commandCode = "AT*REF=101,290718208\r" }
object Land extends Command { def commandCode = "AT*REF=102,290717696\r" }
object Hover extends Command { def commandCode = "AT*PCMD=201,1,0,0,0,0\r" }
object Reset extends Command {def commandCode = "AT*COMWDG=1"}
