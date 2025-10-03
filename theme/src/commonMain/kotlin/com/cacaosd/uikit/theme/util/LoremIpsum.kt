package com.cacaosd.uikit.theme.util

class LoremIpsum(private val words: Int) {
    val values: Sequence<String> =
        """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
            Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.
        """.trimIndent()
            .split(" ")
            .asSequence()


}