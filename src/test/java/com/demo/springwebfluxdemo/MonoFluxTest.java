package com.demo.springwebfluxdemo;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {
    @Test
    public void TestMono(){
        Mono<String> monoString=Mono.just("Optum").log();
        monoString.subscribe(System.out::println);
    }
    @Test
    public void Testflux(){
        Flux<String> fluxString= Flux.just("Interns","Shreshtha","Akshara","Nikita","Mehak")
                .concatWithValues("Summer Interns","Duration : 2 months").log();
        fluxString.subscribe(System.out::println);

    }
}
