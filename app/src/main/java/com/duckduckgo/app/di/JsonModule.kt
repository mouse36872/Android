/*
 * Copyright (c) 2017 DuckDuckGo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duckduckgo.app.di

import com.duckduckgo.app.httpsupgrade.api.HttpsWhitelistJsonAdapter
import com.duckduckgo.app.privacy.api.TermsOfServiceListAdapter
import com.duckduckgo.app.trackerdetection.api.TdsJsonAdapter
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class JsonModule {

    @Provides
    @Singleton
    fun moshi(): Moshi = Moshi.Builder()
        .add(TdsJsonAdapter())
        .add(HttpsWhitelistJsonAdapter())
        .add(TermsOfServiceListAdapter())
        .build()
}