package com.rohit.compose

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rohit.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            previewCards()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun preview() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        listViewItem(R.drawable.ic_launcher_foreground, "John Doe", "Software Developer")
        listViewItem(R.drawable.ic_launcher_foreground, "Rohit Kumar", "Manager")
        listViewItem(R.drawable.ic_launcher_foreground, "Mathew Wood", "Java Developer")
        listViewItem(R.drawable.ic_launcher_foreground, "Karl Marx", "Python Developer")
    }
}

@Composable
fun listViewItem(imgId: Int, name: String, occupation: String) {
    Row(Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(imgId),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
                .border(2.dp,Color.Gray, CircleShape)
                .padding(5.dp)
        )
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp,
                modifier = Modifier.padding(5.dp,0.dp)
            )
        }
    }
}


