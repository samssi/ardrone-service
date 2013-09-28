package rest

import org.scalatra.{CorsSupport, ScalatraServlet}
import general.Logging
import client._

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

  get("/emergency") {
    logger.info("Emergency!!! Shutting down!!!")
    udpClient.execute(Reset)
    "Sent reset"
  }
}

class DirectionServlet extends ScalatraServlet with Logging with CorsSupport {
  val udpClient = new UdpClient

  get("/yawLeft") {
    logger.info("yawing left")
    udpClient.direct(YawLeft)
  }
  get("/yawRight") {
    logger.info("yawing right")
    udpClient.direct(YawRight)
  }
  get("/throttleUp") {
    logger.info("throttling up")
    udpClient.direct(ThrottleUp)
  }
  get("/throttleDown") {
    logger.info("throttling down")
    udpClient.direct(ThrottleDown)
  }
  get("/rollLeft") {
    logger.info("Rolling left")
    udpClient.direct(RollLeft)
  }
  get("/rollRight") {
    logger.info("Rolling right")
    udpClient.direct(RollRight)
  }
  get("/pitchUp") {
    logger.info("Pitching up")
    udpClient.direct(PitchUp)
  }
  get("/pitchDown") {
    logger.info("Pitching down")
    udpClient.direct(PitchDown)
  }
}
