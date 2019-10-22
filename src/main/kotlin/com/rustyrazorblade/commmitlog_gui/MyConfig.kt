package com.rustyrazorblade.commmitlog_gui

import io.dropwizard.Configuration
import javax.validation.constraints.NotEmpty

data class MyConfig(val libraries: String? = null) : Configuration()