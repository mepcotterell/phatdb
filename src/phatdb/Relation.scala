package phatdb

import collection.mutable.{ Buffer, ListBuffer }

object Relation {

} // object Relation

case class Relation (val name) {

  implicit val model = this

  val properties: Buffer[Property[_]] = ListBuffer.empty[Property[_]]

  def key () {}

  def put () {}

  def delete () {}

  def is_save() {}

  def parent() {}

  def parent_key() {}

} // case class Relation
