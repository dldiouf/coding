package codingame

object Duodigits {
  def isDuoDigit(number: Int): Int = {
    var listChar = number.toString().toCharArray()
    var setChar = listChar.toSet
    var size = setChar.size
    var toReturn = 0
    if (size > 2) {
      toReturn = 0
    } else {
      toReturn = 1
    }

    return toReturn
  }
}
