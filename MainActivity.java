package com.example.android.videodemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    /*add audio and controls

    MediaPlayer mediaPlayer;
    AudioManager audioManager;

    public void play(View view) {

        mediaPlayer.start();

    }

    public void pause(View view) {

       mediaPlayer.pause();

    }
        */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        int maxVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        int currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.marbles);

        SeekBar volumeControl = (SeekBar) findViewById(R.id.volumeSeekBar);


        volumeControl.setMax(maxVolume);

        volumeControl.setProgress(currentVolume);

        volumeControl.setOnSeekBarChangeListener(new SeekBar, onSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar, seekBar, int i, boolean b) {

            Log.i("Seekbar changed", Integer.toString(i));

            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0);
        }

        @Override
        public void onStartTrackingTouch(SeekBar, seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }

        });

        SeekBar scrubSeekBar = (SeekBar) findViewById(R.id.scrubSeekBar);

        scrubSeekbar.setMax(mediaPlayer.getDuration());

        scrubSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            Log.i("Scrub seekbar moved", Integer.toString(i));

            mediaPlayer.seekTo(i);
            }

           @Override
           public void onStartTrackingTouch(SeekBar, seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

           new Timer().scheduleAtFixedRate(new TimerTask() {

           @Override
           public void run() {

           scrubSeekBar.setProgress(mediaPlayer.getCurrentPosition());

           }

           }, delay 0, period 300);
       }
         */

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();

    }
}
