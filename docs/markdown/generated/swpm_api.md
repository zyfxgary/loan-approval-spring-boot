# 药研社 - SSU项目管理接口服务中心

## 概览
打通临床试验经脉

### 版本信息
*版本* : 1.0

### 联系方式
*名字* : wanghui  
*邮箱* : wh@dra100.com

### 许可信息
*许可证* : The Apache License, Version 2.0  
*许可网址* : http://www.apache.org/licenses/LICENSE-2.0.html  
*服务条款* : null

### URI scheme
*域名* : http://shuwen.test.trial.link:18081/sw-api-gateway/
*基础路径* : sw-spm

### 标签

* SSU中心基本信息 : SSU中心基本信息相关接口
* SSU工作台 : SSU工作台相关的接口
* SSU跟进记录 : SSU跟进记录接口管理
* SSU项目任务 : 任务相关的接口
* SSU项目文件组专员访问 : 项目文件组专员
* SSU项目相关 : SSU项目相关接口管理
* ssu文件相关 : 文件相关接口管理(项目文件、交付文件、审核文件)
* 中心文件管理-中心文件 : 中心文件相关接口管理
* 中心管理-中心 : 中心管理-中心接口管理
* 公共接口 : 公共接口
* 后端用户 : 后端用户—后端用户管理接口
* 字典 : 字典-字典接口
* 快递相关 : 快递相关接口管理


<a name="paths"></a>
## 资源

<a name="80697476d208567ff022efdce1b2deb2"></a>
### SSU中心基本信息
SSU中心基本信息相关接口


<a name="addormodifyusingpost"></a>
#### SSU中心基本信息-编辑中心基本信息
```
POST /spmSiteFileAnswer/addOrModify
```

##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**reuqest**  <br>*必填*|reuqest|[SpmSiteFileAnswerAddOrModifyRequest](#spmsitefileansweraddormodifyrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### HTTP请求示例

###### 请求 path
```
/spmSiteFileAnswer/addOrModify
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "answerInfoReqs" : [ {
    "answerEndContent" : "string",
    "answerId" : 0,
    "optionId" : 0,
    "other" : "string",
    "questionId" : 0,
    "questionType" : 0,
    "remark" : "string",
    "result" : "string"
  } ],
  "intervalReqs" : [ {
    "date" : "string",
    "id" : 0
  } ],
  "spmHospitalId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="answerdetailusingget"></a>
#### SSU中心基本信息-查询中心信息答案
```
GET /spmSiteFileAnswer/answerDetail/{siteId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**siteId**  <br>*必填*|siteId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmSiteFileBaseModuleDetail»»](#011a5d56749468e21f36a57270744b24)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`

##### HTTP请求示例

###### 请求 path
```
/spmSiteFileAnswer/answerDetail/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "moduleName" : "string",
    "sort" : 0,
    "spmHospitalFileLists" : [ {
      "createTime" : "string",
      "createUser" : 0,
      "fileId" : 0,
      "fileName" : "string",
      "hospitalMainId" : 0,
      "id" : 0,
      "isdeleted" : 0,
      "lable" : "string",
      "lableDetail" : "string",
      "printFormat" : 0,
      "printFormatDetail" : "string",
      "printQuantity" : 0,
      "realName" : "string",
      "remark" : "string",
      "type" : 0,
      "typeDetail" : "string",
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "spmSiteFileBaseInfoDetails" : [ {
      "content" : "string",
      "id" : 0,
      "questionNo" : "string",
      "remark" : "string",
      "type" : 0,
      "value" : "string"
    } ]
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="detailusingget_1"></a>
#### SSU中心基本信息-查询中心基本信息
```
GET /spmSiteFileAnswer/detail/{spmProjectId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**spmProjectId**  <br>*必填*|spmProjectId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmSiteFileModuleDetail»»](#908e5c5a892281ae3c40dfe0b46c35ab)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`



##### HTTP请求示例

###### 请求 path
```
/spmSiteFileAnswer/detail/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "moduleName" : "string",
    "sort" : 0,
    "spmSiteFileQuestionDetails" : [ {
      "content" : "string",
      "createTime" : "string",
      "createUser" : 0,
      "id" : 0,
      "isRemark" : 0,
      "isdeleted" : 0,
      "moduleId" : 0,
      "parentOptionId" : 0,
      "questionCode" : "string",
      "questionNo" : "string",
      "sort" : 0,
      "spmSiteFileAnswerDetailInfos" : [ {
        "answerEndContent" : "string",
        "answerId" : 0,
        "createTime" : "string",
        "createUser" : 0,
        "endContent" : "string",
        "hasOther" : 0,
        "id" : 0,
        "optionName" : "string",
        "other" : "string",
        "questionId" : 0,
        "remark" : "string",
        "result" : "string",
        "sort" : 0,
        "spmSiteFileQuestionDetails" : [ {
          "content" : "string",
          "createTime" : "string",
          "createUser" : 0,
          "id" : 0,
          "isRemark" : 0,
          "isdeleted" : 0,
          "moduleId" : 0,
          "parentOptionId" : 0,
          "questionCode" : "string",
          "questionNo" : "string",
          "sort" : 0,
          "spmSiteFileAnswerDetailInfos" : [ {
            "answerEndContent" : "string",
            "answerId" : 0,
            "createTime" : "string",
            "createUser" : 0,
            "endContent" : "string",
            "hasOther" : 0,
            "id" : 0,
            "optionName" : "string",
            "other" : "string",
            "questionId" : 0,
            "remark" : "string",
            "result" : "string",
            "sort" : 0,
            "spmSiteFileQuestionDetails" : [ "..." ],
            "updateTime" : "string",
            "updateUser" : 0
          } ],
          "type" : 0,
          "updateTime" : "string",
          "updateUser" : 0
        } ],
        "updateTime" : "string",
        "updateUser" : 0
      } ],
      "type" : 0,
      "updateTime" : "string",
      "updateUser" : 0
    } ]
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findallintervalusingget"></a>
#### SSU中心基本信息-查询所有伦理上会时间
```
GET /spmSiteFileAnswer/findAllInterval/{spmProjectId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**spmProjectId**  <br>*必填*|spmProjectId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmSiteFileIntervalList»»](#d26320e3797902404f03323687f5d558)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmSiteFileAnswer/findAllInterval/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "date" : "string",
    "dateInfo" : "string",
    "hospitalId" : 0,
    "id" : 0,
    "indexFlag" : 0,
    "isdeleted" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findallintervalbysiteusingget"></a>
#### SSU中心基本信息-根据中心查询所有伦理上会时间
```
GET /spmSiteFileAnswer/findAllIntervalBySite/{siteId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**siteId**  <br>*必填*|siteId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmSiteFileIntervalList»»](#d26320e3797902404f03323687f5d558)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmSiteFileAnswer/findAllIntervalBySite/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "date" : "string",
    "dateInfo" : "string",
    "hospitalId" : 0,
    "id" : 0,
    "indexFlag" : 0,
    "isdeleted" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findintervalusingpost"></a>
#### SSU中心基本信息-查询伦理上会时间
```
POST /spmSiteFileAnswer/findInterval
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FindIntervalListRequest](#findintervallistrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmSiteFileInterval»»](#914064dac53e53f30ba31b62d20cf8b7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmSiteFileAnswer/findInterval
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "flag" : 0,
  "pageSize" : 0,
  "pages" : 0,
  "searchKey" : "string",
  "spmHospitalId" : 0,
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "date" : "string",
    "hospitalId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="da3b6d09e1c1ed22e447843ddee5c517"></a>
### SSU工作台
SSU工作台相关的接口


<a name="findworkfollowrecordlistusingpost"></a>
#### SSU工作台-查询工作台跟进记录
```
POST /work/findWorkFollowRecordList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[OnlyPagesRequest](#onlypagesrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«BaseListTo«SpmWorkFollowRecordList»»](#01ca60b95919ff858ff627b4ea95a646)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/work/findWorkFollowRecordList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "pageSize" : 0,
  "pages" : 0,
  "searchKey" : "string",
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "pageData" : [ {
      "content" : "string",
      "createTime" : "string",
      "createUser" : 0,
      "createUserName" : "string",
      "projectId" : 0,
      "projectName" : "string",
      "siteId" : 0,
      "siteName" : "string",
      "siteRoleType" : "string",
      "subTaskId" : 0,
      "subTaskName" : "string"
    } ],
    "pageSize" : 0,
    "pages" : 0,
    "totalPages" : 0,
    "totalSize" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findworkprojectlistusingpost"></a>
#### SSU工作台-查询工作台项目
```
POST /work/findWorkProjectList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[OnlyPagesRequest](#onlypagesrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«BaseListTo«SpmWorkProjectList»»](#94ab6350cb150feb0de0d4773c70afb3)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/work/findWorkProjectList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "pageSize" : 0,
  "pages" : 0,
  "searchKey" : "string",
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "pageData" : [ {
      "projectId" : 0,
      "projectName" : "string",
      "projectNo" : "string",
      "siteCount" : 0,
      "successCount" : 0,
      "surveySuccessCount" : 0
    } ],
    "pageSize" : 0,
    "pages" : 0,
    "totalPages" : 0,
    "totalSize" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findworksitelistusingpost"></a>
#### SSU工作台-查询工作台中心
```
POST /work/findWorkSiteList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[OnlyPagesRequest](#onlypagesrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«BaseListTo«SpmWorkSiteList»»](#602579a54974b0cdb8b427882283ab87)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/work/findWorkSiteList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "pageSize" : 0,
  "pages" : 0,
  "searchKey" : "string",
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "pageData" : [ {
      "projectId" : 0,
      "projectName" : "string",
      "projectNo" : "string",
      "siteId" : 0,
      "siteName" : "string",
      "siteRoleType" : "string",
      "status" : "string"
    } ],
    "pageSize" : 0,
    "pages" : 0,
    "totalPages" : 0,
    "totalSize" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="loadpendingtaskusingget"></a>
#### 待完成任务信息列表
```
GET /work/loadPendingTask
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«项目相关子任务信息»»](#11583d25dc4dc4dd04fdeaa7c95bc9a3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/work/loadPendingTask
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "description" : "string",
    "finishRole" : "string",
    "id" : 0,
    "isCommit" : 0,
    "isConfigFileTask" : "string",
    "isDelayed" : 0,
    "isDeliverFilePackage" : "string",
    "isNewFlowRecord" : 0,
    "isProjectFilePackage" : "string",
    "isReturn" : 0,
    "isViewFileTask" : "string",
    "lastOperatorDesc" : "string",
    "lastOperatorUser" : "string",
    "masterTaskCode" : "string",
    "masterTaskId" : 0,
    "masterTaskName" : "string",
    "nodeCode" : "string",
    "participateRoleType" : "string",
    "planningBeginTime" : "string",
    "planningEndTime" : "string",
    "projectId" : 0,
    "projectName" : "string",
    "roleType" : "string",
    "siteId" : 0,
    "siteName" : "string",
    "sort" : 0,
    "stakeholderCode" : "string",
    "statusCode" : 0,
    "taskName" : "string",
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="8fc0cfa4255c6139d68ed20300ddd57d"></a>
### SSU跟进记录
SSU跟进记录接口管理


<a name="addusingput"></a>
#### SSU跟进记录-新增跟进记录
```
PUT /spmFollowRecord/add
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmFollowRecordAddRequest](#spmfollowrecordaddrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmFollowRecordList»](#736d776fa8f680615189dfc862d26550)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmFollowRecord/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "content" : "string",
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "content" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "createUserName" : "string",
    "id" : 0,
    "isRead" : 0,
    "isdeleted" : 0,
    "relationId" : "string",
    "relationName" : "string",
    "relationType" : "string",
    "role" : 0,
    "subTaskId" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findfollowrecordrelationinfousingget"></a>
#### SSU跟进记录-查询跟进记录关联
```
GET /spmFollowRecord/findFollowRecordRelationInfo/{followRecordId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**followRecordId**  <br>*必填*|followRecordId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmFollowRecordRelationInfo»](#05561208bf9f0c95ef40f7b0fe9acd96)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmFollowRecord/findFollowRecordRelationInfo/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "followRecordId" : 0,
    "followRecordRelations" : [ { } ],
    "relationId" : "string",
    "relationType" : "string"
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="listusingpost"></a>
#### SSU跟进记录-跟进记录列表
```
POST /spmFollowRecord/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmFollowRecordListRequest](#spmfollowrecordlistrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«BaseListTo«SpmFollowRecordList»»](#8be5b027134f86b20a2ff9b2b024d274)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmFollowRecord/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "pageSize" : 0,
  "pages" : 0,
  "searchKey" : "string",
  "subTaskId" : 0,
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "pageData" : [ {
      "content" : "string",
      "createTime" : "string",
      "createUser" : 0,
      "createUserName" : "string",
      "id" : 0,
      "isRead" : 0,
      "isdeleted" : 0,
      "relationId" : "string",
      "relationName" : "string",
      "relationType" : "string",
      "role" : 0,
      "subTaskId" : 0
    } ],
    "pageSize" : 0,
    "pages" : 0,
    "totalPages" : 0,
    "totalSize" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="76bd06f4774694ca7e799212f50b9f36"></a>
### SSU项目任务
任务相关的接口


<a name="addcustomertaskusingpost"></a>
#### 新增自定义任务
```
POST /task/addCustomerTask
```


##### 说明
接口操作影响数据表：[spm_project_sub_task_info]


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**customerTaskRequest**  <br>*必填*|任务信息|[自定义任务接收数据对象](#29aaa6e0ebf914420f9674f682d22e0c)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/addCustomerTask
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "auditorRole" : "string",
  "executiveRole" : "string",
  "planFinishTimeStamp" : 0,
  "projectId" : 0,
  "siteId" : 0,
  "taskCode" : "string",
  "taskName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="addsubtaskforreadytaskusingpost"></a>
#### 新增准备任务中子任务
```
POST /task/addSubTaskForReadyTask
```


##### 说明
接口操作影响数据表：[spm_project_sub_task_info,spm_sub_task_remind,spm_follow_record]
[spm_sub_task_remind]表中增加跟进提醒;
[spm_follow_record]表中增加跟进记录信息


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**customerTaskRequest**  <br>*必填*|任务信息|[自定义任务接收数据对象](#29aaa6e0ebf914420f9674f682d22e0c)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/addSubTaskForReadyTask
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "auditorRole" : "string",
  "executiveRole" : "string",
  "planFinishTimeStamp" : 0,
  "projectId" : 0,
  "siteId" : 0,
  "taskCode" : "string",
  "taskName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="enableplanusingpost"></a>
#### 启动计划
```
POST /task/enablePlan
```


##### 说明
接口操作影响数据表：[spm_project_sub_task_info]


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmSitePlan](#spmsiteplan)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/enablePlan
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "approvalPlanSubmitDate" : "string",
  "approvalPlanSuccessDate" : "string",
  "contractPlanExamineDate" : "string",
  "contractPlanSignDate" : "string",
  "contractPlanSubmitDate" : "string",
  "contractPlanSubmitPiDate" : "string",
  "ethicPlanApprovalDate" : "string",
  "ethicPlanIntervalDate" : "string",
  "ethicPlanSubmitDate" : "string",
  "geneticPlanGetDate" : "string",
  "geneticPlanSubmitDate" : "string",
  "planFilterDate" : "string",
  "planHandoverDate" : "string",
  "planStartUpDate" : "string",
  "planSurveyDate" : "string",
  "projectId" : 0,
  "siteId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findsuccesstimelistusingget"></a>
#### SSU项目任务-查询项目下子任务完成时间
```
GET /task/findSuccessTimeList/{projectId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**projectId**  <br>*必填*|项目id|ref||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmTaskSuccessTimeInfo»»](#802403e7dd587f7c0cad40acc17188f2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/findSuccessTimeList/ref
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "approvalSuccessSubmitDate" : "string",
    "approvalSuccessSuccessDate" : "string",
    "contractSuccessExamineDate" : "string",
    "contractSuccessSignDate" : "string",
    "contractSuccessSubmitDate" : "string",
    "contractSuccessSubmitPiDate" : "string",
    "ethicSuccessApprovalDate" : "string",
    "ethicSuccessIntervalDate" : "string",
    "ethicSuccessSubmitDate" : "string",
    "geneticSuccessGetDate" : "string",
    "geneticSuccessSubmitDate" : "string",
    "siteId" : 0,
    "successFilterDate" : "string",
    "successHandoverDate" : "string",
    "successStartUpDate" : "string",
    "successSurveyDate" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="initprojecttaskusingput"></a>
#### 任务初始化——项目任务
```
PUT /task/initProjectTask/{projectId}
```


##### 说明
数据源参考数据表：[spm_task_node_template,spm_task_node_role_template,spm_task_category_relation];
接口操作影响数据表：[spm_project_master_task_info,spm_project_sub_task_info]


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**projectId**  <br>*可选*|项目ID|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/initProjectTask/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="initsitetaskforprojectusingput"></a>
#### 任务初始化——中心任务
```
PUT /task/initSiteTask/{projectId}/{siteId}/{isNeedHeredityOffice}/{isMergePSV}
```


##### 说明
数据源参考数据表：[spm_task_node_template,spm_task_node_role_template,spm_task_category_relation];
接口操作影响数据表：[spm_project_master_task_info,spm_project_sub_task_info]


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**isMergePSV**  <br>*可选*|是否合并PSV|enum (true, false)|`"false"`|
|**Path**|**isNeedHeredityOffice**  <br>*可选*|是否涉及遗传办|enum (true, false)|`"false"`|
|**Path**|**projectId**  <br>*可选*|项目ID|integer (int32)||
|**Path**|**siteId**  <br>*可选*|中心ID|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/initSiteTask/0/0/true/true
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="loadsubtaskinfousingget"></a>
#### SSU项目任务-查询子任务详细信息
```
GET /task/loadSubTaskInfo/{subTaskId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**subTaskId**  <br>*必填*|subTaskId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«项目相关子任务信息»](#bf9d84534a285b43e740dd18ffc4b8d7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/loadSubTaskInfo/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "description" : "string",
    "finishRole" : "string",
    "id" : 0,
    "isCommit" : 0,
    "isConfigFileTask" : "string",
    "isDelayed" : 0,
    "isDeliverFilePackage" : "string",
    "isNewFlowRecord" : 0,
    "isProjectFilePackage" : "string",
    "isReturn" : 0,
    "isViewFileTask" : "string",
    "lastOperatorDesc" : "string",
    "lastOperatorUser" : "string",
    "masterTaskCode" : "string",
    "masterTaskId" : 0,
    "masterTaskName" : "string",
    "nodeCode" : "string",
    "participateRoleType" : "string",
    "planningBeginTime" : "string",
    "planningEndTime" : "string",
    "projectId" : 0,
    "projectName" : "string",
    "roleType" : "string",
    "siteId" : 0,
    "siteName" : "string",
    "sort" : 0,
    "stakeholderCode" : "string",
    "statusCode" : 0,
    "taskName" : "string",
    "updateTime" : "string",
    "updateUser" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="modifysitetaskbyupdateprojectusingput"></a>
#### 遗传办任务变更——项目变更
```
PUT /task/modifySiteTaskByUpdateProject/{projectId}
```


##### 说明
默认初始化时已经添加遗传办主任务，所以只需要做启用操作即可 
接口操作影响数据表：[spm_project_master_task_info]


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**projectId**  <br>*可选*|项目ID|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/modifySiteTaskByUpdateProject/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="modifysubtaskcommitstatususingpost"></a>
#### 提交(退回)子任务
```
POST /task/modifySubTaskCommitStatus
```


##### 说明
接口操作影响数据表：[spm_project_master_task_info,spm_project_sub_task_info,spm_sub_task_remind,spm_follow_record]
更新[spm_project_sub_task_info]表中的isCommit（是否提交）、isReturn（是否退回）、Status和常规修改人以及修改时间字段;
当主任务下所有的子任务完成时会对[spm_project_master_task_info]表中的主状态(status)进行更新;
[spm_sub_task_remind]表中增加跟进提醒;
[spm_follow_record]表中增加跟进记录信息


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**customerTaskRequest**  <br>*必填*|任务状态更新信息|[任务状态更新接收对象](#a15bb0b63e6473736e363eab217048cc)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/modifySubTaskCommitStatus
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "actionType" : 0,
  "finishTimeStamp" : 0,
  "statusCode" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="modifysubtaskplantimeusingput"></a>
#### 更新子任务计划时间
```
PUT /task/modifySubTaskPlanTime/{subTaskId}/{planStartTimeStamp}/{planEndTimeStamp}
```


##### 说明
接口操作影响数据表：[spm_project_sub_task_info]


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**planEndTimeStamp**  <br>*可选*|计划结束时间戳|integer (int64)||
|**Path**|**planStartTimeStamp**  <br>*可选*|计划开始时间戳|integer (int64)||
|**Path**|**subTaskId**  <br>*可选*|子任务ID|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/modifySubTaskPlanTime/0/0/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="modifysubtaskstatususingpost"></a>
#### 更新子任务状态
```
POST /task/modifySubTaskStatus
```


##### 说明
接口操作影响数据表：[spm_project_master_task_info,spm_project_sub_task_info,spm_sub_task_remind,spm_follow_record]
更新[spm_project_sub_task_info]表中的Status和常规修改人以及修改时间字段;
当主任务下所有的子任务完成时会对[spm_project_master_task_info]表中的主状态(status)进行更新;
[spm_sub_task_remind]表中增加跟进提醒;
[spm_follow_record]表中增加跟进记录信息


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**customerTaskRequest**  <br>*必填*|任务状态更新信息|[任务状态更新接收对象](#a15bb0b63e6473736e363eab217048cc)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/modifySubTaskStatus
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "actionType" : 0,
  "finishTimeStamp" : 0,
  "statusCode" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="taskdetailusingget"></a>
#### SSU项目任务-查询子任务问卷信息
```
GET /task/taskDetail/{subTaskId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**subTaskId**  <br>*必填*|子任务id|ref||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«object»](#2e9de6f836ac2d556229adbd14d64b43)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/taskDetail/ref
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : "object",
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="loadtasklistbytaskmodulecodeusingget"></a>
#### 根据任务模块结构获取对应任务列表
```
GET /task/taskList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Query**|**pageSize**  <br>*可选*|pageSize数量|integer (int32)|`10`|
|**Query**|**pages**  <br>*可选*|pages页数|integer (int32)|`1`|
|**Query**|**projectId**  <br>*可选*|项目ID|integer (int32)|`0`|
|**Query**|**siteId**  <br>*可选*|中心ID|integer (int32)|`0`|
|**Query**|**statusCode**  <br>*可选*|状态信息(1:待完成、2:已完成、3:全部)|integer (int32)|`1`|
|**Query**|**subTaskModuleCode**  <br>*可选*|子任务模块编码|string||
|**Query**|**taskKeyWord**  <br>*可选*|任务关键字|string||
|**Query**|**taskModuleCode**  <br>*可选*|任务模块编码|string||
|**Query**|**totalSize**  <br>*可选*|totalSize 总数量|integer (int32)|`100`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«BaseListTo«项目相关子任务信息»»](#75b61d6abd1b9dc840bcb470062d8ef2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/taskList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "pageSize" : 0,
  "pages" : 0,
  "projectId" : 0,
  "siteId" : 0,
  "statusCode" : 0,
  "subTaskModuleCode" : "string",
  "taskKeyWord" : "string",
  "taskModuleCode" : "string",
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "pageData" : [ {
      "description" : "string",
      "finishRole" : "string",
      "id" : 0,
      "isCommit" : 0,
      "isConfigFileTask" : "string",
      "isDelayed" : 0,
      "isDeliverFilePackage" : "string",
      "isNewFlowRecord" : 0,
      "isProjectFilePackage" : "string",
      "isReturn" : 0,
      "isViewFileTask" : "string",
      "lastOperatorDesc" : "string",
      "lastOperatorUser" : "string",
      "masterTaskCode" : "string",
      "masterTaskId" : 0,
      "masterTaskName" : "string",
      "nodeCode" : "string",
      "participateRoleType" : "string",
      "planningBeginTime" : "string",
      "planningEndTime" : "string",
      "projectId" : 0,
      "projectName" : "string",
      "roleType" : "string",
      "siteId" : 0,
      "siteName" : "string",
      "sort" : 0,
      "stakeholderCode" : "string",
      "statusCode" : 0,
      "taskName" : "string",
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "pageSize" : 0,
    "pages" : 0,
    "totalPages" : 0,
    "totalSize" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="loadtaskmodulelistusingget"></a>
#### 任务模块结构列表
```
GET /task/taskModuleList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Query**|**projectId**  <br>*可选*|项目ID|integer (int32)|`0`|
|**Query**|**siteId**  <br>*可选*|中心ID|integer (int32)|`0`|
|**Query**|**statusCode**  <br>*可选*|状态信息(1:待完成、2:已完成、3:全部)|integer (int32)|`1`|
|**Query**|**taskKeyWord**  <br>*可选*|任务关键字|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«任务模块信息»»](#7efdb27dd20fc4af0f37c216ddd7ff3d)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/taskModuleList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "projectId" : 0,
  "siteId" : 0,
  "statusCode" : 0,
  "taskKeyWord" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "count" : 0,
    "flowRecordCount" : 0,
    "moduleCode" : "string",
    "moduleName" : "string",
    "spmTaskCountDetailList" : [ {
      "count" : 0,
      "flowRecordCount" : 0,
      "masterTaskCode" : "string",
      "masterTaskName" : "string",
      "subTaskCode" : "string",
      "subTaskName" : "string"
    } ],
    "subTaskDetailList" : [ {
      "description" : "string",
      "finishRole" : "string",
      "id" : 0,
      "isCommit" : 0,
      "isConfigFileTask" : "string",
      "isDelayed" : 0,
      "isDeliverFilePackage" : "string",
      "isNewFlowRecord" : 0,
      "isProjectFilePackage" : "string",
      "isReturn" : 0,
      "isViewFileTask" : "string",
      "lastOperatorDesc" : "string",
      "lastOperatorUser" : "string",
      "masterTaskCode" : "string",
      "masterTaskId" : 0,
      "masterTaskName" : "string",
      "nodeCode" : "string",
      "participateRoleType" : "string",
      "planningBeginTime" : "string",
      "planningEndTime" : "string",
      "projectId" : 0,
      "projectName" : "string",
      "roleType" : "string",
      "siteId" : 0,
      "siteName" : "string",
      "sort" : 0,
      "stakeholderCode" : "string",
      "statusCode" : 0,
      "taskName" : "string",
      "updateTime" : "string",
      "updateUser" : 0
    } ]
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="loadtaskprocesslistusingget"></a>
#### 任务进度列表
```
GET /task/taskProcessList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Query**|**projectId**  <br>*可选*|项目ID|integer (int32)|`0`|
|**Query**|**siteId**  <br>*可选*|中心ID|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«任务进度列表»](#f9fc1a2258011fe2c9d8abb3940d3890)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/task/taskProcessList
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "projectId" : 0,
  "siteId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "masterTaskDetailList" : [ {
      "currentProgressRate" : 0,
      "finishRole" : "string",
      "id" : 0,
      "isNewFlowRecord" : 0,
      "nodeCode" : "string",
      "nodeType" : 0,
      "participateRoleType" : "string",
      "projectId" : 0,
      "siteId" : 0,
      "sort" : 0,
      "status" : 0,
      "taskName" : "string",
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "subTaskDetailList" : [ {
      "description" : "string",
      "finishRole" : "string",
      "id" : 0,
      "isCommit" : 0,
      "isConfigFileTask" : "string",
      "isDelayed" : 0,
      "isDeliverFilePackage" : "string",
      "isNewFlowRecord" : 0,
      "isProjectFilePackage" : "string",
      "isReturn" : 0,
      "isViewFileTask" : "string",
      "lastOperatorDesc" : "string",
      "lastOperatorUser" : "string",
      "masterTaskCode" : "string",
      "masterTaskId" : 0,
      "masterTaskName" : "string",
      "nodeCode" : "string",
      "participateRoleType" : "string",
      "planningBeginTime" : "string",
      "planningEndTime" : "string",
      "projectId" : 0,
      "projectName" : "string",
      "roleType" : "string",
      "siteId" : 0,
      "siteName" : "string",
      "sort" : 0,
      "stakeholderCode" : "string",
      "statusCode" : 0,
      "taskName" : "string",
      "updateTime" : "string",
      "updateUser" : 0
    } ]
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="58deef158e788fa85b73d9494081ba45"></a>
### SSU项目文件组专员访问
项目文件组专员


<a name="loadcurrentloginuserrelationinfolistusingget"></a>
#### 获取当前登录者(CTA)负责的项目关系数据
```
GET /projectFileUser/loadCurrentLoginUserRelationInfoList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmProjectFileUser»»](#7e21cc21030c67a4f21aab369548abfc)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/projectFileUser/loadCurrentLoginUserRelationInfoList
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "adminUserId" : 0,
    "createTime" : "string",
    "createUser" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "projectId" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="7eefbe48382a272706de6028d7ef119a"></a>
### SSU项目相关
SSU项目相关接口管理


<a name="detailusingget"></a>
#### SSU项目相关-项目详情
```
GET /spmProject/detail/{projectId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**projectId**  <br>*必填*|projectId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SsuProjectDetail»](#81128f7644783e9c9d18dd4b7a6a151a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmProject/detail/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "hasGenetic" : 0,
    "id" : 0,
    "leadingSites" : "string",
    "mergePsv" : 0,
    "piDoctorName" : "string",
    "projectFullName" : "string",
    "projectManager" : "string",
    "projectManagerName" : "string",
    "projectName" : "string",
    "projectNo" : "string",
    "researchDrug" : "string",
    "siteFilterNumber" : 0,
    "sitePlanNumber" : 0,
    "sponsorName" : "string"
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findallsitestatususingget"></a>
#### SSU项目相关-获取中心状态字典
```
GET /spmProject/findAllSiteStatus
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«IdName»»](#b58e663b873f77191bfb9ea1e9e49c97)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmProject/findAllSiteStatus
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "id" : 0,
    "name" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findprojectidnamesusingpost"></a>
#### SSU项目相关-查询项目idnames列表
```
POST /spmProject/findProjectIdNames
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[OnlyPagesRequest](#onlypagesrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«IdName»»](#b58e663b873f77191bfb9ea1e9e49c97)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmProject/findProjectIdNames
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "pageSize" : 0,
  "pages" : 0,
  "searchKey" : "string",
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "id" : 0,
    "name" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findprojectsiteidnamesusingget"></a>
#### SSU项目相关-查询项目中心idnames列表
```
GET /spmProject/findProjectSiteIdNames/{projectId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**projectId**  <br>*必填*|projectId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«IdName»»](#b58e663b873f77191bfb9ea1e9e49c97)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmProject/findProjectSiteIdNames/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "id" : 0,
    "name" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="listusingpost_5"></a>
#### SSU项目相关-项目列表
```
POST /spmProject/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SsuProjectListRequest](#ssuprojectlistrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«BaseListTo«CrmProjectList»»](#b7b0f67bd74e37f9c4ea433a214d674e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmProject/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "confirm" : 0,
  "pageSize" : 0,
  "pages" : 0,
  "projectManager" : 0,
  "searchKey" : "string",
  "status" : 0,
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "pageData" : [ {
      "businessManager" : 0,
      "businessManagerName" : "string",
      "createTime" : "string",
      "createUser" : 0,
      "hasGenetic" : 0,
      "id" : 0,
      "indication" : "string",
      "isdeleted" : 0,
      "isinvesStart" : 0,
      "mainProjectId" : 0,
      "mergePsv" : 0,
      "opManager" : 0,
      "opManagerName" : "string",
      "projectCta" : "string",
      "projectFullName" : "string",
      "projectManager" : "string",
      "projectManagerName" : "string",
      "projectName" : "string",
      "projectNo" : "string",
      "projectSsuCtas" : [ {
        "id" : 0,
        "name" : "string"
      } ],
      "projectType" : 0,
      "protocolName" : "string",
      "recommendedSiteCount" : 0,
      "remark" : "string",
      "researchDrug" : "string",
      "serviceScope" : 0,
      "serviceScopeDetail" : "string",
      "siteCount" : 0,
      "siteFilterNumber" : 0,
      "sitePlanNumber" : 0,
      "sort" : 0,
      "spmProjectRemindInfo" : {
        "contractRemind" : 0,
        "ethicRemind" : 0,
        "handoverRemind" : 0,
        "inheritanceRemind" : 0,
        "projectApprovalRemind" : 0,
        "projectId" : 0,
        "surveyRemind" : 0
      },
      "spmProjectTaskCountInfo" : {
        "contractCount" : 0,
        "ethicCount" : 0,
        "handoverCount" : 0,
        "inheritanceCount" : 0,
        "projectApprovalCount" : 0,
        "projectId" : 0,
        "successCount" : 0,
        "surveyCount" : 0,
        "surveyFailCount" : 0,
        "surveySuccessCount" : 0
      },
      "sponsorName" : "string",
      "startDate" : "string",
      "status" : 0,
      "statusDetail" : "string",
      "trialStages" : 0,
      "trialStagesDetail" : "string",
      "trialType" : 0,
      "trialTypeDetail" : "string",
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "pageSize" : 0,
    "pages" : 0,
    "totalPages" : 0,
    "totalSize" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="sitelistusingpost"></a>
#### SSU项目相关-项目中心列表
```
POST /spmProject/siteList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[CrmProjectSiteListRequest](#crmprojectsitelistrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«CrmProjectSite»»](#241477bd0343f2dce371fd4479ef7b2b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmProject/siteList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "apmId" : 0,
  "projectId" : 0,
  "searchKey" : "string",
  "status" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "city" : 0,
    "cityName" : "string",
    "commissioners" : [ {
      "email" : "string",
      "mobile" : "string",
      "opUserId" : 0,
      "siteId" : 0,
      "userName" : "string"
    } ],
    "createTime" : "string",
    "createUser" : 0,
    "departmentId" : "string",
    "departmentName" : "string",
    "displayName" : "string",
    "doctorAndDepartmentId" : "string",
    "hospitalId" : 0,
    "hospitalName" : "string",
    "id" : 0,
    "isdeleted" : 0,
    "isleadingSite" : 0,
    "piDoctorId" : "string",
    "piDoctorName" : "string",
    "pl" : "string",
    "plName" : "string",
    "projectId" : 0,
    "projectName" : "string",
    "projectNo" : "string",
    "province" : 0,
    "provinceName" : "string",
    "remark" : "string",
    "siteNo" : "string",
    "siteRoleType" : "string",
    "sort" : 0,
    "spmSiteNewFollowRecord" : {
      "content" : "string",
      "followRecordId" : 0,
      "planningEndTime" : "string",
      "projectId" : 0,
      "siteId" : 0,
      "subTaskInfoId" : 0,
      "taskName" : "string"
    },
    "spmSiteRemindInfo" : {
      "projectId" : 0,
      "remindCount" : 0,
      "siteId" : 0
    },
    "status" : "string",
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="c21fcc80cc51e09ddffc79f3b718b52b"></a>
### Ssu文件相关
文件相关接口管理(项目文件、交付文件、审核文件)


<a name="addormodifydeliverytemplateusingpost"></a>
#### 文件管理->交付文件配置新增/编辑
```
POST /ssuFile/addOrModifyDeliveryTemplate
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmDeliveryTemplateAddOrModifyRequest](#spmdeliverytemplateaddormodifyrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/addOrModifyDeliveryTemplate
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "detail" : "string",
  "fileName" : "string",
  "fileRequire" : 0,
  "fileType" : "string",
  "folderId" : 0,
  "id" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "quantity" : 0,
  "subTaskId" : 0,
  "tag" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="uploadprojectfileuploadusingpost"></a>
#### 文件管理->项目文件配置新增/编辑
```
POST /ssuFile/addOrModifyProjectFile
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Query**|**id**  <br>*可选*|主键ID|integer (int32)||
|**FormData**|**request**  <br>*可选*|request|file||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmProjectFileTaskInfo»](#1929d8123b207c6d287d898145bc4caf)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/addOrModifyProjectFile
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


###### 请求 formData
```
json :
"file"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileStatus" : 0,
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "printOrder" : 0,
    "printOrderName" : "string",
    "printUser" : 0,
    "printUserDetail" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "remark" : "string",
    "searchKey" : "string",
    "siteId" : 0,
    "sort" : 0,
    "status" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "version" : "string",
    "versionDate" : "string"
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="addormodifyprojectfileinfousingpost"></a>
#### 文件管理->项目文件配置信息
```
POST /ssuFile/addOrModifyProjectFileInfo
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|< [SSUProjectFileAddOrModifyRequest](#ssuprojectfileaddormodifyrequest) > array||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmProjectFileTaskInfo»»](#501a417b9c6ef80ace0bbef1a1a0837f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/addOrModifyProjectFileInfo
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
[ {
  "detail" : "string",
  "fileName" : "string",
  "fileType" : "string",
  "folderId" : 0,
  "id" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "subTaskId" : 0,
  "tag" : "string",
  "version" : "string",
  "versionDate" : "string"
} ]
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileStatus" : 0,
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "printOrder" : 0,
    "printOrderName" : "string",
    "printUser" : 0,
    "printUserDetail" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "remark" : "string",
    "searchKey" : "string",
    "siteId" : 0,
    "sort" : 0,
    "status" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "version" : "string",
    "versionDate" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="addormodifysiteapproveusingpost"></a>
#### 文件管理->中心立项文件配置信息新增/编辑
```
POST /ssuFile/addOrModifySiteApprove
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|< [SSUSiteApproveAddOrModifyRequest](#ssusiteapproveaddormodifyrequest) > array||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmProjectFileTaskInfo»»](#501a417b9c6ef80ace0bbef1a1a0837f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/addOrModifySiteApprove
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
[ {
  "detail" : "string",
  "fileId" : 0,
  "fileName" : "string",
  "fileStatus" : 0,
  "fileType" : "string",
  "folderId" : 0,
  "id" : 0,
  "masterTaskCode" : "string",
  "printOrder" : 0,
  "printUser" : 0,
  "projectId" : 0,
  "quantity" : 0,
  "siteId" : 0,
  "subTaskId" : 0,
  "tag" : "string",
  "version" : "string",
  "versionDate" : "string"
} ]
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileStatus" : 0,
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "printOrder" : 0,
    "printOrderName" : "string",
    "printUser" : 0,
    "printUserDetail" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "remark" : "string",
    "searchKey" : "string",
    "siteId" : 0,
    "sort" : 0,
    "status" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "version" : "string",
    "versionDate" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="uploadsiteapprovefileuploadusingpost"></a>
#### 文件管理->中心立项文件配置新增/编辑
```
POST /ssuFile/addOrModifySiteApproveFile
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Query**|**id**  <br>*可选*|主键ID|integer (int32)||
|**FormData**|**request**  <br>*可选*|request|file||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmProjectFileTaskInfo»](#1929d8123b207c6d287d898145bc4caf)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/addOrModifySiteApproveFile
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


###### 请求 formData
```
json :
"file"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileStatus" : 0,
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "printOrder" : 0,
    "printOrderName" : "string",
    "printUser" : 0,
    "printUserDetail" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "remark" : "string",
    "searchKey" : "string",
    "siteId" : 0,
    "sort" : 0,
    "status" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "version" : "string",
    "versionDate" : "string"
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="addormodifysitedeliveryfileusingpost"></a>
#### 文件管理->交付文件新增/编辑
```
POST /ssuFile/addOrModifySiteDeliveryFile
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Query**|**fileId**  <br>*可选*|文件ID(新增时为0)|integer (int32)||
|**Query**|**fileName**  <br>*可选*|文件名称|string||
|**Query**|**id**  <br>*可选*|主键ID|integer (int32)||
|**Query**|**subTaskId**  <br>*可选*|任务id|integer (int32)||
|**FormData**|**request**  <br>*可选*|request|file||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmDeliveryFileTaskInfo»](#ddde6852ae3886419c24ae6ad053fcfe)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/addOrModifySiteDeliveryFile
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "fileId" : 0,
  "fileName" : "string",
  "id" : 0,
  "subTaskId" : 0
}
```


###### 请求 formData
```
json :
"file"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "archivePath" : "string",
    "archiveStatus" : 0,
    "archiveStatusDetail" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileRequire" : 0,
    "fileRequireName" : "string",
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "searchKey" : "string",
    "siteId" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "updateUserName" : "string"
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="delfilefolderusingdelete"></a>
#### 文件目录管理--删除文件目录（立项、伦理、遗传办）
```
DELETE /ssuFile/delFileFolder/{id}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**id**  <br>*必填*|id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/delFileFolder/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="deletedeliverytemplateusingdelete"></a>
#### 文件管理->交付文件配置文件删除
```
DELETE /ssuFile/deleteDeliveryTemplate/{id}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**id**  <br>*必填*|id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/deleteDeliveryTemplate/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="delprojectfileusingdelete"></a>
#### 文件管理->项目文件配置删除
```
DELETE /ssuFile/deleteProjectFile/{id}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**id**  <br>*必填*|id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/deleteProjectFile/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="delsiteapprovefileusingdelete"></a>
#### 文件管理->中心立项文件配置删除
```
DELETE /ssuFile/deleteSiteApproveFile/{id}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**id**  <br>*必填*|id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/deleteSiteApproveFile/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="deletesitedeliveryfileusingdelete"></a>
#### 文件管理->中心交付文件删除
```
DELETE /ssuFile/deleteSiteDeliveryFile/{id}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**id**  <br>*必填*|id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/deleteSiteDeliveryFile/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="downloadzipusingpost"></a>
#### 文件管理->文件打包下载
```
POST /ssuFile/downloadZip
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FilesDownloadRequest](#filesdownloadrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/downloadZip
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "filePaths" : [ "string" ],
  "projectId" : 0,
  "rootPath" : "string",
  "siteId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="finddeliverytemplatelistusingpost"></a>
#### 文件管理->交付文件配置列表
```
POST /ssuFile/findDeliveryTemplateList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmFileInfoSearchRequest](#spmfileinfosearchrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmDeliveryFileTaskInfo»»](#a0e2c6ca4b70feb3823bd7f46e7925c2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findDeliveryTemplateList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "folderIds" : [ 0 ],
  "id" : 0,
  "isdeleted" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "archivePath" : "string",
    "archiveStatus" : 0,
    "archiveStatusDetail" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileRequire" : 0,
    "fileRequireName" : "string",
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "searchKey" : "string",
    "siteId" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "updateUserName" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findfilefolderusingpost"></a>
#### 查询目录信息
```
POST /ssuFile/findFileFolder
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FolderAddRequest](#folderaddrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«FolderTreeResponse»»](#06241a5672fc7820f7a6543d28f82ec7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findFileFolder
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "projectId" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "baseFolderType" : 0,
    "children" : [ {
      "baseFolderType" : 0,
      "children" : [ "..." ],
      "createTime" : "string",
      "createUser" : 0,
      "detail" : "string",
      "fileId" : 0,
      "fileName" : "string",
      "folderId" : 0,
      "folderName" : "string",
      "folderParentId" : 0,
      "id" : 0,
      "isdeleted" : 0,
      "path" : "string",
      "projectId" : 0,
      "siteId" : 0,
      "siteName" : "string",
      "sort" : 0,
      "type" : 0,
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "folderId" : 0,
    "folderName" : "string",
    "folderParentId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "path" : "string",
    "projectId" : 0,
    "siteId" : 0,
    "siteName" : "string",
    "sort" : 0,
    "type" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findfolderfilenumusingpost"></a>
#### 文件管理->目录下文件数(交付文件)
```
POST /ssuFile/findFolderFileNum
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FolderFileNumRequest](#folderfilenumrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«IdNameTotal»»](#eafc25542a1e9eacfa728e063a7f1c79)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findFolderFileNum
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "folderIds" : [ 0 ],
  "masterTaskCode" : "string",
  "projectId" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "id" : 0,
    "name" : "string",
    "total" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findprojectfilelistusingpost"></a>
#### 文件管理->项目文件配置列表
```
POST /ssuFile/findProjectFileList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmFileInfoSearchRequest](#spmfileinfosearchrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmProjectFileTaskInfo»»](#501a417b9c6ef80ace0bbef1a1a0837f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findProjectFileList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "folderIds" : [ 0 ],
  "id" : 0,
  "isdeleted" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileStatus" : 0,
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "printOrder" : 0,
    "printOrderName" : "string",
    "printUser" : 0,
    "printUserDetail" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "remark" : "string",
    "searchKey" : "string",
    "siteId" : 0,
    "sort" : 0,
    "status" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "version" : "string",
    "versionDate" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findprojectsitedeliveryfolderusingpost"></a>
#### 文件目录管理--项目(交付)中心文件目录
```
POST /ssuFile/findProjectSiteDeliveryFolder
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FolderAddRequest](#folderaddrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«FolderTreeResponse»»](#06241a5672fc7820f7a6543d28f82ec7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findProjectSiteDeliveryFolder
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "projectId" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "baseFolderType" : 0,
    "children" : [ {
      "baseFolderType" : 0,
      "children" : [ "..." ],
      "createTime" : "string",
      "createUser" : 0,
      "detail" : "string",
      "fileId" : 0,
      "fileName" : "string",
      "folderId" : 0,
      "folderName" : "string",
      "folderParentId" : 0,
      "id" : 0,
      "isdeleted" : 0,
      "path" : "string",
      "projectId" : 0,
      "siteId" : 0,
      "siteName" : "string",
      "sort" : 0,
      "type" : 0,
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "folderId" : 0,
    "folderName" : "string",
    "folderParentId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "path" : "string",
    "projectId" : 0,
    "siteId" : 0,
    "siteName" : "string",
    "sort" : 0,
    "type" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findprojectsubmitsitefolderusingpost"></a>
#### 文件目录管理--项目(递交）中心文件目录
```
POST /ssuFile/findProjectSubmitSiteFolder
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FolderAddRequest](#folderaddrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«FolderTreeResponse»»](#06241a5672fc7820f7a6543d28f82ec7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findProjectSubmitSiteFolder
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "projectId" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "baseFolderType" : 0,
    "children" : [ {
      "baseFolderType" : 0,
      "children" : [ "..." ],
      "createTime" : "string",
      "createUser" : 0,
      "detail" : "string",
      "fileId" : 0,
      "fileName" : "string",
      "folderId" : 0,
      "folderName" : "string",
      "folderParentId" : 0,
      "id" : 0,
      "isdeleted" : 0,
      "path" : "string",
      "projectId" : 0,
      "siteId" : 0,
      "siteName" : "string",
      "sort" : 0,
      "type" : 0,
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "folderId" : 0,
    "folderName" : "string",
    "folderParentId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "path" : "string",
    "projectId" : 0,
    "siteId" : 0,
    "siteName" : "string",
    "sort" : 0,
    "type" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findsiteapprovefilelistusingpost"></a>
#### 文件管理->中心立项材料列表
```
POST /ssuFile/findSiteApproveList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SSUSiteApproveRequest](#ssusiteapproverequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmProjectFileTaskInfo»»](#501a417b9c6ef80ace0bbef1a1a0837f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findSiteApproveList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "fileStatus" : 0,
  "folderId" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "subTaskId" : 0,
  "userType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileStatus" : 0,
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "printOrder" : 0,
    "printOrderName" : "string",
    "printUser" : 0,
    "printUserDetail" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "remark" : "string",
    "searchKey" : "string",
    "siteId" : 0,
    "sort" : 0,
    "status" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "version" : "string",
    "versionDate" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findsitedeliverylistusingpost"></a>
#### 文件管理->交付文件列表
```
POST /ssuFile/findSiteDeliveryList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SSUSiteDeliveryRequest](#ssusitedeliveryrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmDeliveryFileTaskInfo»»](#a0e2c6ca4b70feb3823bd7f46e7925c2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findSiteDeliveryList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "folderId" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "roleType" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "archivePath" : "string",
    "archiveStatus" : 0,
    "archiveStatusDetail" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileRequire" : 0,
    "fileRequireName" : "string",
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "searchKey" : "string",
    "siteId" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "updateUserName" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findsiteprojectfilelistusingpost"></a>
#### 拉取中心立项项目文件
```
POST /ssuFile/findSiteProjectFileList
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FolderAddRequest](#folderaddrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«FolderTreeResponse»»](#06241a5672fc7820f7a6543d28f82ec7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/findSiteProjectFileList
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "projectId" : 0,
  "searchKey" : "string",
  "siteId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "baseFolderType" : 0,
    "children" : [ {
      "baseFolderType" : 0,
      "children" : [ "..." ],
      "createTime" : "string",
      "createUser" : 0,
      "detail" : "string",
      "fileId" : 0,
      "fileName" : "string",
      "folderId" : 0,
      "folderName" : "string",
      "folderParentId" : 0,
      "id" : 0,
      "isdeleted" : 0,
      "path" : "string",
      "projectId" : 0,
      "siteId" : 0,
      "siteName" : "string",
      "sort" : 0,
      "type" : 0,
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "folderId" : 0,
    "folderName" : "string",
    "folderParentId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "path" : "string",
    "projectId" : 0,
    "siteId" : 0,
    "siteName" : "string",
    "sort" : 0,
    "type" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="modifyfilefolderusingpost"></a>
#### 文件目录管理--编辑文件目录（立项、伦理、遗传办）
```
POST /ssuFile/modifyFileFolder
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[FolderModifyRequest](#foldermodifyrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/modifyFileFolder
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "addFolderList" : [ 0 ],
  "projectId" : 0,
  "removeFolderList" : [ 0 ],
  "siteId" : 0,
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="testfiletaskusingpost"></a>
#### 文件管理->测试文件任务
```
POST /ssuFile/testFileTask
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmProjectSubTaskInfoDetail](#spmprojectsubtaskinfodetail)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/testFileTask
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "createTime" : "string",
  "createUser" : 0,
  "description" : "string",
  "finishConditionCode" : "string",
  "finishRole" : "string",
  "id" : 0,
  "isCommit" : 0,
  "isConfigFileTask" : "string",
  "isDeliverFilePackage" : "string",
  "isEndTask" : 0,
  "isProjectFilePackage" : "string",
  "isReturn" : 0,
  "isViewFileTask" : "string",
  "lastOperatorDesc" : "string",
  "masterTaskId" : 0,
  "nodeCode" : "string",
  "participateRoleType" : "string",
  "planningBeginTime" : "string",
  "planningEndTime" : "string",
  "preConditionCode" : "string",
  "projectId" : 0,
  "roleType" : "string",
  "siteId" : 0,
  "sort" : 0,
  "stakeholderCode" : "string",
  "stakeholderCodeList" : [ "string" ],
  "status" : 0,
  "successTime" : "string",
  "taskName" : "string",
  "updateTime" : "string",
  "updateUser" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="updatesitedeliveryfileinfousingpost"></a>
#### 文件管理->更新中心交付文件信息
```
POST /ssuFile/updateSiteDeliveryFileInfo
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SSUSiteDeliveryInfoUpdate](#ssusitedeliveryinfoupdate)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmSiteDeliveryFile»](#873b4ee8277c411b2b91698d206257bf)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/ssuFile/updateSiteDeliveryFileInfo
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "archivePath" : "string",
  "archiveStatus" : 0,
  "detail" : "string",
  "fileId" : 0,
  "fileName" : "string",
  "fileType" : "string",
  "id" : 0,
  "isdeleted" : 0,
  "projectId" : 0,
  "siteId" : 0,
  "tag" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "archivePath" : "string",
    "archiveStatus" : 0,
    "archiveStatusDetail" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "fileId" : 0,
    "fileName" : "string",
    "fileRequire" : 0,
    "fileRequireName" : "string",
    "fileType" : "string",
    "flag" : 0,
    "folderId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "projectId" : 0,
    "quantity" : 0,
    "searchKey" : "string",
    "siteId" : 0,
    "subTaskId" : 0,
    "tag" : "string",
    "updateTime" : "string",
    "updateUser" : 0,
    "updateUserName" : "string"
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="e9d892fac8850be6238d023227df9945"></a>
### 中心文件管理-中心文件
中心文件相关接口管理


<a name="fileuploadusingpost"></a>
#### 中心文件-文件上传
```
POST /spmHospitalFile/addOrModify
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Query**|**fileId**  <br>*可选*|文件ID(新增时为0)|integer (int32)||
|**Query**|**fileName**  <br>*可选*|文件名称|string||
|**Query**|**flag**  <br>*可选*|是否更新文件标志(0 否 1是)|string||
|**Query**|**hospitalMainId**  <br>*可选*|医院主ID|integer (int32)||
|**Query**|**id**  <br>*可选*|主键ID(新增时为0)|integer (int32)||
|**Query**|**lable**  <br>*可选*|标签(多个用逗号隔开)|string||
|**Query**|**printFormat**  <br>*可选*|打印格式|integer (int32)||
|**Query**|**printQuantity**  <br>*可选*|打印份数|integer (int32)||
|**Query**|**realName**  <br>*可选*|实际文件名称|string||
|**Query**|**remark**  <br>*可选*|备注|string||
|**Query**|**type**  <br>*可选*|文件类型|integer (int32)||
|**FormData**|**request**  <br>*可选*|request|file||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`







##### HTTP请求示例

###### 请求 path
```
/spmHospitalFile/addOrModify
```


###### 请求 header
```
json :
"string"
```


###### 请求 query
```
json :
{
  "fileId" : 0,
  "fileName" : "string",
  "flag" : "string",
  "hospitalMainId" : 0,
  "id" : 0,
  "lable" : "string",
  "printFormat" : 0,
  "printQuantity" : 0,
  "realName" : "string",
  "remark" : "string",
  "type" : 0
}
```


###### 请求 formData
```
json :
"file"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="delfileusingdelete"></a>
#### 中心文件-文件删除
```
DELETE /spmHospitalFile/deleteFile/{id}/{fileId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**fileId**  <br>*可选*|文件id|integer (int32)||
|**Path**|**id**  <br>*可选*|主键id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmHospitalFile/deleteFile/0/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findfilepathusingget"></a>
#### 中心文件-查询文件路径
```
GET /spmHospitalFile/findFilePath/{fileId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**fileId**  <br>*必填*|fileId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«string»](#9668a7b1ed1a8a4a83d48793d5d416e7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmHospitalFile/findFilePath/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : "string",
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findhospitalinfousingget"></a>
#### 中心文件-查询中心信息
```
GET /spmHospitalFile/findHospitalInfo/{id}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**id**  <br>*必填*|id|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«IdName»](#863909f8a9141f668574431d45440433)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmHospitalFile/findHospitalInfo/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "id" : 0,
    "name" : "string"
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findfilelistusingpost"></a>
#### 中心文件-文件列表
```
POST /spmHospitalFile/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmHospitalFileSearch](#spmhospitalfilesearch)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmHospitalFileList»»](#1b7655f4446b63ff2ebad9cd99493eec)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmHospitalFile/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "hospitalMainId" : 0,
  "lable" : "string",
  "searchKey" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "createTime" : "string",
    "createUser" : 0,
    "fileId" : 0,
    "fileName" : "string",
    "hospitalMainId" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "lable" : "string",
    "lableDetail" : "string",
    "printFormat" : 0,
    "printFormatDetail" : "string",
    "printQuantity" : 0,
    "realName" : "string",
    "remark" : "string",
    "type" : 0,
    "typeDetail" : "string",
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="45824f4741cac329bfa4e88706182d8d"></a>
### 中心管理-中心
中心管理-中心接口管理


<a name="listusingpost_1"></a>
#### 中心-新增中心
```
POST /hospital/add
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmHospitalAddRequest](#spmhospitaladdrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmHospitalMain»](#8fc766ae41e047861a1d465859c750f5)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/hospital/add
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "city" : 0,
  "cityName" : "string",
  "hospitalId" : 0,
  "hospitalName" : "string",
  "province" : 0,
  "provinceName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "city" : 0,
    "cityName" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "hospitalId" : 0,
    "hospitalName" : "string",
    "id" : 0,
    "isdeleted" : 0,
    "province" : 0,
    "provinceName" : "string",
    "updateTime" : "string",
    "updateUser" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="listusingpost_3"></a>
#### 中心-中心区域(省份)
```
POST /hospital/area
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«IdName»»](#b58e663b873f77191bfb9ea1e9e49c97)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/hospital/area
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "id" : 0,
    "name" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="listusingpost_2"></a>
#### 中心-中心区域(城市)
```
POST /hospital/area/city/{provinceId}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**provinceId**  <br>*必填*|provinceId|integer (int32)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«IdName»»](#b58e663b873f77191bfb9ea1e9e49c97)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/hospital/area/city/0
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "id" : 0,
    "name" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="hospitalsearchusingpost"></a>
#### 中心-中心下拉列表
```
POST /hospital/dc/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[HospitalMainSearchRequest](#hospitalmainsearchrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|object|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/hospital/dc/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "city" : 0,
  "pageSize" : 0,
  "pages" : 0,
  "province" : 0,
  "searchKey" : "string",
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="listusingpost_4"></a>
#### 中心-中心列表
```
POST /hospital/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmHospitalPagesRequest](#spmhospitalpagesrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«BaseListTo«SpmHospitalMain»»](#595e0a508a2f192b8bd19e9a963886d0)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/hospital/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "city" : 0,
  "pageSize" : 0,
  "pages" : 0,
  "province" : 0,
  "searchKey" : "string",
  "totalSize" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "pageData" : [ {
      "city" : 0,
      "cityName" : "string",
      "createTime" : "string",
      "createUser" : 0,
      "hospitalId" : 0,
      "hospitalName" : "string",
      "id" : 0,
      "isdeleted" : 0,
      "province" : 0,
      "provinceName" : "string",
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "pageSize" : 0,
    "pages" : 0,
    "totalPages" : 0,
    "totalSize" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="searchlistusingpost"></a>
#### 中心-中心搜索列表
```
POST /hospital/search/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[OnlySearchKeyRequest](#onlysearchkeyrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«IdName»»](#b58e663b873f77191bfb9ea1e9e49c97)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/hospital/search/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "searchKey" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "id" : 0,
    "name" : "string"
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="926ac08843c1f757ae8e532b0daf7186"></a>
### 公共接口
公共接口


<a name="listbytypecodeusingget"></a>
#### 字典-根据typeCode获取列表
```
GET /common/list/byTypeCode/{typeCode}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**typeCode**  <br>*必填*|typeCode|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«CrmDictGeneral»»](#9bc9d0afadc7490398979d4a9620c7e0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/common/list/byTypeCode/string
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "code" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "name" : "string",
    "sort" : 0,
    "typeCode" : "string",
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="9bf5e4542f473ddea19d5b27c7956142"></a>
### 后端用户
后端用户—后端用户管理接口


<a name="loginbytokenusingpost"></a>
#### 后端用户-使用token登录
```
POST /admin/loginByToken
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«AdminUserLogin»](#e84ee3f18cca3a0746dd7787b3902444)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/admin/loginByToken
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "accessToken" : "string",
    "adminUser" : {
      "createTime" : "string",
      "createUser" : 0,
      "groupId" : "string",
      "id" : 0,
      "isdeleted" : 0,
      "lastLoginTime" : "string",
      "password" : "string",
      "realName" : "string",
      "status" : 0,
      "updateTime" : "string",
      "updateUser" : 0,
      "username" : "string"
    },
    "menus" : [ {
      "authName" : "string",
      "authUrl" : "string",
      "createTime" : "string",
      "createUser" : 0,
      "id" : 0,
      "isdeleted" : 0,
      "isshow" : 0,
      "pid" : 0,
      "selected" : true,
      "sort" : 0,
      "statusBoolean" : true,
      "type" : 0,
      "updateTime" : "string",
      "updateUser" : 0
    } ],
    "permissions" : [ {
      "authName" : "string",
      "authUrl" : "string",
      "groupId" : 0,
      "id" : 0,
      "productCode" : "string"
    } ]
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="7bcd89e7fdc0f2f6c32bd53b406e35ba"></a>
### 字典
字典-字典接口


<a name="listbytypecodeusingget_1"></a>
#### 字典-根据typeCode获取列表
```
GET /dictGeneral/list/byTypeCode/{typeCode}
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Path**|**typeCode**  <br>*必填*|typeCode|string||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«CrmDictGeneral»»](#9bc9d0afadc7490398979d4a9620c7e0)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/dictGeneral/list/byTypeCode/string
```


###### 请求 header
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "code" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "id" : 0,
    "isdeleted" : 0,
    "name" : "string",
    "sort" : 0,
    "typeCode" : "string",
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="8d84f9bd166cedbb33f068b3142d8ccc"></a>
### 快递相关
快递相关接口管理


<a name="addormodifyexpressinfousingpost"></a>
#### 快递相关接口管理--新增快递信息
```
POST /spmExpress/addOrModifyExpressInfo
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmExpressInfoAddRequest](#spmexpressinfoaddrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«SpmExpressInfo»](#196b22ed81670280a6c78ddb55f82860)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmExpress/addOrModifyExpressInfo
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "company" : "string",
  "detail" : "string",
  "expressNumber" : "string",
  "id" : 0,
  "isdeleted" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "remark" : "string",
  "siteId" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : {
    "company" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "expressNumber" : "string",
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "projectId" : 0,
    "remark" : "string",
    "siteId" : 0,
    "subTaskId" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="deleteexpressinfousingpost"></a>
#### 快递相关接口管理--删除快递信息
```
POST /spmExpress/delete
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmExpressInfoAddRequest](#spmexpressinfoaddrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«NullDataTo»](#57934316686d0c0f06bc4c9a5f3c6026)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmExpress/delete
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "company" : "string",
  "detail" : "string",
  "expressNumber" : "string",
  "id" : 0,
  "isdeleted" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "remark" : "string",
  "siteId" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : { },
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```


<a name="findexpressinfousingpost"></a>
#### 快递相关接口管理--查询快递信息
```
POST /spmExpress/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Header**|**access-token**  <br>*可选*|令牌|string|`"D9E61744C0C94905AD0E7C982E1406F7"`|
|**Header**|**product-code**  <br>*必填*|产品code|string|`"shuwen-web"`|
|**Header**|**version**  <br>*必填*|版本号|string|`"1.0.0"`|
|**Body**|**request**  <br>*必填*|request|[SpmExpressInfoSearchRequest](#spmexpressinfosearchrequest)||


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BaseApiResponse«List«SpmExpressInfo»»](#d26ce3cdae43a2fc3f6a6e4a0472d77f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`







##### HTTP请求示例

###### 请求 path
```
/spmExpress/list
```


###### 请求 header
```
json :
"string"
```


###### 请求 body
```
json :
{
  "company" : "string",
  "detail" : "string",
  "expressNumber" : "string",
  "isdeleted" : 0,
  "masterTaskCode" : "string",
  "projectId" : 0,
  "remark" : "string",
  "siteId" : 0,
  "subTaskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "data" : [ {
    "company" : "string",
    "createTime" : "string",
    "createUser" : 0,
    "detail" : "string",
    "expressNumber" : "string",
    "id" : 0,
    "isdeleted" : 0,
    "masterTaskCode" : "string",
    "projectId" : 0,
    "remark" : "string",
    "siteId" : 0,
    "subTaskId" : 0,
    "updateTime" : "string",
    "updateUser" : 0
  } ],
  "errorCode" : 0,
  "errorMessage" : "string",
  "status" : 0,
  "subCode" : 0,
  "subMessage" : "string"
}
```




<a name="definitions"></a>
## 定义

<a name="adminuserlogin"></a>
### AdminUserLogin

|名称|说明|类型|
|---|---|---|
|**accessToken**  <br>*可选*|**样例** : `"string"`|string|
|**adminUser**  <br>*可选*|**样例** : `"[crmadminuser](#crmadminuser)"`|[CrmAdminUser](#crmadminuser)|
|**menus**  <br>*可选*|系统的菜单  <br>**样例** : `[ "[crmauth](#crmauth)" ]`|< [CrmAuth](#crmauth) > array|
|**permissions**  <br>*可选*|**样例** : `[ "[permissionlogin](#permissionlogin)" ]`|< [PermissionLogin](#permissionlogin) > array|


<a name="answerinforeq"></a>
### AnswerInfoReq

|名称|说明|类型|
|---|---|---|
|**answerEndContent**  <br>*可选*|结尾的文本内容(结尾的文本内容)  <br>**样例** : `"string"`|string|
|**answerId**  <br>*可选*|回答id  <br>**样例** : `0`|integer (int32)|
|**optionId**  <br>*可选*|选项id  <br>**样例** : `0`|integer (int32)|
|**other**  <br>*可选*|存放hasOther为1的具体内容  <br>**样例** : `"string"`|string|
|**questionId**  <br>*可选*|题目id  <br>**样例** : `0`|integer (int32)|
|**questionType**  <br>*可选*|题目类型  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|详细信息(当result中的选项需要填写other信息，在remark中输入信息)  <br>**样例** : `"string"`|string|
|**result**  <br>*可选*|回答内容(如果是填空题，则直接存入用户输入的内容，如果是单选和多选，则在用户选择该答案时输入1，没有选择该答案时输入0)  <br>**样例** : `"string"`|string|


<a name="e84ee3f18cca3a0746dd7787b3902444"></a>
### BaseApiResponse«AdminUserLogin»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[adminuserlogin](#adminuserlogin)"`|[AdminUserLogin](#adminuserlogin)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="b7b0f67bd74e37f9c4ea433a214d674e"></a>
### BaseApiResponse«BaseListTo«CrmProjectList»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[a4e2c9dc26b77b56a7c141b24cb9f3a2](#a4e2c9dc26b77b56a7c141b24cb9f3a2)"`|[BaseListTo«CrmProjectList»](#a4e2c9dc26b77b56a7c141b24cb9f3a2)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="8be5b027134f86b20a2ff9b2b024d274"></a>
### BaseApiResponse«BaseListTo«SpmFollowRecordList»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[0dab062cd92873c8a685e593b22fbb80](#0dab062cd92873c8a685e593b22fbb80)"`|[BaseListTo«SpmFollowRecordList»](#0dab062cd92873c8a685e593b22fbb80)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="595e0a508a2f192b8bd19e9a963886d0"></a>
### BaseApiResponse«BaseListTo«SpmHospitalMain»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[3d7eea52e73b63ddbc80a5abebf72ab2](#3d7eea52e73b63ddbc80a5abebf72ab2)"`|[BaseListTo«SpmHospitalMain»](#3d7eea52e73b63ddbc80a5abebf72ab2)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="01ca60b95919ff858ff627b4ea95a646"></a>
### BaseApiResponse«BaseListTo«SpmWorkFollowRecordList»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[3f524fc91abbd5941f63aed4de264b02](#3f524fc91abbd5941f63aed4de264b02)"`|[BaseListTo«SpmWorkFollowRecordList»](#3f524fc91abbd5941f63aed4de264b02)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="94ab6350cb150feb0de0d4773c70afb3"></a>
### BaseApiResponse«BaseListTo«SpmWorkProjectList»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[b309d8191acb257ca295b48046f17f99](#b309d8191acb257ca295b48046f17f99)"`|[BaseListTo«SpmWorkProjectList»](#b309d8191acb257ca295b48046f17f99)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="602579a54974b0cdb8b427882283ab87"></a>
### BaseApiResponse«BaseListTo«SpmWorkSiteList»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[fe4a1d947cb8f0e4b86584d582895829](#fe4a1d947cb8f0e4b86584d582895829)"`|[BaseListTo«SpmWorkSiteList»](#fe4a1d947cb8f0e4b86584d582895829)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="75b61d6abd1b9dc840bcb470062d8ef2"></a>
### BaseApiResponse«BaseListTo«项目相关子任务信息»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[d78a1a21487d7893943fa0148c7b3c3f](#d78a1a21487d7893943fa0148c7b3c3f)"`|[BaseListTo«项目相关子任务信息»](#d78a1a21487d7893943fa0148c7b3c3f)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="863909f8a9141f668574431d45440433"></a>
### BaseApiResponse«IdName»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[idname](#idname)"`|[IdName](#idname)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="9bc9d0afadc7490398979d4a9620c7e0"></a>
### BaseApiResponse«List«CrmDictGeneral»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[crmdictgeneral](#crmdictgeneral)" ]`|< [CrmDictGeneral](#crmdictgeneral) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="241477bd0343f2dce371fd4479ef7b2b"></a>
### BaseApiResponse«List«CrmProjectSite»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[crmprojectsite](#crmprojectsite)" ]`|< [CrmProjectSite](#crmprojectsite) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="06241a5672fc7820f7a6543d28f82ec7"></a>
### BaseApiResponse«List«FolderTreeResponse»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[foldertreeresponse](#foldertreeresponse)" ]`|< [FolderTreeResponse](#foldertreeresponse) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="eafc25542a1e9eacfa728e063a7f1c79"></a>
### BaseApiResponse«List«IdNameTotal»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[idnametotal](#idnametotal)" ]`|< [IdNameTotal](#idnametotal) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="b58e663b873f77191bfb9ea1e9e49c97"></a>
### BaseApiResponse«List«IdName»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[idname](#idname)" ]`|< [IdName](#idname) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="a0e2c6ca4b70feb3823bd7f46e7925c2"></a>
### BaseApiResponse«List«SpmDeliveryFileTaskInfo»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmdeliveryfiletaskinfo](#spmdeliveryfiletaskinfo)" ]`|< [SpmDeliveryFileTaskInfo](#spmdeliveryfiletaskinfo) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="d26ce3cdae43a2fc3f6a6e4a0472d77f"></a>
### BaseApiResponse«List«SpmExpressInfo»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmexpressinfo](#spmexpressinfo)" ]`|< [SpmExpressInfo](#spmexpressinfo) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="1b7655f4446b63ff2ebad9cd99493eec"></a>
### BaseApiResponse«List«SpmHospitalFileList»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmhospitalfilelist](#spmhospitalfilelist)" ]`|< [SpmHospitalFileList](#spmhospitalfilelist) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="501a417b9c6ef80ace0bbef1a1a0837f"></a>
### BaseApiResponse«List«SpmProjectFileTaskInfo»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmprojectfiletaskinfo](#spmprojectfiletaskinfo)" ]`|< [SpmProjectFileTaskInfo](#spmprojectfiletaskinfo) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="7e21cc21030c67a4f21aab369548abfc"></a>
### BaseApiResponse«List«SpmProjectFileUser»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmprojectfileuser](#spmprojectfileuser)" ]`|< [SpmProjectFileUser](#spmprojectfileuser) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="011a5d56749468e21f36a57270744b24"></a>
### BaseApiResponse«List«SpmSiteFileBaseModuleDetail»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmsitefilebasemoduledetail](#spmsitefilebasemoduledetail)" ]`|< [SpmSiteFileBaseModuleDetail](#spmsitefilebasemoduledetail) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="d26320e3797902404f03323687f5d558"></a>
### BaseApiResponse«List«SpmSiteFileIntervalList»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmsitefileintervallist](#spmsitefileintervallist)" ]`|< [SpmSiteFileIntervalList](#spmsitefileintervallist) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="914064dac53e53f30ba31b62d20cf8b7"></a>
### BaseApiResponse«List«SpmSiteFileInterval»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmsitefileinterval](#spmsitefileinterval)" ]`|< [SpmSiteFileInterval](#spmsitefileinterval) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="908e5c5a892281ae3c40dfe0b46c35ab"></a>
### BaseApiResponse«List«SpmSiteFileModuleDetail»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmsitefilemoduledetail](#spmsitefilemoduledetail)" ]`|< [SpmSiteFileModuleDetail](#spmsitefilemoduledetail) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="802403e7dd587f7c0cad40acc17188f2"></a>
### BaseApiResponse«List«SpmTaskSuccessTimeInfo»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[spmtasksuccesstimeinfo](#spmtasksuccesstimeinfo)" ]`|< [SpmTaskSuccessTimeInfo](#spmtasksuccesstimeinfo) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="7efdb27dd20fc4af0f37c216ddd7ff3d"></a>
### BaseApiResponse«List«任务模块信息»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[f170c701f10ae7abf98cc465f487959e](#f170c701f10ae7abf98cc465f487959e)" ]`|< [任务模块信息](#f170c701f10ae7abf98cc465f487959e) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="11583d25dc4dc4dd04fdeaa7c95bc9a3"></a>
### BaseApiResponse«List«项目相关子任务信息»»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `[ "[e6f1f8917099526b58ff7d3540b382ed](#e6f1f8917099526b58ff7d3540b382ed)" ]`|< [项目相关子任务信息](#e6f1f8917099526b58ff7d3540b382ed) > array|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="57934316686d0c0f06bc4c9a5f3c6026"></a>
### BaseApiResponse«NullDataTo»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[nulldatato](#nulldatato)"`|[NullDataTo](#nulldatato)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="ddde6852ae3886419c24ae6ad053fcfe"></a>
### BaseApiResponse«SpmDeliveryFileTaskInfo»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[spmdeliveryfiletaskinfo](#spmdeliveryfiletaskinfo)"`|[SpmDeliveryFileTaskInfo](#spmdeliveryfiletaskinfo)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="196b22ed81670280a6c78ddb55f82860"></a>
### BaseApiResponse«SpmExpressInfo»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[spmexpressinfo](#spmexpressinfo)"`|[SpmExpressInfo](#spmexpressinfo)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="736d776fa8f680615189dfc862d26550"></a>
### BaseApiResponse«SpmFollowRecordList»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[spmfollowrecordlist](#spmfollowrecordlist)"`|[SpmFollowRecordList](#spmfollowrecordlist)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="05561208bf9f0c95ef40f7b0fe9acd96"></a>
### BaseApiResponse«SpmFollowRecordRelationInfo»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[spmfollowrecordrelationinfo](#spmfollowrecordrelationinfo)"`|[SpmFollowRecordRelationInfo](#spmfollowrecordrelationinfo)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="8fc766ae41e047861a1d465859c750f5"></a>
### BaseApiResponse«SpmHospitalMain»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[spmhospitalmain](#spmhospitalmain)"`|[SpmHospitalMain](#spmhospitalmain)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="1929d8123b207c6d287d898145bc4caf"></a>
### BaseApiResponse«SpmProjectFileTaskInfo»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[spmprojectfiletaskinfo](#spmprojectfiletaskinfo)"`|[SpmProjectFileTaskInfo](#spmprojectfiletaskinfo)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="873b4ee8277c411b2b91698d206257bf"></a>
### BaseApiResponse«SpmSiteDeliveryFile»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[spmsitedeliveryfile](#spmsitedeliveryfile)"`|[SpmSiteDeliveryFile](#spmsitedeliveryfile)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="81128f7644783e9c9d18dd4b7a6a151a"></a>
### BaseApiResponse«SsuProjectDetail»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[ssuprojectdetail](#ssuprojectdetail)"`|[SsuProjectDetail](#ssuprojectdetail)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="2e9de6f836ac2d556229adbd14d64b43"></a>
### BaseApiResponse«object»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="9668a7b1ed1a8a4a83d48793d5d416e7"></a>
### BaseApiResponse«string»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"string"`|string|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="f9fc1a2258011fe2c9d8abb3940d3890"></a>
### BaseApiResponse«任务进度列表»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[bc0b6714adc9afa9aee6dda5949a92de](#bc0b6714adc9afa9aee6dda5949a92de)"`|[任务进度列表](#bc0b6714adc9afa9aee6dda5949a92de)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="bf9d84534a285b43e740dd18ffc4b8d7"></a>
### BaseApiResponse«项目相关子任务信息»

|名称|说明|类型|
|---|---|---|
|**data**  <br>*可选*|**样例** : `"[e6f1f8917099526b58ff7d3540b382ed](#e6f1f8917099526b58ff7d3540b382ed)"`|[项目相关子任务信息](#e6f1f8917099526b58ff7d3540b382ed)|
|**errorCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**errorMessage**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subCode**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subMessage**  <br>*可选*|**样例** : `"string"`|string|


<a name="basefollowrecordrelation"></a>
### BaseFollowRecordRelation
*类型* : object


<a name="a4e2c9dc26b77b56a7c141b24cb9f3a2"></a>
### BaseListTo«CrmProjectList»

|名称|说明|类型|
|---|---|---|
|**pageData**  <br>*可选*|**样例** : `[ "[crmprojectlist](#crmprojectlist)" ]`|< [CrmProjectList](#crmprojectlist) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="0dab062cd92873c8a685e593b22fbb80"></a>
### BaseListTo«SpmFollowRecordList»

|名称|说明|类型|
|---|---|---|
|**pageData**  <br>*可选*|**样例** : `[ "[spmfollowrecordlist](#spmfollowrecordlist)" ]`|< [SpmFollowRecordList](#spmfollowrecordlist) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="3d7eea52e73b63ddbc80a5abebf72ab2"></a>
### BaseListTo«SpmHospitalMain»

|名称|说明|类型|
|---|---|---|
|**pageData**  <br>*可选*|**样例** : `[ "[spmhospitalmain](#spmhospitalmain)" ]`|< [SpmHospitalMain](#spmhospitalmain) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="3f524fc91abbd5941f63aed4de264b02"></a>
### BaseListTo«SpmWorkFollowRecordList»

|名称|说明|类型|
|---|---|---|
|**pageData**  <br>*可选*|**样例** : `[ "[spmworkfollowrecordlist](#spmworkfollowrecordlist)" ]`|< [SpmWorkFollowRecordList](#spmworkfollowrecordlist) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="b309d8191acb257ca295b48046f17f99"></a>
### BaseListTo«SpmWorkProjectList»

|名称|说明|类型|
|---|---|---|
|**pageData**  <br>*可选*|**样例** : `[ "[spmworkprojectlist](#spmworkprojectlist)" ]`|< [SpmWorkProjectList](#spmworkprojectlist) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="fe4a1d947cb8f0e4b86584d582895829"></a>
### BaseListTo«SpmWorkSiteList»

|名称|说明|类型|
|---|---|---|
|**pageData**  <br>*可选*|**样例** : `[ "[spmworksitelist](#spmworksitelist)" ]`|< [SpmWorkSiteList](#spmworksitelist) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="d78a1a21487d7893943fa0148c7b3c3f"></a>
### BaseListTo«项目相关子任务信息»

|名称|说明|类型|
|---|---|---|
|**pageData**  <br>*可选*|**样例** : `[ "[e6f1f8917099526b58ff7d3540b382ed](#e6f1f8917099526b58ff7d3540b382ed)" ]`|< [项目相关子任务信息](#e6f1f8917099526b58ff7d3540b382ed) > array|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalPages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="crmadminuser"></a>
### CrmAdminUser

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**groupId**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**lastLoginTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**password**  <br>*可选*|**样例** : `"string"`|string|
|**realName**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**username**  <br>*可选*|**样例** : `"string"`|string|


<a name="crmauth"></a>
### CrmAuth

|名称|说明|类型|
|---|---|---|
|**authName**  <br>*可选*|**样例** : `"string"`|string|
|**authUrl**  <br>*可选*|**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isshow**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**selected**  <br>*可选*|**样例** : `true`|boolean|
|**sort**  <br>*可选*|**样例** : `0`|integer (int32)|
|**statusBoolean**  <br>*可选*|**样例** : `true`|boolean|
|**type**  <br>*可选*|**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="crmdictgeneral"></a>
### CrmDictGeneral

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**sort**  <br>*可选*|**样例** : `0`|integer (int32)|
|**typeCode**  <br>*可选*|**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="crmprojectlist"></a>
### CrmProjectList

|名称|说明|类型|
|---|---|---|
|**businessManager**  <br>*可选*|**样例** : `0`|integer (int32)|
|**businessManagerName**  <br>*可选*|**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**hasGenetic**  <br>*可选*|是否有遗传办（0-没有 1-有）  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**indication**  <br>*可选*|适应症  <br>**样例** : `"string"`|string|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isinvesStart**  <br>*可选*|是否研究者发起(0：否 1：是)  <br>**样例** : `0`|integer (int32)|
|**mainProjectId**  <br>*可选*|主项目信息表主键ID  <br>**样例** : `0`|integer (int32)|
|**mergePsv**  <br>*可选*|合并PSV（0-不合并 1-合并）  <br>**样例** : `0`|integer (int32)|
|**opManager**  <br>*可选*|运营经理(从管理员表获取)  <br>**样例** : `0`|integer (int32)|
|**opManagerName**  <br>*可选*|**样例** : `"string"`|string|
|**projectCta**  <br>*可选*|项目CTA  <br>**样例** : `"string"`|string|
|**projectFullName**  <br>*可选*|项目完整名称  <br>**样例** : `"string"`|string|
|**projectManager**  <br>*可选*|项目经理(从管理员表获取)  <br>**样例** : `"string"`|string|
|**projectManagerName**  <br>*可选*|**样例** : `"string"`|string|
|**projectName**  <br>*可选*|项目简称  <br>**样例** : `"string"`|string|
|**projectNo**  <br>*可选*|内部项目编号  <br>**样例** : `"string"`|string|
|**projectSsuCtas**  <br>*可选*|**样例** : `[ "[idname](#idname)" ]`|< [IdName](#idname) > array|
|**projectType**  <br>*可选*|1-SMO项目 2-SSU项目 3-CRO项目  <br>**样例** : `0`|integer (int32)|
|**protocolName**  <br>*可选*|**样例** : `"string"`|string|
|**recommendedSiteCount**  <br>*可选*|已推荐中心数量  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**researchDrug**  <br>*可选*|研究药物  <br>**样例** : `"string"`|string|
|**serviceScope**  <br>*可选*|**样例** : `0`|integer (int32)|
|**serviceScopeDetail**  <br>*可选*|**样例** : `"string"`|string|
|**siteCount**  <br>*可选*|中心数量  <br>**样例** : `0`|integer (int32)|
|**siteFilterNumber**  <br>*可选*|筛选中心数  <br>**样例** : `0`|integer (int32)|
|**sitePlanNumber**  <br>*可选*|计划中心数  <br>**样例** : `0`|integer (int32)|
|**sort**  <br>*可选*|**样例** : `0`|integer (int32)|
|**spmProjectRemindInfo**  <br>*可选*|任务提醒相关  <br>**样例** : `"[spmprojectremindinfo](#spmprojectremindinfo)"`|[SpmProjectRemindInfo](#spmprojectremindinfo)|
|**spmProjectTaskCountInfo**  <br>*可选*|任务数量相关  <br>**样例** : `"[spmprojecttaskcountinfo](#spmprojecttaskcountinfo)"`|[SpmProjectTaskCountInfo](#spmprojecttaskcountinfo)|
|**sponsorName**  <br>*可选*|**样例** : `"string"`|string|
|**startDate**  <br>*可选*|启动日期  <br>**样例** : `"string"`|string (date-time)|
|**status**  <br>*可选*|项目状态(从字典中获取（project_status）)  <br>**样例** : `0`|integer (int32)|
|**statusDetail**  <br>*可选*|**样例** : `"string"`|string|
|**trialStages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**trialStagesDetail**  <br>*可选*|**样例** : `"string"`|string|
|**trialType**  <br>*可选*|**样例** : `0`|integer (int32)|
|**trialTypeDetail**  <br>*可选*|**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="crmprojectsite"></a>
### CrmProjectSite

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|城市ID(从公共接口获取（省市库）)  <br>**样例** : `0`|integer (int32)|
|**cityName**  <br>*可选*|城市名称  <br>**样例** : `"string"`|string|
|**commissioners**  <br>*可选*|ssu专员  <br>**样例** : `[ "[ssucommissioner](#ssucommissioner)" ]`|< [SsuCommissioner](#ssucommissioner) > array|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**departmentId**  <br>*可选*|**样例** : `"string"`|string|
|**departmentName**  <br>*可选*|医院科室名称  <br>**样例** : `"string"`|string|
|**displayName**  <br>*可选*|中心简称  <br>**样例** : `"string"`|string|
|**doctorAndDepartmentId**  <br>*可选*|**样例** : `"string"`|string|
|**hospitalId**  <br>*可选*|医院ID(从公共接口获取（医院库）)  <br>**样例** : `0`|integer (int32)|
|**hospitalName**  <br>*可选*|医院名称  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isleadingSite**  <br>*可选*|是否组长单位(0：否 1：是)  <br>**样例** : `0`|integer (int32)|
|**piDoctorId**  <br>*可选*|PI(从公共接口获取（医者库）)  <br>**样例** : `"string"`|string|
|**piDoctorName**  <br>*可选*|研究者名称  <br>**样例** : `"string"`|string|
|**pl**  <br>*可选*|项目组长id  <br>**样例** : `"string"`|string|
|**plName**  <br>*可选*|项目组长  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目基本信息表主键ID  <br>**样例** : `0`|integer (int32)|
|**projectName**  <br>*可选*|**样例** : `"string"`|string|
|**projectNo**  <br>*可选*|**样例** : `"string"`|string|
|**province**  <br>*可选*|省份ID(从公共接口获取（省市库）)  <br>**样例** : `0`|integer (int32)|
|**provinceName**  <br>*可选*|省份名称  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**siteNo**  <br>*可选*|中心编号  <br>**样例** : `"string"`|string|
|**siteRoleType**  <br>*可选*|**样例** : `"string"`|string|
|**sort**  <br>*可选*|**样例** : `0`|integer (int32)|
|**spmSiteNewFollowRecord**  <br>*可选*|**样例** : `"[spmsitenewfollowrecord](#spmsitenewfollowrecord)"`|[SpmSiteNewFollowRecord](#spmsitenewfollowrecord)|
|**spmSiteRemindInfo**  <br>*可选*|**样例** : `"[spmsiteremindinfo](#spmsiteremindinfo)"`|[SpmSiteRemindInfo](#spmsiteremindinfo)|
|**status**  <br>*可选*|**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="crmprojectsitelistrequest"></a>
### CrmProjectSiteListRequest

|名称|说明|类型|
|---|---|---|
|**apmId**  <br>*可选*|pl id  <br>**样例** : `0`|integer (int32)|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|状态  <br>**样例** : `0`|integer (int32)|


<a name="filesdownloadrequest"></a>
### FilesDownloadRequest

|名称|说明|类型|
|---|---|---|
|**filePaths**  <br>*可选*|文件/文件夹全路径  <br>**样例** : `[ "string" ]`|< string > array|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int32)|
|**rootPath**  <br>*可选*|根目录路径  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心id  <br>**样例** : `0`|integer (int32)|


<a name="findintervallistrequest"></a>
### FindIntervalListRequest

|名称|说明|类型|
|---|---|---|
|**flag**  <br>*可选*|0 查询新的 1 查询旧的  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|搜索条件可不传  <br>**样例** : `"string"`|string|
|**spmHospitalId**  <br>*可选*|spm中心id  <br>**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="folderaddrequest"></a>
### FolderAddRequest

|名称|说明|类型|
|---|---|---|
|**projectId**  <br>*必填*|项目ID  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|(文件名、分类、标签)模糊查询  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|文件目录类型(0：项目文件包通用目录 1：交付文件目录 2.立项 3.伦理 4.遗传办 5.递交文件目录)  <br>**样例** : `0`|integer (int32)|


<a name="folderfilenumrequest"></a>
### FolderFileNumRequest

|名称|说明|类型|
|---|---|---|
|**folderIds**  <br>*可选*|文件目录ID  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务ID  <br>**样例** : `0`|integer (int32)|


<a name="foldermodifyrequest"></a>
### FolderModifyRequest

|名称|说明|类型|
|---|---|---|
|**addFolderList**  <br>*可选*|新增目录列表  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**removeFolderList**  <br>*可选*|删除目录列表  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|目录类型(2.立项 3.伦理 4.遗传办)  <br>**样例** : `0`|integer (int32)|


<a name="foldertreeresponse"></a>
### FolderTreeResponse

|名称|说明|类型|
|---|---|---|
|**baseFolderType**  <br>*可选*|原目录类型  <br>**样例** : `0`|integer (int32)|
|**children**  <br>*可选*|子目录  <br>**样例** : `[ "[foldertreeresponse](#foldertreeresponse)" ]`|< [FolderTreeResponse](#foldertreeresponse) > array|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileId**  <br>*可选*|文件id  <br>**样例** : `0`|integer (int32)|
|**fileName**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**folderId**  <br>*可选*|文件目录ID  <br>**样例** : `0`|integer (int32)|
|**folderName**  <br>*可选*|文件夹名称  <br>**样例** : `"string"`|string|
|**folderParentId**  <br>*可选*|文件目录父级ID  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**path**  <br>*可选*|目录路径  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**siteName**  <br>*可选*|中心名称  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**type**  <br>*可选*|目录类型  <br>**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|更新人  <br>**样例** : `0`|integer (int32)|


<a name="hospitalmainsearchrequest"></a>
### HospitalMainSearchRequest

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**province**  <br>*可选*|**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|搜索条件，可不传  <br>**样例** : `"string"`|string|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="idname"></a>
### IdName

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|


<a name="idnametotal"></a>
### IdNameTotal

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**total**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="intervalreq"></a>
### IntervalReq

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|具体的日期  <br>**样例** : `"string"`|string (date-time)|
|**id**  <br>*可选*|id 新增的时候为0 删除的时候为具体的id  <br>**样例** : `0`|integer (int32)|


<a name="nulldatato"></a>
### NullDataTo
*类型* : object


<a name="onlypagesrequest"></a>
### OnlyPagesRequest

|名称|说明|类型|
|---|---|---|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|搜索条件可不传  <br>**样例** : `"string"`|string|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="onlysearchkeyrequest"></a>
### OnlySearchKeyRequest

|名称|说明|类型|
|---|---|---|
|**searchKey**  <br>*可选*|搜索条件，可不传  <br>**样例** : `"string"`|string|


<a name="permissionlogin"></a>
### PermissionLogin

|名称|说明|类型|
|---|---|---|
|**authName**  <br>*可选*|**样例** : `"string"`|string|
|**authUrl**  <br>*可选*|**样例** : `"string"`|string|
|**groupId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**productCode**  <br>*可选*|**样例** : `"string"`|string|


<a name="ssuprojectfileaddormodifyrequest"></a>
### SSUProjectFileAddOrModifyRequest

|名称|说明|类型|
|---|---|---|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileName**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**fileType**  <br>*可选*|分类  <br>**样例** : `"string"`|string|
|**folderId**  <br>*可选*|文件夹ID（分类）  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**version**  <br>*可选*|版本号  <br>**样例** : `"string"`|string|
|**versionDate**  <br>*可选*|版本时间  <br>**样例** : `"string"`|string|


<a name="ssusiteapproveaddormodifyrequest"></a>
### SSUSiteApproveAddOrModifyRequest

|名称|说明|类型|
|---|---|---|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileId**  <br>*可选*|文件id  <br>**样例** : `0`|integer (int32)|
|**fileName**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**fileStatus**  <br>*可选*|文件状态(0:中心文件 1:项目文件)  <br>**样例** : `0`|integer (int32)|
|**fileType**  <br>*可选*|文件分类  <br>**样例** : `"string"`|string|
|**folderId**  <br>*可选*|目录ID  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID(新增时为0)  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**printOrder**  <br>*可选*|打印要求  <br>**样例** : `0`|integer (int32)|
|**printUser**  <br>*可选*|打印对象  <br>**样例** : `0`|integer (int32)|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**quantity**  <br>*可选*|打印数量  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**version**  <br>*可选*|版本号  <br>**样例** : `"string"`|string|
|**versionDate**  <br>*可选*|版本时间  <br>**样例** : `"string"`|string|


<a name="ssusiteapproverequest"></a>
### SSUSiteApproveRequest

|名称|说明|类型|
|---|---|---|
|**fileStatus**  <br>*可选*|文件状态(0:中心文件 1:项目文件 查询全部参数不传)  <br>**样例** : `0`|integer (int32)|
|**folderId**  <br>*可选*|目录id  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目id(不能为空)  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|(文件名、分类、标签)模糊查询  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心id(不能为空)  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**userType**  <br>*可选*|用户类型(0:CTA 1:CRA)  <br>**样例** : `0`|integer (int32)|


<a name="ssusitedeliveryinfoupdate"></a>
### SSUSiteDeliveryInfoUpdate

|名称|说明|类型|
|---|---|---|
|**archivePath**  <br>*可选*|归档文件夹  <br>**样例** : `"string"`|string|
|**archiveStatus**  <br>*可选*|归档状态  <br>**样例** : `0`|integer (int32)|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileId**  <br>*可选*|文件ID  <br>**样例** : `0`|integer (int32)|
|**fileName**  <br>*可选*|文件名称  <br>**样例** : `"string"`|string|
|**fileType**  <br>*可选*|文件类型  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标记  <br>**样例** : `"string"`|string|


<a name="ssusitedeliveryrequest"></a>
### SSUSiteDeliveryRequest

|名称|说明|类型|
|---|---|---|
|**folderId**  <br>*可选*|目录id  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目id(不能为空)  <br>**样例** : `0`|integer (int32)|
|**roleType**  <br>*可选*|角色类型(0:PM 1:CTA 2:CRA)  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|(文件名、分类、标签)模糊查询  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心id(不能为空)  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|


<a name="spmdeliveryfiletaskinfo"></a>
### SpmDeliveryFileTaskInfo

|名称|说明|类型|
|---|---|---|
|**archivePath**  <br>*可选*|归档文件夹  <br>**样例** : `"string"`|string|
|**archiveStatus**  <br>*可选*|归档状态  <br>**样例** : `0`|integer (int32)|
|**archiveStatusDetail**  <br>*可选*|归档状态详情  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileId**  <br>*可选*|文件ID  <br>**样例** : `0`|integer (int32)|
|**fileName**  <br>*可选*|文件名称  <br>**样例** : `"string"`|string|
|**fileRequire**  <br>*可选*|归档要求(0:无 1:原件 2:复印件)  <br>**样例** : `0`|integer (int32)|
|**fileRequireName**  <br>*可选*|归档要求中文名(0:无 1:原件 2:复印件)  <br>**样例** : `"string"`|string|
|**fileType**  <br>*可选*|文件类型  <br>**样例** : `"string"`|string|
|**flag**  <br>*可选*|更新文件标志位  <br>**样例** : `0`|integer (int32)|
|**folderId**  <br>*可选*|文件目录ID  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**quantity**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|(文件名、分类、标签)模糊查询  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标记  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|更新人  <br>**样例** : `0`|integer (int32)|
|**updateUserName**  <br>*可选*|**样例** : `"string"`|string|


<a name="spmdeliverytemplateaddormodifyrequest"></a>
### SpmDeliveryTemplateAddOrModifyRequest

|名称|说明|类型|
|---|---|---|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileName**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**fileRequire**  <br>*可选*|归档要求(0:无 1:原件 2:复印件)  <br>**样例** : `0`|integer (int32)|
|**fileType**  <br>*可选*|文件分类  <br>**样例** : `"string"`|string|
|**folderId**  <br>*可选*|文件夹ID（分类）  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键id新增时为0  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**quantity**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标记  <br>**样例** : `"string"`|string|


<a name="spmexpressinfo"></a>
### SpmExpressInfo

|名称|说明|类型|
|---|---|---|
|**company**  <br>*可选*|**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**detail**  <br>*可选*|**样例** : `"string"`|string|
|**expressNumber**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|**样例** : `"string"`|string|
|**projectId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|**样例** : `"string"`|string|
|**siteId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmexpressinfoaddrequest"></a>
### SpmExpressInfoAddRequest

|名称|说明|类型|
|---|---|---|
|**company**  <br>*可选*|快递公司  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**expressNumber**  <br>*可选*|快递单号  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|主键id(新增时为0)  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|


<a name="spmexpressinfosearchrequest"></a>
### SpmExpressInfoSearchRequest

|名称|说明|类型|
|---|---|---|
|**company**  <br>*可选*|快递公司  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**expressNumber**  <br>*可选*|快递单号  <br>**样例** : `"string"`|string|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|


<a name="spmfileinfosearchrequest"></a>
### SpmFileInfoSearchRequest

|名称|说明|类型|
|---|---|---|
|**folderIds**  <br>*可选*|文件夹ID(父目录需要把所有子目录id传过来)  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**id**  <br>*可选*|ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|(文件名、分类、标签)模糊查询  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|


<a name="spmfollowrecordaddrequest"></a>
### SpmFollowRecordAddRequest

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|**样例** : `"string"`|string|
|**subTaskId**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmfollowrecordlist"></a>
### SpmFollowRecordList

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**createUserName**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isRead**  <br>*可选*|0:未读 1 已读  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**relationId**  <br>*可选*|关联id(关联id)  <br>**样例** : `"string"`|string|
|**relationName**  <br>*可选*|关联的名称  <br>**样例** : `"string"`|string|
|**relationType**  <br>*可选*|关联类型  <br>**样例** : `"string"`|string|
|**role**  <br>*可选*|**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|子任务Id  <br>**样例** : `0`|integer (int32)|


<a name="spmfollowrecordlistrequest"></a>
### SpmFollowRecordListRequest

|名称|说明|类型|
|---|---|---|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|搜索条件可不传  <br>**样例** : `"string"`|string|
|**subTaskId**  <br>*可选*|子任务Id  <br>**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmfollowrecordrelationinfo"></a>
### SpmFollowRecordRelationInfo

|名称|说明|类型|
|---|---|---|
|**followRecordId**  <br>*可选*|跟进记录id  <br>**样例** : `0`|integer (int32)|
|**followRecordRelations**  <br>*可选*|**样例** : `[ "[basefollowrecordrelation](#basefollowrecordrelation)" ]`|< [BaseFollowRecordRelation](#basefollowrecordrelation) > array|
|**relationId**  <br>*可选*|**样例** : `"string"`|string|
|**relationType**  <br>*可选*|**样例** : `"string"`|string|


<a name="spmhospitaladdrequest"></a>
### SpmHospitalAddRequest

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `0`|integer (int32)|
|**cityName**  <br>*可选*|**样例** : `"string"`|enum (城市)|
|**hospitalId**  <br>*必填*|医院id  <br>**样例** : `0`|integer (int32)|
|**hospitalName**  <br>*可选*|**样例** : `"string"`|enum (中心名称)|
|**province**  <br>*可选*|**样例** : `0`|integer (int32)|
|**provinceName**  <br>*可选*|**样例** : `"string"`|enum (省份)|


<a name="spmhospitalfilelist"></a>
### SpmHospitalFileList

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**fileId**  <br>*可选*|文件id  <br>**样例** : `0`|integer (int32)|
|**fileName**  <br>*可选*|文件名称  <br>**样例** : `"string"`|string|
|**hospitalMainId**  <br>*可选*|医院主表id  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键id  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**lable**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**lableDetail**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**printFormat**  <br>*可选*|打印格式  <br>**样例** : `0`|integer (int32)|
|**printFormatDetail**  <br>*可选*|打印格式  <br>**样例** : `"string"`|string|
|**printQuantity**  <br>*可选*|打印份数  <br>**样例** : `0`|integer (int32)|
|**realName**  <br>*可选*|实际文件名称  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|文件类型  <br>**样例** : `0`|integer (int32)|
|**typeDetail**  <br>*可选*|文件类型  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmhospitalfilesearch"></a>
### SpmHospitalFileSearch

|名称|说明|类型|
|---|---|---|
|**hospitalMainId**  <br>*可选*|spm医院id  <br>**样例** : `0`|integer (int32)|
|**lable**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**searchKey**  <br>*可选*|文件名称  <br>**样例** : `"string"`|string|
|**type**  <br>*可选*|文件类型  <br>**样例** : `0`|integer (int32)|


<a name="spmhospitalmain"></a>
### SpmHospitalMain

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `0`|integer (int32)|
|**cityName**  <br>*可选*|**样例** : `"string"`|string|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**hospitalId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**hospitalName**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**province**  <br>*可选*|**样例** : `0`|integer (int32)|
|**provinceName**  <br>*可选*|**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmhospitalpagesrequest"></a>
### SpmHospitalPagesRequest

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|城市  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**province**  <br>*可选*|省份  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|医院名称  <br>**样例** : `"string"`|string|
|**totalSize**  <br>*可选*|第一次获取传0，后面传返回的数据  <br>**样例** : `0`|integer (int32)|


<a name="spmprojectfiletaskinfo"></a>
### SpmProjectFileTaskInfo

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileId**  <br>*可选*|文件id  <br>**样例** : `0`|integer (int32)|
|**fileName**  <br>*可选*|名称  <br>**样例** : `"string"`|string|
|**fileStatus**  <br>*可选*|文件状态(0:中心文件 1:项目文件)  <br>**样例** : `0`|integer (int32)|
|**fileType**  <br>*可选*|文件分类  <br>**样例** : `"string"`|string|
|**flag**  <br>*可选*|更新文件标志位  <br>**样例** : `0`|integer (int32)|
|**folderId**  <br>*可选*|目录ID  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**printOrder**  <br>*可选*|打印要求  <br>**样例** : `0`|integer (int32)|
|**printOrderName**  <br>*可选*|打印要求中文  <br>**样例** : `"string"`|string|
|**printUser**  <br>*可选*|打印对象  <br>**样例** : `0`|integer (int32)|
|**printUserDetail**  <br>*可选*|打印对象详情  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**quantity**  <br>*可选*|打印数量  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**searchKey**  <br>*可选*|searchKey  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|状态  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标签  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|更新人  <br>**样例** : `0`|integer (int32)|
|**version**  <br>*可选*|版本号  <br>**样例** : `"string"`|string|
|**versionDate**  <br>*可选*|版本时间  <br>**样例** : `"string"`|string|


<a name="spmprojectfileuser"></a>
### SpmProjectFileUser

|名称|说明|类型|
|---|---|---|
|**adminUserId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|**样例** : `0`|integer (int32)|
|**projectId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmprojectremindinfo"></a>
### SpmProjectRemindInfo

|名称|说明|类型|
|---|---|---|
|**contractRemind**  <br>*可选*|合同中消息提醒  0 没有  <br>**样例** : `0`|integer (int32)|
|**ethicRemind**  <br>*可选*|伦理中消息提醒  0 没有  <br>**样例** : `0`|integer (int32)|
|**handoverRemind**  <br>*可选*|交接中消息提醒  0 没有  <br>**样例** : `0`|integer (int32)|
|**inheritanceRemind**  <br>*可选*|遗传办中消息提醒  0 没有  <br>**样例** : `0`|integer (int32)|
|**projectApprovalRemind**  <br>*可选*|立项中消息提醒  0 没有  <br>**样例** : `0`|integer (int32)|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int32)|
|**surveyRemind**  <br>*可选*|调研中消息提醒  0 没有  <br>**样例** : `0`|integer (int32)|


<a name="spmprojectsubtaskinfodetail"></a>
### SpmProjectSubTaskInfoDetail

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|**样例** : `0`|integer (int32)|
|**description**  <br>*可选*|**样例** : `"string"`|string|
|**finishConditionCode**  <br>*可选*|**样例** : `"string"`|string|
|**finishRole**  <br>*可选*|**样例** : `"string"`|string|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isCommit**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isConfigFileTask**  <br>*可选*|**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**isDeliverFilePackage**  <br>*可选*|**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**isEndTask**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isProjectFilePackage**  <br>*可选*|**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**isReturn**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isViewFileTask**  <br>*可选*|**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**lastOperatorDesc**  <br>*可选*|**样例** : `"string"`|string|
|**masterTaskId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**nodeCode**  <br>*可选*|**样例** : `"string"`|string|
|**participateRoleType**  <br>*可选*|**样例** : `"string"`|string|
|**planningBeginTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**planningEndTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**preConditionCode**  <br>*可选*|**样例** : `"string"`|string|
|**projectId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**roleType**  <br>*可选*|**样例** : `"string"`|string|
|**siteId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**sort**  <br>*可选*|**样例** : `0`|integer (int32)|
|**stakeholderCode**  <br>*可选*|干系人code  <br>**样例** : `"string"`|string|
|**stakeholderCodeList**  <br>*可选*|**样例** : `[ "string" ]`|< string > array|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**successTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**taskName**  <br>*可选*|**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmprojecttaskcountinfo"></a>
### SpmProjectTaskCountInfo

|名称|说明|类型|
|---|---|---|
|**contractCount**  <br>*可选*|合同中  <br>**样例** : `0`|integer (int32)|
|**ethicCount**  <br>*可选*|伦理中  <br>**样例** : `0`|integer (int32)|
|**handoverCount**  <br>*可选*|交接中  <br>**样例** : `0`|integer (int32)|
|**inheritanceCount**  <br>*可选*|遗传办中  <br>**样例** : `0`|integer (int32)|
|**projectApprovalCount**  <br>*可选*|立项中  <br>**样例** : `0`|integer (int32)|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int32)|
|**successCount**  <br>*可选*|已完成数量  <br>**样例** : `0`|integer (int32)|
|**surveyCount**  <br>*可选*|调研中  <br>**样例** : `0`|integer (int32)|
|**surveyFailCount**  <br>*可选*|调研失败数量  <br>**样例** : `0`|integer (int32)|
|**surveySuccessCount**  <br>*可选*|调研成功数量  <br>**样例** : `0`|integer (int32)|


<a name="spmsitedeliveryfile"></a>
### SpmSiteDeliveryFile

|名称|说明|类型|
|---|---|---|
|**archivePath**  <br>*可选*|归档文件夹  <br>**样例** : `"string"`|string|
|**archiveStatus**  <br>*可选*|归档状态  <br>**样例** : `0`|integer (int32)|
|**archiveStatusDetail**  <br>*可选*|归档状态详情  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**detail**  <br>*可选*|描述  <br>**样例** : `"string"`|string|
|**fileId**  <br>*可选*|文件ID  <br>**样例** : `0`|integer (int32)|
|**fileName**  <br>*可选*|文件名称  <br>**样例** : `"string"`|string|
|**fileRequire**  <br>*可选*|归档要求(0:无 1:原件 2:复印件)  <br>**样例** : `0`|integer (int32)|
|**fileRequireName**  <br>*可选*|归档要求中文名(0:无 1:原件 2:复印件)  <br>**样例** : `"string"`|string|
|**fileType**  <br>*可选*|文件类型  <br>**样例** : `"string"`|string|
|**flag**  <br>*可选*|更新文件标志位  <br>**样例** : `0`|integer (int32)|
|**folderId**  <br>*可选*|文件目录ID  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|任务类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**quantity**  <br>*可选*|数量  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|(文件名、分类、标签)模糊查询  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*可选*|任务id  <br>**样例** : `0`|integer (int32)|
|**tag**  <br>*可选*|标记  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|更新人  <br>**样例** : `0`|integer (int32)|
|**updateUserName**  <br>*可选*|**样例** : `"string"`|string|


<a name="spmsitefileansweraddormodifyrequest"></a>
### SpmSiteFileAnswerAddOrModifyRequest

|名称|说明|类型|
|---|---|---|
|**answerInfoReqs**  <br>*可选*|**样例** : `[ "[answerinforeq](#answerinforeq)" ]`|< [AnswerInfoReq](#answerinforeq) > array|
|**intervalReqs**  <br>*可选*|上会时间操作数据  <br>**样例** : `[ "[intervalreq](#intervalreq)" ]`|< [IntervalReq](#intervalreq) > array|
|**spmHospitalId**  <br>*可选*|spm中心id  <br>**样例** : `0`|integer (int32)|


<a name="spmsitefileanswerdetailinfo"></a>
### SpmSiteFileAnswerDetailInfo

|名称|说明|类型|
|---|---|---|
|**answerEndContent**  <br>*可选*|结尾的文本内容(结尾的文本内容)  <br>**样例** : `"string"`|string|
|**answerId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**endContent**  <br>*可选*|结尾的文本内容(结尾的文本内容，存在下拉选择以逗号分隔)  <br>**样例** : `"string"`|string|
|**hasOther**  <br>*可选*|是否需要填写详细信息(0：否 1：是)  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**optionName**  <br>*可选*|题目选项(选择题才会有选项值，如果是填空和上传都为空)  <br>**样例** : `"string"`|string|
|**other**  <br>*可选*|**样例** : `"string"`|string|
|**questionId**  <br>*可选*|问题ID(关联qc_question的主键ID)  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|详细信息(当result中的选项需要填写other信息，在remark中输入信息)  <br>**样例** : `"string"`|string|
|**result**  <br>*可选*|回答内容(如果是填空题，则直接存入用户输入的内容，如果是上传题则放入url，如果是单选和多选，则在用户选择该答案时输入1，没有选择该答案时输入0)  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|序号  <br>**样例** : `0`|integer (int32)|
|**spmSiteFileQuestionDetails**  <br>*可选*|**样例** : `[ "[spmsitefilequestiondetail](#spmsitefilequestiondetail)" ]`|< [SpmSiteFileQuestionDetail](#spmsitefilequestiondetail) > array|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|修改人  <br>**样例** : `0`|integer (int32)|


<a name="spmsitefilebaseinfodetail"></a>
### SpmSiteFileBaseInfoDetail

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|题目描述  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**questionNo**  <br>*可选*|问题序号(问题序号)  <br>**样例** : `"string"`|string|
|**remark**  <br>*可选*|**样例** : `"string"`|string|
|**type**  <br>*可选*|1：单选 2：多选  3：填空 4、日期 5 接待时间6伦理上会日期  <br>**样例** : `0`|integer (int32)|
|**value**  <br>*可选*|题目答案  <br>**样例** : `"string"`|string|


<a name="spmsitefilebasemoduledetail"></a>
### SpmSiteFileBaseModuleDetail

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除(0：未删除 1：已删除)  <br>**样例** : `0`|integer (int32)|
|**moduleName**  <br>*可选*|模块名  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**spmHospitalFileLists**  <br>*可选*|**样例** : `[ "[spmhospitalfilelist](#spmhospitalfilelist)" ]`|< [SpmHospitalFileList](#spmhospitalfilelist) > array|
|**spmSiteFileBaseInfoDetails**  <br>*可选*|**样例** : `[ "[spmsitefilebaseinfodetail](#spmsitefilebaseinfodetail)" ]`|< [SpmSiteFileBaseInfoDetail](#spmsitefilebaseinfodetail) > array|


<a name="spmsitefileinterval"></a>
### SpmSiteFileInterval

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**date**  <br>*可选*|上会日期  <br>**样例** : `"string"`|string (date-time)|
|**hospitalId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除(0：未删除 1：已删除)  <br>**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|修改人  <br>**样例** : `0`|integer (int32)|


<a name="spmsitefileintervallist"></a>
### SpmSiteFileIntervalList

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**date**  <br>*可选*|上会日期  <br>**样例** : `"string"`|string (date-time)|
|**dateInfo**  <br>*可选*|**样例** : `"string"`|string|
|**hospitalId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**indexFlag**  <br>*可选*|**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除(0：未删除 1：已删除)  <br>**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|修改人  <br>**样例** : `0`|integer (int32)|


<a name="spmsitefilemoduledetail"></a>
### SpmSiteFileModuleDetail

|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除(0：未删除 1：已删除)  <br>**样例** : `0`|integer (int32)|
|**moduleName**  <br>*可选*|模块名  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**spmSiteFileQuestionDetails**  <br>*可选*|**样例** : `[ "[spmsitefilequestiondetail](#spmsitefilequestiondetail)" ]`|< [SpmSiteFileQuestionDetail](#spmsitefilequestiondetail) > array|


<a name="spmsitefilequestiondetail"></a>
### SpmSiteFileQuestionDetail

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|题目描述  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|主键ID  <br>**样例** : `0`|integer (int32)|
|**isRemark**  <br>*可选*|是否有备注(是否有备注信息0-否 1-是)  <br>**样例** : `0`|integer (int32)|
|**isdeleted**  <br>*可选*|是否删除(0：未删除 1：已删除)  <br>**样例** : `0`|integer (int32)|
|**moduleId**  <br>*可选*|spm_site_file_module id  <br>**样例** : `0`|integer (int32)|
|**parentOptionId**  <br>*可选*|选项表id(关联选项表的主键ID)  <br>**样例** : `0`|integer (int32)|
|**questionCode**  <br>*可选*|问题code  <br>**样例** : `"string"`|string|
|**questionNo**  <br>*可选*|问题序号(问题序号)  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**spmSiteFileAnswerDetailInfos**  <br>*可选*|**样例** : `[ "[spmsitefileanswerdetailinfo](#spmsitefileanswerdetailinfo)" ]`|< [SpmSiteFileAnswerDetailInfo](#spmsitefileanswerdetailinfo) > array|
|**type**  <br>*可选*|1：单选 2：多选  3：填空 4、日期 5 接待时间6伦理上会日期  <br>**样例** : `0`|integer (int32)|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|修改人  <br>**样例** : `0`|integer (int32)|


<a name="spmsitenewfollowrecord"></a>
### SpmSiteNewFollowRecord

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|跟进记录文本内容  <br>**样例** : `"string"`|string|
|**followRecordId**  <br>*可选*|跟进记录id  <br>**样例** : `0`|integer (int32)|
|**planningEndTime**  <br>*可选*|计划完成结束时间  <br>**样例** : `"string"`|string (date-time)|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|中心id  <br>**样例** : `0`|integer (int32)|
|**subTaskInfoId**  <br>*可选*|子任务id  <br>**样例** : `0`|integer (int32)|
|**taskName**  <br>*可选*|子任务名  <br>**样例** : `"string"`|string|


<a name="spmsiteplan"></a>
### SpmSitePlan

|名称|说明|类型|
|---|---|---|
|**approvalPlanSubmitDate**  <br>*可选*|立项计划递交日期  <br>**样例** : `"string"`|string (date-time)|
|**approvalPlanSuccessDate**  <br>*可选*|立项计划完成日期  <br>**样例** : `"string"`|string (date-time)|
|**contractPlanExamineDate**  <br>*可选*|合同计划审核完成日期  <br>**样例** : `"string"`|string (date-time)|
|**contractPlanSignDate**  <br>*可选*|合同计划签署日期  <br>**样例** : `"string"`|string (date-time)|
|**contractPlanSubmitDate**  <br>*可选*|合同计划递交机构日期  <br>**样例** : `"string"`|string (date-time)|
|**contractPlanSubmitPiDate**  <br>*可选*|合同计划递交pi日期  <br>**样例** : `"string"`|string (date-time)|
|**ethicPlanApprovalDate**  <br>*可选*|伦理计划批准日期  <br>**样例** : `"string"`|string (date-time)|
|**ethicPlanIntervalDate**  <br>*可选*|伦理计划上会日期  <br>**样例** : `"string"`|string (date-time)|
|**ethicPlanSubmitDate**  <br>*可选*|伦理计划递交日期  <br>**样例** : `"string"`|string (date-time)|
|**geneticPlanGetDate**  <br>*可选*|遗传办计划获得承诺书日期  <br>**样例** : `"string"`|string (date-time)|
|**geneticPlanSubmitDate**  <br>*可选*|遗传办计划递交日期  <br>**样例** : `"string"`|string (date-time)|
|**planFilterDate**  <br>*可选*|计划筛选日期  <br>**样例** : `"string"`|string (date-time)|
|**planHandoverDate**  <br>*可选*|计划交接日期  <br>**样例** : `"string"`|string (date-time)|
|**planStartUpDate**  <br>*可选*|计划启动日期  <br>**样例** : `"string"`|string (date-time)|
|**planSurveyDate**  <br>*可选*|计划调研日期  <br>**样例** : `"string"`|string (date-time)|
|**projectId**  <br>*可选*|项目id  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|中心id  <br>**样例** : `0`|integer (int32)|


<a name="spmsiteremindinfo"></a>
### SpmSiteRemindInfo

|名称|说明|类型|
|---|---|---|
|**projectId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**remindCount**  <br>*可选*|未读提醒数量  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="spmtasksuccesstimeinfo"></a>
### SpmTaskSuccessTimeInfo

|名称|说明|类型|
|---|---|---|
|**approvalSuccessSubmitDate**  <br>*可选*|立项完成递交日期  <br>**样例** : `"string"`|string (date-time)|
|**approvalSuccessSuccessDate**  <br>*可选*|立项完成完成日期  <br>**样例** : `"string"`|string (date-time)|
|**contractSuccessExamineDate**  <br>*可选*|合同完成审核完成日期  <br>**样例** : `"string"`|string (date-time)|
|**contractSuccessSignDate**  <br>*可选*|合同完成签署日期  <br>**样例** : `"string"`|string (date-time)|
|**contractSuccessSubmitDate**  <br>*可选*|合同完成递交机构日期  <br>**样例** : `"string"`|string (date-time)|
|**contractSuccessSubmitPiDate**  <br>*可选*|合同完成递交pi日期  <br>**样例** : `"string"`|string (date-time)|
|**ethicSuccessApprovalDate**  <br>*可选*|伦理完成批准日期  <br>**样例** : `"string"`|string (date-time)|
|**ethicSuccessIntervalDate**  <br>*可选*|伦理完成上会日期  <br>**样例** : `"string"`|string (date-time)|
|**ethicSuccessSubmitDate**  <br>*可选*|伦理完成递交日期  <br>**样例** : `"string"`|string (date-time)|
|**geneticSuccessGetDate**  <br>*可选*|遗传办完成获得承诺书日期  <br>**样例** : `"string"`|string (date-time)|
|**geneticSuccessSubmitDate**  <br>*可选*|遗传办完成递交日期  <br>**样例** : `"string"`|string (date-time)|
|**siteId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**successFilterDate**  <br>*可选*|完成筛选日期  <br>**样例** : `"string"`|string (date-time)|
|**successHandoverDate**  <br>*可选*|完成交接日期  <br>**样例** : `"string"`|string (date-time)|
|**successStartUpDate**  <br>*可选*|完成启动日期  <br>**样例** : `"string"`|string (date-time)|
|**successSurveyDate**  <br>*可选*|完成调研日期  <br>**样例** : `"string"`|string (date-time)|


<a name="spmworkfollowrecordlist"></a>
### SpmWorkFollowRecordList

|名称|说明|类型|
|---|---|---|
|**content**  <br>*可选*|内容  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string (date-time)|
|**createUser**  <br>*可选*|创建人id  <br>**样例** : `0`|integer (int32)|
|**createUserName**  <br>*可选*|创建人名称  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**projectName**  <br>*可选*|项目简称  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心id  <br>**样例** : `0`|integer (int32)|
|**siteName**  <br>*可选*|中心简称  <br>**样例** : `"string"`|string|
|**siteRoleType**  <br>*可选*|**样例** : `"string"`|string|
|**subTaskId**  <br>*可选*|子任务id  <br>**样例** : `0`|integer (int32)|
|**subTaskName**  <br>*可选*|子任务名称  <br>**样例** : `"string"`|string|


<a name="spmworkprojectlist"></a>
### SpmWorkProjectList

|名称|说明|类型|
|---|---|---|
|**projectId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**projectName**  <br>*可选*|项目简称  <br>**样例** : `"string"`|string|
|**projectNo**  <br>*可选*|内部项目编号  <br>**样例** : `"string"`|string|
|**siteCount**  <br>*可选*|中心总数  <br>**样例** : `0`|integer (int32)|
|**successCount**  <br>*可选*|已完成中心数  <br>**样例** : `0`|integer (int32)|
|**surveySuccessCount**  <br>*可选*|筛选成功中心数  <br>**样例** : `0`|integer (int32)|


<a name="spmworksitelist"></a>
### SpmWorkSiteList

|名称|说明|类型|
|---|---|---|
|**projectId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**projectName**  <br>*可选*|项目简称  <br>**样例** : `"string"`|string|
|**projectNo**  <br>*可选*|内部项目编号  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心id  <br>**样例** : `0`|integer (int32)|
|**siteName**  <br>*可选*|中心名称  <br>**样例** : `"string"`|string|
|**siteRoleType**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|中心状态  <br>**样例** : `"string"`|string|


<a name="ssucommissioner"></a>
### SsuCommissioner

|名称|说明|类型|
|---|---|---|
|**email**  <br>*可选*|**样例** : `"string"`|string|
|**mobile**  <br>*可选*|**样例** : `"string"`|string|
|**opUserId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|**样例** : `0`|integer (int32)|
|**userName**  <br>*可选*|**样例** : `"string"`|string|


<a name="ssuprojectdetail"></a>
### SsuProjectDetail

|名称|说明|类型|
|---|---|---|
|**hasGenetic**  <br>*可选*|是否有遗传办（0-没有 1-有）  <br>**样例** : `0`|integer (int32)|
|**id**  <br>*可选*|**样例** : `0`|integer (int32)|
|**leadingSites**  <br>*可选*|组长单位  <br>**样例** : `"string"`|string|
|**mergePsv**  <br>*可选*|合并PSV（0-不合并 1-合并）  <br>**样例** : `0`|integer (int32)|
|**piDoctorName**  <br>*可选*|研究者名称  <br>**样例** : `"string"`|string|
|**projectFullName**  <br>*可选*|项目完整名称  <br>**样例** : `"string"`|string|
|**projectManager**  <br>*可选*|**样例** : `"string"`|string|
|**projectManagerName**  <br>*可选*|项目经理名字  <br>**样例** : `"string"`|string|
|**projectName**  <br>*可选*|项目简称  <br>**样例** : `"string"`|string|
|**projectNo**  <br>*可选*|内部项目编号  <br>**样例** : `"string"`|string|
|**researchDrug**  <br>*可选*|研究药物  <br>**样例** : `"string"`|string|
|**siteFilterNumber**  <br>*可选*|筛选中心数  <br>**样例** : `0`|integer (int32)|
|**sitePlanNumber**  <br>*可选*|计划中心数  <br>**样例** : `0`|integer (int32)|
|**sponsorName**  <br>*可选*|申办方  <br>**样例** : `"string"`|string|


<a name="ssuprojectlistrequest"></a>
### SsuProjectListRequest

|名称|说明|类型|
|---|---|---|
|**confirm**  <br>*可选*|配人待确认(0-不选择 1-选择)  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|**样例** : `0`|integer (int32)|
|**projectManager**  <br>*可选*|项目经理id  <br>**样例** : `0`|integer (int32)|
|**searchKey**  <br>*可选*|搜索条件  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|主项目状态(从字典中获取（main_project_status）)  <br>**样例** : `0`|integer (int32)|
|**totalSize**  <br>*可选*|第一次获取传0，后面传返回的数据  <br>**样例** : `0`|integer (int32)|


<a name="f170c701f10ae7abf98cc465f487959e"></a>
### 任务模块信息

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|记录数  <br>**样例** : `0`|integer (int32)|
|**flowRecordCount**  <br>*可选*|新跟进记录数量  <br>**样例** : `0`|integer (int32)|
|**moduleCode**  <br>*可选*|模块编码  <br>**样例** : `"string"`|string|
|**moduleName**  <br>*可选*|模块名称  <br>**样例** : `"string"`|string|
|**spmTaskCountDetailList**  <br>*可选*|子模块信息  <br>**样例** : `[ "[c2b99912c12c1559480f2ca8df1a6ab6](#c2b99912c12c1559480f2ca8df1a6ab6)" ]`|< [统计每一任务的数量](#c2b99912c12c1559480f2ca8df1a6ab6) > array|
|**subTaskDetailList**  <br>*可选*|任务列表  <br>**样例** : `[ "[e6f1f8917099526b58ff7d3540b382ed](#e6f1f8917099526b58ff7d3540b382ed)" ]`|< [项目相关子任务信息](#e6f1f8917099526b58ff7d3540b382ed) > array|


<a name="a15bb0b63e6473736e363eab217048cc"></a>
### 任务状态更新接收对象

|名称|说明|类型|
|---|---|---|
|**actionType**  <br>*可选*|操作类型(0:未提交（退回）、1:提交)  <br>**样例** : `0`|integer (int32)|
|**finishTimeStamp**  <br>*可选*|任务完成时间  <br>**样例** : `0`|integer (int64)|
|**statusCode**  <br>*可选*|状态信息(0:未开始、1:进行中、2:完成、3:终止、4:待定)  <br>**样例** : `0`|integer (int32)|
|**subTaskId**  <br>*必填*|子任务ID  <br>**样例** : `0`|integer (int32)|


<a name="bc0b6714adc9afa9aee6dda5949a92de"></a>
### 任务进度列表

|名称|说明|类型|
|---|---|---|
|**masterTaskDetailList**  <br>*可选*|主任务信息列表  <br>**样例** : `[ "[ed7cb8e0f8f736a5447f7c0af3248762](#ed7cb8e0f8f736a5447f7c0af3248762)" ]`|< [项目相关主任务信息](#ed7cb8e0f8f736a5447f7c0af3248762) > array|
|**subTaskDetailList**  <br>*可选*|子任务信息列表  <br>**样例** : `[ "[e6f1f8917099526b58ff7d3540b382ed](#e6f1f8917099526b58ff7d3540b382ed)" ]`|< [项目相关子任务信息](#e6f1f8917099526b58ff7d3540b382ed) > array|


<a name="c2b99912c12c1559480f2ca8df1a6ab6"></a>
### 统计每一任务的数量

|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|统计记录数  <br>**样例** : `0`|integer (int32)|
|**flowRecordCount**  <br>*可选*|新跟进记录数量  <br>**样例** : `0`|integer (int32)|
|**masterTaskCode**  <br>*可选*|主任务编码  <br>**样例** : `"string"`|string|
|**masterTaskName**  <br>*可选*|主任务名称  <br>**样例** : `"string"`|string|
|**subTaskCode**  <br>*可选*|子任务编码  <br>**样例** : `"string"`|string|
|**subTaskName**  <br>*可选*|子任务名称  <br>**样例** : `"string"`|string|


<a name="29aaa6e0ebf914420f9674f682d22e0c"></a>
### 自定义任务接收数据对象

|名称|说明|类型|
|---|---|---|
|**auditorRole**  <br>*可选*|审核角色  <br>**样例** : `"string"`|enum (CTA, CRA)|
|**executiveRole**  <br>*可选*|执行角色  <br>**样例** : `"string"`|enum (CTA, CRA)|
|**planFinishTimeStamp**  <br>*可选*|计划完成时间戳  <br>**样例** : `0`|integer (int64)|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**taskCode**  <br>*可选*|任务编码，准备任务添加子任务时有效，1001-002:添加专员,1001-003:删除专员  <br>**样例** : `"string"`|string|
|**taskName**  <br>*可选*|任务名称  <br>**样例** : `"string"`|string|


<a name="ed7cb8e0f8f736a5447f7c0af3248762"></a>
### 项目相关主任务信息

|名称|说明|类型|
|---|---|---|
|**currentProgressRate**  <br>*可选*|当前进度百分比  <br>**样例** : `0`|integer (int32)|
|**finishRole**  <br>*可选*|完成角色  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|任务ID  <br>**样例** : `0`|integer (int32)|
|**isNewFlowRecord**  <br>*可选*|是否是最新的跟进(0:不是，1：是)  <br>**样例** : `0`|integer (int32)|
|**nodeCode**  <br>*可选*|节点编码  <br>**样例** : `"string"`|string|
|**nodeType**  <br>*可选*|节点类型(1、项目任务节点  2、中心任务节点)  <br>**样例** : `0`|integer (int32)|
|**participateRoleType**  <br>*可选*|任务参与人角色类型  <br>**样例** : `"string"`|string|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**siteId**  <br>*可选*|机构ID  <br>**样例** : `0`|integer (int32)|
|**sort**  <br>*可选*|节点序号  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|当前状态(0:未开始、1:进行中、2:完成、3:终止)  <br>**样例** : `0`|integer (int32)|
|**taskName**  <br>*可选*|主任务名称  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|修改人  <br>**样例** : `0`|integer (int32)|


<a name="e6f1f8917099526b58ff7d3540b382ed"></a>
### 项目相关子任务信息

|名称|说明|类型|
|---|---|---|
|**description**  <br>*可选*|任务描述信息  <br>**样例** : `"string"`|string|
|**finishRole**  <br>*可选*|完成角色  <br>**样例** : `"string"`|string|
|**id**  <br>*可选*|子任务ID  <br>**样例** : `0`|integer (int32)|
|**isCommit**  <br>*可选*|是否已提交（0：未提交，1：已提交）  <br>**样例** : `0`|integer (int32)|
|**isConfigFileTask**  <br>*可选*|是否配置文件任务（NONE：标识不是）  <br>**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**isDelayed**  <br>*可选*|是否逾期（0:未逾期，1：已逾期）  <br>**样例** : `0`|integer (int32)|
|**isDeliverFilePackage**  <br>*可选*|是否交付文件包（NONE：标识不是）  <br>**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**isNewFlowRecord**  <br>*可选*|是否是最新的跟进(0:不是，1：是)  <br>**样例** : `0`|integer (int32)|
|**isProjectFilePackage**  <br>*可选*|是否项目文件包（NONE：标识不是）  <br>**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**isReturn**  <br>*可选*|是否已退回（0：否，1：是）  <br>**样例** : `0`|integer (int32)|
|**isViewFileTask**  <br>*可选*|是否查看文件任务（NONE：标识不是）  <br>**样例** : `"string"`|enum (NONE, IS_PROJECT_FILE_PACKAGE, IS_DELIVER_FILE_PACKAGE, IS_CONFIG_FILE_TASK, IS_VIEW_FILE_TASK, IS_MERGE_PSV, IS_GENETIC_DO)|
|**lastOperatorDesc**  <br>*可选*|最新操作日志  <br>**样例** : `"string"`|string|
|**lastOperatorUser**  <br>*可选*|最新操作人员名称  <br>**样例** : `"string"`|string|
|**masterTaskCode**  <br>*可选*|主任务编码  <br>**样例** : `"string"`|string|
|**masterTaskId**  <br>*可选*|主任务ID  <br>**样例** : `0`|integer (int32)|
|**masterTaskName**  <br>*可选*|主任务名称  <br>**样例** : `"string"`|string|
|**nodeCode**  <br>*可选*|节点编码  <br>**样例** : `"string"`|string|
|**participateRoleType**  <br>*可选*|任务参与人角色类型  <br>**样例** : `"string"`|string|
|**planningBeginTime**  <br>*可选*|计划开始时间(计划时间)  <br>**样例** : `"string"`|string (date-time)|
|**planningEndTime**  <br>*可选*|计划结束时间(计划时间)  <br>**样例** : `"string"`|string (date-time)|
|**projectId**  <br>*可选*|项目ID  <br>**样例** : `0`|integer (int32)|
|**projectName**  <br>*可选*|项目名称  <br>**样例** : `"string"`|string|
|**roleType**  <br>*可选*|任务执行角色类型  <br>**样例** : `"string"`|string|
|**siteId**  <br>*可选*|中心ID  <br>**样例** : `0`|integer (int32)|
|**siteName**  <br>*可选*|中心名称  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|节点序号  <br>**样例** : `0`|integer (int32)|
|**stakeholderCode**  <br>*可选*|干系人code  <br>**样例** : `"string"`|string|
|**statusCode**  <br>*可选*|当前状态(0:未开始、1:进行中、2:完成、3:终止 4待定)  <br>**样例** : `0`|integer (int32)|
|**taskName**  <br>*可选*|任务名称  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新日期  <br>**样例** : `"string"`|string (date-time)|
|**updateUser**  <br>*可选*|修改人  <br>**样例** : `0`|integer (int32)|





