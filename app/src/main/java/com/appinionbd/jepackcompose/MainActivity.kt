package com.appinionbd.jepackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appinionbd.jepackcompose.ui.MyClass
import com.appinionbd.jepackcompose.ui.theme.JepackComposeTheme

class MainActivity : ComponentActivity() {
    lateinit var myInterface: Interface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JepackComposeTheme {
                myApp()
            }
        }

        MyClass(myInterface)
        Log.e("interface", myInterface.add())
        val list:List<String> = ArrayList()
    }


}

@Composable
private fun myApp(names: List<String> = listOf("world", "compose")) {
    Column(modifier = Modifier.padding(4.dp)) {
        for (name in names) {
            Greeting(name)
        }
    }

}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello \n$name")
            }
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text("See more")
            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    JepackComposeTheme {
        myApp()
    }
}