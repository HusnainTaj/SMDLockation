package com.taj.lockation.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

const val TEST_BANNER_ID = "ca-app-pub-3940256099942544/6300978111";
const val ID_Main_Activity_Top = "ca-app-pub-2232411680637613/3937204640";
const val ID_Locked_Screen_Bottom_Large_Banner = "ca-app-pub-2232411680637613/1395597942";

@Composable
fun AdvertView(modifier: Modifier = Modifier, unitId:String, size:AdSize) {

	val testing = false;

	val isInEditMode = LocalInspectionMode.current
	if (isInEditMode)
	{
		Text(
			modifier = modifier
				.fillMaxWidth()
				.background(Color.Red)
				.padding(horizontal = 2.dp, vertical = 6.dp),
			textAlign = TextAlign.Center,
			color = Color.White,
			text = "Advert Here",
		)
	} else {
		AndroidView(
			modifier = modifier.fillMaxWidth(),
			factory = { context ->
				AdView(context).apply {
					setAdSize(size)
					adUnitId = if(testing) TEST_BANNER_ID else unitId
					loadAd(AdRequest.Builder().build())
				}
			}
		)
	}
}