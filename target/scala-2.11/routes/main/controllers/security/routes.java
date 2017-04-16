
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/v.5/03042017/conf/routes
// @DATE:Mon Apr 17 00:21:34 IST 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
