# KotlinBasicFragment


        btnFragment1.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, firstFragment).
                    addToBackStack(null).
                commit()
            }
        }

        btnFragment2.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, secondFragment).
                    addToBackStack(null).
                commit()
            }

        }


![image](https://user-images.githubusercontent.com/39657409/114811715-43b8b600-9dcc-11eb-9ce0-b5a4b0b1a9d3.png)
