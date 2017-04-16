
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/v.5/03042017/conf/routes
// @DATE:Mon Apr 17 00:21:34 IST 2017


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
