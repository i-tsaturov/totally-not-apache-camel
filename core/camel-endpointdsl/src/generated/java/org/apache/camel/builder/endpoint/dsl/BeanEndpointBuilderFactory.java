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
package org.apache.camel.builder.endpoint.dsl;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.BeanScope;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The bean component is for invoking Java beans from Camel.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BeanEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Bean component.
     */
    public interface BeanEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedBeanEndpointBuilder advanced() {
            return (AdvancedBeanEndpointBuilder) this;
        }
        /**
         * Use scope option instead.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: common
         */
        @Deprecated
        default BeanEndpointBuilder cache(Boolean cache) {
            doSetProperty("cache", cache);
            return this;
        }
        /**
         * Use scope option instead.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: common
         */
        @Deprecated
        default BeanEndpointBuilder cache(String cache) {
            doSetProperty("cache", cache);
            return this;
        }
        /**
         * Sets the name of the method to invoke on the bean.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default BeanEndpointBuilder method(String method) {
            doSetProperty("method", method);
            return this;
        }
        /**
         * Scope of bean. When using singleton scope (default) the bean is
         * created or looked up only once and reused for the lifetime of the
         * endpoint. The bean should be thread-safe in case concurrent threads
         * is calling the bean at the same time. When using request scope the
         * bean is created or looked up once per request (exchange). This can be
         * used if you want to store state on a bean while processing a request
         * and you want to call the same bean instance multiple times while
         * processing the request. The bean does not have to be thread-safe as
         * the instance is only called from the same request. When using
         * prototype scope, then the bean will be looked up or created per call.
         * However in case of lookup then this is delegated to the bean registry
         * such as Spring or CDI (if in use), which depends on their
         * configuration can act as either singleton or prototype scope. so when
         * using prototype then this depends on the delegated registry.
         * 
         * The option is a: <code>org.apache.camel.BeanScope</code> type.
         * 
         * Default: Singleton
         * Group: common
         */
        default BeanEndpointBuilder scope(BeanScope scope) {
            doSetProperty("scope", scope);
            return this;
        }
        /**
         * Scope of bean. When using singleton scope (default) the bean is
         * created or looked up only once and reused for the lifetime of the
         * endpoint. The bean should be thread-safe in case concurrent threads
         * is calling the bean at the same time. When using request scope the
         * bean is created or looked up once per request (exchange). This can be
         * used if you want to store state on a bean while processing a request
         * and you want to call the same bean instance multiple times while
         * processing the request. The bean does not have to be thread-safe as
         * the instance is only called from the same request. When using
         * prototype scope, then the bean will be looked up or created per call.
         * However in case of lookup then this is delegated to the bean registry
         * such as Spring or CDI (if in use), which depends on their
         * configuration can act as either singleton or prototype scope. so when
         * using prototype then this depends on the delegated registry.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.BeanScope</code> type.
         * 
         * Default: Singleton
         * Group: common
         */
        default BeanEndpointBuilder scope(String scope) {
            doSetProperty("scope", scope);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BeanEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default BeanEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Bean component.
     */
    public interface AdvancedBeanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default BeanEndpointBuilder basic() {
            return (BeanEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Used for configuring additional properties on the bean.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedBeanEndpointBuilder parameters(
                Map<String, Object> parameters) {
            doSetProperty("parameters", parameters);
            return this;
        }
        /**
         * Used for configuring additional properties on the bean.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedBeanEndpointBuilder parameters(String parameters) {
            doSetProperty("parameters", parameters);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedBeanEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface BeanBuilders {
        /**
         * Bean (camel-bean)
         * The bean component is for invoking Java beans from Camel.
         * 
         * Category: core,java
         * Since: 1.0
         * Maven coordinates: org.apache.camel:camel-bean
         * 
         * Syntax: <code>bean:beanName</code>
         * 
         * Path parameter: beanName (required)
         * Sets the name of the bean to invoke
         */
        default BeanEndpointBuilder bean(String path) {
            return BeanEndpointBuilderFactory.bean(path);
        }
    }
    /**
     * Bean (camel-bean)
     * The bean component is for invoking Java beans from Camel.
     * 
     * Category: core,java
     * Since: 1.0
     * Maven coordinates: org.apache.camel:camel-bean
     * 
     * Syntax: <code>bean:beanName</code>
     * 
     * Path parameter: beanName (required)
     * Sets the name of the bean to invoke
     */
    static BeanEndpointBuilder bean(String path) {
        class BeanEndpointBuilderImpl extends AbstractEndpointBuilder implements BeanEndpointBuilder, AdvancedBeanEndpointBuilder {
            public BeanEndpointBuilderImpl(String path) {
                super("bean", path);
            }
        }
        return new BeanEndpointBuilderImpl(path);
    }
}