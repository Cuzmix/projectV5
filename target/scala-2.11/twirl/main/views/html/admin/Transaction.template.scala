
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Transaction_Scope0 {
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

class Transaction extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Transaction: List[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("transaction", user)/*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""

    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <div class="container-fluid">
        <div class="row">
            <div class="content">
                <table class="table table-bordered table-hover table-condensed">
                    <thead>
                            <!-- The header row-->
                        <tr>
                            <th>ID</th>
                            <th>Product ID</th>
                            <th>User Email</th>
                            <th>Date Transaction</th>
                            <th>Expire Date</th>
                        </tr>
                    </thead>
                    <tbody>
                            <!-- Product row(s) -->
                            <!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*24.26*/for(p <- Transaction) yield /*24.47*/ {_display_(Seq[Any](format.raw/*24.49*/("""
                            """),format.raw/*25.29*/("""<tr>
                                <td>"""),_display_(/*26.38*/p/*26.39*/.getId),format.raw/*26.45*/("""</td>
                                <td>"""),_display_(/*27.38*/p/*27.39*/.getUser_product_id),format.raw/*27.58*/("""</td>
                                <td>"""),_display_(/*28.38*/p/*28.39*/.getUser_email),format.raw/*28.53*/("""</td>
                                <td>"""),_display_(/*29.38*/p/*29.39*/.getDate_transaction),format.raw/*29.59*/("""</td>
                                <td>"""),_display_(/*30.38*/p/*30.39*/.getExpiring_date),format.raw/*30.56*/("""</td>

                                <td>
                                    <a href=""""),_display_(/*33.47*/routes/*33.53*/.HomeController.updateTransaction(p.getId)),format.raw/*33.95*/("""" class="btn-xs btn-danger">
                                        <span class="glyphicon glyphicon-pencil"></span></a>
                                </td>

                            </tr>
                        """)))}),format.raw/*38.26*/(""" """),format.raw/*38.27*/("""<!-- End of For loop -->
                    </tbody>
                </table>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(Transaction:List[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(Transaction,user)

  def f:((List[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (Transaction,user) => apply(Transaction,user)

  def ref: this.type = this

}


}

/**/
object Transaction extends Transaction_Scope0.Transaction
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/admin/Transaction.scala.html
                  HASH: 1df3feeb44a1582b5a6ccabff58e681550ed30e5
                  MATRIX: 802->1|964->68|992->70|1052->103|1080->104|1126->123|1154->124|1182->125|1229->147|1241->152|1280->183|1319->185|1351->191|2195->1008|2232->1029|2272->1031|2329->1060|2398->1102|2408->1103|2435->1109|2505->1152|2515->1153|2555->1172|2625->1215|2635->1216|2670->1230|2740->1273|2750->1274|2791->1294|2861->1337|2871->1338|2909->1355|3026->1445|3041->1451|3104->1493|3355->1713|3384->1714
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|64->33|64->33|64->33|69->38|69->38
                  -- GENERATED --
              */
          