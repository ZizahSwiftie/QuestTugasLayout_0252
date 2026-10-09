package com.example.questtugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TugasLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_atas_layar)))
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = dimensionResource(id = R.dimen.font_judul).value.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = dimensionResource(id = R.dimen.font_subjudul).value.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spasi_judul)))
        KartuProfil(
            nama = stringResource(id = R.string.nama_2),
            alamat = stringResource(id = R.string.alamat_2),
            warnaCard = colorResource(id = R.color.card_ungu),
            warnaAlamat = colorResource(id = R.color.teks_kuning),
            noHp = stringResource(id = R.string.no_hp)
        )
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spasi_antar_card)))
        KartuProfil(
            nama = stringResource(id = R.string.nama_3),
            alamat = stringResource(id = R.string.alamat_3),
            warnaCard = colorResource(id = R.color.card_biru),
            warnaAlamat = colorResource(id = R.color.teks_putih),
            noHp = stringResource(id = R.string.no_hp)
        )
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spasi_antar_card)))
        KartuProfil(
            nama = stringResource(id = R.string.nama_4),
            alamat = stringResource(id = R.string.alamat_4),
            warnaCard = colorResource(id = R.color.card_hijau),
            warnaAlamat = colorResource(id = R.color.teks_putih),
            noHp = stringResource(id = R.string.no_hp)
        )

        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = stringResource(id = R.string.copyright),
            color = colorResource(id = R.color.teks_hitam),
            fontSize = dimensionResource(id = R.dimen.font_footer).value.sp,
            modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_footer))
        )
    }
}
