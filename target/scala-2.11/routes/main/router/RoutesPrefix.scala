
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Tue Apr 05 18:52:01 CEST 2016


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
