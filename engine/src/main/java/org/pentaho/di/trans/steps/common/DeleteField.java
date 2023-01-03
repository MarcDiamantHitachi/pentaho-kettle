/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2023 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/


package org.pentaho.di.trans.steps.common;

import org.pentaho.di.core.injection.Injection;

public class DeleteField implements Cloneable {

    /** which field in input stream to compare with? */
    @Injection( name = "STREAM_FIELDNAME_1", group = "FIELDS" )
    private String fieldStream;

    /** field in table */
    @Injection( name = "TABLE_NAME_FIELD", group = "FIELDS", required = false )
    private String fieldLookup;

    /** Comparator: =, <>, BETWEEN, ... */
    @Injection( name = "COMPARATOR", group = "FIELDS", required = false )
    private String fieldCondition;

    /** Extra field for between... */
    @Injection( name = "STREAM_FIELDNAME_2", group = "FIELDS")
    private String fieldStream2;

    public DeleteField() {
        this.fieldStream = null;
    }

    public String getFieldStream() {
        return fieldStream;
    }

    public void setFieldStream(String fieldStream) {
        this.fieldStream = fieldStream;
    }

    public String getFieldLookup() {
        return fieldLookup;
    }

    public void setFieldLookup(String fieldLookup) {
        this.fieldLookup = fieldLookup;
    }

    public String getFieldCondition() {
        return fieldCondition;
    }

    public void setFieldCondition(String fieldCondition) {
        this.fieldCondition = fieldCondition;
    }

    public String getFieldStream2() {
        return fieldStream2;
    }

    public void setFieldStream2(String fieldStream2) {
        this.fieldStream2 = fieldStream2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( fieldStream == null ) ? 0 : fieldStream.hashCode() );
        result = prime * result + ( ( fieldLookup == null ) ? 0 : fieldLookup.hashCode() );
        result = prime * result + ( ( fieldCondition == null ) ? 0 : fieldCondition.hashCode() );
        result = prime * result + ( ( fieldStream2 == null ) ? 0 : fieldStream2.hashCode() );
        return result;
    }
    @Override
    public boolean equals( Object obj ) {
        if ( this == obj ) {
            return true;
        }
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        DeleteField other = (DeleteField) obj;
        if ( fieldStream == null ) {
            if ( other.fieldStream != null ) {
                return false;
            }
        } else if ( !fieldStream.equals( other.fieldStream ) ) {
            return false;
        }
        if ( fieldLookup == null ) {
            if ( other.fieldLookup != null ) {
                return false;
            }
        } else if ( !fieldLookup.equals( other.fieldLookup ) ) {
            return false;
        }
        if ( fieldCondition == null ) {
            if ( other.fieldCondition != null ) {
                return false;
            }
        } else if ( !fieldCondition.equals( other.fieldCondition ) ) {
            return false;
        }
        if ( fieldStream2 == null ) {
            if ( other.fieldStream2 != null ) {
                return false;
            }
        } else if ( !fieldStream2.equals( other.fieldStream2 ) ) {
            return false;
        }
        return true;
    }

    @Override
    public Object clone() {
        try {
            return (DeleteField) super.clone();
        } catch ( CloneNotSupportedException e ) {
            throw new RuntimeException( e );
        }
    }
}