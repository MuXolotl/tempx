package defpackage;

/* JADX INFO: renamed from: lٕؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC15475l {
    f30275l("PREVIEW"),
    f30272l("IMAGE_CAPTURE"),
    f30277l("IMAGE_ANALYSIS"),
    f30276l("VIDEO_CAPTURE"),
    f30278l("STREAM_SHARING"),
    f30273l("UNDEFINED");


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Class f30279l;

    EnumC15475l(String str) {
        this.f30279l = cls;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Preview";
        }
        if (iOrdinal == 1) {
            return "ImageCapture";
        }
        if (iOrdinal == 2) {
            return "ImageAnalysis";
        }
        if (iOrdinal == 3) {
            return "VideoCapture";
        }
        if (iOrdinal == 4) {
            return "StreamSharing";
        }
        if (iOrdinal == 5) {
            return "Undefined";
        }
        C18725l.billing();
        return null;
    }
}
