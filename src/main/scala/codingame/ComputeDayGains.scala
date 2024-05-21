package codingame

object ComputeDayGains {

  def computeDayGains(nbSeats: Int, payingGuests: List[Int], guestMovements: List[List[Int]]): Int = {
    var totalGains = 0
    var currentPos = 0
    var remainingRides = payingGuests.toArray

    // Fonction pour vérifier s'il y a encore des tours restants
    def hasRemainingRides(remainingRides: Array[Int]): Boolean = {
      remainingRides.exists(_ > 0)
    }
    // Continuer tant qu'il y a au moins un invité avec des tours restants
    while (hasRemainingRides(remainingRides)) {
      val group = guestMovements(currentPos)
      currentPos = (currentPos + 1) % guestMovements.size
      var seatsFilled = 0
      var roundGain = 0
      for (guestIndex <- group if remainingRides(guestIndex) > 0) {
        if (seatsFilled < nbSeats) {
          seatsFilled += 1
          remainingRides(guestIndex) -= 1
          roundGain += 1 // Supposons que chaque tour coûte 1 unité de gain
        }
        if (seatsFilled == nbSeats) {
          // Les montagnes russes sont pleines
          seatsFilled = nbSeats
        }
      }
      totalGains += roundGain
    }

    totalGains
  }

}
