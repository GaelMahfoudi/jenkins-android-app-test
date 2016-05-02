
node {

    /**
     * Your app name
     */
    def APPNAME = "jean-guy"

    stage 'Build'

    /**
     * Get the name of the branch that triggered the build.
     */
    def branchName = "${env.BRANCH_NAME}"

    /**
     * Start the pipeline for this build.
     */
    build job: "${APPNAME}/${APPNAME}-pipeline", parameters: [[$class: 'StringParameterValue', name: 'BRANCH', value: branchName]]
}