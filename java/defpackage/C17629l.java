package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ؓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17629l implements InterfaceC15894l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7119l f34311l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2397l f34312l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f34313l = AbstractC14503l.startapp;

    public C17629l(C7119l c7119l) {
        this.f34311l = c7119l;
    }

    public final Object crashlytics() throws Throwable {
        Object obj = this.f34313l;
        C9676l c9676l = AbstractC14503l.startapp;
        if (obj == c9676l) {
            C8339l.smaato("`hasNext()` has not been invoked");
            return null;
        }
        this.f34313l = c9676l;
        if (obj != AbstractC14503l.smaato) {
            return obj;
        }
        Throwable thPro = this.f34311l.pro();
        int i = AbstractC15902l.yandex;
        throw thPro;
    }

    @Override // defpackage.InterfaceC15894l
    public final void loadAd(AbstractC16653l abstractC16653l, int i) {
        C2397l c2397l = this.f34312l;
        if (c2397l != null) {
            c2397l.loadAd(abstractC16653l, i);
        }
    }

    public final Object yandex(AbstractC0283l abstractC0283l) throws Throwable {
        C12611l c12611lMetrica;
        Boolean bool;
        Object obj = this.f34313l;
        boolean z = true;
        if (obj == AbstractC14503l.startapp || obj == AbstractC14503l.smaato) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7119l.f14920l;
            C7119l c7119l = this.f34311l;
            C12611l c12611l = (C12611l) atomicReferenceFieldUpdater.get(c7119l);
            while (!c7119l.premium()) {
                long andIncrement = C7119l.f14917l.getAndIncrement(c7119l);
                long j = AbstractC14503l.loadAd;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (c12611l.f32620l != j2) {
                    c12611lMetrica = c7119l.metrica(j2, c12611l);
                    if (c12611lMetrica == null) {
                        continue;
                    }
                } else {
                    c12611lMetrica = c12611l;
                }
                Object objM2171extends = c7119l.m2171extends(c12611lMetrica, i, andIncrement, null);
                C9676l c9676l = AbstractC14503l.remoteconfig;
                C7442l c7442l = null;
                if (objM2171extends == c9676l) {
                    C8339l.smaato("unreachable");
                    return null;
                }
                C9676l c9676l2 = AbstractC14503l.metrica;
                if (objM2171extends == c9676l2) {
                    if (andIncrement < c7119l.advert()) {
                        c12611lMetrica.loadAd();
                    }
                    c12611l = c12611lMetrica;
                } else {
                    if (objM2171extends == AbstractC14503l.vip) {
                        C7119l c7119l2 = this.f34311l;
                        C2397l c2397lYandex = AbstractC15185l.yandex(AbstractC17082l.billing(abstractC0283l));
                        try {
                            this.f34312l = c2397lYandex;
                            Object objM2171extends2 = c7119l2.m2171extends(c12611lMetrica, i, andIncrement, this);
                            Function1 function1 = c7119l2.f14924l;
                            if (objM2171extends2 != c9676l) {
                                if (objM2171extends2 == c9676l2) {
                                    if (andIncrement < c7119l2.advert()) {
                                        c12611lMetrica.loadAd();
                                    }
                                    C12611l c12611l2 = (C12611l) C7119l.f14920l.get(c7119l2);
                                    while (true) {
                                        if (c7119l2.premium()) {
                                            C2397l c2397l = this.f34312l;
                                            this.f34312l = null;
                                            this.f34313l = AbstractC14503l.smaato;
                                            Throwable thStartapp = c7119l.startapp();
                                            if (thStartapp != null) {
                                                c2397l.subs(new C18435l(thStartapp));
                                                break;
                                            }
                                            c2397l.subs(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = C7119l.f14917l.getAndIncrement(c7119l2);
                                        long j3 = AbstractC14503l.loadAd;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (c12611l2.f32620l != j4) {
                                            C12611l c12611lMetrica2 = c7119l2.metrica(j4, c12611l2);
                                            if (c12611lMetrica2 != null) {
                                                c12611l2 = c12611lMetrica2;
                                            }
                                        }
                                        Object objM2171extends3 = c7119l2.m2171extends(c12611l2, i2, andIncrement2, this);
                                        if (objM2171extends3 == AbstractC14503l.remoteconfig) {
                                            loadAd(c12611l2, i2);
                                            break;
                                        }
                                        if (objM2171extends3 == AbstractC14503l.metrica) {
                                            if (andIncrement2 < c7119l2.advert()) {
                                                c12611l2.loadAd();
                                            }
                                        } else {
                                            if (objM2171extends3 == AbstractC14503l.vip) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            c12611l2.loadAd();
                                            this.f34313l = objM2171extends3;
                                            this.f34312l = null;
                                            bool = Boolean.TRUE;
                                            if (function1 != null) {
                                                c7442l = new C7442l(function1, objM2171extends3, 11);
                                            }
                                        }
                                    }
                                } else {
                                    c12611lMetrica.loadAd();
                                    this.f34313l = objM2171extends2;
                                    this.f34312l = null;
                                    bool = Boolean.TRUE;
                                    if (function1 != null) {
                                        c7442l = new C7442l(function1, objM2171extends2, 11);
                                    }
                                }
                                c2397lYandex.remoteconfig(bool, c7442l);
                                break;
                            }
                            loadAd(c12611lMetrica, i);
                            return c2397lYandex.Signature();
                        } catch (Throwable th) {
                            c2397lYandex.m1133throws();
                            throw th;
                        }
                    }
                    c12611lMetrica.loadAd();
                    this.f34313l = objM2171extends;
                }
            }
            this.f34313l = AbstractC14503l.smaato;
            Throwable thStartapp2 = c7119l.startapp();
            if (thStartapp2 != null) {
                int i3 = AbstractC15902l.yandex;
                throw thStartapp2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
