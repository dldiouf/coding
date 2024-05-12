package codingame

object FindSmallestInterval {
  def findSmallestInterval(numbers: Array[Int]): Int = {
    var interval = Int.MaxValue
    scala.util.Sorting.quickSort(numbers)
    val len = numbers.length
    if (len <= 1)
      sys.exit()
    else {
      if (len > 100000) {
        sys.exit()
      } else {
        for (i <- 0 until (len - 1)) {
          if ((numbers(i + 1) - numbers(i)) < interval) {
            interval = numbers(i + 1) - numbers(i)
          }
        }
      }
      return interval
    }
  }
}
