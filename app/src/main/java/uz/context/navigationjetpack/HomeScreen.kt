package uz.context.navigationjetpack

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = "1",
                color = MaterialTheme.colors.onBackground,
                fontSize = MaterialTheme.typography.h3.fontSize,
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(
                        route = Screen.Detail.passNameAndId(
                            id = 20,
                            name = "Samandar"
                        )
                    )
                },
                text = "Home",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navController = rememberNavController()
    )
}