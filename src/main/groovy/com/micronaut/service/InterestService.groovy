package com.micronaut.service

import groovy.transform.CompileStatic
import io.micronaut.context.annotation.Value
import javax.inject.Singleton

@Singleton
@CompileStatic
class InterestService {
    @Value('${interestService.message: This is getMethodName from InterestService.}')
    String message

    String getMethodName() {
        return message
    }
}
