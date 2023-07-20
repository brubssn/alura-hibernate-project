package br.com.alura.store.model;

import jdk.jfr.Category;
import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.ImmutableMutabilityPlan;
import org.hibernate.type.descriptor.spi.JdbcRecommendedSqlTypeMappingContext;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

public class CategoryDescriptor  extends AbstractTypeDescriptor<Category>   {

    protected CategoryDescriptor() {
        super(Category.class, new ImmutableMutabilityPlan<>());
    }

    @Override
    public String toString(Category value) {
        return null;
    }

    @Override
    public Category fromString(String string) {
        return null;
    }

    @Override
    public <X> X unwrap(Category value, Class<X> type, WrapperOptions options) {
        return null;
    }

    @Override
    public <X> Category wrap(X value, WrapperOptions options) {
        return null;
    }

    @Override
    public SqlTypeDescriptor getJdbcRecommendedSqlType(JdbcRecommendedSqlTypeMappingContext context) {
        return null;
    }


    }
