import codingame.{ComputeMultiplesSum, CountFrequencies, Encode, FilterDuplicates, FilterWords, FindLargestSquare, FindLargestSquare1, FindSmallestInterval, FindSmallestInterval1, FindSumPair}

object MainCodingame {
  def main(args: Array[String]): Unit = {
    val matrix = Array(
      Array(1, 0, 1, 0, 0),
      Array(1, 0, 1, 1, 1),
      Array(1, 1, 1, 1, 1),
      Array(1, 0, 0, 1, 0)
    )
    val largestSquare = FindLargestSquare1.findLargestSquare(matrix)
println(largestSquare)
  }
}
