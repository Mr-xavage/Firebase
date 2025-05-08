package com.example.firebasemvvm.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun Register_Screen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var lname by remember { mutableStateOf(TextFieldValue("")) }
    var fname by remember { mutableStateOf(TextFieldValue("")) }




    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFC1E3)) // Soft pink background 🌸
            .padding(16.dp)
    ) {
        Text(
            "Register Screen",
            color = Color(0xFF6A1B9A), // Deep purple
            fontSize = 35.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text(
                    "Enter email",
                    color = Color(0xFF6A1B9A),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFF3F8), RoundedCornerShape(12.dp)) // Light rose field
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text(
                    "Enter password",
                    color = Color(0xFF6A1B9A),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFF3F8), RoundedCornerShape(12.dp)) // Matching soft field
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = fname,
            onValueChange = { fname = it },
            label = {
                Text(
                    "Enter first name",
                    color = Color(0xFF6A1B9A),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFF3F8), RoundedCornerShape(12.dp)) // Matching soft field
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = lname,
            onValueChange = { lname = it },
            label = {
                Text(
                    "Enter last name",
                    color = Color(0xFF6A1B9A),
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFF3F8), RoundedCornerShape(12.dp)) // Matching soft field
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { /* TODO: Login */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFF3F6)), // Bright Mint Green 💚
            shape = RoundedCornerShape(40.dp),
            elevation = ButtonDefaults.buttonElevation(14.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(
                text = " Click to  Sign Up",
                color = Color.Blue,
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Medium
            )
        }
    }
}


@Preview
@Composable
private fun Registerprev() {
    Register_Screen(rememberNavController())
}