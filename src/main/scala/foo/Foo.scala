package foo

sealed trait Foo

object Foo {
  implicit object LogOrdering extends Ordering[Foo] {
    override def compare(x: Foo, y: Foo): Int = ???
  }
}
