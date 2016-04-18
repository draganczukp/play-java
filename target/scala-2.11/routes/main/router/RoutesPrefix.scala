
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Sat Apr 16 11:15:44 UTC 2016


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
