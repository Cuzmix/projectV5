
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.Users,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.Users)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.58*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

            <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

            <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*25.54*/routes/*25.60*/.Assets.versioned("assets/css/main.css")),format.raw/*25.100*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.59*/routes/*26.65*/.Assets.versioned("images/favicon.png")),format.raw/*26.104*/("""">
    </head>
    <body>
            <!-- Page Wrapper -->
        <div id="page-wrapper">

                <!-- Page Wrapper -->
            <div id="page-wrapper">

                """),_display_(/*35.18*/if(title == "Home")/*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
                        """),format.raw/*36.25*/("""<!--HOMEPAGE-->
                        <!-- Header -->
                    <header id="header" class="alt">
                        <h1><a href="index.html"><span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>
                """)))}),format.raw/*44.18*/("""
                """),_display_(/*45.18*/if(title != "Home")/*45.37*/{_display_(Seq[Any](format.raw/*45.38*/("""
                        """),format.raw/*46.25*/("""<!--OTHER PAGE-->
                        <!-- Header -->
                    <header id="header">
                        <h1><a href="index.html"><span class="glyphicon glyphicon-book"></span>DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>

                """)))}),format.raw/*55.18*/("""


            """),format.raw/*58.13*/("""<!-- Menu -->
        <nav id="menu">
            <div class="inner">
                <h2>Menu</h2>
                <ul class="links">
                    <li """),_display_(/*63.26*/if(title == "Home")/*63.45*/{_display_(Seq[Any](format.raw/*63.46*/("""class="active"""")))}),format.raw/*63.61*/("""><a href=""""),_display_(/*63.72*/routes/*63.78*/.HomeController.index()),format.raw/*63.101*/("""">Home</a></li>
                    <li """),_display_(/*64.26*/if(title == "About")/*64.46*/{_display_(Seq[Any](format.raw/*64.47*/("""class="active"""")))}),format.raw/*64.62*/("""><a href=""""),_display_(/*64.73*/routes/*64.79*/.HomeController.about()),format.raw/*64.102*/("""">About Us</a></li>
                    <li """),_display_(/*65.26*/if(title == "Products")/*65.49*/{_display_(Seq[Any](format.raw/*65.50*/("""class="active"""")))}),format.raw/*65.65*/(""">
                    """),_display_(/*66.22*/if(user != null)/*66.38*/ {_display_(Seq[Any](format.raw/*66.40*/("""
                        """),format.raw/*67.25*/("""<a href=""""),_display_(/*67.35*/routes/*67.41*/.HomeController.rent()),format.raw/*67.63*/("""">Products</a>
                    """)))}/*68.23*/else/*68.28*/{_display_(Seq[Any](format.raw/*68.29*/("""
                        """),format.raw/*69.25*/("""<a href=""""),_display_(/*69.35*/routes/*69.41*/.HomeController.products()),format.raw/*69.67*/("""">Products</a>
                    """)))}),format.raw/*70.22*/("""
                    """),format.raw/*71.21*/("""</li>
                    <li """),_display_(/*72.26*/if(title == "Sign Up")/*72.48*/{_display_(Seq[Any](format.raw/*72.49*/("""class="active"""")))}),format.raw/*72.64*/(""">
                    """),_display_(/*73.22*/if(user == null)/*73.38*/ {_display_(Seq[Any](format.raw/*73.40*/("""
                        """),format.raw/*74.25*/("""<a href=""""),_display_(/*74.35*/routes/*74.41*/.HomeController.signup()),format.raw/*74.65*/("""">Sign Up</a>
                    """)))}),format.raw/*75.22*/("""
                    """),format.raw/*76.21*/("""</li>
                    <li """),_display_(/*77.26*/if(title == "Login")/*77.46*/{_display_(Seq[Any](format.raw/*77.47*/("""class="active"""")))}),format.raw/*77.62*/(""">
                    """),_display_(/*78.22*/if(user != null)/*78.38*/{_display_(Seq[Any](format.raw/*78.39*/("""
                        """),format.raw/*79.25*/("""<li ><a href=""""),_display_(/*79.40*/routes/*79.46*/.HomeController.profile()),format.raw/*79.71*/("""">Profile</a></li>
                        <li><a href=""><p class="Navbar-FontStyle">Balance: """),_display_(/*80.78*/user/*80.82*/.getPoints()),format.raw/*80.94*/(""" """),format.raw/*80.95*/("""<span class="glyphicon glyphicon-bitcoin"></span></p></a></li>
                        <li ><a href=""""),_display_(/*81.40*/controllers/*81.51*/.security.routes.LoginController.logout()),format.raw/*81.92*/(""""><p class="Navbar-FontStyle">Logout """),_display_(/*81.130*/user/*81.134*/.getName()),format.raw/*81.144*/(""" """),format.raw/*81.145*/("""<span class="glyphicon glyphicon-log-in"></span></p></a></li>
                    """)))}/*82.23*/else/*82.28*/{_display_(Seq[Any](format.raw/*82.29*/("""
                        """),format.raw/*83.25*/("""<a href=""""),_display_(/*83.35*/controllers/*83.46*/.security.routes.LoginController.login()),format.raw/*83.86*/("""">Login</a>
                    """)))}),format.raw/*84.22*/("""
                """),format.raw/*85.17*/("""</ul>
                <a href="#" class="close">Close</a>
            </div>
        </nav>
    
    <div class="container-fluid">
        """),format.raw/*92.32*/("""
        """),_display_(/*93.10*/content),format.raw/*93.17*/("""
    """),format.raw/*94.5*/("""</div>
    <footer class="container-fluid">
        <section id="footer">
            <div class="inner">
                <h2 class="major">Get in touch</h2>
                <p>Cras mattis ante fermentum, malesuada neque vitae, eleifend erat. Phasellus non pulvinar erat. Fusce tincidunt, nisl eget mattis egestas, purus ipsum consequat orci, sit amet lobortis lorem lacus in tellus. Sed ac elementum arcu. Quisque placerat auctor laoreet.</p>
                <form method="post" action="#">
                    <div class="field">
                        <label for="name">Name</label>
                        <input type="text" name="name" id="name" />
                    </div>
                    <div class="field">
                        <label for="email">Email</label>
                        <input type="email" name="email" id="email" />
                    </div>
                    <div class="field">
                        <label for="message">Message</label>
                        <textarea name="message" id="message" rows="4"></textarea>
                    </div>
                    <ul class="actions">
                        <li><input type="submit" value="Send Message" /></li>
                    </ul>
                </form>
                <ul class="contact">
                    <li class="fa-home">
                        Untitled Inc<br />
                        1234 Somewhere Road Suite #2894<br />
                        Nashville, TN 00000-0000
                    </li>
                    <li class="fa-phone">(000) 000-0000</li>
                    <li class="fa-envelope"><a href="#">information/untitled.tld</a></li>
                    <li class="fa-twitter"><a href="#">twitter.com/untitled-tld</a></li>
                    <li class="fa-facebook"><a href="#">facebook.com/untitled-tld</a></li>
                    <li class="fa-instagram"><a href="#">instagram.com/untitled-tld</a></li>
                </ul>
                <ul class="copyright">
                    <li>&copy; Untitled Inc. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
                </ul>
            </div>
        </section>
     </footer>

        </div>

    </body>

        <!-- Load JavaScript libs last -->
    <script src=""""),_display_(/*141.19*/routes/*141.25*/.Assets.versioned("assets/js/skel.min.js")),format.raw/*141.67*/(""""></script>
    <script src=""""),_display_(/*142.19*/routes/*142.25*/.Assets.versioned("assets/js/jquery.min.js")),format.raw/*142.69*/(""""></script>
    <script src=""""),_display_(/*143.19*/routes/*143.25*/.Assets.versioned("assets/js/jquery.scrollex.min.js")),format.raw/*143.78*/(""""></script>
    <script src=""""),_display_(/*144.19*/routes/*144.25*/.Assets.versioned("assets/js/util.js")),format.raw/*144.63*/(""""></script>
    <script src=""""),_display_(/*145.19*/routes/*145.25*/.Assets.versioned("assets/js/ie/respond.min.js")),format.raw/*145.73*/(""""></script>
    <script src=""""),_display_(/*146.19*/routes/*146.25*/.Assets.versioned("assets/js/main.js")),format.raw/*146.63*/(""""></script>
    <script src=""""),_display_(/*147.19*/routes/*147.25*/.Assets.versioned("https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js")),format.raw/*147.110*/(""""></script>
    <script src=""""),_display_(/*148.19*/routes/*148.25*/.Assets.versioned("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js")),format.raw/*148.113*/(""""></script>
    <script src=""""),_display_(/*149.19*/routes/*149.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*149.66*/("""" type="text/javascript"></script>
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

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/main.scala.html
                  HASH: 2a5c34bb9ca0042287cb0cb87b9460b2c93d6b40
                  MATRIX: 1021->260|1172->316|1200->318|1280->423|1316->432|1351->440|1377->445|2378->1419|2393->1425|2455->1465|2543->1526|2558->1532|2619->1571|2831->1756|2859->1775|2898->1776|2951->1801|3369->2188|3414->2206|3442->2225|3481->2226|3534->2251|3942->2628|3985->2643|4172->2803|4200->2822|4239->2823|4285->2838|4323->2849|4338->2855|4383->2878|4451->2919|4480->2939|4519->2940|4565->2955|4603->2966|4618->2972|4663->2995|4735->3040|4767->3063|4806->3064|4852->3079|4902->3102|4927->3118|4967->3120|5020->3145|5057->3155|5072->3161|5115->3183|5170->3220|5183->3225|5222->3226|5275->3251|5312->3261|5327->3267|5374->3293|5441->3329|5490->3350|5548->3381|5579->3403|5618->3404|5664->3419|5714->3442|5739->3458|5779->3460|5832->3485|5869->3495|5884->3501|5929->3525|5995->3560|6044->3581|6102->3612|6131->3632|6170->3633|6216->3648|6266->3671|6291->3687|6330->3688|6383->3713|6425->3728|6440->3734|6486->3759|6609->3855|6622->3859|6655->3871|6684->3872|6813->3974|6833->3985|6895->4026|6961->4064|6975->4068|7007->4078|7037->4079|7139->4163|7152->4168|7191->4169|7244->4194|7281->4204|7301->4215|7362->4255|7426->4288|7471->4305|7638->4534|7675->4544|7703->4551|7735->4556|10058->6851|10074->6857|10138->6899|10196->6929|10212->6935|10278->6979|10336->7009|10352->7015|10427->7068|10485->7098|10501->7104|10561->7142|10619->7172|10635->7178|10705->7226|10763->7256|10779->7262|10839->7300|10897->7330|10913->7336|11021->7421|11079->7451|11095->7457|11206->7545|11264->7575|11280->7581|11343->7622
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|55->25|55->25|55->25|56->26|56->26|56->26|65->35|65->35|65->35|66->36|74->44|75->45|75->45|75->45|76->46|85->55|88->58|93->63|93->63|93->63|93->63|93->63|93->63|93->63|94->64|94->64|94->64|94->64|94->64|94->64|94->64|95->65|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|99->69|100->70|101->71|102->72|102->72|102->72|102->72|103->73|103->73|103->73|104->74|104->74|104->74|104->74|105->75|106->76|107->77|107->77|107->77|107->77|108->78|108->78|108->78|109->79|109->79|109->79|109->79|110->80|110->80|110->80|110->80|111->81|111->81|111->81|111->81|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|114->84|115->85|121->92|122->93|122->93|123->94|170->141|170->141|170->141|171->142|171->142|171->142|172->143|172->143|172->143|173->144|173->144|173->144|174->145|174->145|174->145|175->146|175->146|175->146|176->147|176->147|176->147|177->148|177->148|177->148|178->149|178->149|178->149
                  -- GENERATED --
              */
          