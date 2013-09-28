package client

/*
Controls:
 gaz 0.1: java ARDrone 192.168.1.1 AT*PCMD=301,1,0,0,1036831949,0
 gaz -0.1: java ARDrone 192.168.1.1 AT*PCMD=302,1,0,0,-1110651699,0
 pitch 0.1: java ARDrone 192.168.1.1 AT*PCMD=303,1,1036831949,0,0,0
 pitch -0.1: java ARDrone 192.168.1.1 AT*PCMD=304,1,-1110651699,0,0,0
 yaw 0.1: java ARDrone 192.168.1.1 AT*PCMD=305,1,0,0,0,1036831949
 yaw -0.1: java ARDrone 192.168.1.1 AT*PCMD=306,1,0,0,0,-1110651699
 roll 0.1: java ARDrone 192.168.1.1 AT*PCMD=307,1,0,1036831949,0,0
 roll -0.1: java ARDrone 192.168.1.1 AT*PCMD=308,1,0,-1110651699,0,0
  */

abstract class Direction {
  def directionCode: String
}

object YawLeft extends Direction {
  def directionCode = "AT*PCMD=" + Sequence.nextValue + ",1,0,0,0,-1110651699\r"
}

object YawRight extends Direction {
  def directionCode = "AT*PCMD=" + Sequence.nextValue + ",3,0,0,0,1036831949\r"
}

object ThrottleUp extends Direction {
  def directionCode = "AT*PCMD="+ Sequence.nextValue + ",1,0,0,1036831949,0\r"
}

object ThrottleDown extends Direction {
  def directionCode = "AT*PCMD="+ Sequence.nextValue + ",1,0,0,-1110651699,0\r"
}