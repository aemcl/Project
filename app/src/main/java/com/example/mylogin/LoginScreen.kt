package com.example.mylogin

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(){

    var password by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    Column (

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter = painterResource(id = R.drawable.cc),
            contentDescription = "Logo" ,
            modifier = Modifier.size(200.dp)
        )

        Text(text = "Log in", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Text(text = "Log in your account")

        Spacer(modifier = Modifier.height(4.dp))


        OutlinedTextField(value = email, onValueChange = { email = it
        }, label = {
            Text(text = "Email")
        })

        OutlinedTextField(value = password, onValueChange = { password = it}, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential", "Email: $email Password: $password")
        }) {
            Text(text = "Log in")
        }
        Spacer(modifier = Modifier.height(25.dp))

        Text(text = "Forgot Password?", fontSize = 12.sp, modifier = Modifier.clickable {
        })

        Text(text = "Don't have an account? Sign Up", fontSize = 12.sp, modifier = Modifier.clickable {
        })

        Spacer(modifier = Modifier.height(25.dp))

        Text(text = "Or Sign in With", fontSize = 14.sp, fontWeight = FontWeight.Light)

        Spacer(modifier = Modifier.height(20.dp))

        Row (

        ) {
            Image(painter = painterResource(id = R.drawable.fb),
                contentDescription = "Facebook",
                modifier = Modifier.size(60.dp).clickable{
                    //code here
                }
            )

            Image(painter = painterResource(id = R.drawable.g),
                contentDescription = "Google",
                modifier = Modifier.size(60.dp).clickable{
                    //code here
                }
            )

            Image(painter = painterResource(id = R.drawable.x),
                contentDescription = "Twitter",
                modifier = Modifier.size(60.dp).clickable{
                    //code here
                }
            )
        }
    }
}