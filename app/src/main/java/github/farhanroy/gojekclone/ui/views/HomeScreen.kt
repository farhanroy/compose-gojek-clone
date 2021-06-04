package github.farhanroy.gojekclone.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.coil.rememberCoilPainter
import github.farhanroy.gojekclone.R
import github.farhanroy.gojekclone.data.ContentForYou
import github.farhanroy.gojekclone.data.DummyData
import github.farhanroy.gojekclone.ui.base.BaseChip
import github.farhanroy.gojekclone.ui.theme.Green500

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.padding(vertical = 16.dp, horizontal = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(32.dp)
                .height(8.dp)
                .background(color = Color.LightGray, shape = CircleShape)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(270.dp)
                    .background(color = Color(0xFFF5F5F5), shape = CircleShape)
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                Row {
                    Icon(Icons.Default.Search, contentDescription = null)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Cari", style = TextStyle(color = Color.Gray))
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = rememberCoilPainter(request = "https://reqres.in/img/faces/1-image.jpg"),
                contentDescription = null,
                modifier = Modifier
                    .size(49.dp)
                    .clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))
        HomeGopaySection()
        Spacer(modifier = Modifier.height(16.dp))
        HomeContentSection()
    }
}

@Composable
fun HomeGopaySection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        backgroundColor = Color(0xff0081a0)
    ){
        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Card(shape= RoundedCornerShape(10.dp)){
                Column(modifier = Modifier.padding(bottom = 8.dp, start = 12.dp, end = 12.dp)) {
                    Image(
                        modifier = Modifier
                            .width(100.dp)
                            .height(32.dp),
                        painter = painterResource(id = R.drawable.gopay_logo),
                        contentDescription = null,
                    )
                    Text("Rp.567.541", style = TextStyle(fontWeight = FontWeight.Bold))
                    Text("Klik & cek Riwayat", style = TextStyle(color = Green500))
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(id = R.drawable.ic_pay), contentDescription = null)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Bayar")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(id = R.drawable.ic_topup), contentDescription = null)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Top up")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Image(
                    painter = painterResource(id = R.drawable.ic_explore),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Bayar")
            }
        }
    }
}

@Composable
fun HomeContentSection() {
    val contents = remember { DummyData.listContent.filter { it.id > 0 } }

    Column( horizontalAlignment = Alignment.Start ) {
        Text(
            text = "Konten buat kamu",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            items(
                count = contents.size,
                itemContent = { index ->
                    BaseChip(selected = contents[index].id == 1, text = contents[index].type, modifier = Modifier.padding(8.dp))
                }
            )
        }
        LazyColumn {
            items(
                count = contents.size,
                itemContent = { index -> ContentListItem(contents[index])}
            )
        }
    }
}

@Composable
fun ContentListItem(content: ContentForYou) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = RoundedCornerShape(14.dp)
    ) {
        Column {
            Image(painter = rememberCoilPainter(request = content.imageUrl), contentDescription = null)
            Text(content.title, style = MaterialTheme.typography.h6, modifier = Modifier.padding(horizontal = 14.dp))
            Text(content.shortDesc, modifier = Modifier.padding(horizontal = 14.dp))
        }
    }
}

















