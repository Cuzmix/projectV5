
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!-- Pass page title and content """),format.raw/*2.34*/("""{"""),format.raw/*2.35*/("""html between braces"""),format.raw/*2.54*/("""}"""),format.raw/*2.55*/(""" """),format.raw/*2.56*/("""to the main view -->
"""),_display_(/*3.2*/main("About", user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<!-- HTML content for the index view -->
    <div class="row">
        <div class="col-sm-12">
                <!-- Header -->
            <header id="header" class="alt">
                <h1><a href="index.html"><span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
                <nav>
                    <a href="#menu">Menu</a>
                </nav>
            </header>

                    <!-- Four -->
                <section id="four" class="wrapper alt style1">
                    <iframe name='playframe' height="1000px" width="100%" src="""),_display_(/*17.80*/routes/*17.86*/.HomeController.rent()),format.raw/*17.108*/("""></iframe>
                </section>

        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/about.scala.html
                  HASH: 84ff27fea8261c6dba7d00cf4e407febde003853
                  MATRIX: 757->1|878->27|905->28|965->61|993->62|1039->81|1067->82|1095->83|1142->105|1169->124|1208->126|1239->131|1836->701|1851->707|1895->729
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4|48->17|48->17|48->17
                  -- GENERATED --
              */
          