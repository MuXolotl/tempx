package defpackage;

/* JADX INFO: renamed from: lُۣۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11440l implements InterfaceC5457l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static volatile C11440l f23022l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String[] f23023l;

    public C11440l() {
        this.f23023l = new String[]{"Band", "Linear"};
    }

    @Override // defpackage.InterfaceC5457l
    public String getValue(int i) {
        String str;
        return (mo1044goto(i) && (str = this.f23023l[i]) != null) ? str : "";
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public boolean mo1044goto(int i) {
        return i >= 0 && i <= 1;
    }

    public C11440l(String[] strArr) {
        this.f23023l = strArr;
    }
}
