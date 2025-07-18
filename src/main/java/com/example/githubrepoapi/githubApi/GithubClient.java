package com.example.githubrepoapi.githubApi;

import com.example.githubrepoapi.common.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class GithubClient {

    private final RestTemplate restTemplate;

    public GithubClient(){
        this.restTemplate = new RestTemplate();
        this.restTemplate.getInterceptors().add((request, body, execution) -> {
            request.getHeaders().add(HttpHeaders.USER_AGENT, "MyApp");
            return execution.execute(request, body);
        });
    }

    public List<GithubReposiotryResponeFromGit> getUserRepo(String username) {
        try {
            ResponseEntity<GithubReposiotryResponeFromGit[]> response = restTemplate.getForEntity(
                    "https://api.github.com/users/{username}/repos", GithubReposiotryResponeFromGit[].class,
                    username
            );
            return Arrays.asList(Objects.requireNonNull(response.getBody()));
        }catch (HttpClientErrorException.NotFound e){
            throw new UserNotFoundException("Github user not found: " + username);
        }
    }
    public List<GithubBranchResponseFromGit> getBranch(String user, String repo){
        ResponseEntity<GithubBranchResponseFromGit[]> response = restTemplate.getForEntity(
                "https://api.github.com/repos/{user}/{repo}/branches",
                GithubBranchResponseFromGit[].class,
                user,
                repo
        );
        return Arrays.asList(Objects.requireNonNull(response.getBody()));
    }
    }

