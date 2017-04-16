
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object transactionUpdate_Scope0 {
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

     object transactionUpdate_Scope1 {
import helper._

class transactionUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(UsersLibraryForm: play.data.Form[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

"""),format.raw/*6.102*/("""


"""),_display_(/*9.2*/main("Update Transaction", user)/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""
	"""),format.raw/*10.2*/("""<h3>Add a new Product</h3>


	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*14.3*/form(action = routes.HomeController.addTransactionSubmit(), 'class -> "form-horizontal", 'role->"form")/*14.106*/ {_display_(Seq[Any](format.raw/*14.108*/("""




        """),_display_(/*19.10*/inputText(UsersLibraryForm("Id"), '_label -> "Id",'class -> "form-control")),format.raw/*19.85*/("""
        """),_display_(/*20.10*/inputText(UsersLibraryForm("User_product_id"), '_label -> "User_product_id",'class -> "form-control")),format.raw/*20.111*/("""
        """),_display_(/*21.10*/inputText(UsersLibraryForm("User_email"), '_label -> "User_email",'class -> "form-control")),format.raw/*21.101*/("""
        """),_display_(/*22.10*/inputDate(UsersLibraryForm("Date_transaction"), '_label -> "Date_transaction",'class -> "form-control")),format.raw/*22.113*/("""
        """),_display_(/*23.10*/inputDate(UsersLibraryForm("Expiring_date"), '_label -> "Expiring_date",'class -> "form-control")),format.raw/*23.107*/("""





	"""),format.raw/*29.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*32.14*/routes/*32.20*/.HomeController.transactionUpdate()),format.raw/*32.55*/("""">
				
				<button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*37.3*/(""" """),format.raw/*37.4*/("""<!-- End Form definition -->
""")))}),format.raw/*38.2*/("""
"""),format.raw/*39.1*/("""-- End of page content -->"""))
      }
    }
  }

  def render(UsersLibraryForm:play.data.Form[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(UsersLibraryForm,user)

  def f:((play.data.Form[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (UsersLibraryForm,user) => apply(UsersLibraryForm,user)

  def ref: this.type = this

}


}
}

/**/
object transactionUpdate extends transactionUpdate_Scope0.transactionUpdate_Scope1.transactionUpdate
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/transactionUpdate.scala.html
                  HASH: 20599c8b05edd6512992617fb9a02e67d7d474dc
                  MATRIX: 874->109|1051->191|1081->294|1110->298|1150->330|1189->332|1218->334|1339->429|1452->532|1493->534|1534->548|1630->623|1667->633|1790->734|1827->744|1940->835|1977->845|2102->948|2139->958|2258->1055|2292->1062|2450->1193|2465->1199|2521->1234|2632->1315|2660->1316|2720->1346|2748->1347
                  LINES: 30->4|35->4|37->6|40->9|40->9|40->9|41->10|45->14|45->14|45->14|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|60->29|63->32|63->32|63->32|68->37|68->37|69->38|70->39
                  -- GENERATED --
              */
          