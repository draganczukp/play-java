
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/killermenpl/26EC4C4BEC4C1807/Users/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Fri Apr 15 15:28:24 UTC 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.get",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/user"})
          }
        
        }
      """
    )
  
    // @LINE:32
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/logout"})
        }
      """
    )
  
    // @LINE:30
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.register",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
          }
        
        }
      """
    )
  
    // @LINE:27
    def root: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.root",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:28
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.login",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/login"})
          }
        
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseFiles(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Files.upload",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "files/upload"})
          }
        
        }
      """
    )
  
    // @LINE:21
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Files.get",
      """
        function(path0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "files/get/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", encodeURIComponent(path0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseArticles(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Articles.get",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/get"})
        }
      """
    )
  
    // @LINE:37
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Articles.list",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles"})
          }
        
        }
      """
    )
  
    // @LINE:39
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Articles.add",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/add"})
          }
        
        }
      """
    )
  
  }


}
