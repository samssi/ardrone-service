package rest

import org.scalatra.{CorsSupport, ScalatraServlet}
import general.Logging
import client.{Hover, Land, Takeoff, UdpClient}


/**
Takeoff: java ARDrone 192.168.1.1 AT*REF=101,290718208
    Landing: java ARDrone 192.168.1.1 AT*REF=102,290717696
    Hovering: java ARDrone 192.168.1.1 AT*PCMD=201,1,0,0,0,0
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

class ControlServlet extends ScalatraServlet with Logging with CorsSupport {
  val udpClient = new UdpClient
  get("/takeoff") {
    logger.info("Sending takeoff...")
    udpClient.execute(Takeoff)
    "Sent takeoff"
  }

  get("/land") {
    logger.info("Sending land...")
    udpClient.execute(Land)
    "Sent land"
  }

  get("/hover") {
    logger.info("Sending hover...")
    udpClient.execute(Hover)
    "Sent hover"
  }
}
