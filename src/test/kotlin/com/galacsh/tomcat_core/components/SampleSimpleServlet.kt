package com.galacsh.tomcat_core.components

import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

class SampleSimpleServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        resp?.contentType = "text/plain;charset=UTF-8"
        resp?.writer?.print("Hello, world!")
    }
}
