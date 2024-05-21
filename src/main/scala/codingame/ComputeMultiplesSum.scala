package codingame

object ComputeMultiplesSum {
  var somme = 0

  def computeMultiplesSum(n: Int): Int = {
    if (0 <= n && n < 1000) {
      for (i <- 0 until (n)) {
        if ((i % 3) == 0 || (i % 5) == 0 || (i % 7) == 0) {
          somme += i
        }
      }
    }
    return somme
  }
}
