/**
 * Copyright 2011-2020 GatlingCorp (http://gatling.io)
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.jenkins;

@SuppressWarnings("unused")
public class Statistics {

  private long total;
  private long ok;
  private long ko;

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public long getOK() {
    return ok;
  }

  public void setOK(long ok) {
    this.ok = ok;
  }

  public long getKO() {
    return ko;
  }

  public void setKO(long ko) {
    this.ko = ko;
  }
}
