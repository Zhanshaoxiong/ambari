/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.api.services.registry;

import org.apache.ambari.server.controller.ApiModel;
import org.apache.ambari.server.controller.RegistryMpackRequest;
import org.apache.ambari.server.controller.internal.RegistryMpackResourceProvider;

import io.swagger.annotations.ApiModelProperty;

@SuppressWarnings("unused") // for Swagger
public interface RegistryMpackRequestSwagger extends ApiModel {
  @ApiModelProperty(name = RegistryMpackResourceProvider.RESPONSE_KEY)
  RegistryMpackRequest getRegistryMpackRequest();
}
