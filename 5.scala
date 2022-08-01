object `5` {
  def toUpper(s:String):String = {
        s.toUpperCase()
    }

    def toLower(s:String):String = {
        s.toLowerCase()
    }

    def formatNames(name:String, text:(String) => String):String={
        text(name)
    }


    def main(args:Array[String]):String={
    printf("%s\n", formatNames("Benny", toUpper))
    printf("%s\n", formatNames("Niroshan", toUpper))
    printf("%s\n", formatNames("Saman", toLower))
    printf("%s\n", formatNames("Kumara", toLower))
    }


}
