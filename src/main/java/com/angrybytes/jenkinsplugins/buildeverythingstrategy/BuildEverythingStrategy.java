package com.angrybytes.jenkinsplugins.buildeverythingstrategy;

import hudson.Extension;
import jenkins.branch.BranchBuildStrategy;
import jenkins.branch.BranchBuildStrategyDescriptor;
import jenkins.scm.api.SCMSource;
import jenkins.scm.api.SCMHead;

public class BuildEverythingStrategy extends BranchBuildStrategy {

    @Override
    public boolean isAutomaticBuild(SCMSource source, SCMHead head) {
        return true;
    }

    @Extension
    public static class DescriptorImpl extends BranchBuildStrategyDescriptor {
        public String getDisplayName() {
             return "Build everything";
        }
    }

}
