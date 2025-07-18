package com.example.githubrepoapi.githubApi;

public class GithubBranchResponseFromGit {
    private String name;
    private Commit commit;

    public  GithubBranchResponseFromGit(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public static class Commit{
        private String sha;

        public Commit(){}

        public Commit(String sha) {
            this.sha = sha;
        }

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }
    }

}
