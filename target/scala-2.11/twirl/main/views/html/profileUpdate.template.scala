
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profileUpdate_Scope0 {
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

     object profileUpdate_Scope1 {
import helper._

class profileUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.users.Users],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addUsersForm: play.data.Form[models.users.Users], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.78*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Update Profile", user)/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
	"""),format.raw/*9.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.addProfileSubmit(), 'class -> "form-horizontal", 'role->"form")/*12.102*/ {_display_(Seq[Any](format.raw/*12.104*/("""

	"""),_display_(/*14.3*/inputText(addUsersForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.71*/("""
    """),_display_(/*15.6*/inputText(addUsersForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*15.81*/("""
    """),_display_(/*16.6*/inputText(addUsersForm("address"), '_label -> "Address",'class -> "form-control")),format.raw/*16.87*/("""
	"""),_display_(/*17.3*/inputText(addUsersForm("number"), '_label -> "Number",'class -> "form-control")),format.raw/*17.82*/("""
    """),_display_(/*18.6*/inputText(addUsersForm("password"), '_label -> "Password",'class -> "form-control")),format.raw/*18.89*/("""
	"""),format.raw/*19.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*22.14*/routes/*22.20*/.HomeController.profileUpdate()),format.raw/*22.51*/("""">
				
				<button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*27.3*/(""" """),format.raw/*27.4*/("""<!-- End Form definition -->

""")))}),format.raw/*29.2*/(""" """),format.raw/*29.3*/("""<!-- End of page content -->"""))
      }
    }
  }

  def render(addUsersForm:play.data.Form[models.users.Users],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addUsersForm,user)

  def f:((play.data.Form[models.users.Users],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addUsersForm,user) => apply(addUsersForm,user)

  def ref: this.type = this

}


}
}

/**/
object profileUpdate extends profileUpdate_Scope0.profileUpdate_Scope1.profileUpdate
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/profileUpdate.scala.html
                  HASH: 583dd6b6ca9b972a8c7282e7516041f38091e502
                  MATRIX: 860->109|1031->185|1061->288|1089->291|1125->319|1164->321|1192->323|1313->418|1422->517|1463->519|1493->523|1582->591|1614->597|1710->672|1742->678|1844->759|1873->762|1973->841|2005->847|2109->930|2138->932|2296->1063|2311->1069|2363->1100|2474->1181|2502->1182|2563->1213|2591->1214
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|53->22|53->22|53->22|58->27|58->27|60->29|60->29
                  -- GENERATED --
              */
          