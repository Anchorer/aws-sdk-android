/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a job.
 * </p>
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend
     * using a UUID. Alpha-numeric characters, "-" and "_" are valid for use
     * here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String documentSource;

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     */
    private String document;

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     */
    private PresignedUrlConfig presignedUrlConfig;

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     */
    private String targetSelection;

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     */
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;

    /**
     * <p>
     * Parameters for the job document.
     * </p>
     */
    private java.util.Map<String, String> documentParameters;

    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend
     * using a UUID. Alpha-numeric characters, "-" and "_" are valid for use
     * here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         A job identifier which must be unique for your AWS account. We
     *         recommend using a UUID. Alpha-numeric characters, "-" and "_" are
     *         valid for use here.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend
     * using a UUID. Alpha-numeric characters, "-" and "_" are valid for use
     * here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            A job identifier which must be unique for your AWS account. We
     *            recommend using a UUID. Alpha-numeric characters, "-" and "_"
     *            are valid for use here.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A job identifier which must be unique for your AWS account. We recommend
     * using a UUID. Alpha-numeric characters, "-" and "_" are valid for use
     * here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            A job identifier which must be unique for your AWS account. We
     *            recommend using a UUID. Alpha-numeric characters, "-" and "_"
     *            are valid for use here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     *
     * @return <p>
     *         A list of things and thing groups to which the job should be
     *         sent.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     *
     * @param targets <p>
     *            A list of things and thing groups to which the job should be
     *            sent.
     *            </p>
     */
    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of things and thing groups to which the job should be
     *            sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTargets(String... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<String>(targets.length);
        }
        for (String value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of things and thing groups to which the job should be
     *            sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return <p>
     *         An S3 link to the job document.
     *         </p>
     */
    public String getDocumentSource() {
        return documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link to the job document.
     *            </p>
     */
    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link to the job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDocumentSource(String documentSource) {
        this.documentSource = documentSource;
        return this;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @return <p>
     *         The job document.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A short text description of the job.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A short text description of the job.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A short text description of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     *
     * @return <p>
     *         Configuration information for pre-signed S3 URLs.
     *         </p>
     */
    public PresignedUrlConfig getPresignedUrlConfig() {
        return presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     *
     * @param presignedUrlConfig <p>
     *            Configuration information for pre-signed S3 URLs.
     *            </p>
     */
    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed S3 URLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param presignedUrlConfig <p>
     *            Configuration information for pre-signed S3 URLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @return <p>
     *         Specifies whether the job will continue to run (CONTINUOUS), or
     *         will be complete after all those things specified as targets have
     *         completed the job (SNAPSHOT). If continuous, the job may also be
     *         run on a thing when a change is detected in a target. For
     *         example, a job will run on a thing when the thing is added to a
     *         target group, even after the job was completed by all things
     *         originally in the group.
     *         </p>
     * @see TargetSelection
     */
    public String getTargetSelection() {
        return targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public CreateJobRequest withTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be
     * complete after all those things specified as targets have completed the
     * job (SNAPSHOT). If continuous, the job may also be run on a thing when a
     * change is detected in a target. For example, a job will run on a thing
     * when the thing is added to a target group, even after the job was
     * completed by all things originally in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the job will continue to run (CONTINUOUS),
     *            or will be complete after all those things specified as
     *            targets have completed the job (SNAPSHOT). If continuous, the
     *            job may also be run on a thing when a change is detected in a
     *            target. For example, a job will run on a thing when the thing
     *            is added to a target group, even after the job was completed
     *            by all things originally in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public CreateJobRequest withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     *
     * @return <p>
     *         Allows you to create a staged rollout of the job.
     *         </p>
     */
    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of the job.
     *            </p>
     */
    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withJobExecutionsRolloutConfig(
            JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        return this;
    }

    /**
     * <p>
     * Parameters for the job document.
     * </p>
     *
     * @return <p>
     *         Parameters for the job document.
     *         </p>
     */
    public java.util.Map<String, String> getDocumentParameters() {
        return documentParameters;
    }

    /**
     * <p>
     * Parameters for the job document.
     * </p>
     *
     * @param documentParameters <p>
     *            Parameters for the job document.
     *            </p>
     */
    public void setDocumentParameters(java.util.Map<String, String> documentParameters) {
        this.documentParameters = documentParameters;
    }

    /**
     * <p>
     * Parameters for the job document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentParameters <p>
     *            Parameters for the job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDocumentParameters(java.util.Map<String, String> documentParameters) {
        this.documentParameters = documentParameters;
        return this;
    }

    /**
     * <p>
     * Parameters for the job document.
     * </p>
     * <p>
     * The method adds a new key-value pair into documentParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into documentParameters.
     * @param value The corresponding value of the entry to be added into
     *            documentParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest adddocumentParametersEntry(String key, String value) {
        if (null == this.documentParameters) {
            this.documentParameters = new java.util.HashMap<String, String>();
        }
        if (this.documentParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.documentParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into documentParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateJobRequest cleardocumentParametersEntries() {
        this.documentParameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getTargets() != null)
            sb.append("targets: " + getTargets() + ",");
        if (getDocumentSource() != null)
            sb.append("documentSource: " + getDocumentSource() + ",");
        if (getDocument() != null)
            sb.append("document: " + getDocument() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPresignedUrlConfig() != null)
            sb.append("presignedUrlConfig: " + getPresignedUrlConfig() + ",");
        if (getTargetSelection() != null)
            sb.append("targetSelection: " + getTargetSelection() + ",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("jobExecutionsRolloutConfig: " + getJobExecutionsRolloutConfig() + ",");
        if (getDocumentParameters() != null)
            sb.append("documentParameters: " + getDocumentParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDocumentParameters() == null) ? 0 : getDocumentParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDocumentSource() == null ^ this.getDocumentSource() == null)
            return false;
        if (other.getDocumentSource() != null
                && other.getDocumentSource().equals(this.getDocumentSource()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPresignedUrlConfig() == null ^ this.getPresignedUrlConfig() == null)
            return false;
        if (other.getPresignedUrlConfig() != null
                && other.getPresignedUrlConfig().equals(this.getPresignedUrlConfig()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null
                && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getJobExecutionsRolloutConfig() == null
                ^ this.getJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getJobExecutionsRolloutConfig() != null
                && other.getJobExecutionsRolloutConfig().equals(
                        this.getJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getDocumentParameters() == null ^ this.getDocumentParameters() == null)
            return false;
        if (other.getDocumentParameters() != null
                && other.getDocumentParameters().equals(this.getDocumentParameters()) == false)
            return false;
        return true;
    }
}
