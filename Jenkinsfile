node {
    stage 'Ultimate try !'
    def branchName = "${env.BRANCH_NAME}"
    build job: 'my-app/my-app-pipeline', parameters: [[$class: 'StringParameterValue', name: 'BRANCH', value: branchName]]

}