
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Home", user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-12">
              <!-- Header -->
          <header id="header" class="alt">
              <h1><a href="index.html"><span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
              <nav>
                  <a href="#menu">Menu</a>
              </nav>
          </header>

              <!-- Banner -->
          <section id="banner">
              <div class="inner">
                  <h2><span class="glyphicon glyphicon-book"></span> DUT Library</h2>
                  <p> A service to all our students</p>
              </div>
          </section>

              <!-- Wrapper -->
          <section id="wrapper">

                  <!-- One -->
              <section id="one" class="wrapper spotlight style1">
                  <div class="inner">
                      <a href="#" class="image"><img src="images/pic01.jpg" alt="" /></a>
                      <div class="content">
                          <h2 class="major">Loan products</h2>
                          <p>Our services provides our student's with a service to burrow our products by using a point system as a currency.</p>
                          <a href="#" class="special">Have a look</a>
                      </div>
                  </div>
              </section>

                  <!-- Two -->
              <section id="two" class="wrapper alt spotlight style2">
                  <div class="inner">
                      <a href="#" class="image"><img src="images/pic02.jpg" alt="" /></a>
                      <div class="content">
                          <h2 class="major">Open for all students</h2>
                          <p>everyone except for animu ppl.</p>
                          <a href="#" class="special">Learn more</a>
                      </div>
                  </div>
              </section>

                  <!-- Three -->
              <section id="three" class="wrapper spotlight style3">
                  <div class="inner">
                      <a href="#" class="image"><img src="images/pic03.jpg" alt="" /></a>
                      <div class="content">
                          <h2 class="major">Products ranging from hardware to software</h2>
                          <p>exampls of our products are gud..</p>
                          <a href="#" class="special">Learn more</a>
                      </div>
                  </div>
              </section>

                  <!-- Four -->
              <section id="four" class="wrapper alt style1">
                  <div class="inner">
                      <h2 class="major">Meet our Staff</h2>
                      <p>This is our friendly staff :)</p>
                      <section class="features">
                          <article>
                              <a href="#" class="image"><img src="images/pic04.jpg" alt="" /></a>
                              <h3 class="major">Jehan the great</h3>
                              <p>Lorem ipsum dolor sit amet, consectetur adipiscing vehicula id nulla dignissim dapibus ultrices.</p>
                              <a href="#" class="special">Learn more</a>
                          </article>
                          <article>
                              <a href="#" class="image"><img src="images/pic05.jpg" alt="" /></a>
                              <h3 class="major">Mango agwu</h3>
                              <p>Lorem ipsum dolor sit amet, consectetur adipiscing vehicula id nulla dignissim dapibus ultrices.</p>
                              <a href="#" class="special">Learn more</a>
                          </article>
                          <article>
                              <a href="#" class="image"><img src="images/pic06.jpg" alt="" /></a>
                              <h3 class="major">Saitama kapuku</h3>
                              <p>Lorem ipsum dolor sit amet, consectetur adipiscing vehicula id nulla dignissim dapibus ultrices.</p>
                              <a href="#" class="special">Learn more</a>
                          </article>
                          <article>
                              <a href="#" class="image"><img src="images/pic07.jpg" alt="" /></a>
                              <h3 class="major">stronk boi</h3>
                              <p>Lorem ipsum dolor sit amet, consectetur adipiscing vehicula id nulla dignissim dapibus ultrices.</p>
                              <a href="#" class="special">Learn more</a>
                          </article>
                      </section>
                      <ul class="actions">
                          <li><a href="#" class="button">Browse All</a></li>
                      </ul>
                  </div>
              </section>

          </section>
      </div>
  </div>
  <!-- End of content for main -->
""")))}),format.raw/*104.2*/("""

"""))
      }
    }
  }

  def render(user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/index.scala.html
                  HASH: bc6e3c85589705a09f07b8143800decfe9008e77
                  MATRIX: 757->1|878->27|906->29|966->62|994->63|1040->82|1068->83|1096->84|1143->106|1169->124|1208->126|1237->129|6143->5004
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|135->104
                  -- GENERATED --
              */
          