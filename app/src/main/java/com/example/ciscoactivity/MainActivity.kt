package com.example.ciscoactivity

import androidx.appcompat.app.AppCompatActivity

        class MainActivity : AppCompatActivity {
            private lateinit var Motivational Quotes: Button
            private lateinit var Love Quotes: Button
            private lateinit var Favorite Quotes: Button

                    override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)
                        Motivational Quote = findViewById(R.id.Motivational Quote)
                        Love Quote = findViewById(R.id.Love Quote)
                        Favorite Quote = findViewById(R.id.Favorite Quote)

                        Motivational Quote.setOnClickListener {
                            startQuotesActivity("Motivational Quote")
                        }
                        Love Quote.setOnClickListener {
                            startQuotesActivity("Love Quote")
                        }
                        Favorite Quote.setOnClickListener{
                            startFavoritesActivity()
                        }

                        private fun startQuotesActivty(quoteType: String) {
                            val intent = Intent(this, QuotesActivity::class.java)
                            intent.putExtra("quoteType", quoteType)
                            startActivity(intent)
                        }

                        private fun startFavoritesActivity(){
                            val intent = Intent(this, FavoritesActivity::class.java)
                            startActivity(intent)
                        }
                    }

        }