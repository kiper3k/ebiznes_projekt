
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*7.2*/import forms.SignInForm.Data
/*8.2*/import b3.inline.fieldConstructor

object signin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.1*/("""
"""),_display_(/*12.2*/main(messages("sign.in.title"))/*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""
    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*14.18*/messages("sign.in.credentials")),format.raw/*14.49*/("""</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.SignInController.submit())/*15.76*/ {_display_(Seq[Any](format.raw/*15.78*/("""
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),_display_(/*17.14*/b3/*17.16*/.email(signInForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*17.149*/("""
            """),_display_(/*18.14*/b3/*18.16*/.password(signInForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*18.161*/("""
            """),_display_(/*19.14*/b3/*19.16*/.checkbox(signInForm("rememberMe"), '_text -> messages("remember.me"), 'checked -> true)),format.raw/*19.104*/("""
            """),format.raw/*20.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*22.112*/messages("sign.in")),format.raw/*22.131*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*25.10*/("""

        """),format.raw/*27.9*/("""<div>
            <p class="not-a-member">"""),_display_(/*28.38*/messages("not.a.member")),format.raw/*28.62*/(""" """),format.raw/*28.63*/("""<a href=""""),_display_(/*28.73*/controllers/*28.84*/.routes.SignUpController.view),format.raw/*28.113*/("""">"""),_display_(/*28.116*/messages("sign.up.now")),format.raw/*28.139*/("""</a> | <a href=""""),_display_(/*28.156*/controllers/*28.167*/.routes.ForgotPasswordController.view()),format.raw/*28.206*/("""" title=""""),_display_(/*28.216*/messages("forgot.your.password")),format.raw/*28.248*/("""">"""),_display_(/*28.251*/messages("forgot.your.password")),format.raw/*28.283*/("""</a></p>
        </div>

        """),_display_(/*31.10*/if(socialProviders.providers.nonEmpty)/*31.48*/ {_display_(Seq[Any](format.raw/*31.50*/("""
            """),format.raw/*32.13*/("""<div class="social-providers">
                <p>"""),_display_(/*33.21*/messages("or.use.social")),format.raw/*33.46*/("""</p>
                <div>
                """),_display_(/*35.18*/for(p <- socialProviders.providers) yield /*35.53*/ {_display_(Seq[Any](format.raw/*35.55*/("""
                    """),format.raw/*36.21*/("""<a href=""""),_display_(/*36.31*/controllers/*36.42*/.routes.SocialAuthController.authenticate(p.id)),format.raw/*36.89*/("""" class="provider """),_display_(/*36.108*/p/*36.109*/.id),format.raw/*36.112*/("""" title=""""),_display_(/*36.122*/messages(p.id)),format.raw/*36.136*/(""""><img src=""""),_display_(/*36.149*/assets/*36.155*/.path(s"images/providers/${p.id}.png")),format.raw/*36.193*/("""" width="64px" height="64px" alt=""""),_display_(/*36.228*/messages(p.id)),format.raw/*36.242*/(""""></a>
                """)))}),format.raw/*37.18*/("""
                """),format.raw/*38.17*/("""</div>
            </div>
        """)))}),format.raw/*40.10*/("""

    """),format.raw/*42.5*/("""</fieldset>
""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(signInForm:Form[Data],socialProviders:SocialProviderRegistry,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def f:((Form[Data],SocialProviderRegistry) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages,webJarsUtil,assets) => apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jun 19 13:28:50 CEST 2018
                  SOURCE: /home/kiper/Dokumenty/UJ/E-biznes/lab0424/play-products-crud-sklick/app/views/signin.scala.html
                  HASH: f42c77b2d54ba5f02257d1ee76c892ca4f52d5b6
                  MATRIX: 432->1|465->28|502->59|543->94|586->131|625->164|704->237|740->267|1155->303|1416->470|1444->472|1484->503|1524->505|1556->510|1644->571|1696->602|1742->621|1757->627|1826->687|1866->689|1907->703|1922->709|1958->724|1999->738|2010->740|2165->873|2206->887|2217->889|2384->1034|2425->1048|2436->1050|2546->1138|2587->1151|2773->1309|2814->1328|2906->1389|2943->1399|3013->1442|3058->1466|3087->1467|3124->1477|3144->1488|3195->1517|3226->1520|3271->1543|3316->1560|3337->1571|3398->1610|3436->1620|3490->1652|3521->1655|3575->1687|3636->1721|3683->1759|3723->1761|3764->1774|3842->1825|3888->1850|3959->1894|4010->1929|4050->1931|4099->1952|4136->1962|4156->1973|4224->2020|4271->2039|4282->2040|4307->2043|4345->2053|4381->2067|4422->2080|4438->2086|4498->2124|4561->2159|4597->2173|4652->2197|4697->2214|4763->2249|4796->2255|4839->2268
                  LINES: 17->1|18->2|19->3|20->4|21->5|22->6|23->7|24->8|29->10|34->11|35->12|35->12|35->12|36->13|37->14|37->14|38->15|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|45->22|45->22|48->25|50->27|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|54->31|54->31|54->31|55->32|56->33|56->33|58->35|58->35|58->35|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|60->37|61->38|63->40|65->42|66->43
                  -- GENERATED --
              */
          