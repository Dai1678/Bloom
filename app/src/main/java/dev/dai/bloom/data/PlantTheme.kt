/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.dai.bloom.data

import androidx.annotation.DrawableRes
import dev.dai.bloom.R

data class PlantTheme(
    @DrawableRes val imageResId: Int,
    val name: String
)

val plantThemeList = listOf(
    PlantTheme(R.drawable.desert_chic, "Desert chic"),
    PlantTheme(R.drawable.tiny_terrariums, "Tiny terrariums"),
    PlantTheme(R.drawable.jungle_vibes, "Jungle vibes"),
    PlantTheme(R.drawable.easy_care, "Easy care"),
    PlantTheme(R.drawable.statements, "Statements")
)
