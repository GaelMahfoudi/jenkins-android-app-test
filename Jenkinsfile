node {
    stage 'JenkinsTest build process'
    def branchName = "${env.BRANCH_NAME}"
    def branchBuildNumber = "${env.BUILD_NUMBER}"
    build job: 'my-app/my-app-pipeline', parameters: [[$class: 'StringParameterValue', name: 'BRANCH', value: branchName], [$class: 'StringParameterValue', name: 'BUILDNUMBER', value: branchBuildNumber]]
}