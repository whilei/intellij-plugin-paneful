package com.github.whilei.intellijpluginpaneful.services

import com.intellij.openapi.project.Project
import com.github.whilei.intellijpluginpaneful.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
