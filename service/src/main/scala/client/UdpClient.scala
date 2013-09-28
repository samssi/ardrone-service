package client

import java.net.{DatagramPacket, DatagramSocket, InetAddress}
import general.Logging

class UdpClient extends Logging {
  val host = InetAddress.getByName("192.168.1.1")
  val port = 5556;

  def execute(command: Command) {
     send(command.commandCode)
  }

  def direct(direction: Direction) {
    send(direction.directionCode)
  }

  def send(command: String) {
    val b = command.getBytes("ASCII")
    logger.debug("Sending packet containing: [ " + command + " ]")
    val socket = new DatagramSocket()
    val packet = new DatagramPacket(b, b.length, host, port)
    socket.send(packet)
    socket.close
  }

  def sendDirection(command: String) {
    val b = command.getBytes("ASCII")
    logger.debug("Sending packet containing: [ " + command + " ]")
    val socket = new DatagramSocket()
    val packet = new DatagramPacket(b, b.length, host, port)
    socket.send(packet)
    socket.close
  }
}
