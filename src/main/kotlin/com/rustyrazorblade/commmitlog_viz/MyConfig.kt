package com.rustyrazorblade.commmitlog_gui

import io.dropwizard.Configuration
import javax.validation.constraints.NotEmpty

data class MyConfig(val commitLogs: String? = null) : Configuration()