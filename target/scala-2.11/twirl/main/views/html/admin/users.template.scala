
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.users.Users],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Users], user: models.users.Users   ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""


"""),format.raw/*4.1*/("""<!-- Pass page title and content """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""html between braces"""),format.raw/*4.54*/("""}"""),format.raw/*4.55*/(""" """),format.raw/*4.56*/("""to the main view -->
"""),_display_(/*5.2*/admin/*5.7*/.adminMain("Users", user)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
   """),format.raw/*6.4*/("""<!-- HTML content for the index view -->
  <div class="row">
                  <div class="col-sm-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="SubTitles">Users</h4>
                    </div>
                    <div class="panel-body">
                            """),_display_(/*14.30*/if(flash.containsKey("success"))/*14.62*/ {_display_(Seq[Any](format.raw/*14.64*/("""
              """),format.raw/*15.15*/("""<div class="alert alert-success">
              """),_display_(/*16.16*/flash/*16.21*/.get("success")),format.raw/*16.36*/("""
              """),format.raw/*17.15*/("""</div>
          """)))}),format.raw/*18.12*/("""
          """),format.raw/*19.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>Email</th>
            <th>Name</th>
            <th>Address</th>
            <th>Number</th>
            <th>Password</th>
            <th>Points</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*34.12*/for(p <- users) yield /*34.27*/ {_display_(Seq[Any](format.raw/*34.29*/("""
			        """),format.raw/*35.12*/("""<tr>
                  <td>"""),_display_(/*36.24*/p/*36.25*/.getEmail),format.raw/*36.34*/("""</td>
                  <td>"""),_display_(/*37.24*/p/*37.25*/.getName),format.raw/*37.33*/("""</td>
                  <td>"""),_display_(/*38.24*/p/*38.25*/.getAddress),format.raw/*38.36*/("""</td>
                  <td>"""),_display_(/*39.24*/p/*39.25*/.getNumber),format.raw/*39.35*/("""</td>
                  <td>"""),_display_(/*40.24*/p/*40.25*/.getPassword),format.raw/*40.37*/("""</td>
                  <td>"""),_display_(/*41.24*/p/*41.25*/.getPoints),format.raw/*41.35*/("""</td>

                 <td>
                      <a href=""""),_display_(/*44.33*/routes/*44.39*/.AdminController.updateUsers(p.getEmail)),format.raw/*44.79*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*49.33*/routes/*49.39*/.AdminController.deleteUsers(p.getEmail)),format.raw/*49.79*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*55.7*/(""" """),format.raw/*55.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
      </div>
                </div>


  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*64.27*/("""{"""),format.raw/*64.28*/("""
        """),format.raw/*65.9*/("""return confirm('Are you sure?');
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""
  """),format.raw/*67.3*/("""</script>
""")))}))
      }
    }
  }

  def render(users:List[models.users.Users],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.Users],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/admin/users.scala.html
                  HASH: d79542cda879b09e5d96e01aa9f3fb0c1f93ffb0
                  MATRIX: 788->1|945->63|974->66|1034->99|1062->100|1108->119|1136->120|1164->121|1211->143|1223->148|1256->173|1295->175|1325->179|1711->538|1752->570|1792->572|1835->587|1911->636|1925->641|1961->656|2004->671|2053->689|2092->700|2585->1166|2616->1181|2656->1183|2696->1195|2751->1223|2761->1224|2791->1233|2847->1262|2857->1263|2886->1271|2942->1300|2952->1301|2984->1312|3040->1341|3050->1342|3081->1352|3137->1381|3147->1382|3180->1394|3236->1423|3246->1424|3277->1434|3365->1495|3380->1501|3441->1541|3700->1773|3715->1779|3776->1819|4033->2046|4061->2047|4302->2260|4331->2261|4367->2270|4431->2307|4459->2308|4489->2311
                  LINES: 27->1|32->1|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|75->44|75->44|75->44|80->49|80->49|80->49|86->55|86->55|95->64|95->64|96->65|97->66|97->66|98->67
                  -- GENERATED --
              */
          