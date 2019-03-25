package SenJSon;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import SenJSon.*;

public class MyClass {
  protected NObject javonetHandle;

  public MyClass() {
    try {
      javonetHandle = Javonet.New("SenJSon.MyClass");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MyClass(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public static class Class1 {
    protected NObject javonetHandle;

    public Class1() {
      try {
        javonetHandle = Javonet.New("SenJSon.MyClass+Class1");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Class1(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Integer ActAsButton() {
      try {
        java.lang.Integer res = javonetHandle.invoke("ActAsButton");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
