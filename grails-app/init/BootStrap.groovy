class BootStrap {

    def init = { servletContext ->
    	new demo.Foo(field1: "Foo", field2: "Bar").save()
    }
    def destroy = {
    }
}
