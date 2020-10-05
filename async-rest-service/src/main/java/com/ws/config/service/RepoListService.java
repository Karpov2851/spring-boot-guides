package com.ws.config.service;


import com.ws.config.dto.RepoListDto;
import org.springframework.util.concurrent.ListenableFuture;

public interface RepoListService {
    public ListenableFuture<RepoListDto> search(String query);
}
