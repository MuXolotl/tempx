package ealvatag.tag.id3.framebody;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyDeprecated extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private AbstractID3v2FrameBody originalFrameBody;

    public FrameBodyDeprecated(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        this.originalFrameBody = abstractID3v2FrameBody;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC16446l
    public boolean equals(Object obj) {
        return (obj instanceof FrameBodyDeprecated) && getIdentifier().equals(((FrameBodyDeprecated) obj).getIdentifier()) && super.equals(obj);
    }

    @Override // defpackage.AbstractC16446l
    public String getBriefDescription() {
        AbstractID3v2FrameBody abstractID3v2FrameBody = this.originalFrameBody;
        return abstractID3v2FrameBody != null ? abstractID3v2FrameBody.getBriefDescription() : "";
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return this.originalFrameBody.getIdentifier();
    }

    public AbstractID3v2FrameBody getOriginalFrameBody() {
        return this.originalFrameBody;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC18219l
    public int getSize() {
        return this.originalFrameBody.getSize();
    }

    @Override // defpackage.AbstractC16446l
    public String toString() {
        return getIdentifier();
    }

    public FrameBodyDeprecated(FrameBodyDeprecated frameBodyDeprecated) {
        super(frameBodyDeprecated);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
    }
}
