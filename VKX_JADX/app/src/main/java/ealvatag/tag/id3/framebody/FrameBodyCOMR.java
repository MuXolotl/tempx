package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringDate;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyCOMR extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyCOMR(byte b, String str, String str2, String str3, byte b2, String str4, String str5, String str6, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_PRICE_STRING, str);
        setObjectValue(DataTypes.OBJ_VALID_UNTIL, str2);
        setObjectValue(DataTypes.OBJ_CONTACT_URL, str3);
        setObjectValue(DataTypes.OBJ_RECIEVED_AS, Byte.valueOf(b2));
        setObjectValue(DataTypes.OBJ_SELLER_NAME, str4);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str5);
        setObjectValue(DataTypes.OBJ_MIME_TYPE, str6);
        setObjectValue(DataTypes.OBJ_SELLER_LOGO, bArr);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "COMR";
    }

    public String getOwner() {
        return (String) getObjectValue(DataTypes.OBJ_OWNER);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_PRICE_STRING, this));
        addDataType(new StringDate(DataTypes.OBJ_VALID_UNTIL, this));
        addDataType(new StringNullTerminated(DataTypes.OBJ_CONTACT_URL, this));
        addDataType(new NumberHashMap(DataTypes.OBJ_RECIEVED_AS, this, 1));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_SELLER_NAME, this));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new StringNullTerminated(DataTypes.OBJ_MIME_TYPE, this));
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_SELLER_LOGO, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((AbstractString) getObject(DataTypes.OBJ_SELLER_NAME)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }

    public void getOwner(String str) {
        setObjectValue(DataTypes.OBJ_OWNER, str);
    }

    public FrameBodyCOMR(FrameBodyCOMR frameBodyCOMR) {
        super(frameBodyCOMR);
    }

    public FrameBodyCOMR() {
    }

    public FrameBodyCOMR(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyCOMR(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
