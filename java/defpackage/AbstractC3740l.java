package defpackage;

/* JADX INFO: renamed from: lۣۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3740l extends AbstractC1281l implements InterfaceC9921l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f7825l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2312l f7826l;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC3740l(InterfaceC11865l interfaceC11865l, C2312l c2312l) {
        C3199l c3199l = C2782l.f6058l;
        C16781l c16781l = c2312l.yandex;
        super(interfaceC11865l, c3199l, c16781l.crashlytics() ? C16781l.purchase : c16781l.mopub(), InterfaceC5706l.f12087l);
        this.f7826l = c2312l;
        this.f7825l = "package " + c2312l + " of " + interfaceC11865l;
    }

    @Override // defpackage.AbstractC1281l, defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        return (InterfaceC11865l) super.Signature();
    }

    @Override // defpackage.AbstractC1281l, defpackage.InterfaceC10233l
    public InterfaceC5706l billing() {
        return InterfaceC5706l.f12087l;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.ad(this, obj);
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final InterfaceC11865l m1422l() {
        return (InterfaceC11865l) super.Signature();
    }

    @Override // defpackage.AbstractC2775l, defpackage.Cgoto
    public String toString() {
        return this.f7825l;
    }
}
