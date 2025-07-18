package com.example.githubrepoapi.githubApi;

import java.util.List;

public record ReadGithubRepositoryResponse(String repositoryName, String ownerLogin,
                                           List<ReadGithubBranchResponse> branches) {
}
