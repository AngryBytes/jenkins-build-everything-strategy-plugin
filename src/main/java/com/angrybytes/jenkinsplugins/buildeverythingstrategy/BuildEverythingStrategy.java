package com.angrybytes.jenkinsplugins.buildeverythingstrategy;

import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;
import jenkins.branch.BranchBuildStrategy;
import jenkins.branch.BranchBuildStrategyDescriptor;
import jenkins.scm.api.SCMSource;
import jenkins.scm.api.SCMHead;

public class BuildEverythingStrategy extends BranchBuildStrategy {

    @DataBoundConstructor
    public BuildEverythingStrategy() {
    }

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
