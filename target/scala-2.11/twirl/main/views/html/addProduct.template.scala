
package views.html

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

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(addProductForm: Form[models.Product], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.66*/("""

"""),format.raw/*7.102*/("""

"""),_display_(/*9.2*/main("Add Product", user)/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""
	"""),format.raw/*10.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form")/*13.102*/ {_display_(Seq[Any](format.raw/*13.104*/("""
		
		"""),format.raw/*15.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*17.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*17.81*/("""
		"""),_display_(/*18.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*18.95*/("""

		"""),_display_(/*20.4*/select(
			addProductForm("category.id"),
			
			options(Category.options),
			'_label -> "Category", '_default -> "-- Choose a category --",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*26.4*/("""
		"""),_display_(/*27.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*27.83*/("""
		"""),_display_(/*28.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*28.83*/("""

		"""),format.raw/*30.3*/("""<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*31.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*31.71*/("""

	"""),format.raw/*33.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*36.14*/routes/*36.20*/.HomeController.products()),format.raw/*36.46*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*39.3*/(""" """),format.raw/*39.4*/("""<!-- End Form definition -->

""")))}),format.raw/*41.2*/(""" """),format.raw/*41.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/addProduct.scala.html
                  HASH: 3b93680e45cb0aa39e4094c5f5a53ffb2a8e2f0e
                  MATRIX: 837->110|996->174|1026->277|1054->280|1087->305|1126->307|1155->309|1276->404|1385->503|1426->505|1459->511|1580->606|1678->683|1708->687|1820->778|1851->783|2072->984|2102->988|2202->1067|2232->1071|2332->1150|2363->1154|2448->1213|2536->1280|2566->1283|2724->1414|2739->1420|2786->1446|2887->1517|2915->1518|2976->1549|3004->1550
                  LINES: 30->5|35->5|37->7|39->9|39->9|39->9|40->10|43->13|43->13|43->13|45->15|47->17|47->17|48->18|48->18|50->20|56->26|57->27|57->27|58->28|58->28|60->30|61->31|61->31|63->33|66->36|66->36|66->36|69->39|69->39|71->41|71->41
                  -- GENERATED --
              */
          