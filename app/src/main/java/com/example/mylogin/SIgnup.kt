package com.example.mylogin

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Signup(){

    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var confirm_password by remember {
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

        Text(text = "Sign Up", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Text(text = "Create an Account")

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = username, onValueChange = {
            username = it
        }, label = {
            Text(text = "Username")
        })

        OutlinedTextField(value = email, onValueChange = { email = it
        }, label = {
            Text(text = "Email")
        })

        OutlinedTextField(value = password, onValueChange = { password = it}, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        OutlinedTextField(value = confirm_password, onValueChange = {confirm_password = it}, label = {
            Text(text = "Confirm Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential", "Email: $email Password: $password")
        }) {
            Text(text = "Sign up")
        }

        Text(text = "or", fontSize = 14.sp, fontWeight = FontWeight.Light)

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Sign in with Google")
        }

        Text(text = "Already have an account? Log in.", fontSize = 16.sp, modifier = Modifier.clickable {

        })



    }
}