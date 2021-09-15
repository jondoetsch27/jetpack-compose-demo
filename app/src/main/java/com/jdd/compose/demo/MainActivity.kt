package com.jdd.compose.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jdd.compose.demo.ui.theme.JetpackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                Surface(color = MaterialTheme.colors.background) {
                    //MessageCard(message = Message(author = "Jetpack", body = "Compose"))
                    PlayerCard(
                        playerMessage = PlayerMessage(
                            playerFirstName = "Trevor",
                            playerLastName = "Lawrence",
                            playerNumber = "16"
                        )
                    )
                }
            }
        }
    }
}

data class PlayerMessage(
    val playerFirstName: String,
    val playerLastName: String,
    val playerNumber: String
)

@Composable
fun PlayerCard(playerMessage: PlayerMessage) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.trevor_lawrence_profile_picture),
            contentDescription = "Player Profile Picture"
        )
        Column {
            Text(text = playerMessage.playerFirstName)
            Text(text = playerMessage.playerLastName)
            Text(text = playerMessage.playerNumber)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeDemoTheme {
        PlayerCard(
            playerMessage = PlayerMessage(
                playerFirstName = "Trevor",
                playerLastName = "Lawrence",
                playerNumber = "16"
            )
        )
    }
}