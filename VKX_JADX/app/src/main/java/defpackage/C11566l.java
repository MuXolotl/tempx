package defpackage;

/* JADX INFO: renamed from: lِٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11566l extends C16492l {
    public final long vip;
    public EnumC8667l metrica = EnumC8667l.UNKNOWN;
    public EnumC3098l startapp = EnumC3098l.f6639l;
    public String adcel = "";

    public C11566l(long j) {
        this.vip = j;
    }

    @Override // defpackage.C16492l
    public final C18449l yandex() {
        C18449l c18449lYandex = super.yandex();
        c18449lYandex.tapsense(this.vip, "fileSize");
        c18449lYandex.Signature(this.metrica, "kind");
        c18449lYandex.Signature(this.startapp, "profile");
        c18449lYandex.Signature(this.adcel, "brand");
        return c18449lYandex;
    }
}
