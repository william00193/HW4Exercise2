package com.example.courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.courtcounter.databinding.ActivityMainBinding


const val CURRENT_INDEX_KEY = "CURRENT_INDEX_KEY"
const val CURRENT_INDEX_KEY2 = "CURRENT_INDEX_KEY2"




class ViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {



    var scoreTeamA: Int

        get() = savedStateHandle.get(CURRENT_INDEX_KEY) ?: 0
        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY, value)

    var scoreTeamB: Int

        get() = savedStateHandle.get(CURRENT_INDEX_KEY2) ?: 0
        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY2, value)



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
