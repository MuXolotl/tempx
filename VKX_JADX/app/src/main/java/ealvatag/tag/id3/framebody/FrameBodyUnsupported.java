package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.ByteArraySizeTerminated;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyUnsupported extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody, ID3v22FrameBody {
    private String identifier;

    public FrameBodyUnsupported(byte[] bArr) {
        this.identifier = "";
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC16446l
    public boolean equals(Object obj) {
        return (obj instanceof FrameBodyUnsupported) && this.identifier.equals(((FrameBodyUnsupported) obj).identifier) && super.equals(obj);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new ByteArraySizeTerminated(DataTypes.OBJ_DATA, this));
    }

    @Override // defpackage.AbstractC16446l
    public String toString() {
        return getIdentifier();
    }

    public FrameBodyUnsupported(String str) {
        this.identifier = str;
    }

    public FrameBodyUnsupported(String str, byte[] bArr) {
        this.identifier = str;
        setObjectValue(DataTypes.OBJ_DATA, bArr);
    }

    public FrameBodyUnsupported() {
        this.identifier = "";
    }

    public FrameBodyUnsupported(FrameBodyUnsupported frameBodyUnsupported) {
        super(frameBodyUnsupported);
        this.identifier = "";
        this.identifier = frameBodyUnsupported.identifier;
    }

    public FrameBodyUnsupported(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
        this.identifier = "";
    }

    public FrameBodyUnsupported(C0869l c0869l, int i) {
        super(c0869l, i);
        this.identifier = "";
    }
}
