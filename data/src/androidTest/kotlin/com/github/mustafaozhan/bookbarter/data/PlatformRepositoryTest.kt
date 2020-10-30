/*
 * Copyright (c) 2020 Mustafa Ozhan. All rights reserved.
 */

package com.github.mustafaozhan.bookbarter.data

import com.github.mustafaozhan.bookbarter.data.di.RepositoryInjector
import org.junit.Assert.assertTrue
import org.junit.Test

class PlatformRepositoryTest {

    private val platformRepository = RepositoryInjector.platformRepository()

    @Test
    fun testExample() {
        assertTrue(
            "Check Android is mentioned",
            platformRepository.platform.name.contains("Android")
        )
    }
}
