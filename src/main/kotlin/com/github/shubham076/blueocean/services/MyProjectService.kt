package com.github.shubham076.blueocean.services

import com.intellij.openapi.project.Project
import com.github.shubham076.blueocean.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
