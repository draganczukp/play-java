
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Sat Apr 16 11:15:44 UTC 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:27
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def get(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:33
        case (id)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/user")
      
      }
    
    }
  
    // @LINE:32
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/logout")
    }
  
    // @LINE:30
    def register(): Call = {
    
      () match {
      
        // @LINE:30
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "users/register")
      
      }
    
    }
  
    // @LINE:27
    def root(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:28
    def login(): Call = {
    
      () match {
      
        // @LINE:28
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "users/login")
      
      }
    
    }
  
  }

  // @LINE:21
  class ReverseFiles(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def upload(): Call = {
    
      () match {
      
        // @LINE:22
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "files/upload")
      
      }
    
    }
  
    // @LINE:21
    def get(path:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "files/get/" + implicitly[PathBindable[String]].unbind("path", dynamicString(path)))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:37
  class ReverseArticles(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def get(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/get")
    }
  
    // @LINE:37
    def list(): Call = {
    
      () match {
      
        // @LINE:37
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "articles")
      
      }
    
    }
  
    // @LINE:39
    def add(): Call = {
    
      () match {
      
        // @LINE:39
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "articles/add")
      
      }
    
    }
  
    // @LINE:42
    def edit(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:42
        case (id)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
      
      }
    
    }
  
  }


}
