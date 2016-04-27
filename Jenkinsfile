node {
    stage 'Ultimate try !'
    sh 'cd ..'
    sh 'pwd'
    def branchName = "${env.BRANCH_NAME}"
    build job: 'my-app/my-app-pipeline', parameters: [[$class: 'StringParameterValue', name: 'BRANCH', value: branchName]]

}