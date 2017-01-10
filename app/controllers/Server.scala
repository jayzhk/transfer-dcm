package controllers

import play.api.mvc.{Action, Call, Controller}

/**
  * Created by huajiezeng on 1/10/17.
  */
class Server extends  Controller{
   def show = Action {
    //Ok("hello")
    Redirect(routes.HomeController.index())
  }

  def home = Action {
    Ok(<h1>Hello world !</h1>).as(XML)
  }
}
