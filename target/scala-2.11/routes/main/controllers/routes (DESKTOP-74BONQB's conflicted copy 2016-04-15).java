
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/killermenpl/26EC4C4BEC4C1807/Users/killermenpl/Dropbox/play-java/conf/routes
// @DATE:Fri Apr 15 15:28:24 UTC 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsers Users = new controllers.ReverseUsers(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFiles Files = new controllers.ReverseFiles(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseArticles Articles = new controllers.ReverseArticles(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsers Users = new controllers.javascript.ReverseUsers(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFiles Files = new controllers.javascript.ReverseFiles(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseArticles Articles = new controllers.javascript.ReverseArticles(RoutesPrefix.byNamePrefix());
  }

}