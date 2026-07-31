package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyRVRB extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyRVRB(short s, short s2, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        setObjectValue(DataTypes.OBJ_REVERB_LEFT, Short.valueOf(s));
        setObjectValue(DataTypes.OBJ_REVERB_RIGHT, Short.valueOf(s2));
        setObjectValue(DataTypes.OBJ_REVERB_BOUNCE_LEFT, Byte.valueOf(b));
        setObjectValue(DataTypes.OBJ_REVERB_BOUNCE_RIGHT, Byte.valueOf(b2));
        setObjectValue(DataTypes.OBJ_REVERB_FEEDBACK_LEFT_TO_LEFT, Byte.valueOf(b3));
        setObjectValue(DataTypes.OBJ_REVERB_FEEDBACK_LEFT_TO_RIGHT, Byte.valueOf(b4));
        setObjectValue(DataTypes.OBJ_REVERB_FEEDBACK_RIGHT_TO_RIGHT, Byte.valueOf(b5));
        setObjectValue(DataTypes.OBJ_REVERB_FEEDBACK_RIGHT_TO_LEFT, Byte.valueOf(b6));
        setObjectValue(DataTypes.OBJ_PREMIX_LEFT_TO_RIGHT, Byte.valueOf(b7));
        setObjectValue(DataTypes.OBJ_PREMIX_RIGHT_TO_LEFT, Byte.valueOf(b8));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "RVRB";
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_LEFT, this, 2));
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_RIGHT, this, 2));
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_BOUNCE_LEFT, this, 1));
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_BOUNCE_RIGHT, this, 1));
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_FEEDBACK_LEFT_TO_LEFT, this, 1));
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_FEEDBACK_LEFT_TO_RIGHT, this, 1));
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_FEEDBACK_RIGHT_TO_RIGHT, this, 1));
        addDataType(new NumberFixedLength(DataTypes.OBJ_REVERB_FEEDBACK_RIGHT_TO_LEFT, this, 1));
        addDataType(new NumberFixedLength(DataTypes.OBJ_PREMIX_LEFT_TO_RIGHT, this, 1));
        addDataType(new NumberFixedLength(DataTypes.OBJ_PREMIX_RIGHT_TO_LEFT, this, 1));
    }

    public FrameBodyRVRB(FrameBodyRVRB frameBodyRVRB) {
        super(frameBodyRVRB);
    }

    public FrameBodyRVRB() {
    }

    public FrameBodyRVRB(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyRVRB(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
