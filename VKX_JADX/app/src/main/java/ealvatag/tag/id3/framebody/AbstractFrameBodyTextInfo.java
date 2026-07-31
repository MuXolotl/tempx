package ealvatag.tag.id3.framebody;

import defpackage.AbstractC3843l;
import defpackage.AbstractC6745l;
import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFrameBodyTextInfo extends AbstractID3v2FrameBody {
    public AbstractFrameBodyTextInfo() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, "");
    }

    public void addTextValue(String str) {
        ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).addValue(str);
    }

    public String getFirstTextValue() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueAtIndex(0);
    }

    public int getNumberOfValues() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getNumberOfValues();
    }

    public String getText() {
        return (String) getObjectValue(DataTypes.OBJ_TEXT);
    }

    public String getTextWithoutTrailingNulls() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueWithoutTrailingNull();
    }

    @Override // defpackage.AbstractC16446l
    public String getUserFriendlyValue() {
        return getTextWithoutTrailingNulls();
    }

    public String getValueAtIndex(int i) {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValueAtIndex(i);
    }

    public List<String> getValues() {
        return ((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).getValues();
    }

    public void setText(String str) {
        AbstractC6745l.yandex(str);
        setObjectValue(DataTypes.OBJ_TEXT, str);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new TextEncodedStringSizeTerminated(DataTypes.OBJ_TEXT, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        setTextEncoding(AbstractC3843l.yandex(getHeader(), getTextEncoding()));
        if (!((TextEncodedStringSizeTerminated) getObject(DataTypes.OBJ_TEXT)).canBeEncoded()) {
            setTextEncoding(AbstractC3843l.loadAd(getHeader()));
        }
        super.write(byteArrayOutputStream);
    }

    public AbstractFrameBodyTextInfo(AbstractFrameBodyTextInfo abstractFrameBodyTextInfo) {
        super(abstractFrameBodyTextInfo);
    }

    public AbstractFrameBodyTextInfo(byte b, String str) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_TEXT, str);
    }

    public AbstractFrameBodyTextInfo(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public AbstractFrameBodyTextInfo(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
