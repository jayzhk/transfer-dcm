package model


import play.api.data.Form
import play.api.data.Forms._

/**
  * Created by huajiezeng on 1/12/17.
  */
case class StudyData(description: String, studyUID: String){
  val userForm = Form(
    mapping("description" -> text, "studyUID" -> text)(StudyData.apply)(StudyData.unapply)
      verifying ("failed form constraints", fields => fields match {
      case studyData => validate(studyData.description, studyData.studyUID).isDefined}
    )
  )

  def validate(description: String, studyUID: String) = {
    description match {
      case "bob" if !description.isEmpty =>
        Some(StudyData(description, studyUID))
      case "admin" =>
        Some(StudyData(description, studyUID))
      case _ =>
        None
    }
  }
}



