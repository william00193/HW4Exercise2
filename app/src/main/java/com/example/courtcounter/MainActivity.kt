package com.example.courtcounter

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val ViewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//What prvented this from working for the longest time
//keep in OnCreate Section!!
        displayForTeamA(ViewModel.scoreTeamA)
        displayForTeamB(ViewModel.scoreTeamB)


    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
//        scoreTeamA++

        ViewModel.addOneA()

        displayForTeamA(ViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
//        scoreTeamA += 2
        ViewModel.addTwoA()


        displayForTeamA(ViewModel.scoreTeamA)


    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        ViewModel.addThreeA()


        displayForTeamA(ViewModel.scoreTeamA)

    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
//        scoreTeamB++
        ViewModel.addOneB()

        displayForTeamB(ViewModel.scoreTeamB)


    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
//        scoreTeamB += 2
        ViewModel.addTwoB()


        displayForTeamB(ViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
//        scoreTeamB += 3
        ViewModel.addThreeB()

        displayForTeamB(ViewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
//        scoreTeamA = 0
//        scoreTeamB = 0
        ViewModel.Reset()
//        displayForTeamA(scoreTeamA)
        displayForTeamA(ViewModel.scoreTeamA)
        displayForTeamB(ViewModel.scoreTeamB)
    }



    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }

    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
        scoreTeamA
    }



}