
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reserve_Scope0 {
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

     object reserve_Scope1 {
import helper._

class reserve extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.75*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Reservation", user)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
	"""),format.raw/*9.2*/("""<h3>Reservation</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.addReserveSubmit(), 'class -> "form-horizontal", 'role->"form")/*12.102*/ {_display_(Seq[Any](format.raw/*12.104*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addProductForm("available"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.78*/("""
		"""),_display_(/*15.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*15.71*/("""
	
		"""),_display_(/*17.4*/inputText(addProductForm("slot1"), '_label -> "Please enter the name of item you wish to reserve",'class -> "form-control")),format.raw/*17.127*/("""
    """),_display_(/*18.6*/inputText(addProductForm("validAvailable"), '_label -> "Enter Reserved/reserved to confirm your reservation",'class -> "form-control")),format.raw/*18.140*/("""

	
	"""),format.raw/*21.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*24.14*/routes/*24.20*/.HomeController.rent()),format.raw/*24.42*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*27.3*/(""" """),format.raw/*27.4*/("""<!-- End Form definition -->

""")))}),format.raw/*29.2*/(""" """),format.raw/*29.3*/("""<!-- End of page content -->

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
object reserve extends reserve_Scope0.reserve_Scope1.reserve
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/reserve.scala.html
                  HASH: a21eeccb418467fc7c4bf8ce1edea1670cf0ce63
                  MATRIX: 838->109|1006->182|1036->285|1064->288|1105->321|1144->323|1172->325|1287->414|1396->513|1437->515|1467->518|1553->578|1648->652|1678->656|1766->723|1798->729|1943->852|1975->858|2131->992|2163->997|2321->1128|2336->1134|2379->1156|2480->1227|2508->1228|2569->1259|2597->1260
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|48->17|48->17|49->18|49->18|52->21|55->24|55->24|55->24|58->27|58->27|60->29|60->29
                  -- GENERATED --
              */
          