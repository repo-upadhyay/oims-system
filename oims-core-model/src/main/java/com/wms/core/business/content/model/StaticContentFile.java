package com.wms.core.business.content.model;

import com.wms.core.business.content.model.ContentFile;
import com.wms.core.business.content.model.FileContentType;

public abstract class StaticContentFile extends ContentFile {
	
	private FileContentType fileContentType;

	public FileContentType getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(FileContentType fileContentType) {
		this.fileContentType = fileContentType;
	}


	

}
