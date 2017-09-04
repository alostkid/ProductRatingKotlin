/**
 * Created by Gavin Ham on 9/4/2017.
 */

    fun main(args: Array<String>) {
        println("Hello World!")
        val Rating = Rating()

        Rating.addVote(3)
        Rating.toStars()
        println(Rating.toStars())
    }