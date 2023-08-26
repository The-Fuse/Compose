package com.rohit.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500, showBackground = true)
@Composable
fun previewCards(){
    LazyColumn { 
        itemsIndexed(getCategoryList()){ index, item ->
            blogCategory(item)
            if (index != getCategoryList().size -1){
                Divider(
                    thickness = 2.dp,
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp,0.dp,8.dp,0.dp)
                        .shadow(elevation =1.dp, shape = RoundedCornerShape(100))
                )
            }
        }
    }

}

@Composable
fun blogCategory(category: Category) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = category.img),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
                    .padding(4.dp)
                    .weight(.2f)

            )
            itemDescription(category.title, category.subTitle,Modifier.weight(.8f))
        }
    }
}

@Composable
private fun itemDescription(title: String, subTitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = subTitle,
            fontWeight = FontWeight.Thin,
            style = MaterialTheme.typography.titleSmall,
            fontSize = 12.sp
        )
    }
}

data class Category(val img: Int, val title: String, val subTitle: String)

fun getCategoryList(): MutableList<Category> {
    return mutableListOf(
        Category(R.drawable.baseline_person_pin_24, "John Doe", "Software Developer"),
        Category(R.drawable.baseline_person_pin_24_yellow, "Smith Doe", "Python Developer"),
        Category(R.drawable.baseline_person_pin_24_red, "Will Jai", "Engineer Manager"),
        Category(R.drawable.baseline_person_pin_24_green, "Joe Henry", "React Developer"),
        Category(R.drawable.baseline_person_pin_24, "Kerry Pepper", "Node.js Developer"),
        Category(R.drawable.baseline_person_pin_24_red, "Noah Rest", "AI ML Expert"),
        Category(R.drawable.baseline_person_pin_24_yellow, "Son Jonas", "Software Developer"),
        Category(R.drawable.baseline_person_pin_24_yellow, "Smith Doe", "Python Developer"),
        Category(R.drawable.baseline_person_pin_24_red, "Will Jai", "Engineer Manager"),
        Category(R.drawable.baseline_person_pin_24_green, "Joe Henry", "React Developer"),
        Category(R.drawable.baseline_person_pin_24, "Kerry Pepper", "Node.js Developer"),
        Category(R.drawable.baseline_person_pin_24_red, "Noah Rest", "AI ML Expert"),
        Category(R.drawable.baseline_person_pin_24_yellow, "Son Jonas", "Software Developer"),
        Category(R.drawable.baseline_person_pin_24_yellow, "Smith Doe", "Python Developer"),
        Category(R.drawable.baseline_person_pin_24_red, "Will Jai", "Engineer Manager"),
        Category(R.drawable.baseline_person_pin_24_green, "Joe Henry", "React Developer")
    )
}

