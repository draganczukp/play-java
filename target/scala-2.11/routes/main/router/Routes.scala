
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Sun Apr 03 17:40:39 CEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:13
  Assets_2: controllers.Assets,
  // @LINE:14
  WebJarAssets_0: controllers.WebJarAssets,
  // @LINE:22
  Users_3: controllers.Users,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:13
    Assets_2: controllers.Assets,
    // @LINE:14
    WebJarAssets_0: controllers.WebJarAssets,
    // @LINE:22
    Users_3: controllers.Users
  ) = this(errorHandler, HomeController_1, Assets_2, WebJarAssets_0, Users_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_2, WebJarAssets_0, Users_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Users.root()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/login""", """controllers.Users.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/register""", """controllers.Users.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/register""", """controllers.Users.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/logout""", """controllers.Users.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/user/""" + "$" + """id<[^/]+>""", """controllers.Users.get(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_WebJarAssets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at2_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Users_root3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Users_root3_invoker = createInvoker(
    Users_3.root(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "root",
      Nil,
      "GET",
      """users""",
      this.prefix + """users"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Users_login4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/login")))
  )
  private[this] lazy val controllers_Users_login4_invoker = createInvoker(
    Users_3.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """users/login"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Users_register5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_Users_register5_invoker = createInvoker(
    Users_3.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """users/register"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Users_register6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_Users_register6_invoker = createInvoker(
    Users_3.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """users/register"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Users_logout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/logout")))
  )
  private[this] lazy val controllers_Users_logout7_invoker = createInvoker(
    Users_3.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """users/logout"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Users_get8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_get8_invoker = createInvoker(
    Users_3.get(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "get",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """users/user/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:13
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:14
    case controllers_WebJarAssets_at2_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at2_invoker.call(WebJarAssets_0.at(file))
      }
  
    // @LINE:22
    case controllers_Users_root3_route(params) =>
      call { 
        controllers_Users_root3_invoker.call(Users_3.root())
      }
  
    // @LINE:23
    case controllers_Users_login4_route(params) =>
      call { 
        controllers_Users_login4_invoker.call(Users_3.login())
      }
  
    // @LINE:24
    case controllers_Users_register5_route(params) =>
      call { 
        controllers_Users_register5_invoker.call(Users_3.register())
      }
  
    // @LINE:25
    case controllers_Users_register6_route(params) =>
      call { 
        controllers_Users_register6_invoker.call(Users_3.register())
      }
  
    // @LINE:26
    case controllers_Users_logout7_route(params) =>
      call { 
        controllers_Users_logout7_invoker.call(Users_3.logout())
      }
  
    // @LINE:27
    case controllers_Users_get8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_get8_invoker.call(Users_3.get(id))
      }
  }
}
