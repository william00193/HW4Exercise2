package com.example.courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.courtcounter.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

private const val TAG = "ViewModel"
const val CURRENT_INDEX_KEY = "CURRENT_INDEX_KEY"




 val scoreTeamA = 0

val scoreTeamB = 0



class ViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {

    fun displayA() {
        scoreTeamA
    }


    fun displayB() {
        scoreTeamB
    }


    var scoreTeamA = 0

    var scoreTeamB = 0


//    val scoreTeamA: Int
//        get() = scoreTeamA
//
//    val scoreTeamB: Int
//        get() = scoreTeamB


//        get() = savedStateHandle.get(CURRENT_INDEX_KEY)?:0
//        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY, value)




    fun addOneA() {
        scoreTeamA++

    }

    fun addOneB() {
        scoreTeamB++

    }

    fun addTwoA() {
        scoreTeamA += 2

    }

    fun addTwoB() {
        scoreTeamB += 2

    }

    fun addThreeA() {
        scoreTeamA += 3

    }

    fun addThreeB() {
        scoreTeamB += 3

    }

    fun Reset() {
        scoreTeamA = 0
        scoreTeamB = 0
    }








}
