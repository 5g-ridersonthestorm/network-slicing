# SliceCatalogApi

All URIs are relative to *http://nmsf/slicemanager/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nmsfSlicecatalogV1TemplatesGet**](SliceCatalogApi.md#nmsfSlicecatalogV1TemplatesGet) | **GET** /nmsf/slicecatalog/v1/templates | Query  Slice Template


<a name="nmsfSlicecatalogV1TemplatesGet"></a>
# **nmsfSlicecatalogV1TemplatesGet**
> nmsfSlicecatalogV1TemplatesGet(xAuthToken)

Query  Slice Template



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SliceCatalogApi;


SliceCatalogApi apiInstance = new SliceCatalogApi();
String xAuthToken = "xAuthToken_example"; // String | 
try {
    apiInstance.nmsfSlicecatalogV1TemplatesGet(xAuthToken);
} catch (ApiException e) {
    System.err.println("Exception when calling SliceCatalogApi#nmsfSlicecatalogV1TemplatesGet");
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

