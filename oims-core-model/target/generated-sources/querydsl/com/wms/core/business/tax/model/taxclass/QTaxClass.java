package com.wms.core.business.tax.model.taxclass;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTaxClass is a Querydsl query type for TaxClass
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTaxClass extends EntityPathBase<TaxClass> {

    private static final long serialVersionUID = -213339703L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTaxClass taxClass = new QTaxClass("taxClass");

    public final com.wms.core.business.generic.model.QSalesManagerEntity _super = new com.wms.core.business.generic.model.QSalesManagerEntity(this);

    public final StringPath code = createString("code");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.wms.core.business.merchant.model.QMerchantStore merchantStore;

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final ListPath<com.wms.core.business.catalog.product.model.Product, com.wms.core.business.catalog.product.model.QProduct> products = this.<com.wms.core.business.catalog.product.model.Product, com.wms.core.business.catalog.product.model.QProduct>createList("products", com.wms.core.business.catalog.product.model.Product.class, com.wms.core.business.catalog.product.model.QProduct.class, PathInits.DIRECT2);

    public final ListPath<com.wms.core.business.tax.model.taxrate.TaxRate, com.wms.core.business.tax.model.taxrate.QTaxRate> taxRates = this.<com.wms.core.business.tax.model.taxrate.TaxRate, com.wms.core.business.tax.model.taxrate.QTaxRate>createList("taxRates", com.wms.core.business.tax.model.taxrate.TaxRate.class, com.wms.core.business.tax.model.taxrate.QTaxRate.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QTaxClass(String variable) {
        this(TaxClass.class, forVariable(variable), INITS);
    }

    public QTaxClass(Path<? extends TaxClass> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTaxClass(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTaxClass(PathMetadata<?> metadata, PathInits inits) {
        this(TaxClass.class, metadata, inits);
    }

    public QTaxClass(Class<? extends TaxClass> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.merchantStore = inits.isInitialized("merchantStore") ? new com.wms.core.business.merchant.model.QMerchantStore(forProperty("merchantStore"), inits.get("merchantStore")) : null;
    }

}

