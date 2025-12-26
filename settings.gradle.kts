pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StartAndroid_Compose"
include(":app")
include(":app:lesson1")
include(":app:lesson5")
include(":app:lesson6")
include(":app:lesson7")
include(":app:lesson8")
include(":app:lesson11")
include(":app:lesson12")
include(":app:lesson13")
include(":app:lesson14")
include(":app:lesson15")
include(":app:lesson16")
include(":app:lesson17")
include(":app:lesson18")
include(":app:lesson19")
include(":app:lesson20")
include(":app:lesson21")
include(":app:lesson22")
include(":app:lesson23")
