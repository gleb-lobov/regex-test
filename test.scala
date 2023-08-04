//> using dep "com.github.marianobarrios::dregex:0.7.0"
//> using scala "2.13"

import scala.io.Source
import dregex.Regex

object Main extends App {
    val regexpStr = Source.fromFile("regex.txt").getLines.toList(0)
    val matchEverything = ".*"
    val List(regex, everything) = Regex.compile(List(regexpStr, matchEverything))
    println(regexpStr)
    println(regex.isSubsetOf(everything))
}