package com.example.firebasemvvm.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasemvvm.navigation.ROUTE_ADD_PRODUCT
import com.example.firebasemvvm.navigation.ROUTE_VIEW_PRODUCT
import com.example.firebasemvvm.navigation.ROUTE_VIEW_UPLOAD
import com.example.firebasemvvm.ui.theme.CrimsonRed
import com.example.firebasemvvm.ui.theme.DeepBlue
import com.example.firebasemvvm.ui.theme.Jose
import com.example.firebasemvvm.ui.theme.LightCoral
import com.example.firebasemvvm.ui.theme.PaleOrange
import com.example.firebasemvvm.ui.theme.Pink80
import com.example.firebasemvvm.ui.theme.Tomato
import com.example.firebasemvvm.ui.theme.green


@Composable
fun Home_Screen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(green, Jose)
                )
            )
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Welcome Text
            Text(
                text = "Welcome to Home Page",
                color = CrimsonRed,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                modifier = Modifier.padding(bottom = 32.dp)
            )

            // Add Product Button
            ActionCard(
                title = "Add Product",
                description = "Add new products to your inventory.",
                backgroundColor = LightCoral,
                onClick = { navController.navigate(ROUTE_ADD_PRODUCT) }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // View Product Button
            ActionCard(
                title = "View Product",
                description = "Browse and manage your products.",
                backgroundColor = DeepBlue,
                onClick = { navController.navigate(ROUTE_VIEW_PRODUCT) }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Upload Products Button
            ActionCard(
                title = "Upload Products",
                description = "Upload product details to the cloud.",
                backgroundColor = Tomato,
                onClick = { navController.navigate(ROUTE_VIEW_UPLOAD) }
            )
        }
    }
}

@Composable
fun ActionCard(
    title: String,
    description: String,
    backgroundColor: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(8.dp, RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = description,
                color = Color.White.copy(alpha = 0.8f),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = onClick,
                modifier = Modifier.align(Alignment.End),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(
                    text = "Go",
                    color = backgroundColor,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}



@Preview
@Composable
private fun Homeprev() {
    Home_Screen(rememberNavController())
}