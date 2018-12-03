package my.pkg.one
import my.pkg.two.OtherThing

import java.net.URL
import java.io.File

object Main extends App {
  val t1 = Thing(new URL("http://nowhere.io"))
  val t2 = OtherThing(new File("/tmp/foo"))
  println(t1, t2)
}