node {
    def BRANCH = "${env.BRANCH_NAME}"
    def BUILDNUMBER = "${env.BUILD_NUMBER}"

    sh "mkdir -p ../../common-workspace-$BRANCH-$BUILDNUMBER"
    sh "cp -r * ../../common-workspace-$BRANCH-$BUILDNUMBER/"
}