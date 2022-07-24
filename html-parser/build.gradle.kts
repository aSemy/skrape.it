plugins {
    buildsrc.convention.`kotlin-jvm`
}

java {
    registerFeature("jsExecution") {
        usingSourceSet(sourceSets["main"])
    }
}

dependencies {
    implementation(projects.dsl)
    api(projects.fetcher.baseFetcher)
    api(Deps.jsoup)

    "jsExecutionImplementation"(projects.fetcher.browserFetcher)

    testImplementation(projects.testUtils)
}
