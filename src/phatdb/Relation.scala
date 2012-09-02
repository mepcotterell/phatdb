package phatdb

import collection.mutable.{ Buffer, ListBuffer }

object Relation {

} // object Relation

case class Relation (val _name: String) {

  implicit val _model = this

  val _attributes: Buffer[Attribute[_]] = ListBuffer.empty[Attribute[_]]

  val _tuples: Buffer[Array[_]] = ListBuffer.empty[Array[_]]

  def degree () = _attributes.length

  def cardinality () = _tuples.length

  def key () {}

  def put () {}

  def delete () {}

  def is_save() {}

  def parent() {}

  def parent_key() {}

} // case class Relation
