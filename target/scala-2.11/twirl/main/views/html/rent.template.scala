
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rent_Scope0 {
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

class rent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
    <section id="wrapper">

        <section id="products" class="wrapper spotlight style3">
            <div class="content">
                <div class="row">
                    <div class="col-sm-2">
                        <h4>Categories</h4>
                        <div class="list-group">
                                <!-- A link to display all products -->
                            <a href=""""),_display_(/*15.39*/routes/*15.45*/.HomeController.products(0)),format.raw/*15.72*/("""" class="list-group-item">All categories</a>

                                <!-- Start of For loop - For each c in categories add a list item -->
                                <!-- Also show the number of products in each category -->
                            """),_display_(/*19.30*/for(c <- categories) yield /*19.50*/ {_display_(Seq[Any](format.raw/*19.52*/("""
                                """),format.raw/*20.33*/("""<a href=""""),_display_(/*20.43*/routes/*20.49*/.HomeController.products(c.getId)),format.raw/*20.82*/("""" class="list-group-item">"""),_display_(/*20.109*/c/*20.110*/.getName),format.raw/*20.118*/("""
                                """),format.raw/*21.33*/("""<span class="badge">"""),_display_(/*21.54*/c/*21.55*/.getProducts.size()),format.raw/*21.74*/("""</span>
                                </a>
                            """)))}),format.raw/*23.30*/("""
                        """),format.raw/*24.25*/("""</div>
                    </div>
                    <div class="col-sm-10">

                        """),_display_(/*28.26*/if(flash.containsKey("success"))/*28.58*/ {_display_(Seq[Any](format.raw/*28.60*/("""
                            """),format.raw/*29.29*/("""<div class="alert alert-success">
                            """),_display_(/*30.30*/flash/*30.35*/.get("success")),format.raw/*30.50*/("""
                            """),format.raw/*31.29*/("""</div>
                        """)))}),format.raw/*32.26*/("""
                            """),format.raw/*33.29*/("""<!-- Two -->
                        <section id="two" class="wrapper alt spotlight style2">
                            <div class="inner">
                                <a href="#" class="image"><img src="images/pic02.jpg" alt="" /></a>
                                <div class="content">
                                    <table>
                                        <thead>
                                                <!-- The header row-->
                                            <tr>
                                                <th>ID</th>
                                                <th>Name</th>
                                                <th>Description</th>
                                                <th>Stock</th>
                                                <th>Price</th>
                                                <th>Reserve</th>
                                                <th>Loan</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                                <!-- Product row(s) -->
                                                <!-- Start of For loop - For each p in products add a row -->
                                            """),_display_(/*54.46*/for(p <- products) yield /*54.64*/ {_display_(Seq[Any](format.raw/*54.66*/("""
                                                """),format.raw/*55.49*/("""<tr>
                                                    <td>"""),_display_(/*56.58*/p/*56.59*/.getId),format.raw/*56.65*/("""</td>
                                                    <td>"""),_display_(/*57.58*/p/*57.59*/.getName),format.raw/*57.67*/("""</td>
                                                    <td>"""),_display_(/*58.58*/p/*58.59*/.getDescription),format.raw/*58.74*/("""</td>
                                                    <td>"""),_display_(/*59.58*/p/*59.59*/.getStock),format.raw/*59.68*/("""</td>
                                                    <td>&euro; """),_display_(/*60.65*/("%.2f".format(p.getPrice))),format.raw/*60.92*/("""</td>
                                                    <td>
                                                        <a href=""""),_display_(/*62.67*/routes/*62.73*/.HomeController.updateReserve(p.getId)),format.raw/*62.111*/("""" class="btn-xs btn-danger">
                                                            <span class="glyphicon glyphicon-pencil"></span></a>
                                                    </td>

                                                    <td>
                                                        <a href=""""),_display_(/*67.67*/routes/*67.73*/.HomeController.updateLoan(p.getId)),format.raw/*67.108*/("""" class="btn-xs btn-danger">
                                                            <span class="glyphicon glyphicon-pencil"></span></a>
                                                    </td>

                                                </tr>
                                            """)))}),format.raw/*72.46*/(""" """),format.raw/*72.47*/("""<!-- End of For loop -->
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </section>


                    </div>
                </div>
            </div>
        </section>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*87.27*/("""{"""),format.raw/*87.28*/("""
        """),format.raw/*88.9*/("""return confirm('Are you sure?');
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""
  """),format.raw/*90.3*/("""</script>

  <!-- End of content for main -->
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
object rent extends rent_Scope0.rent
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/rent.scala.html
                  HASH: 3524683c61a883ce3e3b674a76dbd2b1226b59b8
                  MATRIX: 798->1|986->94|1014->96|1074->129|1102->130|1148->149|1176->150|1204->151|1251->173|1281->195|1320->197|1349->200|1824->648|1839->654|1887->681|2182->949|2218->969|2258->971|2319->1004|2356->1014|2371->1020|2425->1053|2480->1080|2491->1081|2521->1089|2582->1122|2630->1143|2640->1144|2680->1163|2785->1237|2838->1262|2969->1366|3010->1398|3050->1400|3107->1429|3197->1492|3211->1497|3247->1512|3304->1541|3367->1573|3424->1602|4776->2927|4810->2945|4850->2947|4927->2996|5016->3058|5026->3059|5053->3065|5143->3128|5153->3129|5182->3137|5272->3200|5282->3201|5318->3216|5408->3279|5418->3280|5448->3289|5545->3359|5593->3386|5749->3515|5764->3521|5824->3559|6175->3883|6190->3889|6247->3924|6578->4224|6607->4225|7068->4658|7097->4659|7133->4668|7197->4705|7225->4706|7255->4709
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|46->15|46->15|46->15|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|93->62|93->62|93->62|98->67|98->67|98->67|103->72|103->72|118->87|118->87|119->88|120->89|120->89|121->90
                  -- GENERATED --
              */
          