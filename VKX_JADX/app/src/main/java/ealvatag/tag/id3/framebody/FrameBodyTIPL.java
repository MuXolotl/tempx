package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import defpackage.EnumC1699l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTIPL extends AbstractFrameBodyPairs implements ID3v24FrameBody {
    public static final String ARRANGER;
    public static final String DJMIXER;
    public static final String ENGINEER;
    public static final String MIXER;
    public static final String PRODUCER;

    static {
        HashMap map = EnumC1699l.f4087l;
        ENGINEER = "engineer";
        HashMap map2 = EnumC1699l.f4087l;
        MIXER = "mix";
        HashMap map3 = EnumC1699l.f4087l;
        DJMIXER = "DJ-mix";
        HashMap map4 = EnumC1699l.f4087l;
        PRODUCER = "producer";
        HashMap map5 = EnumC1699l.f4087l;
        ARRANGER = "arranger";
    }

    public FrameBodyTIPL(byte b, List<Pair> list) {
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
        return "TIPL";
    }

    public FrameBodyTIPL(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTIPL(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTIPL(C0869l c0869l, int i) {
        super(c0869l, i);
    }

    public FrameBodyTIPL(FrameBodyIPLS frameBodyIPLS) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(frameBodyIPLS.getTextEncoding()));
        setObjectValue(DataTypes.OBJ_TEXT, frameBodyIPLS.getPairing());
    }

    public FrameBodyTIPL() {
    }
}
