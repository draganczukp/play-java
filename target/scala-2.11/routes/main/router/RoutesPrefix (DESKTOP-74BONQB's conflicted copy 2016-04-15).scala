
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/killermenpl/26EC4C4BEC4C1807/Users/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Fri Apr 15 15:28:24 UTC 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
