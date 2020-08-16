package org.example

import tornadofx.*

class MyView : View("My View") {
    override val root = stackpane {
        label {
            text = "Test"
        }
    }
}
