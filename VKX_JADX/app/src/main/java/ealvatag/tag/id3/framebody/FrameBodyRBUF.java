package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.BooleanByte;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyRBUF extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static int BUFFER_FIELD_SIZE = 3;
    private static int EMBED_FLAG_BIT_POSITION = 1;
    private static int OFFSET_FIELD_SIZE = 4;

    public FrameBodyRBUF(byte b, boolean z, byte b2) {
        setObjectValue(DataTypes.OBJ_BUFFER_SIZE, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_EMBED_FLAG, Boolean.valueOf(z));
        setObjectValue(DataTypes.OBJ_OFFSET, Byte.valueOf(b2));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "RBUF";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberFixedLength(DataTypes.OBJ_BUFFER_SIZE, this, BUFFER_FIELD_SIZE));
        addDataType(new BooleanByte(DataTypes.OBJ_EMBED_FLAG, this, (byte) EMBED_FLAG_BIT_POSITION));
        addDataType(new NumberFixedLength(DataTypes.OBJ_OFFSET, this, OFFSET_FIELD_SIZE));
    }

    public FrameBodyRBUF(FrameBodyRBUF frameBodyRBUF) {
        super(frameBodyRBUF);
    }

    public FrameBodyRBUF() {
        setObjectValue(DataTypes.OBJ_BUFFER_SIZE, (byte) 0);
        setObjectValue(DataTypes.OBJ_EMBED_FLAG, Boolean.FALSE);
        setObjectValue(DataTypes.OBJ_OFFSET, (byte) 0);
    }

    public FrameBodyRBUF(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyRBUF(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
