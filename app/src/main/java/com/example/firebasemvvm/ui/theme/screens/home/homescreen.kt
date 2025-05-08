package com.example.firebasemvvm.ui.theme.screens.home

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasemvvm.navigation.ROUTE_LOGIN
import com.example.firebasemvvm.navigation.ROUTE_REGISTER


@Composable
fun Home_Screen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFFE5EC), // Soft Pink
                        Color(0xFFFFF1F3), // Cotton White
                        Color(0xFFE0FFFF), // Ice Blue
                        Color(0xFFFFF9C4)  // Soft Lemon
                    )
                )
            )
            .padding(24.dp)
    ) {
        Text(
            text = "✨ TOP WHEELS ✨",
            color = Color(0xFFEC407A), // Sweet Pink
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "🏟️ Welcome to Top Wheels  💙",
            color = Color(0xFF9575CD), // Lilac Purple
            fontSize = 24.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { navController.navigate(ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF98FF98)), // Mint Green
            shape = RoundedCornerShape(40.dp),
            elevation = ButtonDefaults.buttonElevation(14.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(
                text = "🔐 Sparkly Login",
                color = Color(0xFF004D40), // Deep Teal Text
                fontSize = 22.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate(ROUTE_REGISTER) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC1E3)), // Soft Candy Pink
            shape = RoundedCornerShape(40.dp),
            elevation = ButtonDefaults.buttonElevation(14.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(
                text = "📝 Register Now!",
                color = Color(0xFF6A1B9A), // Fun Purple Text
                fontSize = 22.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            )
        }

        }


    }




@Preview
@Composable
private fun Homeprev() {
    Home_Screen(rememberNavController())
}