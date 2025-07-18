package com.example.githubrepoapi.githubApi;

public class GithubReposiotryResponeFromGit {
    private String name;
    private boolean fork;
    private Owner owner;

    public GithubReposiotryResponeFromGit() {
    }

    public GithubReposiotryResponeFromGit(String name, boolean fork, Owner owner) {
        this.name = name;
        this.fork = fork;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }


    public boolean isFork() {
        return fork;
    }


    public Owner getOwner() {
        return owner;
    }


    public static class Owner {
        private String login;

        public Owner() {
        }

        public Owner(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

    }

}
