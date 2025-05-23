package com.example.firebasemvvm.navigation



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasemvvm.ui.theme.screens.login.Login_Screen
import com.example.firebasemvvm.ui.theme.screens.products.AddProductsScreen
import com.example.firebasemvvm.ui.theme.screens.products.UpdateProductsScreen
import com.example.firebasemvvm.ui.theme.screens.products.ViewProductsScreen
import com.example.firebasemvvm.ui.theme.screens.products.ViewUploadsScreen
import com.example.firebasemvvm.ui.theme.screens.register.Register_Screen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController,
        modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            Login_Screen(navController)
        }
        composable(ROUTE_REGISTER){
            Register_Screen(navController)
        }
        composable(ROUTE_HOME){
            Register_Screen(navController)
        }


        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }

    }

}