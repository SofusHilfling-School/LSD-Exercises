package HellApp;

/**
* HellApp/HelloHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./Hello.idl
* Monday, October 25, 2021 2:58:38 PM CEST
*/

public final class HelloHolder implements org.omg.CORBA.portable.Streamable
{
  public HellApp.Hello value = null;

  public HelloHolder ()
  {
  }

  public HelloHolder (HellApp.Hello initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HellApp.HelloHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HellApp.HelloHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HellApp.HelloHelper.type ();
  }

}
