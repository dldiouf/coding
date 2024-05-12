package codingame

object FilterWords {
  def filterWords(words: Array[String], letters: String): Array[String] = {
    val chars = letters.toLowerCase.toCharArray
    var newArray: Array[String] = null
    words.foreach(word =>
      chars.foreach(char =>
        if (word.contains(char)) {
          newArray = words
        }
      )
    )
    newArray
  }
}
