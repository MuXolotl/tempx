package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘِٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11665l extends AbstractC14971l implements InterfaceC7150l, InterfaceC1905l, InterfaceC16388l, InterfaceC16031l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C14632l f23379l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C12683l(interfaceC7448l, this, abstractC10113lAdcel, 9));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f23379l.getClass();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        AbstractC3700l.admob(this, this.f23379l.f28637l);
        this.f23379l.getClass();
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        C8896l c8896lCrashlytics;
        c6742l.yandex();
        C14632l c14632l = this.f23379l;
        InterfaceC3685l interfaceC3685lRemoteconfig = AbstractC5573l.remoteconfig(this);
        C13601l c13601l = c6742l.f14144l;
        C10086l c10086l = c14632l.f28632l;
        List listM4243this = AbstractC16901l.m4243this((List) c10086l.getValue(), C13617l.f26647l);
        int size = listM4243this.size();
        for (int i = 0; i < size; i++) {
            C0633l c0633l = (C0633l) listM4243this.get(i);
            boolean zMopub = c0633l.mopub();
            C10086l c10086l2 = c0633l.f2084l;
            if (zMopub && ((C11925l) c10086l2.getValue()) == null) {
                c10086l2.setValue(interfaceC3685lRemoteconfig.crashlytics());
            }
            C11925l c11925l = (C11925l) c10086l2.getValue();
            if (c11925l != null && (c8896lCrashlytics = c0633l.purchase().crashlytics.tapsense().crashlytics()) != null && c0633l.mopub()) {
                long jAdmob = c8896lCrashlytics.admob();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jAdmob >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jAdmob & 4294967295L));
                C9902l c9902l = c0633l.f2090l;
                if (c9902l != null) {
                    C18449l c18449l = c13601l.f26629l;
                    C18449l c18449l2 = c13601l.f26629l;
                    long jM4551private = c18449l.m4551private();
                    c18449l.m4555synchronized().mopub();
                    try {
                        ((C18449l) ((C16543l) c18449l.f36010l).f32482l).m4555synchronized().remoteconfig(c9902l);
                        ((C16543l) c18449l2.f36010l).inmobi(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            AbstractC2576l.loadAd(c6742l, c11925l);
                            ((C16543l) c18449l2.f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                            AbstractC0653l.license(c18449l, jM4551private);
                        } catch (Throwable th) {
                            ((C16543l) c18449l2.f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        AbstractC0653l.license(c18449l, jM4551private);
                        throw th2;
                    }
                } else {
                    C18449l c18449l3 = c13601l.f26629l;
                    C18449l c18449l4 = c13601l.f26629l;
                    ((C16543l) c18449l3.f36010l).inmobi(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        AbstractC2576l.loadAd(c6742l, c11925l);
                        ((C16543l) c18449l4.f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                    } catch (Throwable th3) {
                        ((C16543l) c18449l4.f36010l).inmobi(-fIntBitsToFloat, -fIntBitsToFloat2);
                        throw th3;
                    }
                }
            }
        }
        c10086l.setValue(listM4243this);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        this.f23379l.purchase();
        AbstractC3700l.admob(this, this.f23379l.f28637l);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
