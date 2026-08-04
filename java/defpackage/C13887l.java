package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٓؒۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13887l extends C14274l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ThreadLocal f27157l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C13887l(InterfaceC14029l interfaceC14029l, InterfaceC12932l interfaceC12932l) {
        C4639l c4639l = C4639l.f9438l;
        super(interfaceC14029l, interfaceC12932l.mo245l(c4639l) == null ? interfaceC12932l.mo246l(c4639l) : interfaceC12932l);
        this.f27157l = new ThreadLocal();
        if (interfaceC14029l.metrica().mo245l(C6168l.f13001l) instanceof AbstractC1872l) {
            return;
        }
        Object objLoadAd = AbstractC7999l.loadAd(interfaceC12932l, null);
        AbstractC7999l.yandex(interfaceC12932l, objLoadAd);
        m3794l(interfaceC12932l, objLoadAd);
    }

    @Override // defpackage.C14274l, defpackage.C14750l
    public final void isPro(Object obj) {
        m3797l();
        Object objLoadAd = AbstractC13573l.loadAd(obj);
        InterfaceC14029l interfaceC14029l = this.f27949l;
        InterfaceC12932l interfaceC12932lMetrica = interfaceC14029l.metrica();
        Object objLoadAd2 = AbstractC7999l.loadAd(interfaceC12932lMetrica, null);
        C13887l c13887lRemoteconfig = objLoadAd2 != AbstractC7999l.yandex ? AbstractC14425l.remoteconfig(interfaceC14029l, interfaceC12932lMetrica, objLoadAd2) : null;
        try {
            interfaceC14029l.subs(objLoadAd);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (c13887lRemoteconfig == null || c13887lRemoteconfig.m3796l()) {
                AbstractC7999l.yandex(interfaceC12932lMetrica, objLoadAd2);
            }
        }
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final void m3794l(InterfaceC12932l interfaceC12932l, Object obj) {
        this.threadLocalIsSet = true;
        this.f27157l.set(new C8195l(interfaceC12932l, obj));
    }

    @Override // defpackage.C14274l
    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public final void mo3795l() {
        m3797l();
    }

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final boolean m3796l() {
        boolean z = this.threadLocalIsSet && this.f27157l.get() == null;
        this.f27157l.remove();
        return !z;
    }

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final void m3797l() {
        if (this.threadLocalIsSet) {
            C8195l c8195l = (C8195l) this.f27157l.get();
            if (c8195l != null) {
                AbstractC7999l.yandex((InterfaceC12932l) c8195l.f17098l, c8195l.f17097l);
            }
            this.f27157l.remove();
        }
    }
}
