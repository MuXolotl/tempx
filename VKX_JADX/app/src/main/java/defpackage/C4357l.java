package defpackage;

/* JADX INFO: renamed from: lۣؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C4357l implements InterfaceC4656l, Cloneable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C12645l f8893l;

    public C4357l(C12645l c12645l) {
        C12645l c12645l2 = new C12645l(c12645l.f24876l, c12645l.f24877l, c12645l.f24874l, 0);
        c12645l2.f24875l = c12645l.amazon();
        this.f8893l = c12645l2;
    }

    @Override // defpackage.InterfaceC4656l
    public final byte[] billing() {
        return this.f8893l.amazon();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // defpackage.InterfaceC4656l
    public final String getId() {
        return this.f8893l.f24877l;
    }

    @Override // defpackage.InterfaceC4656l
    public boolean isEmpty() {
        return this.f8893l.f24875l.length == 0;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return C0966l.f2667l.contains(EnumC14116l.yandex(this.f8893l.f24877l));
    }

    @Override // defpackage.InterfaceC4656l
    public final String toString() {
        return this.f8893l.purchase();
    }
}
