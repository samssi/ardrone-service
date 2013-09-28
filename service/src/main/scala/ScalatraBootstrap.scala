import general.Logging
import javax.servlet.ServletContext
import org.scalatra.LifeCycle
import rest.ControlServlet

class ScalatraBootstrap extends LifeCycle with Logging {

  override def init(context: ServletContext) {
    context.mount(new ControlServlet, "/control")
  }
}
