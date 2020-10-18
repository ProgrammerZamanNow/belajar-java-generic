package programmer.zaman.now.generic;

public class MyData<T> {

  private T data;

  public MyData(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
