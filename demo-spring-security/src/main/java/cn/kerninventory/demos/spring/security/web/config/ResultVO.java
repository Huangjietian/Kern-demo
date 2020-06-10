package cn.kerninventory.demos.spring.security.web.config;

import java.io.Serializable;
import java.util.Objects;

public class ResultVO<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public static <T> ResultVO success(Integer code, String message, T data) {
        ResultVO<T> resultVo = new ResultVO();
        resultVo.setData(data);
        resultVo.setCode(code == null ? 200 : code);
        resultVo.setMessage(message == null ? "success" : message);
        return resultVo;
    }

    public static <T> ResultVO success(T data) {
        ResultVO<T> resultVo = new ResultVO();
        resultVo.setData(data);
        resultVo.setCode(200);
        resultVo.setMessage("success");
        return resultVo;
    }

    public static ResultVO success() {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(200);
        resultVo.setMessage("success");
        return resultVo;
    }

    public static ResultVO error(Integer code, String message) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(code == null ? 500 : code);
        resultVo.setMessage(message == null ? "failure" : message);
        return resultVo;
    }

    public static ResultVO error() {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(500);
        resultVo.setMessage("failure");
        return resultVo;
    }

    public ResultVO(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultVO() {
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ResultVO<?> resultVo = (ResultVO)o;
            return this.code.equals(resultVo.code) && this.message.equals(resultVo.message) && this.data.equals(resultVo.data);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.code, this.message, this.data});
    }

    public String toString() {
        return "ResultVo{code=" + this.code + ", message='" + this.message + '\'' + ", data=" + this.data + '}';
    }
}
