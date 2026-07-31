package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.PartOfSet;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTRCK extends AbstractFrameBodyNumberTotal implements ID3v23FrameBody, ID3v24FrameBody {
    public FrameBodyTRCK() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TRCK";
    }

    public Integer getTrackNo() {
        return getNumber();
    }

    public String getTrackNoAsText() {
        return getNumberAsText();
    }

    public Integer getTrackTotal() {
        return getTotal();
    }

    public String getTrackTotalAsText() {
        return getTotalAsText();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal
    public void setText(String str) {
        setObjectValue(DataTypes.OBJ_TEXT, new PartOfSet.PartOfSetValue(str));
    }

    public void setTrackNo(Integer num) {
        setNumber(num);
    }

    public void setTrackTotal(Integer num) {
        setTotal(num);
    }

    public FrameBodyTRCK(FrameBodyTRCK frameBodyTRCK) {
        super(frameBodyTRCK);
    }

    public void setTrackNo(String str) {
        setNumber(str);
    }

    public void setTrackTotal(String str) {
        setTotal(str);
    }

    public FrameBodyTRCK(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTRCK(byte b, Integer num, Integer num2) {
        super(b, num, num2);
    }

    public FrameBodyTRCK(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTRCK(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
