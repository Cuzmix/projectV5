
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loan_Scope0 {
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

     object loan_Scope1 {
import helper._

class loan extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addLoanForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.72*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Loan", user)/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
	"""),format.raw/*9.2*/("""<h3>Loaning</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.addLoanSubmit(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*12.112*/ {_display_(Seq[Any](format.raw/*12.114*/("""
			"""),format.raw/*13.4*/("""<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*14.4*/inputText(addLoanForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*14.74*/("""

		"""),_display_(/*16.4*/inputText(addLoanForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*16.77*/("""
		"""),_display_(/*17.4*/inputText(addLoanForm("validAvailable"), '_label -> "", 'style -> "display: none")),format.raw/*17.86*/("""


        """),_display_(/*20.10*/inputText(addLoanForm("available"), '_label -> "Enter Loaned/loaned to confirm your loan",'class -> "form-control")),format.raw/*20.125*/("""
		"""),_display_(/*21.4*/inputText(addLoanForm("quantity"), '_label -> "Enter the amount you wish to loan",'class -> "form-control")),format.raw/*21.111*/("""

	"""),format.raw/*23.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*26.14*/routes/*26.20*/.HomeController.rent()),format.raw/*26.42*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*29.3*/(""" """),format.raw/*29.4*/("""<!-- End Form definition -->

""")))}),format.raw/*31.2*/(""" """),format.raw/*31.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addLoanForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addLoanForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addLoanForm,user) => apply(addLoanForm,user)

  def ref: this.type = this

}


}
}

/**/
object loan extends loan_Scope0.loan_Scope1.loan
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/loan.scala.html
                  HASH: 96d9952903a6cfd6e98921007892c3e8dbd2ced5
                  MATRIX: 829->109|994->179|1024->282|1052->285|1086->311|1125->313|1153->315|1264->400|1383->509|1424->511|1455->515|1540->574|1631->644|1662->649|1756->722|1786->726|1889->808|1928->820|2065->935|2095->939|2224->1046|2254->1049|2412->1180|2427->1186|2470->1208|2571->1279|2599->1280|2660->1311|2688->1312
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|47->16|47->16|48->17|48->17|51->20|51->20|52->21|52->21|54->23|57->26|57->26|57->26|60->29|60->29|62->31|62->31
                  -- GENERATED --
              */
          