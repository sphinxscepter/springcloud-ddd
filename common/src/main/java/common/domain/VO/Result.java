package common.domain.VO;

import lombok.Data;

@Data
public class Result<T> {

    private int status;
    private String msg;
    private T data;

    public Result(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

}
