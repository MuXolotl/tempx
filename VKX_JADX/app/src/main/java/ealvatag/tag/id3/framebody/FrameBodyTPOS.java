package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTPOS extends AbstractFrameBodyNumberTotal implements ID3v23FrameBody, ID3v24FrameBody {
    public FrameBodyTPOS() {
    }

    public Integer getDiscNo() {
        return getNumber();
    }

    public String getDiscNoAsText() {
        return getNumberAsText();
    }

    public Integer getDiscTotal() {
        return getTotal();
    }

    public String getDiscTotalAsText() {
        return getTotalAsText();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TPOS";
    }

    public void setDiscNo(Integer num) {
        setNumber(num);
    }

    public void setDiscTotal(Integer num) {
        setTotal(num);
    }

    public FrameBodyTPOS(FrameBodyTPOS frameBodyTPOS) {
        super(frameBodyTPOS);
    }

    public void setDiscNo(String str) {
        setNumber(str);
    }

    public void setDiscTotal(String str) {
        setTotal(str);
    }

    public FrameBodyTPOS(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTPOS(byte b, Integer num, Integer num2) {
        super(b, num, num2);
    }

    public FrameBodyTPOS(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTPOS(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
