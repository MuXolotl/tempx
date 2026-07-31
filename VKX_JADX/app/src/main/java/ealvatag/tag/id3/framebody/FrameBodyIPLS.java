package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyIPLS extends AbstractFrameBodyPairs implements ID3v23FrameBody {
    public FrameBodyIPLS(byte b, List<Pair> list) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
        Iterator<Pair> it = list.iterator();
        while (it.hasNext()) {
            valuePairs.add(it.next());
        }
        setObjectValue(DataTypes.OBJ_TEXT, valuePairs);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyPairs, ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "IPLS";
    }

    public FrameBodyIPLS(byte b, String str) {
        super(b, str);
    }

    public FrameBodyIPLS(FrameBodyIPLS frameBodyIPLS) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyIPLS.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyIPLS.getPairing());
    }

    public FrameBodyIPLS(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyIPLS(C0869l c0869l, int i) {
        super(c0869l, i);
    }

    public FrameBodyIPLS(FrameBodyTIPL frameBodyTIPL) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyTIPL.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyTIPL.getPairing());
    }

    public FrameBodyIPLS() {
    }
}
