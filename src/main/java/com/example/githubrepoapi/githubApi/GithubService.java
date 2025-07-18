package com.example.githubrepoapi.githubApi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GithubService {
    private final GithubClient githubClient;

    public GithubService(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    public List<ReadGithubRepositoryResponse> getRepository(String username) {

        List<GithubReposiotryResponeFromGit> githubRepository = githubClient.getUserRepo(username);
        List<ReadGithubRepositoryResponse> result = new ArrayList<>();

        for (GithubReposiotryResponeFromGit repo : githubRepository) {
            if (repo.isFork()) {
                continue;
            }

            List<GithubBranchResponseFromGit> gitBranches = githubClient.getBranch(repo.getOwner().getLogin(), repo.getName());
            List<ReadGithubBranchResponse> branches = new ArrayList<>();

            for (GithubBranchResponseFromGit branch : gitBranches) {
                branches.add(new ReadGithubBranchResponse(
                        branch.getName(),
                        branch.getCommit().getSha()
                ));
            }
            ReadGithubRepositoryResponse response = new ReadGithubRepositoryResponse(
                    repo.getName(),
                    repo.getOwner().getLogin(),
                    branches
            );
            result.add(response);
        }
        return result;

        }
    }

