package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTORY extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
    private static final int NUMBER_OF_DIGITS_IN_YEAR = 4;

    public FrameBodyTORY(FrameBodyTDOR frameBodyTDOR) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTDOR.getText().length() > 4 ? frameBodyTDOR.getText().substring(0, 4) : frameBodyTDOR.getText());
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TORY";
    }

    public FrameBodyTORY(FrameBodyTORY frameBodyTORY) {
        super(frameBodyTORY);
    }

    public FrameBodyTORY(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTORY() {
    }

    public FrameBodyTORY(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTORY(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
