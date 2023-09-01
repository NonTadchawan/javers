package com.example.demojavers1.controller;

import com.example.demojavers1.domain.Store;
import com.example.demojavers1.jpa.StoreJpaRepo;
import org.javers.core.Javers;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.QueryBuilder;
import org.javers.spring.auditable.AuthorProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreControl {
    private final StoreJpaRepo repo;
    private final Javers javers;

    public StoreControl(StoreJpaRepo repo, Javers javers) {

        this.repo = repo;
        this.javers = javers;
    }

    @PostMapping
    public void save(@RequestBody Store store) {
        repo.save(store);
    }


    @GetMapping("/snapshots")
    public String getStoresSnapshots() {
        QueryBuilder jqlQuery = QueryBuilder.byClass(Store.class);
        List<CdoSnapshot> snapshots = javers.findSnapshots(jqlQuery.build());
        return javers.getJsonConverter().toJson(snapshots);
    }

    @Bean
    public AuthorProvider providerJaversAuthor() {
        return new SimpleAuthorProvider();
    }

    private static class SimpleAuthorProvider implements AuthorProvider {

        @Override
        public String provide() {
            return "test";
        }
    }

}
