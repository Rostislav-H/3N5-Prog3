package org.Hudiakov

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements



fun main() {
    val url = "https://google.com"

    scanWebPage(url)
}

fun scanWebPage(url: String){
    try{
        val doc: Document = Jsoup.connect(url).get()
        val links: Elements = doc.select("a")

        for (link: Element in links){
            val linkHref = link.attr("href")
            val linkText = link.text()
            println("$linkText = $linkHref")
        }
    }
    catch (e: Exception){
        println("${e.message},Erreur de Url ")
    }
}
