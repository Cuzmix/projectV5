
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Products", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
   """),format.raw/*5.4*/("""<!-- HTML content for the index view -->
  <div class="row">
                  <div class="col-sm-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="SubTitles">Books</h4>
                    </div>
                    <div class="panel-body">
                            """),_display_(/*13.30*/if(flash.containsKey("success"))/*13.62*/ {_display_(Seq[Any](format.raw/*13.64*/("""
              """),format.raw/*14.15*/("""<div class="alert alert-success">
              """),_display_(/*15.16*/flash/*15.21*/.get("success")),format.raw/*15.36*/("""
              """),format.raw/*16.15*/("""</div>
          """)))}),format.raw/*17.12*/("""
          """),format.raw/*18.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*33.12*/for(p <- products) yield /*33.30*/ {_display_(Seq[Any](format.raw/*33.32*/("""
			        """),format.raw/*34.12*/("""<tr>
                  <td>"""),_display_(/*35.24*/p/*35.25*/.getId),format.raw/*35.31*/("""</td>
                  <td>"""),_display_(/*36.24*/p/*36.25*/.getName),format.raw/*36.33*/("""</td>
                  <td>"""),_display_(/*37.24*/p/*37.25*/.getCategory.getName),format.raw/*37.45*/("""</td>
                  <td>"""),_display_(/*38.24*/p/*38.25*/.getDescription),format.raw/*38.40*/("""</td>
                  <td>"""),_display_(/*39.24*/p/*39.25*/.getStock),format.raw/*39.34*/("""</td>
                  <td>&euro; """),_display_(/*40.31*/("%.2f".format(p.getPrice))),format.raw/*40.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*44.33*/routes/*44.39*/.AdminController.updateProduct(p.getId)),format.raw/*44.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*49.33*/routes/*49.39*/.AdminController.deleteProduct(p.getId)),format.raw/*49.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*55.7*/(""" """),format.raw/*55.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*59.21*/routes/*59.27*/.AdminController.addProduct()),format.raw/*59.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*68.27*/("""{"""),format.raw/*68.28*/("""
        """),format.raw/*69.9*/("""return confirm('Are you sure?');
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/("""
  """),format.raw/*71.3*/("""</script>
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
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/admin/products.scala.html
                  HASH: 2ce4fa17a1ce31e5f846cb419bab78a77a23988b
                  MATRIX: 812->1|1000->94|1028->96|1088->129|1116->130|1162->149|1190->150|1218->151|1265->173|1277->178|1313->206|1352->208|1382->212|1768->571|1809->603|1849->605|1892->620|1968->669|1982->674|2018->689|2061->704|2110->722|2149->733|2641->1198|2675->1216|2715->1218|2755->1230|2810->1258|2820->1259|2847->1265|2903->1294|2913->1295|2942->1303|2998->1332|3008->1333|3049->1353|3105->1382|3115->1383|3151->1398|3207->1427|3217->1428|3247->1437|3310->1473|3358->1500|3494->1609|3509->1615|3569->1654|3828->1886|3843->1892|3903->1931|4160->2158|4188->2159|4308->2252|4323->2258|4373->2287|4636->2522|4665->2523|4701->2532|4765->2569|4793->2570|4823->2573
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|75->44|75->44|75->44|80->49|80->49|80->49|86->55|86->55|90->59|90->59|90->59|99->68|99->68|100->69|101->70|101->70|102->71
                  -- GENERATED --
              */
          