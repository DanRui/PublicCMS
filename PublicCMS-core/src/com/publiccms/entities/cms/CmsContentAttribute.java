package com.publiccms.entities.cms;

// Generated 2015-6-25 11:28:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CmsContentAttribute generated by hbm2java
 */
@Entity
@Table(name = "cms_content_attribute")
public class CmsContentAttribute implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int contentId;
	private String data;
	private String text;
	private int wordCount;

	public CmsContentAttribute() {
	}

	public CmsContentAttribute(int contentId, int wordCount) {
		this.contentId = contentId;
		this.wordCount = wordCount;
	}

	public CmsContentAttribute(int contentId, String data, String text, int wordCount) {
		this.contentId = contentId;
		this.data = data;
		this.text = text;
		this.wordCount = wordCount;
	}

	@Id
	@Column(name = "content_id", unique = true, nullable = false)
	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	@Column(name = "data", length = 65535)
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Column(name = "text", length = 65535)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "word_count", nullable = false)
	public int getWordCount() {
		return this.wordCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

}
