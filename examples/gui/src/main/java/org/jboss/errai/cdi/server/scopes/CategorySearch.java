/*
 * Copyright 2009 JBoss, a divison Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.errai.cdi.server.scopes;

import com.google.inject.servlet.RequestScoped;
import org.jboss.errai.bus.server.annotations.Service;
import org.jboss.errai.cdi.client.scopes.Categories;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Heiko Braun <hbraun@redhat.com>
 * @date: Sep 10, 2010
 */
@RequestScoped
@Service
public class CategorySearch implements Categories {

    List<String> values = new ArrayList<String>();

    public CategorySearch() {
        this.values.add("Movies");
        this.values.add("Books");
        this.values.add("Games");
    }

    public List<String> getAllCategories() {
        return values;
    }
}

