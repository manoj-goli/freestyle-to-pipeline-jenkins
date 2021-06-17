job('seed-external-job') {
  scm {
      git('https://github.com/manoj-goli/freestyle-to-pipeline-jenkins.git')
  }
  steps {
    dsl {
      external('seed-hello-world-external/hello_world_external.groovy')
    }
  }
}
