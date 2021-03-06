/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.resourcegroupstaggingapi;

import javax.annotation.Generated;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Resource Groups Tagging API asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Resource Groups Tagging API</fullname>
 * <p>
 * This guide describes the API operations for the resource groups tagging.
 * </p>
 * <p>
 * A tag is a label that you assign to an AWS resource. A tag consists of a key and a value, both of which you define.
 * For example, if you have two Amazon EC2 instances, you might assign both a tag key of "Stack." But the value of
 * "Stack" might be "Testing" for one and "Production" for the other.
 * </p>
 * <important>
 * <p>
 * Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use
 * tags to provide you with billing and administration services. Tags are not intended to be used for private or
 * sensitive data.
 * </p>
 * </important>
 * <p>
 * Tagging can help you organize your resources and enables you to simplify resource management, access management and
 * cost allocation.
 * </p>
 * <p>
 * You can use the resource groups tagging API operations to complete the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tag and untag supported resources located in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use tag-based filters to search for resources located in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing tag keys in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing values for the specified key in the specified Region for the AWS account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To use resource groups tagging API operations, you must add the following permissions to your IAM policy:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>tag:GetResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:TagResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:UntagResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:GetTagKeys</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:GetTagValues</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You'll also need permissions to access the resources of individual services so that you can tag and untag those
 * resources.
 * </p>
 * <p>
 * For more information on IAM policies, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage.html">Managing IAM Policies</a> in the
 * <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <i> <b>Services that support the Resource Groups Tagging API</b> </i>
 * </p>
 * <p>
 * You can use the Resource Groups Tagging API to tag resources for the following AWS services.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/a4b">Alexa for Business (a4b)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/apigateway">API Gateway</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appstream2">Amazon AppStream</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appsync">AWS AppSync</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/app-mesh">AWS App Mesh</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/athena">Amazon Athena</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide">Amazon Aurora</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/aws-backup">AWS Backup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/acm">AWS Certificate Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/acm">AWS Certificate Manager Private CA</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/clouddirectory">Amazon Cloud Directory</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloud-map">AWS Cloud Map</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudformation">AWS CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudfront">Amazon CloudFront</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudhsm">AWS CloudHSM</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudtrail">AWS CloudTrail</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch">Amazon CloudWatch (alarms only)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch/?id=docs_gateway#amazon-cloudwatch-events">Amazon CloudWatch
 * Events</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch/?id=docs_gateway#amazon-cloudwatch-logs">Amazon CloudWatch Logs</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cloudwatch">Amazon Cloudwatch Synthetics</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codebuild">AWS CodeBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codecommit">AWS CodeCommit</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codepipeline">AWS CodePipeline</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codestar">AWS CodeStar</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codestar-connections/latest/APIReference/">AWS CodeStar Connections</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cognito">Amazon Cognito Identity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cognito">Amazon Cognito User Pools</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/comprehend">Amazon Comprehend</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/config">AWS Config</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/connect/resources/?whats-new-cards#Documentation">Amazon Connect</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/data-exchange">AWS Data Exchange</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/data-pipeline">AWS Data Pipeline</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/dms">AWS Database Migration Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/datasync">AWS DataSync</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/devicefarm">AWS Device Farm</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/directconnect">AWS Direct Connect</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/directory-service">AWS Directory Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/dynamodb">Amazon DynamoDB</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ebs">Amazon EBS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ec2">Amazon EC2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/imagebuilder">EC2 Image Builder</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ecr">Amazon ECR</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ecs">Amazon ECS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/eks">Amazon EKS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elastic-beanstalk">AWS Elastic Beanstalk</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/efs">Amazon Elastic File System</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elasticloadbalancing">Elastic Load Balancing</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elasticache">Amazon ElastiCache</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/elasticsearch-service">Amazon Elasticsearch Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/medialive">AWS Elemental MediaLive</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mediapackage">AWS Elemental MediaPackage</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mediapackage">AWS Elemental MediaPackage VoD</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/mediatailor">AWS Elemental MediaTailor</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/emr">Amazon EMR</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/eventbridge">Amazon EventBridge Schema</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/firewall-manager">AWS Firewall Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/fsx">Amazon FSx</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/s3/?id=docs_gateway#amazon-s3-glacier">Amazon S3 Glacier</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/global-accelerator">AWS Global Accelerator</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ground-station">AWS Ground Station</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/glue">AWS Glue</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/guardduty">Amazon GuardDuty</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/inspector">Amazon Inspector</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotanalytics">AWS IoT Analytics</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot">AWS IoT Core</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-device-defender">AWS IoT Device Defender</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-device-management">AWS IoT Device Management</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotevents">AWS IoT Events</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/greengrass">AWS IoT Greengrass</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-1-click">AWS IoT 1-Click</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/iot-sitewise">AWS IoT Sitewise</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/thingsgraph">AWS IoT Things Graph</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kendra">Amazon Kendra</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kms">AWS Key Management Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kinesis">Amazon Kinesis</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kinesis/?id=docs_gateway#amazon-kinesis-data-analytics">Amazon Kinesis Data
 * Analytics</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/kinesis/?id=docs_gateway#amazon-kinesis-data-firehose">Amazon Kinesis Data
 * Firehose</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/lambda">AWS Lambda</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/lex">Amazon Lex</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/license-manager">AWS License Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/macie">Amazon Macie</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/machine-learning">Amazon Machine Learning</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/amazon-mq">Amazon MQ</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/msk">Amazon MSK</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/neptune">Amazon Neptune</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/opsworks">AWS OpsWorks</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/opsworks">AWS OpsWorks CM</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/organizations">AWS Organizations</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/pinpoint">Amazon Pinpoint</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/qldb">Amazon Quantum Ledger Database (QLDB)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/rds">Amazon RDS</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/redshift">Amazon Redshift</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ram">AWS Resource Access Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ARG">AWS Resource Groups</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/robomaker">AWS RoboMaker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/route53">Amazon Route 53</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/route53">Amazon Route 53 Resolver</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/s3">Amazon S3 (buckets only)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker">Amazon SageMaker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/savingsplans">Savings Plans</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/secretsmanager">AWS Secrets Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/securityhub">AWS Security Hub</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/servicecatalog">AWS Service Catalog</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ses">Amazon Simple Email Service (SES)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sns">Amazon Simple Notification Service (SNS)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sqs">Amazon Simple Queue Service (SQS)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/swf">Amazon Simple Workflow Service</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/step-functions">AWS Step Functions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway">AWS Storage Gateway</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/systems-manager">AWS Systems Manager</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/transfer">AWS Transfer for SFTP</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/vpc">Amazon VPC</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/waf">AWS WAFv2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/waf">AWS WAF Regional</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/worklink">Amazon WorkLink</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/workspaces">Amazon WorkSpaces</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSResourceGroupsTaggingAPIAsyncClient extends AWSResourceGroupsTaggingAPIClient implements AWSResourceGroupsTaggingAPIAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSResourceGroupsTaggingAPIAsyncClientBuilder asyncBuilder() {
        return AWSResourceGroupsTaggingAPIAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Resource Groups Tagging API using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSResourceGroupsTaggingAPIAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Resource Groups Tagging API using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSResourceGroupsTaggingAPIAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<DescribeReportCreationResult> describeReportCreationAsync(DescribeReportCreationRequest request) {

        return describeReportCreationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReportCreationResult> describeReportCreationAsync(final DescribeReportCreationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReportCreationRequest, DescribeReportCreationResult> asyncHandler) {
        final DescribeReportCreationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReportCreationResult>() {
            @Override
            public DescribeReportCreationResult call() throws Exception {
                DescribeReportCreationResult result = null;

                try {
                    result = executeDescribeReportCreation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryResult> getComplianceSummaryAsync(GetComplianceSummaryRequest request) {

        return getComplianceSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryResult> getComplianceSummaryAsync(final GetComplianceSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryRequest, GetComplianceSummaryResult> asyncHandler) {
        final GetComplianceSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetComplianceSummaryResult>() {
            @Override
            public GetComplianceSummaryResult call() throws Exception {
                GetComplianceSummaryResult result = null;

                try {
                    result = executeGetComplianceSummary(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest request) {

        return getResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(final GetResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler) {
        final GetResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcesResult>() {
            @Override
            public GetResourcesResult call() throws Exception {
                GetResourcesResult result = null;

                try {
                    result = executeGetResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(GetTagKeysRequest request) {

        return getTagKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(final GetTagKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagKeysRequest, GetTagKeysResult> asyncHandler) {
        final GetTagKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagKeysResult>() {
            @Override
            public GetTagKeysResult call() throws Exception {
                GetTagKeysResult result = null;

                try {
                    result = executeGetTagKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(GetTagValuesRequest request) {

        return getTagValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(final GetTagValuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagValuesRequest, GetTagValuesResult> asyncHandler) {
        final GetTagValuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagValuesResult>() {
            @Override
            public GetTagValuesResult call() throws Exception {
                GetTagValuesResult result = null;

                try {
                    result = executeGetTagValues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartReportCreationResult> startReportCreationAsync(StartReportCreationRequest request) {

        return startReportCreationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReportCreationResult> startReportCreationAsync(final StartReportCreationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReportCreationRequest, StartReportCreationResult> asyncHandler) {
        final StartReportCreationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReportCreationResult>() {
            @Override
            public StartReportCreationResult call() throws Exception {
                StartReportCreationResult result = null;

                try {
                    result = executeStartReportCreation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(TagResourcesRequest request) {

        return tagResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(final TagResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourcesRequest, TagResourcesResult> asyncHandler) {
        final TagResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourcesResult>() {
            @Override
            public TagResourcesResult call() throws Exception {
                TagResourcesResult result = null;

                try {
                    result = executeTagResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(UntagResourcesRequest request) {

        return untagResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(final UntagResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourcesRequest, UntagResourcesResult> asyncHandler) {
        final UntagResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourcesResult>() {
            @Override
            public UntagResourcesResult call() throws Exception {
                UntagResourcesResult result = null;

                try {
                    result = executeUntagResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
