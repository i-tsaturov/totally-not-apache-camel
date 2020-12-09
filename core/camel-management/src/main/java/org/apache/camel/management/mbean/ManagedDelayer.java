/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.management.mbean;

import org.apache.camel.CamelContext;
import org.apache.camel.Expression;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.api.management.mbean.ManagedDelayerMBean;
import org.apache.camel.builder.ExpressionBuilder;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.processor.Delayer;

@ManagedResource(description = "Managed Delayer")
public class ManagedDelayer extends ManagedProcessor implements ManagedDelayerMBean {
    private final Delayer delayer;

    public ManagedDelayer(CamelContext context, Delayer delayer, ProcessorDefinition<?> definition) {
        super(context, delayer, definition);
        this.delayer = delayer;
    }

    public Delayer getDelayer() {
        return delayer;
    }

    @Override
    public Long getDelay() {
        return delayer.getDelayValue();
    }

    @Override
    public void constantDelay(Integer millis) {
        Expression delay = ExpressionBuilder.constantExpression(millis);
        delayer.setDelay(delay);
    }

    @Override
    public int getDelayedCount() {
        return delayer.getDelayedCount();
    }

    @Override
    public Boolean isAsyncDelayed() {
        return delayer.isAsyncDelayed();
    }

    @Override
    public Boolean isCallerRunsWhenRejected() {
        return delayer.isCallerRunsWhenRejected();
    }

}
