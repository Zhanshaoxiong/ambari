/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.controller;

/**
 * Request for registry mpack resource type.
 */
public class RegistryMpackRequest {
  private Long registryId;
  private String mpackName;

  /**
   * Constructor
   * @param registryId  registry id
   * @param mpackName   management pack name
   */
  public RegistryMpackRequest(Long registryId, String mpackName) {
    this.registryId = registryId;
    this.mpackName = mpackName;
  }

  /**
   * Get registry id
   * @return
   */
  public Long getRegistryId() {
    return registryId;
  }

  /**
   * Get registry mpack
   * @return
   */
  public String getMpackName() {
    return mpackName;
  }
}
