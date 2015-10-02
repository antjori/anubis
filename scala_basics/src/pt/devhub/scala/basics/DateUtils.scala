package pt.devhub.scala.basics

import java.util.Locale
import java.util.Date
import java.text.DateFormat._

object DateUtils {

  def main(args: Array[String]) {
    for {
       locale <- Locale.getAvailableLocales
    } this.format(locale)
  }

  def format(locale: Locale) {
    val now = new Date
    val df = getDateInstance(LONG, locale)
    println(df format now)
  }
}