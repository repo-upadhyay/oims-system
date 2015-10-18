package com.wms.core.business.common.model.audit;

import com.wms.core.business.common.model.audit.AuditSection;

public interface Auditable {
	
	AuditSection getAuditSection();
	
	void setAuditSection(AuditSection audit);
}
