package com.defrag.code.base.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;

public class AbstractDAO {
    protected Log log = LogFactory.getLog(AbstractDAO.class);
    
    @Resource(name="sqlSession")
    private SqlSessionTemplate sqlSession;
    
    /**
     * 
     * @param queryId
     */
    protected void printQueryId(String queryId) {
        if(log.isDebugEnabled()){
            log.debug("\t QueryId  \t:  " + queryId);
        }
    }
    
    /**
     * 
     * @param queryId
     * @param params
     * @return
     */
    public int insert(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.insert(queryId, params);
    }
    
    /**
     * 
     * @param queryId
     * @param params
     * @return
     */
    public int update(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.update(queryId, params);
    }
    
    /**
     * 
     * @param queryId
     * @param params
     * @return
     */
    public int delete(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.delete(queryId, params);
    }
    
    /**
     * 
     * @param queryId
     * @return
     */
    public Object selectOne(String queryId){
        printQueryId(queryId);
        return sqlSession.selectOne(queryId);
    }
    
    /**
     * 
     * @param queryId
     * @param params
     * @return
     */
    public Object selectOne(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.selectOne(queryId, params);
    }
    
    /**
     * 
     * @param queryId
     * @return
     */
    @SuppressWarnings("rawtypes")
    public List selectList(String queryId){
        printQueryId(queryId);
        return sqlSession.selectList(queryId);
    }
    
    /**
     * 
     * @param queryId
     * @param params
     * @return
     */
    @SuppressWarnings("rawtypes")
    public List selectList(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.selectList(queryId,params);
    }
}
