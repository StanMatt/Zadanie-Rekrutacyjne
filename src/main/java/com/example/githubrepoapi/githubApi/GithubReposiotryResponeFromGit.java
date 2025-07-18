package com.example.githubrepoapi.githubApi;

public class GithubReposiotryResponeFromGit {
    private String name;
    private boolean fork;
    private Owner owner;

    public GithubReposiotryResponeFromGit(){}

    public GithubReposiotryResponeFromGit(String name, boolean fork, Owner owner) {
        this.name = name;
        this.fork = fork;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public static class Owner {
        private String login;

        public Owner(){}

        public Owner(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }
    }

}
