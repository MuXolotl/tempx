package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12379l;
import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractArtworkFrameBody extends AbstractID3v2FrameBody {
    public AbstractArtworkFrameBody() {
    }

    public abstract byte[] getImageData();

    public String getImageUrl() {
        return isImageUrl() ? new String((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA), 0, ((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA)).length, AbstractC12379l.loadAd) : "";
    }

    public abstract String getMimeType();

    public int getPictureType() {
        return ((Long) getObjectValue(DataTypes.OBJ_PICTURE_TYPE)).intValue();
    }

    public abstract boolean isImageUrl();

    public AbstractArtworkFrameBody(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public AbstractArtworkFrameBody(C0869l c0869l, int i) {
        super(c0869l, i);
    }

    public AbstractArtworkFrameBody(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        super(abstractID3v2FrameBody);
    }
}
