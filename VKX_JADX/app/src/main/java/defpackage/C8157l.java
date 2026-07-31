package defpackage;

/* JADX INFO: renamed from: lًٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8157l extends AbstractC7954l {
    public C13716l metrica;
    public final Object remoteconfig;
    public final C18353l vip;

    public C8157l(Object obj, C18353l c18353l) {
        this.remoteconfig = obj;
        this.vip = c18353l;
    }

    @Override // defpackage.AbstractC8769l
    public final Object amazon() {
        C13716l c13716l = this.metrica;
        return c13716l == null ? this.remoteconfig : this.vip.mo1368apply(c13716l.amazon());
    }
}
