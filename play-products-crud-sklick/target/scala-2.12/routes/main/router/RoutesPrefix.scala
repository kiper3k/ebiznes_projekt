// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kiper/Dokumenty/UJ/E-biznes/lab0424/play-products-crud-sklick/conf/routes
// @DATE:Tue Jun 19 13:54:03 CEST 2018


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
