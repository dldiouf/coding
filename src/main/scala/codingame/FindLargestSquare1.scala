package codingame

object FindLargestSquare1 {

  def findLargestSquare(matrix: Array[Array[Int]]): Int = {
    if (matrix.isEmpty || matrix(0).isEmpty) return 0

    val rows = matrix.length
    val cols = matrix(0).length
    val dp = Array.ofDim[Int](rows, cols)
    var maxSquareSize = 0

    // Initialiser la première ligne et la première colonne de dp
    for (i <- 0 until rows) {
      dp(i)(0) = matrix(i)(0)
      if (dp(i)(0) == 1) maxSquareSize = 1
    }
    for (j <- 0 until cols) {
      dp(0)(j) = matrix(0)(j)
      if (dp(0)(j) == 1) maxSquareSize = 1
    }

    // Remplir le reste de la matrice dp
    for (i <- 1 until rows) {
      for (j <- 1 until cols) {
        if (matrix(i)(j) == 1) {
          dp(i)(j) = math.min(dp(i - 1)(j), math.min(dp(i)(j - 1), dp(i - 1)(j - 1))) + 1
          if (dp(i)(j) > maxSquareSize) {
            maxSquareSize = dp(i)(j)
          }
        } else {
          dp(i)(j) = 0
        }
      }
    }

    maxSquareSize
  }
}


