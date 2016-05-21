
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Mon May 16 17:59:47 CEST 2016

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
  Assets_4: controllers.Assets,
  // @LINE:22
  Files_3: controllers.Files,
  // @LINE:28
  Users_0: controllers.Users,
  // @LINE:38
  Articles_2: controllers.Articles,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:22
    Files_3: controllers.Files,
    // @LINE:28
    Users_0: controllers.Users,
    // @LINE:38
    Articles_2: controllers.Articles
  ) = this(errorHandler, HomeController_1, Assets_4, Files_3, Users_0, Articles_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_4, Files_3, Users_0, Articles_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """files/get/""" + "$" + """path<[^/]+>""", """controllers.Files.get(path:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """files/upload""", """controllers.Files.upload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """files/upload""", """controllers.Files.upload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Users.root()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/login""", """controllers.Users.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/login""", """controllers.Users.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/register""", """controllers.Users.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/register""", """controllers.Users.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/logout""", """controllers.Users.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/user""", """controllers.Users.get(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/user""", """controllers.Users.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles""", """controllers.Articles.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/list""", """controllers.Articles.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/add""", """controllers.Articles.add()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/add""", """controllers.Articles.add()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """id<[^/]+>/get""", """controllers.Articles.get(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """id<[^/]+>/edit""", """controllers.Articles.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """articles/""" + "$" + """id<[^/]+>/edit""", """controllers.Articles.edit(id:Long)"""),
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
    Assets_4.at(fakeValue[String], fakeValue[String]),
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

  // @LINE:22
  private[this] lazy val controllers_Files_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("files/get/"), DynamicPart("path", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Files_get2_invoker = createInvoker(
    Files_3.get(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Files",
      "get",
      Seq(classOf[String]),
      "GET",
      """files""",
      this.prefix + """files/get/""" + "$" + """path<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Files_upload3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("files/upload")))
  )
  private[this] lazy val controllers_Files_upload3_invoker = createInvoker(
    Files_3.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Files",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """files/upload"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Files_upload4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("files/upload")))
  )
  private[this] lazy val controllers_Files_upload4_invoker = createInvoker(
    Files_3.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Files",
      "upload",
      Nil,
      "GET",
      """""",
      this.prefix + """files/upload"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Users_root5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Users_root5_invoker = createInvoker(
    Users_0.root(),
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

  // @LINE:29
  private[this] lazy val controllers_Users_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/login")))
  )
  private[this] lazy val controllers_Users_login6_invoker = createInvoker(
    Users_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """users/login"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Users_login7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/login")))
  )
  private[this] lazy val controllers_Users_login7_invoker = createInvoker(
    Users_0.login(),
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

  // @LINE:31
  private[this] lazy val controllers_Users_register8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_Users_register8_invoker = createInvoker(
    Users_0.register(),
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

  // @LINE:32
  private[this] lazy val controllers_Users_register9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_Users_register9_invoker = createInvoker(
    Users_0.register(),
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

  // @LINE:33
  private[this] lazy val controllers_Users_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/logout")))
  )
  private[this] lazy val controllers_Users_logout10_invoker = createInvoker(
    Users_0.logout(),
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

  // @LINE:34
  private[this] lazy val controllers_Users_get11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/user")))
  )
  private[this] lazy val controllers_Users_get11_invoker = createInvoker(
    Users_0.get(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "get",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """users/""" + "$" + """id<[^/]+>/user"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Users_get12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/user")))
  )
  private[this] lazy val controllers_Users_get12_invoker = createInvoker(
    Users_0.get(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "get",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """users/""" + "$" + """id<[^/]+>/user"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Articles_list13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles")))
  )
  private[this] lazy val controllers_Articles_list13_invoker = createInvoker(
    Articles_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "list",
      Nil,
      "GET",
      """articles""",
      this.prefix + """articles"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Articles_list14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/list")))
  )
  private[this] lazy val controllers_Articles_list14_invoker = createInvoker(
    Articles_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """articles/list"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Articles_add15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/add")))
  )
  private[this] lazy val controllers_Articles_add15_invoker = createInvoker(
    Articles_2.add(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "add",
      Nil,
      "GET",
      """""",
      this.prefix + """articles/add"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Articles_add16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/add")))
  )
  private[this] lazy val controllers_Articles_add16_invoker = createInvoker(
    Articles_2.add(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "add",
      Nil,
      "POST",
      """""",
      this.prefix + """articles/add"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Articles_get17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/get")))
  )
  private[this] lazy val controllers_Articles_get17_invoker = createInvoker(
    Articles_2.get(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "get",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """id<[^/]+>/get"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Articles_edit18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_Articles_edit18_invoker = createInvoker(
    Articles_2.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """articles/""" + "$" + """id<[^/]+>/edit"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Articles_edit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("articles/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_Articles_edit19_invoker = createInvoker(
    Articles_2.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Articles",
      "edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """articles/""" + "$" + """id<[^/]+>/edit"""
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
        controllers_Assets_at1_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:22
    case controllers_Files_get2_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Files_get2_invoker.call(Files_3.get(path))
      }
  
    // @LINE:23
    case controllers_Files_upload3_route(params) =>
      call { 
        controllers_Files_upload3_invoker.call(Files_3.upload())
      }
  
    // @LINE:24
    case controllers_Files_upload4_route(params) =>
      call { 
        controllers_Files_upload4_invoker.call(Files_3.upload())
      }
  
    // @LINE:28
    case controllers_Users_root5_route(params) =>
      call { 
        controllers_Users_root5_invoker.call(Users_0.root())
      }
  
    // @LINE:29
    case controllers_Users_login6_route(params) =>
      call { 
        controllers_Users_login6_invoker.call(Users_0.login())
      }
  
    // @LINE:30
    case controllers_Users_login7_route(params) =>
      call { 
        controllers_Users_login7_invoker.call(Users_0.login())
      }
  
    // @LINE:31
    case controllers_Users_register8_route(params) =>
      call { 
        controllers_Users_register8_invoker.call(Users_0.register())
      }
  
    // @LINE:32
    case controllers_Users_register9_route(params) =>
      call { 
        controllers_Users_register9_invoker.call(Users_0.register())
      }
  
    // @LINE:33
    case controllers_Users_logout10_route(params) =>
      call { 
        controllers_Users_logout10_invoker.call(Users_0.logout())
      }
  
    // @LINE:34
    case controllers_Users_get11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_get11_invoker.call(Users_0.get(id))
      }
  
    // @LINE:35
    case controllers_Users_get12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Users_get12_invoker.call(Users_0.get(id))
      }
  
    // @LINE:38
    case controllers_Articles_list13_route(params) =>
      call { 
        controllers_Articles_list13_invoker.call(Articles_2.list())
      }
  
    // @LINE:39
    case controllers_Articles_list14_route(params) =>
      call { 
        controllers_Articles_list14_invoker.call(Articles_2.list())
      }
  
    // @LINE:40
    case controllers_Articles_add15_route(params) =>
      call { 
        controllers_Articles_add15_invoker.call(Articles_2.add())
      }
  
    // @LINE:41
    case controllers_Articles_add16_route(params) =>
      call { 
        controllers_Articles_add16_invoker.call(Articles_2.add())
      }
  
    // @LINE:42
    case controllers_Articles_get17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Articles_get17_invoker.call(Articles_2.get(id))
      }
  
    // @LINE:43
    case controllers_Articles_edit18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Articles_edit18_invoker.call(Articles_2.edit(id))
      }
  
    // @LINE:44
    case controllers_Articles_edit19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Articles_edit19_invoker.call(Articles_2.edit(id))
      }
  }
}
