package com.wms.core.business.order.model.payment;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCreditCard is a Querydsl query type for CreditCard
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QCreditCard extends BeanPath<CreditCard> {

    private static final long serialVersionUID = -199919725L;

    public static final QCreditCard creditCard = new QCreditCard("creditCard");

    public final EnumPath<com.wms.core.business.payments.model.CreditCardType> cardType = createEnum("cardType", com.wms.core.business.payments.model.CreditCardType.class);

    public final StringPath ccCvv = createString("ccCvv");

    public final StringPath ccExpires = createString("ccExpires");

    public final StringPath ccNumber = createString("ccNumber");

    public final StringPath ccOwner = createString("ccOwner");

    public QCreditCard(String variable) {
        super(CreditCard.class, forVariable(variable));
    }

    public QCreditCard(Path<? extends CreditCard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCreditCard(PathMetadata<?> metadata) {
        super(CreditCard.class, metadata);
    }

}

