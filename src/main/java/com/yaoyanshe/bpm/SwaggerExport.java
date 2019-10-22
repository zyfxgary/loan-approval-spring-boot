package com.yaoyanshe.bpm;

import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

import java.net.URL;
import java.nio.file.Paths;

/**
 * @author by lishuailei
 * @classname SwaggerExport
 * @description TODO
 * @date 2019/10/11
 */
public class SwaggerExport {
  public static void main(String[] args) throws Exception {
    String shuwen_api= "http://shuwen.test.trial.link:18081/sw-api-gateway/shuwen-web/v2/api-docs?group=api-v1";
    String swpm_api = "http://localhost:13082/v2/api-docs?group=api-v1";

    generateMarkdownDocsToFile(MarkupLanguage.MARKDOWN,swpm_api,"swpm_api");
  }

  static void generateMarkdownDocsToFile(MarkupLanguage markupLanguage,String url,String fileName) throws Exception {
    //    输出Markdown到单文件
    Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
        .withMarkupLanguage(markupLanguage)
        .withOutputLanguage(Language.ZH)
        .withPathsGroupedBy(GroupBy.TAGS)
        .withGeneratedExamples()
        .withoutInlineSchema()
        .build();

    Swagger2MarkupConverter.from(new URL(url))
        .withConfig(config)
        .build()
        .toFile(Paths.get("./docs/markdown/generated/"+fileName));
  }
}
