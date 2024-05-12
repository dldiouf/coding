package codingame

import scala.util.control.Breaks.break

object CountFrequencies {
  def countFrequencies(words: Array[String]): Unit = {
    var wordCounts: Array[Int] = new Array[Int](words.length)
    var uniqueWords: Array[String] = new Array[String](words.length)
    var uniqueWordCount = 0
    for (i <- 0 until (words.length - 1)) {
      var isUnique: Boolean = false
      for (j <- 0 until (uniqueWords.length - 1)) {
        if (uniqueWords(j).equals(words(i))) {
          wordCounts(j) = wordCounts(j) + 1
          isUnique = false
          break
        }
      }
      if (isUnique) {
        uniqueWords(uniqueWordCount) = words(i)
        wordCounts(uniqueWordCount) = 1
        uniqueWordCount = uniqueWordCount + 1
      }
    }
  }
}
