package pl.exsio.querydsl.entityql.path;

import com.querydsl.core.types.*;
import com.querydsl.core.types.dsl.LiteralExpression;

import java.lang.reflect.AnnotatedElement;
import java.util.UUID;

/**
 * Custom Enum path for handling Java UUIDs in QueryDSL
 */
public class QUuidPath extends LiteralExpression<UUID> implements Path<UUID> {

    private static final long serialVersionUID = 7983490925756833429L;

    private final PathImpl<UUID> pathMixin;

    public QUuidPath(Path<?> parent, String property) {
        this(PathMetadataFactory.forProperty(parent, property));
    }

    private QUuidPath(PathMetadata metadata) {
        super(ExpressionUtils.path(UUID.class, metadata));
        this.pathMixin = (PathImpl<UUID>) mixin;
    }

    @Override
    public final <R,C> R accept(Visitor<R,C> v, C context) {
        return v.visit(pathMixin, context);
    }

    @Override
    public PathMetadata getMetadata() {
        return pathMixin.getMetadata();
    }

    @Override
    public Path<?> getRoot() {
        return pathMixin.getRoot();
    }

    @Override
    public AnnotatedElement getAnnotatedElement() {
        return pathMixin.getAnnotatedElement();
    }
}
