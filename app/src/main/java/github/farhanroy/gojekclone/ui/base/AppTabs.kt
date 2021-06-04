package github.farhanroy.gojekclone.ui.base

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import github.farhanroy.gojekclone.AppScreen
import github.farhanroy.gojekclone.ui.theme.Green700

@Composable
fun AppTabBar(
    modifier: Modifier = Modifier,
    children: @Composable (Modifier) -> Unit
) {
    Row(modifier) {
        children(
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
fun AppTabs(
    modifier: Modifier = Modifier,
    titles: List<String>,
    tabSelected: AppScreen,
    onTabSelected: (AppScreen) -> Unit
){
    TabRow(
        selectedTabIndex = tabSelected.ordinal,
        modifier = modifier,
        contentColor = MaterialTheme.colors.onSurface,
        indicator = {},
        divider = {}
    ) {
        titles.forEachIndexed { index, title ->
            var selected = index == tabSelected.ordinal
            Tab(
               selected = selected,
               onClick = { onTabSelected(AppScreen.values()[index]) }
            ) {
                Surface(
                    color = when {
                        selected -> Green700
                        else -> Color.Transparent
                    },
                    contentColor = Color.White,
                    shape = CircleShape
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 8.dp, horizontal = 10.dp)
                    ) {
                        when(index) {
                            0 -> Icon(Icons.Filled.ShoppingCart, contentDescription = null)
                            1 -> Icon(Icons.Filled.Home, contentDescription = null)
                            else -> Icon(Icons.Filled.Send, contentDescription = null)
                        }
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(title)
                    }
                }
            }
        }
    }
}