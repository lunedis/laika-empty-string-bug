import laika.api.Transformer
import laika.format.{HTML, Markdown}

object Main {
  def main(args: Array[String]): Unit = {
    val transformer = Transformer.from(Markdown).to(HTML).build
    println(transformer.transform(""))
  }
}