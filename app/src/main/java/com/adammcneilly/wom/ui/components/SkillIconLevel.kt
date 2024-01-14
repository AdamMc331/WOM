package com.adammcneilly.wom.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.wom.R
import com.adammcneilly.wom.theme.WOMTheme
import com.adammcneilly.wom.ui.displaymodels.SkillDisplayModel

@Composable
fun SkillIconLevel(
    displayModel: SkillDisplayModel,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Image(
            painter = painterResource(id = displayModel.iconRes),
            contentDescription = displayModel.skillName,
            modifier = Modifier
                .size(24.dp),
        )

        Text(
            text = displayModel.level,
        )
    }
}

@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun SkillIconLevelPreview() {
    val displayModel = SkillDisplayModel(
        iconRes = R.drawable.ic_mining,
        level = "99",
        experience = "13,807,412",
        experienceToNext = null,
        rank = "7,630th",
        efficientHoursPlayed = "127.748",
        skillName = "Mining",
    )

    WOMTheme {
        Surface {
            SkillIconLevel(
                displayModel = displayModel,
                modifier = Modifier
                    .padding(8.dp),
            )
        }
    }
}
