package com.aldana.ejemplo14

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var TeamA=0
    var TeamB=0

    val scoreTeamA = MutableLiveData<Int>()
    val scoreTeamB = MutableLiveData<Int>()

    fun addTeamA(i: Int) {
        TeamA= TeamA+i
        scoreTeamA.postValue(TeamA)
    }
    fun addTeamB(i: Int) {
        TeamB= TeamB+i
        scoreTeamB.postValue(TeamB)
    }

    fun resetA (){
        TeamA= 0
        scoreTeamA.postValue(TeamA)

    }

    fun resetB (){

        TeamB= 0
        scoreTeamB.postValue(TeamB)
    }




}