package com.gauteri.drumflame

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    // Declaro los MediaPlayers para cada recurso
    private lateinit var kickMediaPlayer: MediaPlayer
    private lateinit var snareMediaPlayer: MediaPlayer
    private lateinit var floorMediaPlayer: MediaPlayer
    private lateinit var tom1MediaPlayer: MediaPlayer
    private lateinit var tom2MediaPlayer: MediaPlayer
    private lateinit var hithatMediaPlayer: MediaPlayer
    private lateinit var crashMediaPlayer: MediaPlayer
    private lateinit var rideMediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicia MediaPlayer con los recursos de audio
        kickMediaPlayer = MediaPlayer.create(this, R.raw.kick)
        val btnKick: ImageView = findViewById(R.id.btnKick)
        btnKick.setOnClickListener{
            kickMediaPlayer.seekTo(0)
            kickMediaPlayer.start()
        }

        snareMediaPlayer = MediaPlayer.create(this, R.raw.snare)
        val btnSnare: ImageView = findViewById(R.id.btnSnare)
        btnSnare.setOnClickListener{
            snareMediaPlayer.seekTo(0)
            snareMediaPlayer.start()
        }


        floorMediaPlayer = MediaPlayer.create(this, R.raw.floor)
        val btnFloor: ImageView = findViewById(R.id.btnFloor)
        btnFloor.setOnClickListener{
            floorMediaPlayer.seekTo(0)
            floorMediaPlayer.start()
        }


        tom1MediaPlayer = MediaPlayer.create(this, R.raw.tommid)
        val btnTom1: ImageView = findViewById(R.id.btnTom1)
        btnTom1.setOnClickListener{
            tom1MediaPlayer.seekTo(0)
            tom1MediaPlayer.start()
        }


        tom2MediaPlayer = MediaPlayer.create(this, R.raw.tomhard)
        val btnTom2: ImageView = findViewById(R.id.btnTom2)
        btnTom2.setOnClickListener{
            tom2MediaPlayer.seekTo(0)
            tom2MediaPlayer.start()
        }


        hithatMediaPlayer = MediaPlayer.create(this, R.raw.hat)
        val btnHitHat: ImageView = findViewById(R.id.btnHitHat)
        btnHitHat.setOnClickListener{
            hithatMediaPlayer.seekTo(0)
            hithatMediaPlayer.start()
        }


        crashMediaPlayer = MediaPlayer.create(this, R.raw.crash)
        val btnCrash: ImageView = findViewById(R.id.btnCrash)
        btnCrash.setOnClickListener{
            crashMediaPlayer.seekTo(0)
            crashMediaPlayer.start()
        }


        rideMediaPlayer = MediaPlayer.create(this, R.raw.ride)
        val btnRide: ImageView = findViewById(R.id.btnRide)
        btnRide.setOnClickListener{
            rideMediaPlayer.seekTo(0)
            rideMediaPlayer.start()
        }

        val btnExit: Button = findViewById(R.id.btnExit)
        btnExit.setOnClickListener {
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // Liberar los MediaPlayers al finalizar la actividad
        rideMediaPlayer.release()
    }
}