package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1F)) {
            ComposableInfoCard(
                Color(0xFFEADDFF),
                stringResource(id = R.string.text_composable),
                stringResource(id = R.string.text_definition),
                modifier = Modifier.weight(1F)
            )
            ComposableInfoCard(
                Color(0xFFD0BCFF),
                stringResource(id = R.string.image_composable),
                stringResource(id = R.string.image_definition),
                modifier = Modifier.weight(1F)
            )
        }
        Row(Modifier.weight(1F)) {
            ComposableInfoCard(
                Color(0xFFB69DF8),
                stringResource(id = R.string.row_composable),
                stringResource(id = R.string.row_definition),
                modifier = Modifier.weight(1F)
            )
            ComposableInfoCard(
                Color(0xFFF6EDFF),
                stringResource(id = R.string.column_composable),
                stringResource(id = R.string.column_definition),
                modifier = Modifier.weight(1F)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(backgroundColor: Color, title: String, content: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}