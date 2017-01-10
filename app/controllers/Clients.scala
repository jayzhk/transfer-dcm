package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{Action, Controller}

/**
  * Created by huajiezeng on 1/10/17.
  */
@Singleton
class Clients @Inject() extends Controller {

  def show(id: Long) = Action {
    implicit request => {
      Ok(" the request is [" + request + "]")
    }
  }

  def home() = controllers.Default.NotFound
}
