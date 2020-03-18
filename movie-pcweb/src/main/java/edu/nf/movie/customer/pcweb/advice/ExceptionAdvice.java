package edu.nf.movie.customer.pcweb.advice;

import edu.nf.movie.customer.pcweb.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.xml.transform.Result;

/**
 * @author Boom ShaGa1aGa
 * @date 2019-11-20
 */
@RestControllerAdvice("edu.nf.movie.customer.pcweb.controller")
public class ExceptionAdvice {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);

    @ExceptionHandler(DataAccessException.class)
    public ResultVO dataAccessException(DataAccessException e){
        ResultVO vo = new ResultVO();
        vo.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        vo.setMessage(e.getMessage());
        logger.error(e.getMessage());
        return vo;
    }
}
