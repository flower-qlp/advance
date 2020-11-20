package com.middle.advanced.demo.mongo;

import com.alibaba.fastjson.JSON;
import com.middle.advanced.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 * @author
 */
@Component
public class MongoDbJdbc {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Object o) {
        mongoTemplate.save(o, "product");
    }

    public <T> T findOne(Class<T> className, String collectionName) {
        Query query = new Query();
        query.limit(1);
        query.addCriteria(Criteria.where("_id").is(12123));
        return mongoTemplate.findOne(query, className, collectionName);
    }

    public void delete() {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("宅宅会").and("_id").is(12123));
        mongoTemplate.remove(query, "product");
    }


}
