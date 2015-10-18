package com.wms.core.business.reference.language.dao;

import org.springframework.stereotype.Repository;

import com.wms.core.business.generic.dao.SalesManagerEntityDaoImpl;
import com.wms.core.business.reference.language.model.Language;

@Repository("languageDao")
public class LanguageDaoImpl extends SalesManagerEntityDaoImpl<Integer, Language> implements LanguageDao {
}
