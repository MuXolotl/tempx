package ealvatag.tag.id3.framebody;

import defpackage.AbstractC3843l;
import defpackage.C0869l;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.Lyrics3Line;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringHashMap;
import ealvatag.tag.datatype.TextEncodedStringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyUSLT extends AbstractID3v2FrameBody implements ID3v23FrameBody, ID3v24FrameBody {
    public FrameBodyUSLT() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_LANGUAGE, "");
        setObjectValue(DataTypes.OBJ_DESCRIPTION, "");
        setObjectValue(DataTypes.OBJ_LYRICS, "");
    }

    public void addLyric(Lyrics3Line lyrics3Line) {
        setLyric(getLyric() + lyrics3Line.writeString());
    }

    public String getDescription() {
        return (String) getObjectValue(DataTypes.OBJ_DESCRIPTION);
    }

    public String getFirstTextValue() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_LYRICS)).getValueAtIndex(0);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "USLT";
    }

    public String getLanguage() {
        return (String) getObjectValue(DataTypes.OBJ_LANGUAGE);
    }

    public String getLyric() {
        return (String) getObjectValue(DataTypes.OBJ_LYRICS);
    }

    @Override // defpackage.AbstractC16446l
    public String getUserFriendlyValue() {
        return getFirstTextValue();
    }

    public void setDescription(String str) {
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str);
    }

    public void setLanguage(String str) {
        setObjectValue(DataTypes.OBJ_LANGUAGE, str);
    }

    public void setLyric(String str) {
        setObjectValue(DataTypes.OBJ_LYRICS, str);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringHashMap(DataTypes.OBJ_LANGUAGE, this, 3));
        addDataType(new TextEncodedStringNullTerminated(DataTypes.OBJ_DESCRIPTION, this));
        addDataType(new TextEncodedStringSizeTerminated(DataTypes.OBJ_LYRICS, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        setTextEncoding(AbstractC3843l.yandex(getHeader(), getTextEncoding()));
        if (!((AbstractString) getObject(DataTypes.OBJ_DESCRIPTION)).canBeEncoded()) {
            setTextEncoding(AbstractC3843l.loadAd(getHeader()));
        }
        if (!((AbstractString) getObject(DataTypes.OBJ_LYRICS)).canBeEncoded()) {
            setTextEncoding(AbstractC3843l.loadAd(getHeader()));
        }
        super.write(byteArrayOutputStream);
    }

    public void addLyric(String str) {
        setLyric(getLyric() + str);
    }

    public FrameBodyUSLT(FrameBodyUSLT frameBodyUSLT) {
        super(frameBodyUSLT);
    }

    public FrameBodyUSLT(byte b, String str, String str2, String str3) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_LANGUAGE, str);
        setObjectValue(DataTypes.OBJ_DESCRIPTION, str2);
        setObjectValue(DataTypes.OBJ_LYRICS, str3);
    }

    public FrameBodyUSLT(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyUSLT(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
