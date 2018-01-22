/*
 *  The MIT License (MIT)
 * 
 * Copyright (c) 2017 Vidhyadharan Deivamani < it.vidhyadharan@gmail.com >
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.vidhya.java.http.patch.jax.rs;

import com.vidhya.java.http.jax.rs.fileupload.FileUploadResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
/**
 * 
 *
 * @author vidhya (it.vidhyadharan@gmail.com)
 */
@javax.ws.rs.ApplicationPath("")
public class ApplicationConfig extends Application {

    
     @Override
        public Set<Class<?>> getClasses() {

            Set<Class<?>> listOfClasses = new HashSet<>();
            listOfClasses.add(PersonResource.class);
            listOfClasses.add(Patching.class);
            listOfClasses.add(AcceptPatchHeaderFilter.class);
            
            //File upload resource            
            listOfClasses.add(FileUploadResource.class);
            
            
            return listOfClasses;
          } 
}