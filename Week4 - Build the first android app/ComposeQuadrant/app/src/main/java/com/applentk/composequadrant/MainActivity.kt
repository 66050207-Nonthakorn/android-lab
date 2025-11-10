package com.applentk.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.applentk.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface {
                    ComposeQuadrant(
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(weight = 1f)
                    .background(color = Color(0xFFEADDFF))
                    .padding(all = 16.dp)
            )
            ComposableInfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(weight = 1f)
                    .background(color = Color(0xFFD0BCFF))
                    .padding(all = 16.dp)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(weight = 1f)
                    .background(color = Color(0xFFB69DF8))
                    .padding(all = 16.dp)
            )
            ComposableInfoCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFF6EDFF))
                    .padding(all = 16.dp)
            )
        }
    }
}

@Composable
fun ComposableInfoCard(title: String, description: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ComposeQuadrantPreview() {
    ComposeQuadrant(
        modifier = Modifier.fillMaxSize())
}

@Composable
@Preview(showBackground = true)
fun ComposableInfoCardPreview() {
    ComposableInfoCard(
        title = "Title",
        description = "description"
    )
}