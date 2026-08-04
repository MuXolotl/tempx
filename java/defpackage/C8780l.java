package defpackage;

/* JADX INFO: renamed from: lٌٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8780l extends Exception {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C6403l f18075l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f18076l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f18077l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f18078l;

    public C8780l(C5978l c5978l, C11928l c11928l, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c5978l, c11928l, c5978l.metrica, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C8780l(String str, Throwable th, String str2, boolean z, C6403l c6403l, String str3) {
        super(str, th);
        this.f18077l = str2;
        this.f18076l = z;
        this.f18075l = c6403l;
        this.f18078l = str3;
    }
}
