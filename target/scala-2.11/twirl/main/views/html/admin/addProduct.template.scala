
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.76*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Product", user)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
	"""),format.raw/*9.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form")/*12.103*/ {_display_(Seq[Any](format.raw/*12.105*/("""
		
		"""),_display_(/*14.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*14.81*/("""
		"""),_display_(/*15.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*15.95*/("""

		"""),_display_(/*17.4*/select(
			addProductForm("category.id"),
			
			options(Category.options),
			'_label -> "Category", '_default -> "-- Choose a category --",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*23.4*/("""
		"""),_display_(/*24.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*24.83*/("""
		"""),_display_(/*25.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*25.83*/("""

		"""),format.raw/*27.3*/("""<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*28.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.71*/("""

	"""),format.raw/*30.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*33.14*/routes/*33.20*/.AdminController.products()),format.raw/*33.47*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*36.3*/(""" """),format.raw/*36.4*/("""<!-- End Form definition -->

""")))}),format.raw/*38.2*/(""" """),format.raw/*38.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/admin/addProduct.scala.html
                  HASH: 920c2df10f0d2d0d553ee51cd2452ce82d40f05b
                  MATRIX: 853->109|1022->183|1052->286|1080->289|1092->294|1131->325|1170->327|1198->329|1319->424|1429->524|1470->526|1503->533|1601->610|1631->614|1743->705|1774->710|1995->911|2025->915|2125->994|2155->998|2255->1077|2286->1081|2371->1140|2459->1207|2489->1210|2647->1341|2662->1347|2710->1374|2811->1445|2839->1446|2900->1477|2928->1478
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|39->8|40->9|43->12|43->12|43->12|45->14|45->14|46->15|46->15|48->17|54->23|55->24|55->24|56->25|56->25|58->27|59->28|59->28|61->30|64->33|64->33|64->33|67->36|67->36|69->38|69->38
                  -- GENERATED --
              */
          