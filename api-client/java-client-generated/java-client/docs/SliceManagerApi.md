# SliceManagerApi

All URIs are relative to *http://nmsf/slicemanager/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nmsfSlicemanagerV1SlicesBySliceIdDelete**](SliceManagerApi.md#nmsfSlicemanagerV1SlicesBySliceIdDelete) | **DELETE** /nmsf/slicemanager/v1/slices/{sliceId} | Delete Slice
[**nmsfSlicemanagerV1SlicesBySliceIdGet**](SliceManagerApi.md#nmsfSlicemanagerV1SlicesBySliceIdGet) | **GET** /nmsf/slicemanager/v1/slices/{sliceId} | Get Slice
[**nmsfSlicemanagerV1SlicesBySliceIdPut**](SliceManagerApi.md#nmsfSlicemanagerV1SlicesBySliceIdPut) | **PUT** /nmsf/slicemanager/v1/slices/{sliceId} | Modify Slice
[**nmsfSlicemanagerV1SlicesGet**](SliceManagerApi.md#nmsfSlicemanagerV1SlicesGet) | **GET** /nmsf/slicemanager/v1/slices | List Slices
[**nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet**](SliceManagerApi.md#nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet) | **GET** /nmsf/slicemanager/v1/slices/{sliceId}/metrics/{metricName} | View Slice Metric
[**nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet**](SliceManagerApi.md#nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet) | **GET** /nmsf/slicemanager/v1/slices/{sliceId}/operations/{operationId} | View Slice Operations
[**nmsfSlicemanagerV1SlicesPost**](SliceManagerApi.md#nmsfSlicemanagerV1SlicesPost) | **POST** /nmsf/slicemanager/v1/slices | Create Slice
[**restServicemanagerV1ServicesGet**](SliceManagerApi.md#restServicemanagerV1ServicesGet) | **GET** /rest/servicemanager/v1/services | Query Slice
[**slicesPost2**](SliceManagerApi.md#slicesPost2) | **POST** /slices | Create Slice - Data Network Name


<a name="nmsfSlicemanagerV1SlicesBySliceIdDelete"></a>
# **nmsfSlicemanagerV1SlicesBySliceIdDelete**
> nmsfSlicemanagerV1SlicesBySliceIdDelete(accept, contentType, authorization, sliceId)

Delete Slice

List the slices under the current tenant

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SliceManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

SliceManagerApi apiInstance = new SliceManagerApi();
String accept = "accept_example"; // String | 
String contentType = "contentType_example"; // String | 
String authorization = "authorization_example"; // String | 
String sliceId = "sliceId_example"; // String | 
try {
    apiInstance.nmsfSlicemanagerV1SlicesBySliceIdDelete(accept, contentType, authorization, sliceId);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#nmsfSlicemanagerV1SlicesBySliceIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  |
 **contentType** | **String**|  |
 **authorization** | **String**|  |
 **sliceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nmsfSlicemanagerV1SlicesBySliceIdGet"></a>
# **nmsfSlicemanagerV1SlicesBySliceIdGet**
> nmsfSlicemanagerV1SlicesBySliceIdGet(xAuthToken, sliceId)

Get Slice



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SliceManagerApi;


SliceManagerApi apiInstance = new SliceManagerApi();
String xAuthToken = "xAuthToken_example"; // String | 
String sliceId = "sliceId_example"; // String | 
try {
    apiInstance.nmsfSlicemanagerV1SlicesBySliceIdGet(xAuthToken, sliceId);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#nmsfSlicemanagerV1SlicesBySliceIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthToken** | **String**|  |
 **sliceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nmsfSlicemanagerV1SlicesBySliceIdPut"></a>
# **nmsfSlicemanagerV1SlicesBySliceIdPut**
> nmsfSlicemanagerV1SlicesBySliceIdPut(accept, contentType, authorization, sliceId)

Modify Slice

List the slices under the current tenant

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SliceManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

SliceManagerApi apiInstance = new SliceManagerApi();
String accept = "accept_example"; // String | 
String contentType = "contentType_example"; // String | 
String authorization = "authorization_example"; // String | 
String sliceId = "sliceId_example"; // String | 
try {
    apiInstance.nmsfSlicemanagerV1SlicesBySliceIdPut(accept, contentType, authorization, sliceId);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#nmsfSlicemanagerV1SlicesBySliceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  |
 **contentType** | **String**|  |
 **authorization** | **String**|  |
 **sliceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nmsfSlicemanagerV1SlicesGet"></a>
# **nmsfSlicemanagerV1SlicesGet**
> nmsfSlicemanagerV1SlicesGet(startIndex, accept, contentType, authorization)

List Slices

List the slices under the current tenant

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SliceManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: auth
HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
auth.setUsername("YOUR USERNAME");
auth.setPassword("YOUR PASSWORD");

SliceManagerApi apiInstance = new SliceManagerApi();
String startIndex = "startIndex_example"; // String | 
String accept = "accept_example"; // String | 
String contentType = "contentType_example"; // String | 
String authorization = "authorization_example"; // String | 
try {
    apiInstance.nmsfSlicemanagerV1SlicesGet(startIndex, accept, contentType, authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#nmsfSlicemanagerV1SlicesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startIndex** | **String**|  |
 **accept** | **String**|  |
 **contentType** | **String**|  |
 **authorization** | **String**|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet"></a>
# **nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet**
> ViewSliceMetric nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet(xAuthToken, sliceId, metricName)

View Slice Metric



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SliceManagerApi;


SliceManagerApi apiInstance = new SliceManagerApi();
String xAuthToken = "xAuthToken_example"; // String | 
String sliceId = "sliceId_example"; // String | 
String metricName = "metricName_example"; // String | 
try {
    ViewSliceMetric result = apiInstance.nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet(xAuthToken, sliceId, metricName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#nmsfSlicemanagerV1SlicesMetricsBySliceIdAndMetricNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthToken** | **String**|  |
 **sliceId** | **String**|  |
 **metricName** | **String**|  |

### Return type

[**ViewSliceMetric**](ViewSliceMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet"></a>
# **nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet**
> Object nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet(xAuthToken, sliceId, operationId)

View Slice Operations

This interface is used to query performance Metrics such as the delay and traffic of slices.  Queries Metrics based on the slice ID and Metric name and returns the latest Metric values in the system. The returned content includes: Time, value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SliceManagerApi;


SliceManagerApi apiInstance = new SliceManagerApi();
String xAuthToken = "xAuthToken_example"; // String | 
String sliceId = "sliceId_example"; // String | 
String operationId = "operationId_example"; // String | 
try {
    Object result = apiInstance.nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet(xAuthToken, sliceId, operationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#nmsfSlicemanagerV1SlicesOperationsBySliceIdAndOperationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthToken** | **String**|  |
 **sliceId** | **String**|  |
 **operationId** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nmsfSlicemanagerV1SlicesPost"></a>
# **nmsfSlicemanagerV1SlicesPost**
> nmsfSlicemanagerV1SlicesPost(templateId, name, onfailure, description, parameters, xAuthToken)

Create Slice

createbyServiceName

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SliceManagerApi;


SliceManagerApi apiInstance = new SliceManagerApi();
String templateId = "templateId_example"; // String | 
String name = "name_example"; // String | 
String onfailure = "onfailure_example"; // String | 
String description = "description_example"; // String | 
String parameters = "parameters_example"; // String | 
String xAuthToken = "xAuthToken_example"; // String | 
try {
    apiInstance.nmsfSlicemanagerV1SlicesPost(templateId, name, onfailure, description, parameters, xAuthToken);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#nmsfSlicemanagerV1SlicesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**|  |
 **name** | **String**|  |
 **onfailure** | **String**|  |
 **description** | **String**|  |
 **parameters** | **String**|  |
 **xAuthToken** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="restServicemanagerV1ServicesGet"></a>
# **restServicemanagerV1ServicesGet**
> restServicemanagerV1ServicesGet(xAuthToken)

Query Slice



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SliceManagerApi;


SliceManagerApi apiInstance = new SliceManagerApi();
String xAuthToken = "xAuthToken_example"; // String | 
try {
    apiInstance.restServicemanagerV1ServicesGet(xAuthToken);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#restServicemanagerV1ServicesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAuthToken** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="slicesPost2"></a>
# **slicesPost2**
> CreateSliceDataNetworkName slicesPost2(templateId, name, onfailure, description, parameters, dataNetworkName, xAuthToken)

Create Slice - Data Network Name

This interface is used to create a slice instance using a nominated DNN or APN.   This means the access network part of the slice is shared, and not sliced.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SliceManagerApi;


SliceManagerApi apiInstance = new SliceManagerApi();
String templateId = "templateId_example"; // String | 
String name = "name_example"; // String | 
String onfailure = "onfailure_example"; // String | 
String description = "description_example"; // String | 
String parameters = "parameters_example"; // String | 
String dataNetworkName = "dataNetworkName_example"; // String | 
String xAuthToken = "xAuthToken_example"; // String | 
try {
    CreateSliceDataNetworkName result = apiInstance.slicesPost2(templateId, name, onfailure, description, parameters, dataNetworkName, xAuthToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceManagerApi#slicesPost2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**|  |
 **name** | **String**|  |
 **onfailure** | **String**|  |
 **description** | **String**|  |
 **parameters** | **String**|  |
 **dataNetworkName** | **String**|  |
 **xAuthToken** | **String**|  |

### Return type

[**CreateSliceDataNetworkName**](CreateSliceDataNetworkName.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

