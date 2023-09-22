package com.example.CISCOActivity

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ciscoactivity.R
import

        class QuotesActivity : AppCompatActivity(){
private lateinit var quoteTextView: TextView
private lateinit var saveButton: Button


                override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_love_quotes)

                      quoteTextView = findViewById(R.id.quoteTextView)
                        saveButton = findViewById(R.id.saveButton)

                        val quoteType = intent.getStringExtra("quoteType")

                        val quotes = when (quoteType) {
                                    "Love Quote" -> arrayOf( "I love you very much, probably more than anybody could love another person."
                                                             "Love is that condition in which the happiness of another person is essential to your own.”
                                                             "To love is to burn, to be on fire.”
                                                             "In the end we discover that to love and let go can be the same thing.”
                                                             "Pleasure of love lasts but a moment. Pain of love lasts a lifetime.”
                                                             "Love is so short, forgetting is so long.”
                                                             "Love is a thing that is full of cares and fears.”
                                                             "Love is not love until love’s vulnerable.”
                                                             "All our dreams can come true, if we have the courage to pursue them.”
                                                             "If people are doubting how far you can go, go so far that you can’t hear them anymore.”

                                    "Motivational Quote" -> arrayOf( "I wake up every morning and think to myself, ‘How far can I push this company in the next 24 hours.’”
                                                                     "It’s hard to beat a person who never gives up.”
                                                                     "The best time to plant a tree was 20 years ago. The second best time is now.”
                                                                     "Everything you can imagine is real.”
                                                                     "Whatever you are, be a good one.”
                                                                     "Happiness is not something ready made. It comes from your own actions.”
                                                                     "Do what you feel in your heart to be right―for you’ll be criticized anyway.”
                                                                     "It’s no use going back to yesterday, because I was a different person then.”
                                                                     "Do one thing every day that scares you.”
                                                                     "Impossible is just an opinion.”
                                                                 )
                                        else -> arrayOf()

                                        val randomIndex = Random







                            )

                        }                        }