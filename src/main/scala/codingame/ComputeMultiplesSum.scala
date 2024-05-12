package codingame

object ComputeMultiplesSum {
  def computeMultiplesSum(n: Int): Int = {
    var somme = 0
    if (n >= 0 && n < 1000) {
      for (i <- 0 until n) {
        if ((i == 3) && (i % 3 == 0)) {
          somme = somme + i
        } else if ((i == 5) && (i % 5 == 0)) {
          somme = somme + i
        } else if ((i == 7) && (i % 7 == 0)) {
          somme = somme + i
        }
      }
      return somme
    } else
      return 0
  }
}
