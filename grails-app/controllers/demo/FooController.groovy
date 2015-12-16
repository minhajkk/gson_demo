package demo

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

class FooController {


    def index() {
        render (view: 'index', model: [foo:demo.Foo.findAll()])
    }

    def index2() {
        render (view: 'index2', model: [foo:demo.Foo.findAll()])
    }
}
