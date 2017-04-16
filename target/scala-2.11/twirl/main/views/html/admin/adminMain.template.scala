
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

     object adminMain_Scope1 {
import controllers.security.LoginController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.Users,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.Users)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.58*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
        """),_display_(/*17.10*/if(title == "service" || title == "transaction")/*17.58*/{_display_(Seq[Any](format.raw/*17.59*/("""
            """),format.raw/*18.13*/("""<nav class="navbar navbar-inverse">
                    <!-- nav header/ branding -->
                <div class="navbar-header">
                    <a class="navbar-brand" href="/">Product Catalogue</a>
                </div>
                    <!-- List containing nav links -->
                <ul class="nav navbar-nav">
                    <li """),_display_(/*25.26*/if(title == "service")/*25.48*/{_display_(Seq[Any](format.raw/*25.49*/("""class="active"""")))}),format.raw/*25.64*/("""><a href=""""),_display_(/*25.75*/routes/*25.81*/.AdminController.service()),format.raw/*25.107*/("""">Service</a></li>
                    <li """),_display_(/*26.26*/if(title == "transaction")/*26.52*/{_display_(Seq[Any](format.raw/*26.53*/("""class="active"""")))}),format.raw/*26.68*/("""><a href=""""),_display_(/*26.79*/routes/*26.85*/.AdminController.Transaction()),format.raw/*26.115*/("""">Transactions</a></li>
                    <li """),_display_(/*27.26*/if(title == "Login")/*27.46*/{_display_(Seq[Any](format.raw/*27.47*/("""class="active"""")))}),format.raw/*27.62*/(""">
                    """),_display_(/*28.22*/if(user != null)/*28.38*/{_display_(Seq[Any](format.raw/*28.39*/("""
                        """),format.raw/*29.25*/("""<a href=""""),_display_(/*29.35*/controllers/*29.46*/.security.routes.LoginController.logout()),format.raw/*29.87*/("""">Logout """),_display_(/*29.97*/user/*29.101*/.getName()),format.raw/*29.111*/("""</a>
                    """)))}/*30.23*/else/*30.28*/{_display_(Seq[Any](format.raw/*30.29*/("""
                        """),format.raw/*31.25*/("""<a href=""""),_display_(/*31.35*/controllers/*31.46*/.security.routes.LoginController.login()),format.raw/*31.86*/("""">Login</a>
                    """)))}),format.raw/*32.22*/("""
                    """),format.raw/*33.21*/("""</li>
                </ul>
            </nav>
        """)))}),format.raw/*36.10*/("""

    
    """),format.raw/*39.5*/("""<div class="container-fluid">
        """),format.raw/*41.32*/("""
        """),_display_(/*42.10*/content),format.raw/*42.17*/("""
    """),format.raw/*43.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*52.19*/routes/*52.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*52.66*/("""" type="text/javascript"></script>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.Users,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.Users) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/admin/adminMain.scala.html
                  HASH: 48112b883d5cf1bdd68f2d67ab7e98525f8f0662
                  MATRIX: 887->75|1038->131|1066->133|1145->238|1180->247|1214->255|1239->260|1514->508|1529->514|1592->555|1680->616|1695->622|1756->661|1852->730|1909->778|1948->779|1989->792|2368->1144|2399->1166|2438->1167|2484->1182|2522->1193|2537->1199|2585->1225|2656->1269|2691->1295|2730->1296|2776->1311|2814->1322|2829->1328|2881->1358|2957->1407|2986->1427|3025->1428|3071->1443|3121->1466|3146->1482|3185->1483|3238->1508|3275->1518|3295->1529|3357->1570|3394->1580|3408->1584|3440->1594|3485->1621|3498->1626|3537->1627|3590->1652|3627->1662|3647->1673|3708->1713|3772->1746|3821->1767|3908->1823|3946->1834|4012->1962|4049->1972|4077->1979|4109->1984|4471->2319|4486->2325|4548->2366
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|50->17|50->17|50->17|51->18|58->25|58->25|58->25|58->25|58->25|58->25|58->25|59->26|59->26|59->26|59->26|59->26|59->26|59->26|60->27|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|62->29|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|64->31|65->32|66->33|69->36|72->39|73->41|74->42|74->42|75->43|84->52|84->52|84->52
                  -- GENERATED --
              */
          