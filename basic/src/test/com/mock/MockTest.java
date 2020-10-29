package com.mock;

import org.junit.Test;

import java.io.IOError;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author steng
 * @description
 * @date 2020-09-29 16:35
 **/
public class MockTest {

    /**
     * 验证行为
     */
    @Test
    public void verify_behaviour(){

        //模拟创建一个list
        List mock = mock(List.class);

        mock.add(1);
        mock.clear();

        verify(mock).add(1);
        verify(mock).clear();

    }

    /**
     * 模拟我们所期望的结果
     */
    @Test
    public void when_thenReturn(){

        //mock 一个Iterator
        Iterator iterator = mock(Iterator.class);

        //预设当iterator调用next()时,第一次返回hello,第n次返回world
        when(iterator.next()).thenReturn("hello").thenReturn("world");

        //使用mock对象
        String result = iterator.next() + " " + iterator.next();

        //验证结果
        assertEquals("hello world",result);
    }

    @Test
    public void when_thenThrow() throws IOException{
        OutputStream outputStream = mock(OutputStream.class);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);

        //预设当流关闭时抛出异常
        doThrow(new IOException()).when(outputStream).close();

        outputStream.close();
    }


}
