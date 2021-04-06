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

package tk.cofedream.example.springboot.parent.proguard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Objects;

/**
 * @author : zhengrf
 * @date : 2021-04-06
 */
@SpringBootApplication
public class HelloProguardApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloProguardApplication.class)
                .beanNameGenerator((definition, registry) -> Objects.requireNonNull(definition.getBeanClassName()))
                .run(args);
    }
}
