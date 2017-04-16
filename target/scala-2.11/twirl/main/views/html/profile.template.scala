
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Users], products: List[models.Product], Transactions: List[models.Users_library],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.134*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Users", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<!-- HTML content for the index view -->
    <div class="row">
        <div class="col-sm-12">
            <div class="panel panel-default" style = "color: black">
                <div class="panel-heading">
                    <h4 class="SubTitles">"""),_display_(/*10.44*/user/*10.48*/.getName()),format.raw/*10.58*/(""" """),format.raw/*10.59*/("""Profile</h4>
                </div>
                <div class="panel-body">
                    """),_display_(/*13.22*/if(flash.containsKey("success"))/*13.54*/ {_display_(Seq[Any](format.raw/*13.56*/("""
                        """),format.raw/*14.25*/("""<div class="alert alert-success">
                        """),_display_(/*15.26*/flash/*15.31*/.get("success")),format.raw/*15.46*/("""
                        """),format.raw/*16.25*/("""</div>
                    """)))}),format.raw/*17.22*/("""
                    """),format.raw/*18.21*/("""<table class="table table-bordered table-hover table-condensed">
                        <thead>
                                <!-- The header row-->
                            <tr>
                                <th style = "color: black">Email</th>
                                <th style = "color: black">Name</th>
                                <th style = "color: black">Address</th>
                                <th style = "color: black">Number</th>
                                <th style = "color: black">Password</th>
                                <th style = "color: black">Points</th>
                            </tr>
                        </thead>
                        <tbody>
                                <!-- Product row(s) -->
                                <!-- Start of For loop - For each p in products add a row -->

                            <tr>
                                <td>"""),_display_(/*35.38*/user/*35.42*/.getEmail),format.raw/*35.51*/("""</td>
                                <td>"""),_display_(/*36.38*/user/*36.42*/.getName),format.raw/*36.50*/("""</td>
                                <td>"""),_display_(/*37.38*/user/*37.42*/.getAddress),format.raw/*37.53*/("""</td>
                                <td>"""),_display_(/*38.38*/user/*38.42*/.getNumber),format.raw/*38.52*/("""</td>
                                <td>"""),_display_(/*39.38*/user/*39.42*/.getPassword),format.raw/*39.54*/("""</td>
                                <td>"""),_display_(/*40.38*/user/*40.42*/.getPoints),format.raw/*40.52*/("""</td>

                                <td>
                                    <a href=""""),_display_(/*43.47*/routes/*43.53*/.HomeController.updateProfile(user.getEmail)),format.raw/*43.97*/("""" class="btn-xs btn-danger">
                                        <span class="glyphicon glyphicon-pencil"></span></a>
                                </td>

                            </tr>

                        </tbody>
                    </table>
                    <table class="table table-bordered table-hover table-condensed">
                        <thead>
                            <h1> Loaned Items </h1>
                                <!-- The header row-->

                            <tr>
                                <th style = "color: black">ID</th>
                                <th style = "color: black">Product ID</th>
                                <th style = "color: black">User Email</th>
                                <th style = "color: black">Date Of transaction </th>
                                <th style = "color: black">Expire Date</th>

                            </tr>


                            """),_display_(/*66.30*/for(p <- Transactions) yield /*66.52*/{_display_(Seq[Any](format.raw/*66.53*/("""
                                """),_display_(/*67.34*/if(p.getUser_email.equalsIgnoreCase(user.getEmail))/*67.85*/{_display_(Seq[Any](format.raw/*67.86*/("""
                                    """),format.raw/*68.37*/("""<tr>
                                        <td>"""),_display_(/*69.46*/p/*69.47*/.getId),format.raw/*69.53*/("""</td>
                                        <td>"""),_display_(/*70.46*/p/*70.47*/.getUser_product_id),format.raw/*70.66*/("""</td>
                                        <td>"""),_display_(/*71.46*/p/*71.47*/.getUser_email),format.raw/*71.61*/("""</td>
                                        <td>"""),_display_(/*72.46*/p/*72.47*/.getDate_transaction),format.raw/*72.67*/("""</td>
                                        <td>"""),_display_(/*73.46*/p/*73.47*/.getExpiring_date),format.raw/*73.64*/("""</td>

                                        <td>
                                            <a href=""""),_display_(/*76.55*/routes/*76.61*/.HomeController.updateTransaction(p.getId)),format.raw/*76.103*/("""" class="btn-xs btn-danger">
                                                <span class="glyphicon glyphicon-pencil"></span></a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*80.34*/("""
                            """)))}),format.raw/*81.30*/("""

                        """),format.raw/*83.25*/("""</thead>
                        <tbody>
                                <!-- Product row(s) -->
                                <!-- Start of For loop - For each p in products add a row -->

                        </tbody>
                    </table>
                </div>
            </div>


</div>
""")))}))
      }
    }
  }

  def render(users:List[models.users.Users],products:List[models.Product],Transactions:List[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(users,products,Transactions,user)

  def f:((List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (users,products,Transactions,user) => apply(users,products,Transactions,user)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/profile.scala.html
                  HASH: 1c86c3959e23fe93759e24aad58b022fc9d56262
                  MATRIX: 834->1|1062->133|1090->135|1150->168|1178->169|1224->188|1252->189|1280->190|1327->212|1354->231|1393->233|1424->238|1702->489|1715->493|1746->503|1775->504|1900->602|1941->634|1981->636|2034->661|2120->720|2134->725|2170->740|2223->765|2282->793|2331->814|3289->1745|3302->1749|3332->1758|3402->1801|3415->1805|3444->1813|3514->1856|3527->1860|3559->1871|3629->1914|3642->1918|3673->1928|3743->1971|3756->1975|3789->1987|3859->2030|3872->2034|3903->2044|4020->2134|4035->2140|4100->2184|5087->3144|5125->3166|5164->3167|5225->3201|5285->3252|5324->3253|5389->3290|5466->3340|5476->3341|5503->3347|5581->3398|5591->3399|5631->3418|5709->3469|5719->3470|5754->3484|5832->3535|5842->3536|5883->3556|5961->3607|5971->3608|6009->3625|6142->3731|6157->3737|6221->3779|6503->4030|6564->4060|6618->4086
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|41->10|41->10|41->10|41->10|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|74->43|74->43|74->43|97->66|97->66|97->66|98->67|98->67|98->67|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|107->76|107->76|107->76|111->80|112->81|114->83
                  -- GENERATED --
              */
          