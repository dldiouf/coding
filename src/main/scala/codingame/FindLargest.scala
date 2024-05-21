package codingame

object FindLargest {
  def findLargest(numbers: Array[Int]): Int = {
    var maxx = numbers(0)
    for (i <- 0 until(numbers.length - 1)){
      if (numbers(i) > maxx)
        maxx = numbers(i)
    }
    return maxx
  }

}
