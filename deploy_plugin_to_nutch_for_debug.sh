#!/bin/sh

PROJECT_DIR="$(dirname "$0")/"
cd ${PROJECT_DIR}

NUTCH_DIR=nutch-1.10

# Prepares testing data so we have something to process by the plugin.
TEST_DATA_DIR=${NUTCH_DIR}/test_data
rm -rf ${TEST_DATA_DIR}
unzip ${NUTCH_DIR}/test_data.zip -d ${NUTCH_DIR}

#mvn clean install

NUTCH_PLUGIN_DIR=${NUTCH_DIR}/plugins/nutch-plugin-development-template/
mkdir -p ${NUTCH_PLUGIN_DIR}
cp target/nutchPluginDevelopmentTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar ${NUTCH_PLUGIN_DIR}
cp conf/plugin.xml ${NUTCH_PLUGIN_DIR}
