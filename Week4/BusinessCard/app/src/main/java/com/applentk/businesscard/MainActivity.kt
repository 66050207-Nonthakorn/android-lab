package com.applentk.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applentk.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface {
                    BusinessCard(
                        fullName = "Nonthakorn",
                        title = "ไม่บอกอิอิ",
                        tel = "+11 (123) 444 555 6666",
                        account = "@AndroidDev",
                        email = "jen.doe@android.com"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    fullName: String,
    title: String,
    tel: String,
    account: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .background(color = Color(0xFFd2e8d4))
            .then(modifier)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .size(148.dp)
                    .background(color = Color(0xFF073042))
                    .padding(all = 12.dp)
            )
            Text(
                text = fullName,
                fontSize = 48.sp,
                lineHeight = 56.sp,
                fontWeight = FontWeight.W300,
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 12.dp)
            )
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF0b703d)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 48.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_phone_24),
                        contentDescription = null,
                        tint = Color(0xFF0b703d),
                        modifier = Modifier
                            .padding(end = 16.dp)
                    )
                    Text(
                        text = tel,
                        color = Color(0xFF000000),
                        fontSize = 14.sp
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_share_24),
                        contentDescription = null,
                        tint = Color(0xFF0b703d),
                        modifier = Modifier
                            .padding(end = 16.dp)
                    )
                    Text(
                        text = account,
                        color = Color(0xFF000000),
                        fontSize = 14.sp
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_email_24),
                        contentDescription = null,
                        tint = Color(0xFF0b703d),
                        modifier = Modifier
                            .padding(end = 16.dp)
                    )
                    Text(
                        text = email,
                        color = Color(0xFF000000),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard(
            fullName = "John Doe",
            title = "Title",
            tel = "+11 (123) 444 555 6666",
            account = "@AndroidDev",
            email = "jen.doe@android.com"
        )
    }
}