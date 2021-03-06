// @SOURCE:C:/Users/Caio/Downloads/salaorocha/conf/routes
// @HASH:ad9fd498d33123512e9e080f2e57b6a61d4a338d
// @DATE:Sun Oct 18 23:44:01 BRST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_splay1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("splay"))))
private[this] lazy val controllers_Application_splay1_invoker = createInvoker(
controllers.Application.splay(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "splay", Nil,"GET", """""", Routes.prefix + """splay"""))
        

// @LINE:8
private[this] lazy val controllers_Application_index_app2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("app"))))
private[this] lazy val controllers_Application_index_app2_invoker = createInvoker(
controllers.Application.index_app(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index_app", Nil,"GET", """""", Routes.prefix + """app"""))
        

// @LINE:11
private[this] lazy val controllers_Application_index3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index3_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"POST", """""", Routes.prefix + """"""))
        

// @LINE:16
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """splay""","""controllers.Application.splay()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """app""","""controllers.Application.index_app()"""),("""POST""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_splay1_route(params) => {
   call { 
        controllers_Application_splay1_invoker.call(controllers.Application.splay())
   }
}
        

// @LINE:8
case controllers_Application_index_app2_route(params) => {
   call { 
        controllers_Application_index_app2_invoker.call(controllers.Application.index_app())
   }
}
        

// @LINE:11
case controllers_Application_index3_route(params) => {
   call { 
        controllers_Application_index3_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:16
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     