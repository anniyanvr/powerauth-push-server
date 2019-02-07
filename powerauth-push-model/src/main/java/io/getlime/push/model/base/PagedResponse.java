/*
 * Copyright 2016 Wultra s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getlime.push.model.base;

import io.getlime.core.rest.model.base.response.ObjectResponse;

/**
 * Generic response class for paged results
 *
 * @author Martin Tupy, martin.tupy.work@gmail.com
 */
public class PagedResponse<T> extends ObjectResponse<T> {

    private int page;
    private int size;

    public PagedResponse() {
        super();
    }

    public PagedResponse(T t) {
        super(t);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
