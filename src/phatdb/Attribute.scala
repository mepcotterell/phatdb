package phatdb

case class Attribute [T] (val name: String) (implicit ord: Ordering[T], relation: Relation) extends Ordered[Attribute[T]] {

  relation._attributes += this

  private var value: T = _

  def apply (): T = this.value

  def update (value: T) {
    this.value = value
  } // update

  def compare (that: Attribute[T]) = ord.compare(this(), that())

} // case class Attribute

object AttributeImplicits {

  implicit def mkAttribute [T] (x: Attribute[T]) = x()

} // object AttributeImplicits


object AttributeTest extends App {

  class User () extends Relation ("user") {
    val name = Attribute[String]("name")
    val age  = Attribute[Int]("age")
  }
  
  val michael = new User()

  michael.age() = 20
  michael.name() = "Michael"
  println(michael.name())
  println(michael.age())

} // AttributeTest
