// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kiper/Dokumenty/UJ/E-biznes/projekt/play-products-crud-sklick/conf/routes
// @DATE:Wed Sep 19 02:23:29 CEST 2018


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
