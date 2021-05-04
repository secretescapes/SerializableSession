grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolver = "maven"


grails.project.repos.seGrailsPlugins.username = "admin"
grails.project.repos.seGrailsPlugins.password = "<INSERT_API_KEY>"

grails.project.repos.seGrailsPlugins.url = "https://secretescapes.jfrog.io/artifactory/se-grails-plugins/"
grails.project.repos.default = "seGrailsPlugins"
grails.release.scm.enabled = false

grails.project.dependency.resolution = {
	inherits("global") {
	}

	log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()
		mavenCentral()
	}

	dependencies {
		build 'org.apache.httpcomponents:httpclient:4.0.3', {
			export = false
		}
	}

	plugins {
		build ":release:3.1.3", {
			export = false
		}
		build ':tomcat:7.0.55.3'
	}
}
