package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import defpackage.EnumC7716l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTKEY extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTKEY() {
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TKEY";
    }

    public boolean isValid() {
        String firstTextValue = getFirstTextValue();
        EnumC7716l enumC7716l = EnumC7716l.FLAT;
        return firstTextValue != null && firstTextValue.length() <= 3 && firstTextValue.length() != 0 && ((firstTextValue.length() == 1 && firstTextValue.equals("o")) || (EnumC7716l.f16194l.containsKey(firstTextValue.substring(0, 1)) && ((!(firstTextValue.length() == 2 || firstTextValue.length() == 3) || EnumC7716l.f16196l.containsKey(firstTextValue.substring(1, 2))) && (firstTextValue.length() != 3 || firstTextValue.substring(2, 3).equals("m")))));
    }

    public FrameBodyTKEY(FrameBodyTKEY frameBodyTKEY) {
        super(frameBodyTKEY);
    }

    public FrameBodyTKEY(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTKEY(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTKEY(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
