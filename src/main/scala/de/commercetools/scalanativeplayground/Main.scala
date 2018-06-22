package de.commercetools.scalanativeplayground

import json._

@accessor case class Book(name: String, pages: Int, chapters: Seq[String])

object Main {
  def main(args: Array[String]): Unit = {
    println(
      Book("Making JSON Easy in Scala", 2,
        List("Getting Started, Fast", "Getting Back to Work")
      ).js)
  }
}