
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""

    """),format.raw/*7.5*/("""<section id="two" class="wrapper alt spotlight style2">
        <div class="inner">
            <a href="#" class="image"><img src="images/pic02.jpg" alt="" /></a>
            <div class="content">
                <div class="col-xs-12">
                    <h3> Sign in</h3>

                    """),_display_(/*14.22*/if(loginForm.hasGlobalErrors)/*14.51*/{_display_(Seq[Any](format.raw/*14.52*/("""
                        """),format.raw/*15.25*/("""<p class="alert alert-warning">
                        """),_display_(/*16.26*/loginForm/*16.35*/.globalError.message),format.raw/*16.55*/("""
                        """),format.raw/*17.25*/("""</p>
                    """)))}),format.raw/*18.22*/("""
                    """),_display_(/*19.22*/if(flash.containsKey("error"))/*19.52*/{_display_(Seq[Any](format.raw/*19.53*/("""
                        """),format.raw/*20.25*/("""<div class="alert alert-warning">
                        """),_display_(/*21.26*/flash/*21.31*/.get("loginRequired")),format.raw/*21.52*/("""
                        """),format.raw/*22.25*/("""</div>
                    """)))}),format.raw/*23.22*/("""

                    """),_display_(/*25.22*/helper/*25.28*/.form(action = controllers.security.routes.LoginController.loginSubmit())/*25.101*/{_display_(Seq[Any](format.raw/*25.102*/("""
                        """),format.raw/*26.25*/("""<div class="form-group">
                        """),_display_(/*27.26*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*27.129*/("""
                        """),format.raw/*28.25*/("""</div>
                        <div class="form-group">
                        """),_display_(/*30.26*/inputPassword(loginForm("password"),'_label -> "",'class -> "form-control input-xs",'placeholder -> "Password")),format.raw/*30.137*/("""
                        """),format.raw/*31.25*/("""</div>

                        <div class="form-group">
                            <input type="submit" value="Sign In" class="btn btn-primary">
                        </div>
                    """)))}),format.raw/*36.22*/(""" """),format.raw/*36.38*/("""
                """),format.raw/*37.17*/("""</div>
            </div>
        </div>
    </section>


""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/login.scala.html
                  HASH: 871d26146fec85264d9cc6dcf22c1704229dd5a4
                  MATRIX: 782->1|955->64|982->82|1010->155|1037->157|1064->176|1102->177|1134->183|1459->481|1497->510|1536->511|1589->536|1673->593|1691->602|1732->622|1785->647|1842->673|1891->695|1930->725|1969->726|2022->751|2108->810|2122->815|2164->836|2217->861|2276->889|2326->912|2341->918|2424->991|2464->992|2517->1017|2594->1067|2719->1170|2772->1195|2880->1276|3013->1387|3066->1412|3296->1611|3325->1627|3370->1644
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|37->7|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|48->18|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|53->23|55->25|55->25|55->25|55->25|56->26|57->27|57->27|58->28|60->30|60->30|61->31|66->36|66->36|67->37
                  -- GENERATED --
              */
          