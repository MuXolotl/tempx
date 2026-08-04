package defpackage;

/* JADX INFO: renamed from: lٌۦۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9199l {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f18918l;

    EnumC9199l(String str) {
        this.f18918l = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18918l;
    }
}
