package ealvatag.tag.id3.framebody;

import defpackage.AbstractC3843l;
import defpackage.C0869l;
import ealvatag.tag.datatype.AbstractString;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.StringDate;
import ealvatag.tag.datatype.StringNullTerminated;
import ealvatag.tag.datatype.TextEncodedStringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyOWNE extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyOWNE(byte b, String str, String str2, String str3) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_PRICE_PAID, str);
        setObjectValue(DataTypes.OBJ_PURCHASE_DATE, str2);
        setObjectValue(DataTypes.OBJ_SELLER_NAME, str3);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "OWNE";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new StringNullTerminated(DataTypes.OBJ_PRICE_PAID, this));
        addDataType(new StringDate(DataTypes.OBJ_PURCHASE_DATE, this));
        addDataType(new TextEncodedStringSizeTerminated(DataTypes.OBJ_SELLER_NAME, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        setTextEncoding(AbstractC3843l.yandex(getHeader(), getTextEncoding()));
        if (!((AbstractString) getObject(DataTypes.OBJ_SELLER_NAME)).canBeEncoded()) {
            setTextEncoding(AbstractC3843l.loadAd(getHeader()));
        }
        super.write(byteArrayOutputStream);
    }

    public FrameBodyOWNE(FrameBodyOWNE frameBodyOWNE) {
        super(frameBodyOWNE);
    }

    public FrameBodyOWNE() {
    }

    public FrameBodyOWNE(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyOWNE(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
