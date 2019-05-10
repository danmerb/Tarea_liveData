package com.aldana.ejemplo14



import kotlinx.android.synthetic.main.activity_main.*


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scoreTeam_A = ViewModelProviders.of(this).get(ScoreViewModel::class.java)
        val scoreTeam_B = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        val scoreObserverA = Observer<Int> { newInt ->

            tv_score_team_a.text = newInt.toString()
        }
        val scoreObserverB = Observer<Int> { newInt ->

            tv_score_team_b.text = newInt.toString()
        }
        scoreTeam_A.scoreTeamA.observe(this, scoreObserverA)
        scoreTeam_B.scoreTeamB.observe(this, scoreObserverB)




        bt_team_a_3_p.setOnClickListener(){
            scoreTeam_A.addTeamA(3)
        }
        bt_team_a_2_p.setOnClickListener(){
            scoreTeam_A.addTeamA(2)
        }
        bt_team_a_free_throw.setOnClickListener(){
            scoreTeam_A.addTeamA(1)
        }
        bt_team_b_3_p.setOnClickListener(){
            scoreTeam_B.addTeamB(3)
        }
        bt_team_b_2_p.setOnClickListener(){
            scoreTeam_B.addTeamB(2)
        }
        bt_team_b_free_throw.setOnClickListener(){
            scoreTeam_B.addTeamB(1)
        }

        bt_reset.setOnClickListener(){
            scoreTeam_A.resetA()
            scoreTeam_B.resetB()
        }
    }
}




