package defpackage;

/* JADX INFO: renamed from: lٓؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13947l extends IllegalStateException implements InterfaceC14404l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f27244l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f27245l;

    public C13947l(String str, String str2) {
        super(AbstractC14814l.adcel("Header ", str, " is not allowed for ", str2));
        this.f27245l = str;
        this.f27244l = str2;
    }

    @Override // defpackage.InterfaceC14404l
    public final Throwable yandex() {
        C13947l c13947l = new C13947l(this.f27245l, this.f27244l);
        c13947l.initCause(this);
        return c13947l;
    }
}
