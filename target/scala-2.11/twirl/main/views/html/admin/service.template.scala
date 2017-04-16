
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object service_Scope0 {
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

class service extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("service", user)/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""

    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-7">
                <iframe src=""""),_display_(/*10.31*/routes/*10.37*/.AdminController.products()),format.raw/*10.64*/("""" width="100%" height="700px" seamless ></iframe>
            </div>
            <div class="col-sm-5">
                <iframe src=""""),_display_(/*13.31*/routes/*13.37*/.AdminController.users()),format.raw/*13.61*/("""" width="100%" height="700px" seamless ></iframe>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object service extends service_Scope0.service
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/admin/service.scala.html
                  HASH: c44c2459a322625f0dce0d3f7222d2f532ffd5f0
                  MATRIX: 810->1|998->94|1026->96|1086->129|1114->130|1160->149|1188->150|1216->151|1263->173|1275->178|1310->205|1349->207|1381->213|1574->379|1589->385|1637->412|1798->546|1813->552|1858->576
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|41->10|41->10|41->10|44->13|44->13|44->13
                  -- GENERATED --
              */
          