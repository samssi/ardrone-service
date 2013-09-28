import general.Logging
import javax.servlet.ServletContext
import org.scalatra.LifeCycle
import rest.{DirectionServlet, ControlServlet}

class ScalatraBootstrap extends LifeCycle with Logging {

  override def init(context: ServletContext) {
    context.mount(new ControlServlet, "/control")
    context.mount(new DirectionServlet, "/direction")
  }
}
