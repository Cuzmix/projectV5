
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/v.5/03042017/conf/routes
// @DATE:Mon Apr 17 00:21:34 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:57
  AdminController_0: controllers.AdminController,
  // @LINE:92
  LoginController_5: controllers.security.LoginController,
  // @LINE:111
  CountController_1: controllers.CountController,
  // @LINE:113
  AsyncController_3: controllers.AsyncController,
  // @LINE:116
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:57
    AdminController_0: controllers.AdminController,
    // @LINE:92
    LoginController_5: controllers.security.LoginController,
    // @LINE:111
    CountController_1: controllers.CountController,
    // @LINE:113
    AsyncController_3: controllers.AsyncController,
    // @LINE:116
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rent""", """controllers.HomeController.rent(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reserve""", """controllers.HomeController.reserve"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReserveSubmit""", """controllers.HomeController.addReserveSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateReserve/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateReserve(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loan""", """controllers.HomeController.loan"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addLoanSubmit/""" + "$" + """email<[^/]+>""", """controllers.HomeController.addLoanSubmit(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateLoan/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateLoan(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profileUpdate""", """controllers.HomeController.profileUpdate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionUpadate""", """controllers.HomeController.transactionUpdate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProfileSubmit""", """controllers.HomeController.addProfileSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTransactionSubmit""", """controllers.HomeController.addTransactionSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProfile/""" + "$" + """email<[^/]+>""", """controllers.HomeController.updateProfile(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateTrasaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTransaction(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/products""", """controllers.AdminController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/service""", """controllers.AdminController.service(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/Transaction""", """controllers.AdminController.Transaction"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/rent""", """controllers.HomeController.rent(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/users""", """controllers.AdminController.users(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addUsers""", """controllers.AdminController.addUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addUsersSubmit""", """controllers.AdminController.addUsersSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateUsers/""" + "$" + """email<[^/]+>""", """controllers.AdminController.updateUsers(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delUsers/""" + "$" + """email<[^/]+>""", """controllers.AdminController.deleteUsers(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addproduct""", """controllers.AdminController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProductSubmit""", """controllers.AdminController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.security.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.HomeController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProductSubmit""", """controllers.HomeController.addProductSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUsersSubmit""", """controllers.HomeController.addUsersSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_2.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_rent2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rent")))
  )
  private[this] lazy val controllers_HomeController_rent2_invoker = createInvoker(
    HomeController_2.rent(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "rent",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """rent"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_products3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_products3_invoker = createInvoker(
    HomeController_2.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """ products accepts a parameter default to 0 (Long)""",
      this.prefix + """products"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_signup4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup4_invoker = createInvoker(
    HomeController_2.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_profile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile5_invoker = createInvoker(
    HomeController_2.profile(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_reserve6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reserve")))
  )
  private[this] lazy val controllers_HomeController_reserve6_invoker = createInvoker(
    HomeController_2.reserve,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reserve",
      Nil,
      "GET",
      """""",
      this.prefix + """reserve"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_addReserveSubmit7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReserveSubmit")))
  )
  private[this] lazy val controllers_HomeController_addReserveSubmit7_invoker = createInvoker(
    HomeController_2.addReserveSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addReserveSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """addReserveSubmit"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_updateReserve8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateReserve/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateReserve8_invoker = createInvoker(
    HomeController_2.updateReserve(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateReserve",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateReserve/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_loan9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loan")))
  )
  private[this] lazy val controllers_HomeController_loan9_invoker = createInvoker(
    HomeController_2.loan,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loan",
      Nil,
      "GET",
      """""",
      this.prefix + """loan"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_addLoanSubmit10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addLoanSubmit/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addLoanSubmit10_invoker = createInvoker(
    HomeController_2.addLoanSubmit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addLoanSubmit",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """addLoanSubmit/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_updateLoan11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateLoan/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateLoan11_invoker = createInvoker(
    HomeController_2.updateLoan(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateLoan",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateLoan/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_profileUpdate12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profileUpdate")))
  )
  private[this] lazy val controllers_HomeController_profileUpdate12_invoker = createInvoker(
    HomeController_2.profileUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profileUpdate",
      Nil,
      "GET",
      """""",
      this.prefix + """profileUpdate"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_transactionUpdate13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionUpadate")))
  )
  private[this] lazy val controllers_HomeController_transactionUpdate13_invoker = createInvoker(
    HomeController_2.transactionUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transactionUpdate",
      Nil,
      "GET",
      """""",
      this.prefix + """transactionUpadate"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_addProfileSubmit14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProfileSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProfileSubmit14_invoker = createInvoker(
    HomeController_2.addProfileSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProfileSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """addProfileSubmit"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_addTransactionSubmit15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTransactionSubmit")))
  )
  private[this] lazy val controllers_HomeController_addTransactionSubmit15_invoker = createInvoker(
    HomeController_2.addTransactionSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTransactionSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """addTransactionSubmit"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_updateProfile16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProfile/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProfile16_invoker = createInvoker(
    HomeController_2.updateProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProfile",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """updateProfile/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_updateTransaction17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTrasaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTransaction17_invoker = createInvoker(
    HomeController_2.updateTransaction(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateTransaction",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateTrasaction/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_AdminController_products18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/products")))
  )
  private[this] lazy val controllers_AdminController_products18_invoker = createInvoker(
    AdminController_0.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/products"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_AdminController_service19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/service")))
  )
  private[this] lazy val controllers_AdminController_service19_invoker = createInvoker(
    AdminController_0.service(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "service",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/service"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_AdminController_Transaction20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/Transaction")))
  )
  private[this] lazy val controllers_AdminController_Transaction20_invoker = createInvoker(
    AdminController_0.Transaction,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "Transaction",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/Transaction"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_HomeController_rent21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/rent")))
  )
  private[this] lazy val controllers_HomeController_rent21_invoker = createInvoker(
    HomeController_2.rent(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "rent",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/rent"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_AdminController_users22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users")))
  )
  private[this] lazy val controllers_AdminController_users22_invoker = createInvoker(
    AdminController_0.users(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "users",
      Seq(classOf[Long]),
      "GET",
      """ users accepts a parameter default to 0 (Long)""",
      this.prefix + """admin/users"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_AdminController_addUsers23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addUsers")))
  )
  private[this] lazy val controllers_AdminController_addUsers23_invoker = createInvoker(
    AdminController_0.addUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addUsers"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_AdminController_addUsersSubmit24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addUsersSubmit")))
  )
  private[this] lazy val controllers_AdminController_addUsersSubmit24_invoker = createInvoker(
    AdminController_0.addUsersSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addUsersSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addUsersSubmit"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_AdminController_updateUsers25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateUsers/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateUsers25_invoker = createInvoker(
    AdminController_0.updateUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/updateUsers/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_AdminController_deleteUsers26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delUsers/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteUsers26_invoker = createInvoker(
    AdminController_0.deleteUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteUsers",
      Seq(classOf[String]),
      "GET",
      """ Delete a user by an email passed as a parameter""",
      this.prefix + """admin/delUsers/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_AdminController_addProduct27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addproduct")))
  )
  private[this] lazy val controllers_AdminController_addProduct27_invoker = createInvoker(
    AdminController_0.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProduct",
      Nil,
      "GET",
      """ Request to load the add product form""",
      this.prefix + """admin/addproduct"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_AdminController_addProductSubmit28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminController_addProductSubmit28_invoker = createInvoker(
    AdminController_0.addProductSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProductSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """admin/addProductSubmit"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_AdminController_deleteProduct29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteProduct29_invoker = createInvoker(
    AdminController_0.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """ Delete a product by an id passed as a parameter""",
      this.prefix + """admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_AdminController_updateProduct30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProduct30_invoker = createInvoker(
    AdminController_0.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """ Update a product by id""",
      this.prefix + """admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_security_LoginController_login31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginController_login31_invoker = createInvoker(
    LoginController_5.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "login",
      Nil,
      "GET",
      """###############
 Login Routes #
###############""",
      this.prefix + """login"""
    )
  )

  // @LINE:93
  private[this] lazy val controllers_security_LoginController_loginSubmit32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginController_loginSubmit32_invoker = createInvoker(
    LoginController_5.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_security_LoginController_logout33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginController_logout33_invoker = createInvoker(
    LoginController_5.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_HomeController_addProduct34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct34_invoker = createInvoker(
    HomeController_2.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "GET",
      """ Request to load the add product form""",
      this.prefix + """addproduct"""
    )
  )

  // @LINE:100
  private[this] lazy val controllers_HomeController_addProductSubmit35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProductSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProductSubmit35_invoker = createInvoker(
    HomeController_2.addProductSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProductSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """addProductSubmit"""
    )
  )

  // @LINE:102
  private[this] lazy val controllers_HomeController_addUsersSubmit36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUsersSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUsersSubmit36_invoker = createInvoker(
    HomeController_2.addUsersSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUsersSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addUsersSubmit"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_HomeController_deleteProduct37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProduct37_invoker = createInvoker(
    HomeController_2.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """ Delete a product by an id passed as a parameter""",
      this.prefix + """delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_HomeController_updateProduct38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct38_invoker = createInvoker(
    HomeController_2.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """ Update a product by id""",
      this.prefix + """updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:111
  private[this] lazy val controllers_CountController_count39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count39_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_AsyncController_message40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message40_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:116
  private[this] lazy val controllers_Assets_versioned41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned41_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:9
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_2.about)
      }
  
    // @LINE:11
    case controllers_HomeController_rent2_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_rent2_invoker.call(HomeController_2.rent(cat))
      }
  
    // @LINE:14
    case controllers_HomeController_products3_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_products3_invoker.call(HomeController_2.products(cat))
      }
  
    // @LINE:16
    case controllers_HomeController_signup4_route(params) =>
      call { 
        controllers_HomeController_signup4_invoker.call(HomeController_2.signup)
      }
  
    // @LINE:18
    case controllers_HomeController_profile5_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_profile5_invoker.call(HomeController_2.profile(cat))
      }
  
    // @LINE:20
    case controllers_HomeController_reserve6_route(params) =>
      call { 
        controllers_HomeController_reserve6_invoker.call(HomeController_2.reserve)
      }
  
    // @LINE:22
    case controllers_HomeController_addReserveSubmit7_route(params) =>
      call { 
        controllers_HomeController_addReserveSubmit7_invoker.call(HomeController_2.addReserveSubmit)
      }
  
    // @LINE:24
    case controllers_HomeController_updateReserve8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateReserve8_invoker.call(HomeController_2.updateReserve(id))
      }
  
    // @LINE:26
    case controllers_HomeController_loan9_route(params) =>
      call { 
        controllers_HomeController_loan9_invoker.call(HomeController_2.loan)
      }
  
    // @LINE:28
    case controllers_HomeController_addLoanSubmit10_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_addLoanSubmit10_invoker.call(HomeController_2.addLoanSubmit(email))
      }
  
    // @LINE:30
    case controllers_HomeController_updateLoan11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateLoan11_invoker.call(HomeController_2.updateLoan(id))
      }
  
    // @LINE:32
    case controllers_HomeController_profileUpdate12_route(params) =>
      call { 
        controllers_HomeController_profileUpdate12_invoker.call(HomeController_2.profileUpdate)
      }
  
    // @LINE:34
    case controllers_HomeController_transactionUpdate13_route(params) =>
      call { 
        controllers_HomeController_transactionUpdate13_invoker.call(HomeController_2.transactionUpdate)
      }
  
    // @LINE:37
    case controllers_HomeController_addProfileSubmit14_route(params) =>
      call { 
        controllers_HomeController_addProfileSubmit14_invoker.call(HomeController_2.addProfileSubmit)
      }
  
    // @LINE:39
    case controllers_HomeController_addTransactionSubmit15_route(params) =>
      call { 
        controllers_HomeController_addTransactionSubmit15_invoker.call(HomeController_2.addTransactionSubmit)
      }
  
    // @LINE:43
    case controllers_HomeController_updateProfile16_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_updateProfile16_invoker.call(HomeController_2.updateProfile(email))
      }
  
    // @LINE:45
    case controllers_HomeController_updateTransaction17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateTransaction17_invoker.call(HomeController_2.updateTransaction(id))
      }
  
    // @LINE:57
    case controllers_AdminController_products18_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_products18_invoker.call(AdminController_0.products(cat))
      }
  
    // @LINE:58
    case controllers_AdminController_service19_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_service19_invoker.call(AdminController_0.service(cat))
      }
  
    // @LINE:60
    case controllers_AdminController_Transaction20_route(params) =>
      call { 
        controllers_AdminController_Transaction20_invoker.call(AdminController_0.Transaction)
      }
  
    // @LINE:62
    case controllers_HomeController_rent21_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_rent21_invoker.call(HomeController_2.rent(cat))
      }
  
    // @LINE:65
    case controllers_AdminController_users22_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_users22_invoker.call(AdminController_0.users(cat))
      }
  
    // @LINE:67
    case controllers_AdminController_addUsers23_route(params) =>
      call { 
        controllers_AdminController_addUsers23_invoker.call(AdminController_0.addUsers)
      }
  
    // @LINE:69
    case controllers_AdminController_addUsersSubmit24_route(params) =>
      call { 
        controllers_AdminController_addUsersSubmit24_invoker.call(AdminController_0.addUsersSubmit)
      }
  
    // @LINE:71
    case controllers_AdminController_updateUsers25_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_updateUsers25_invoker.call(AdminController_0.updateUsers(email))
      }
  
    // @LINE:74
    case controllers_AdminController_deleteUsers26_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_deleteUsers26_invoker.call(AdminController_0.deleteUsers(email))
      }
  
    // @LINE:77
    case controllers_AdminController_addProduct27_route(params) =>
      call { 
        controllers_AdminController_addProduct27_invoker.call(AdminController_0.addProduct)
      }
  
    // @LINE:80
    case controllers_AdminController_addProductSubmit28_route(params) =>
      call { 
        controllers_AdminController_addProductSubmit28_invoker.call(AdminController_0.addProductSubmit)
      }
  
    // @LINE:83
    case controllers_AdminController_deleteProduct29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteProduct29_invoker.call(AdminController_0.deleteProduct(id))
      }
  
    // @LINE:86
    case controllers_AdminController_updateProduct30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProduct30_invoker.call(AdminController_0.updateProduct(id))
      }
  
    // @LINE:92
    case controllers_security_LoginController_login31_route(params) =>
      call { 
        controllers_security_LoginController_login31_invoker.call(LoginController_5.login)
      }
  
    // @LINE:93
    case controllers_security_LoginController_loginSubmit32_route(params) =>
      call { 
        controllers_security_LoginController_loginSubmit32_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:94
    case controllers_security_LoginController_logout33_route(params) =>
      call { 
        controllers_security_LoginController_logout33_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:97
    case controllers_HomeController_addProduct34_route(params) =>
      call { 
        controllers_HomeController_addProduct34_invoker.call(HomeController_2.addProduct)
      }
  
    // @LINE:100
    case controllers_HomeController_addProductSubmit35_route(params) =>
      call { 
        controllers_HomeController_addProductSubmit35_invoker.call(HomeController_2.addProductSubmit)
      }
  
    // @LINE:102
    case controllers_HomeController_addUsersSubmit36_route(params) =>
      call { 
        controllers_HomeController_addUsersSubmit36_invoker.call(HomeController_2.addUsersSubmit)
      }
  
    // @LINE:105
    case controllers_HomeController_deleteProduct37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProduct37_invoker.call(HomeController_2.deleteProduct(id))
      }
  
    // @LINE:108
    case controllers_HomeController_updateProduct38_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProduct38_invoker.call(HomeController_2.updateProduct(id))
      }
  
    // @LINE:111
    case controllers_CountController_count39_route(params) =>
      call { 
        controllers_CountController_count39_invoker.call(CountController_1.count)
      }
  
    // @LINE:113
    case controllers_AsyncController_message40_route(params) =>
      call { 
        controllers_AsyncController_message40_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:116
    case controllers_Assets_versioned41_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned41_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
