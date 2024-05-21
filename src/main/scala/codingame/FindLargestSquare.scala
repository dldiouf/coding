package codingame

object FindLargestSquare {
  def findLargestSquare(matrix: Array[Array[Int]]): Int = {
    var R = matrix.length
    var C = matrix(0).length
    var s: Array[Array[Int]] = Array.ofDim[Int](R, C)
    var max_of_s, max_i, max_j = 0
    for (i <- 0 until (R - 1)) {
      s(i)(0) = matrix(i)(0)
    }
    for (j <- 0 until (C - 1)) {
      s(0)(j) = matrix(0)(j)
    }
    for (i <- 0 until (R - 1)) {
      for (j <- 0 until (C - 1)) {
        if (matrix(i)(j) == 1) {
          s(i)(j) = Math.min(s(i)(j - 1), Math.min(s(i - 1)(j), s(i - 1)(j - 1))) + 1
        } else {
          s(i)(j) = 0
        }
      }
    }
    max_of_s = s(0)(0)
    max_i = 0
    max_j = 0
    for (i <- 0 until (R - 1)) {
      for (j <- 0 until (C - 1)) {
        if (max_of_s < s(i)(j)) {
          max_of_s = s(i)(j)
          max_i = i
          max_j = j
        }
      }
    }
    s.length
  }

}
