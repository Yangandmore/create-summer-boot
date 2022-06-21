package com.github.yangandmore.createsummerboot.services

import com.intellij.openapi.project.Project
import com.github.yangandmore.createsummerboot.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
