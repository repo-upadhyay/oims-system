package com.wms.core.business.content.model;

import java.io.InputStream;
import java.io.Serializable;

import com.wms.core.business.content.model.StaticContentFile;


public class InputContentFile extends StaticContentFile implements Serializable 
{

    private static final long serialVersionUID = 1L;
   
    private InputStream file;
   
    
    public InputStream getFile()
    {
        return file;
    }
    public void setFile( InputStream file )
    {
        this.file = file;
    }
   
    
    
}