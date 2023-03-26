package com.learning.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.learning.recordkeeper.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.buttonRunning.setOnClickListener() {
           onRunningClicked()
       }

        binding.buttonCycling.setOnClickListener() {
            onCyclingClicked()
        }


    }

    private fun onCyclingClicked() {
        // this.FragmentTransaction help to switch between the fragment
        supportFragmentManager.commit {
            replace(R.id.frame_content, CyclingFragment())
        }

    }

    private fun onRunningClicked() {
        // this.FragmentTransaction help to switch between the fragment
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }

    }
}