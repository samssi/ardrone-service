package client

/*
Takeoff: java ARDrone 192.168.1.1 AT*REF=101,290718208
    Landing: java ARDrone 192.168.1.1 AT*REF=102,290717696
    Hovering: java ARDrone 192.168.1.1 AT*PCMD=201,1,0,0,0,0
  */

abstract class Command {
  def commandCode: String
}

object Takeoff extends Command { def commandCode = "AT*REF=101,290718208\r" }
object Land extends Command { def commandCode = "AT*REF=102,290717696\r" }
object Hover extends Command { def commandCode = "AT*PCMD=" + Sequence.nextValue + ",1,0,0,0,0\r" }
// untested
object Reset extends Command {
  Sequence.reset
  def commandCode = "AT*COMWDG=1"
}