package com.example.questtugaslayout.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun KartuProfil(
    nama: String,
    alamat: String,
    warnaCard: Color,
    warnaAlamat: Color,
    modifier: Modifier = Modifier,
    noHp: String? = null,
    fontNama: FontFamily = FontFamily.Default,
    bobotNama: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = dimensionResource(id = R.dimen.margin_card)),
        shape = RoundedCornerShape(dimensionResource(id = R.dimen.sudut_card)),
        colors = CardDefaults.cardColors(containerColor = warnaCard)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_isi_card)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(dimensionResource(id = R.dimen.ukuran_logo))
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(id = R.dimen.jarak_logo_teks))
            ) {
                Text(
                    text = nama,
                    color = colorResource(id = R.color.teks_putih),
                    fontSize = dimensionResource(id = R.dimen.font_nama).value.sp,
                    fontFamily = fontNama,
                    fontWeight = bobotNama
                )
                if (noHp != null) {
                    Text(
                        text = noHp,
                        color = colorResource(id = R.color.teks_cyan),
                        fontSize = dimensionResource(id = R.dimen.font_detail).value.sp
                    )
                }
                Text(
                    text = alamat,
                    color = warnaAlamat,
                    fontSize = dimensionResource(id = R.dimen.font_detail).value.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(dimensionResource(id = R.dimen.ukuran_logo))
            )
        }
    }
}
