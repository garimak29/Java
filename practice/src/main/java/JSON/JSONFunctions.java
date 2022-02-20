package JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.jayway.jsonpath.JsonPath;

import java.util.Map;

public class JSONFunctions {
    public static int countJsonRows(String json){
        int res = 0;
        Map<String, String> objectMap = JsonPath.read(json, "$.results..id");
        res =  objectMap.keySet().size();
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countJsonRows("{\n" +
                "    \"completionStatus\": \"OK\",\n" +
                "    \"results\": [\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0eb\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantIntegration\"\n" +
                "            ],\n" +
                "            \"UserId\": \"saw-integration-internal@dummy.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0ec\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantIntegration\"\n" +
                "            ],\n" +
                "            \"UserId\": \"saw-integration-external@dummy.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0fa\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantAdmin\",\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"testIntUser\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0fb\",\n" +
                "            \"Roles\": [\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"testz1\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0fc\",\n" +
                "            \"Roles\": [\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"testz\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0fd\",\n" +
                "            \"Roles\": [\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"test-1\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0fe\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantAdmin\",\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"gkumar\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b0ff\",\n" +
                "            \"Roles\": [\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"testUser\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b100\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantAdmin\",\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"adm-gkumar\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b101\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantAdmin\",\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"adm-dhgoel\",\n" +
                "            \"IsSystem\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38d8de4b06ddf8122b102\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantAdmin\",\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"adm-hhimanshu\",\n" +
                "            \"IsSystem\": false,\n" +
                "            \"Permissions\": [\n" +
                "                {\n" +
                "                    \"Params\": [\n" +
                "                        {\n" +
                "                            \"ParamName\": \"domain\",\n" +
                "                            \"ParamValues\": [\n" +
                "                                \"DEV_c\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"TemplateId\": \"Data-Domains-Primary-Template\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f38f95e4b09cce365ace46\",\n" +
                "            \"Roles\": [\n" +
                "                \"Self-Service Portal User\",\n" +
                "                \"tenantAdmin\"\n" +
                "            ],\n" +
                "            \"UserId\": \"adm-oveya\",\n" +
                "            \"IsSystem\": false,\n" +
                "            \"Permissions\": [\n" +
                "                {\n" +
                "                    \"Params\": [\n" +
                "                        {\n" +
                "                            \"ParamName\": \"domain\",\n" +
                "                            \"ParamValues\": [\n" +
                "                                \"SSG_c\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"TemplateId\": \"Data-Domains-Primary-Template\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f3992ae4b09cce365b0b41\",\n" +
                "            \"Roles\": [],\n" +
                "            \"UserId\": \"devorg\",\n" +
                "            \"Permissions\": [\n" +
                "                {\n" +
                "                    \"Params\": [\n" +
                "                        {\n" +
                "                            \"ParamName\": \"domain\",\n" +
                "                            \"ParamValues\": [\n" +
                "                                \"DEV_c\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"TemplateId\": \"Data-Domains-Primary-Template\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f39f1de4b0c6876b8bbcd7\",\n" +
                "            \"Roles\": [],\n" +
                "            \"UserId\": \"Dev_Functional\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"61f3ba61e4b0c6876b8bcb29\",\n" +
                "            \"Roles\": [],\n" +
                "            \"UserId\": \"Public Org\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"620657cce4b0c6876b938106\",\n" +
                "            \"Roles\": [\n" +
                "                \"tenantAdmin\",\n" +
                "                \"Self-Service Portal User\"\n" +
                "            ],\n" +
                "            \"UserId\": \"esb_testing\",\n" +
                "            \"IsSystem\": false,\n" +
                "            \"Permissions\": [\n" +
                "                {\n" +
                "                    \"Params\": [\n" +
                "                        {\n" +
                "                            \"ParamName\": \"domain\",\n" +
                "                            \"ParamValues\": [\n" +
                "                                \"DEV_c\"\n" +
                "                            ]\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"TemplateId\": \"Data-Domains-Primary-Template\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"totalCount\": 0\n" +
                "}"));
    }
}
