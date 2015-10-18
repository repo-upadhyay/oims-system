package com.wms.core.business.catalog.product.model.file;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDigitalProduct is a Querydsl query type for DigitalProduct
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDigitalProduct extends EntityPathBase<DigitalProduct> {

    private static final long serialVersionUID = 1216472051L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDigitalProduct digitalProduct = new QDigitalProduct("digitalProduct");

    public final com.wms.core.business.generic.model.QSalesManagerEntity _super = new com.wms.core.business.generic.model.QSalesManagerEntity(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final com.wms.core.business.catalog.product.model.QProduct product;

    public final StringPath productFileName = createString("productFileName");

    public QDigitalProduct(String variable) {
        this(DigitalProduct.class, forVariable(variable), INITS);
    }

    public QDigitalProduct(Path<? extends DigitalProduct> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDigitalProduct(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDigitalProduct(PathMetadata<?> metadata, PathInits inits) {
        this(DigitalProduct.class, metadata, inits);
    }

    public QDigitalProduct(Class<? extends DigitalProduct> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.wms.core.business.catalog.product.model.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

