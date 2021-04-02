/*
 * Copyright 2021 cofe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tk.cofedream.example.multiple.proguard.entity;

/**
 * @author : cofe
 * @date : 2021-04-01
 */
public class Proguard {
    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public Proguard setName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Proguard setVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return "Proguard{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
