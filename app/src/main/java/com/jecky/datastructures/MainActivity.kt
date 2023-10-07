package com.jecky.datastructures

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jecky.datastructures.ui.theme.DataStructuresTheme
import com.jecky.datastructures.util.Sorting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DataStructuresTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Button(onClick = {
            Sorting.selectionSort(intArrayOf(10, 20, 30, 40))
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Selection Sort")
        }
        Button(onClick = {
            Sorting.bubbleSort(intArrayOf(10,5,9,23,15,1,43,29,87))
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Bubble Sort")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DataStructuresTheme {
        Greeting("Android")
    }
}