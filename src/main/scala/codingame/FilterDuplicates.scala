package codingame

object FilterDuplicates {
  def filterDuplicates(data: Array[Int]): Array[Int] = {
    if (data.isEmpty) {
      sys.exit()
    } else {
      data.toList.distinct.toArray
    }
  }
}
