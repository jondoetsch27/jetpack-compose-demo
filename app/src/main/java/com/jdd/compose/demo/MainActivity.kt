package com.jdd.compose.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jdd.compose.demo.ui.theme.JetpackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                Surface(color = MaterialTheme.colors.background) {
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
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.trevor_lawrence_profile_picture),
            contentDescription = "Player Profile Picture",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(3.dp, MaterialTheme.colors.secondary, CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = playerMessage.playerFirstName,
                color = MaterialTheme.colors.secondaryVariant,
                fontSize = 16.sp
            )
            Text(
                text = playerMessage.playerLastName,
                color = MaterialTheme.colors.secondaryVariant,
                fontSize = 16.sp
            )
            Text(
                text = playerMessage.playerNumber,
                color = MaterialTheme.colors.secondaryVariant,
                fontSize = 16.sp
            )
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