# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.SliceCatalogApi;

import java.io.File;
import java.util.*;

public class SliceCatalogApiExample {

    public static void main(String[] args) {
        
        SliceCatalogApi apiInstance = new SliceCatalogApi();
        String xAuthToken = "xAuthToken_example"; // String | 
        try {
            apiInstance.nmsfSlicecatalogV1TemplatesGet(xAuthToken);
        } catch (ApiException e) {
            System.err.println("Exception when calling SliceCatalogApi#nmsfSlicecatalogV1TemplatesGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://nmsf/slicemanager/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SliceCatalogApi* | [**nmsfSlicecatalogV1TemplatesGet**](docs/SliceCatalogApi.md#nmsfSlicecatalogV1TemplatesGet) | **GET** /nmsf/slicecatalog/v1/templates | Query  Slice Template
*SliceManagerApi* | [**nmsfSlicemanagerV1SlicesBySliceIdDelete**](docs/SliceManagerApi.md#nmsfSlicemanagerV1SlicesBySliceIdDelete) | **DELETE** /nmsf/slicemanager/v1/slices/{sliceId} | Delete Slice
*SliceManagerApi* | [**nmsfSlicemanagerV1SlicesBySliceIdGet**](docs/SliceManagerApi.md#nmsfSlicemanagerV1SlicesBySliceIdGet) | **GET** /nmsf/slicemanager/v1/slices/{sliceId} | Get Slice
*SliceManagerApi* | [**nmsfSlicemanagerV1SlicesBySliceIdPut**](docs/SliceManagerApi.md#nmsfSlicemanagerV1SlicesBySliceIdPut) | **PUT** /nmsf/slicemanager/v1/slices/{sliceId} | Modify Slice
*SliceManagerApi* | [**nmsfSlicemanagerV1SlicesGet**](docs/SliceManagerApi.md#nmsfSlicemanagerV1SlicesGet) | **GET** /nmsf/slicemanager/v1/slices | List Slices
*SliceManagerApi* | [**nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet**](docs/SliceManagerApi.md#nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet) | **GET** /nmsf/slicemanager/v1/slices/{sliceId}/metrics/{metricName} | View Slice Metric
*SliceManagerApi* | [**nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet**](docs/SliceManagerApi.md#nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet) | **GET** /nmsf/slicemanager/v1/slices/{sliceId}/operations/{operationId} | View Slice Operations
*SliceManagerApi* | [**nmsfSlicemanagerV1SlicesPost**](docs/SliceManagerApi.md#nmsfSlicemanagerV1SlicesPost) | **POST** /nmsf/slicemanager/v1/slices | Create Slice
*SliceManagerApi* | [**restServicemanagerV1ServicesGet**](docs/SliceManagerApi.md#restServicemanagerV1ServicesGet) | **GET** /rest/servicemanager/v1/services | Query Slice
*SliceManagerApi* | [**slicesPost2**](docs/SliceManagerApi.md#slicesPost2) | **POST** /slices | Create Slice - Data Network Name


## Documentation for Models

 - [CreateSliceDataNetworkName](docs/CreateSliceDataNetworkName.md)
 - [ViewSliceMetric](docs/ViewSliceMetric.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### auth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



