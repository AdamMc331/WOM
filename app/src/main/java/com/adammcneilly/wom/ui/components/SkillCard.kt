package com.adammcneilly.wom.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.wom.debug.debugSkillList
import com.adammcneilly.wom.models.Skill
import com.adammcneilly.wom.theme.WOMTheme
import com.adammcneilly.wom.ui.displaymodels.SkillDisplayModel
import com.adammcneilly.wom.ui.displaymodels.toDisplayModel

private const val SKILL_COLUMNS = 3

@Composable
fun SkillCard(
    skills: List<SkillDisplayModel>,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier,
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(SKILL_COLUMNS),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        ) {
            items(skills) { skill ->
                SkillIconLevel(
                    displayModel = skill,
                    modifier = Modifier
                        .padding(8.dp)
                        .wrapContentSize(),
                )
            }
        }
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
private fun SkillCardPreview() {
    val skills = debugSkillList().map(Skill::toDisplayModel)

    WOMTheme {
        SkillCard(
            skills = skills,
            modifier = Modifier
                .padding(16.dp),
        )
    }
}
