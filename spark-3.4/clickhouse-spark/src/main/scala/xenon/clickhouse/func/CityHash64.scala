/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xenon.clickhouse.func

import xenon.clickhouse.hash

object CityHash64 extends MultiStringArgsHash {
  // https://github.com/ClickHouse/ClickHouse/blob/v23.5.3.24-stable/src/Functions/FunctionsHashing.h#L694

  override protected def funcName: String = "clickhouse_cityHash64"
  override val ckFuncNames: Array[String] = Array("cityHash64")

  override def applyHash(input: Array[Any]): Long = hash.CityHash64(input)
}
