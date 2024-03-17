package com.chaochao.playground.Controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping


@RestController
class Controller {

    @GetMapping
    String get() {
        "fHello "
    }

}