package controllers

import play.api.mvc.{Action, Controller}

/**
  * Created by huajiezeng on 1/11/17.
  */
class StudyController extends Controller{

  def save = Action(parse.json) { request =>
    Ok("Got :"  + (request.body \ "name").as[String])
  }

}
