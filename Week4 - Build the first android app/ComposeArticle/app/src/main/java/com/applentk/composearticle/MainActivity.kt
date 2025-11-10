package com.applentk.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applentk.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold { paddingValues ->
                    Article(
                        painter = painterResource(R.drawable.bg_compose_background),
                        title = stringResource(R.string.title),
                        description = stringResource(R.string.article),
                        article = stringResource(R.string.description),
                        modifier = Modifier
                            .padding(paddingValues)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(
    painter: Painter,
    title: String,
    description: String,
    article: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = article,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ArticlePreview() {
    Article(
        painter = painterResource(R.drawable.bg_compose_background),
        title = stringResource(R.string.title),
        description = stringResource(R.string.article),
        article = stringResource(R.string.description),
    )
}