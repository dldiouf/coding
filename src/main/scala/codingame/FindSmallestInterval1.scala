package codingame

object FindSmallestInterval1 {
  def findSmallestInterval1(numbers: Array[Int]): Int = {
    var interval = Int.MaxValue
    var difference = 0
    scala.util.Sorting.quickSort(numbers)
    if (numbers.length == 0)
      return 0
    else {
      if (numbers.length < 100000) {
        for (i <- 0 until (numbers.length - 1)) {
          for (j <- 0 until (numbers.length - 1)) {
            if (j != i) {
              difference = Math.abs(numbers(i) - numbers(j))
              if (interval > difference)
                interval = difference
            }
          }
        }
      }
      return interval
    }
  }
}
