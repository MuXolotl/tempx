package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.PartOfSet;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFrameBodyNumberTotal extends AbstractID3v2FrameBody {
    public AbstractFrameBodyNumberTotal() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue());
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public abstract String getIdentifier();

    public Integer getNumber() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getCount();
    }

    public String getNumberAsText() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getCountAsText();
    }

    public String getText() {
        return getObjectValue(DataTypes.OBJ_TEXT).toString();
    }

    public Integer getTotal() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getTotal();
    }

    public String getTotalAsText() {
        return ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getTotalAsText();
    }

    @Override // defpackage.AbstractC16446l
    public String getUserFriendlyValue() {
        return String.valueOf(((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).getCount());
    }

    public void setNumber(Integer num) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setCount(num);
    }

    public void setText(String str) {
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(str));
    }

    public void setTotal(Integer num) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setTotal(num);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new PartOfSet(DataTypes.OBJ_TEXT, this));
    }

    public void setNumber(String str) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setCount(str);
    }

    public void setTotal(String str) {
        ((PartOfSet.PartOfSetValue) getObjectValue(DataTypes.OBJ_TEXT)).setTotal(str);
    }

    public AbstractFrameBodyNumberTotal(AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal) {
        super(abstractFrameBodyNumberTotal);
    }

    public AbstractFrameBodyNumberTotal(byte b, String str) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(str));
    }

    public AbstractFrameBodyNumberTotal(byte b, Integer num, Integer num2) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(num, num2));
    }

    public AbstractFrameBodyNumberTotal(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public AbstractFrameBodyNumberTotal(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
