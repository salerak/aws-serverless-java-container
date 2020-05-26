/*
 * Copyright 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.serverless.sample.springboot.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@EnableWebMvc
public class PetsController {

  @RequestMapping(path = "/states/health", method = RequestMethod.GET)
  public String health() {
    return "Hello World";
  }

  @RequestMapping(path = "/states/{collectorNumber}", method = RequestMethod.GET)
  public String collectorNumber(@PathVariable("collectorNumber") String collectorNumber,
      @RequestParam("requestParamCollectorNumber") String requestParamCollectorNumber,
      @RequestHeader(name = "requestHeaderCollectorNumber")
          String requestHeaderCollectorNumber) {
    return "Hello World GET my collectorNumber from authorizer from Path Param is " + collectorNumber
        + " and my requestHeaderCollectorNumber " + requestHeaderCollectorNumber
        + " and my requestParamCollectorNumber " + requestParamCollectorNumber;
  }

  @RequestMapping(path = "/states/{collectorNumber}", method = RequestMethod.POST)
  public String postCollectorNumber(@PathVariable("PostCollectorNumber") String PostCollectorNumber,
      @RequestParam("requestPostParamCollectorNumber") String requestPostParamCollectorNumber,
      @RequestHeader(name = "requestPostHeaderCollectorNumber")
          String requestPostHeaderCollectorNumber) {
    return "Hello World POST my collectorNumber from authorizer from Path Param is " + PostCollectorNumber
        + " and my requestHeaderCollectorNumber " + requestPostHeaderCollectorNumber
        + " and my requestParamCollectorNumber " + requestPostParamCollectorNumber;
  }


}
