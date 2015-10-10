package com.github.vkuzel.nutch_plugin_development_template;

import org.apache.hadoop.conf.Configuration;
import org.apache.nutch.parse.HTMLMetaTags;
import org.apache.nutch.parse.HtmlParseFilter;
import org.apache.nutch.parse.ParseResult;
import org.apache.nutch.protocol.Content;
import org.w3c.dom.DocumentFragment;

public class DummyHtmlParserFilter implements HtmlParseFilter {

    private Configuration configuration;

    public ParseResult filter(Content content, ParseResult parseResult, HTMLMetaTags htmlMetaTags, DocumentFragment documentFragment) {
        // Here you can place your parse filtering code. A good approach is to
        // grab some content text and put it into metadata list. You can work
        // with metadata in the indexing filter or in the Solr.

        System.out.println("Nutch Plugin Development Template says: Hello World!");

        return parseResult;
    }

    public void setConf(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConf() {
        return configuration;
    }
}
