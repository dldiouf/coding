package codingame

object Encode {
  def encode(plainText: String): String = {
    val listChar = plainText.toLowerCase.toCharArray
    var count = 0
    var res = ""
    var char = listChar(0)
    if (plainText.isEmpty) return null
    else {
      if (plainText.exists(_.isDigit)) sys.exit()
      else {
        if (plainText.length <= 15000) {
          for (letter <- listChar) {
            if (letter.toString != char.toString) {
              res += count.toString + char.toString
              char = letter
              count = 1
            } else {
              if (letter.toString.equals(char.toString)) {
                count += 1
              }
            }
          }
        } else sys.exit()
      }
      res += count.toString + char.toString
      return res
    }
  }
}