/**
 * Created by Gavin Ham on 9/4/2017.
 */
class Rating {

    private val MAXVOTE = 3     // Int type is inferred, val, also dont need semicolons
    private var Votes = 0
    private var TotalScore = 0
    private var Score = 0.0
    private var stringScore = ""

     /*
     adds votes
      */
    fun addVote(amount: Int) {

         if (amount <= MAXVOTE) {
             Votes ++
             TotalScore += amount
         }
     }
    /*
    computes score
     */
    private fun computeScore (): Double{

        if (Votes > 0) {
            Score = (TotalScore / Votes).toDouble()
            return Score
        }
        return 0.0
    }

    /*
    converts the Score to Stars
     */
    fun toStars(): String {
        Score = computeScore()
        for(i in 0..Score.toInt()) {
            stringScore += "*"
        }

        return stringScore
    }

}