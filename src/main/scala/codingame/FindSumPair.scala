package codingame

object FindSumPair {
  def findSumPair(numbers: Array[Int], k: Int): Array[Int] = {
    var tab = Array[Int](2)
    for (i <- 0 until (numbers.length - 1)) {
      for (j <- (i + 1) until (numbers.length - 1)) {
        if (numbers(i) + numbers(j) == k) {
          tab = numbers
        }
      }
    }
    return tab
  }
}
