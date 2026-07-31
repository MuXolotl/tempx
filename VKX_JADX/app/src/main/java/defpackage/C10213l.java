package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lََۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10213l implements InterfaceC16975l, InterfaceC11724l, InterfaceC18104l, InterfaceC3266l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f20805l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f20806l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20807l;

    public /* synthetic */ C10213l(long j, Object obj, int i) {
        this.f20805l = obj;
        this.f20807l = i;
        this.f20806l = j;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        C2285l c2285l = (C2285l) this.f20805l;
        C8755l c8755l = (C8755l) obj;
        c2285l.admob.getClass();
        byte[] bArrSmaato = C11140l.smaato(c8755l.yandex, c8755l.crashlytics);
        C13143l c13143l = c2285l.crashlytics;
        c13143l.getClass();
        c13143l.m3565private(bArrSmaato.length, bArrSmaato);
        c2285l.yandex.purchase(bArrSmaato.length, c13143l);
        long j = c8755l.loadAd;
        C5978l c5978l = c2285l.admob;
        long j2 = this.f20806l;
        if (j == -9223372036854775807L) {
            AbstractC12442l.subscription(c5978l.tapsense == Long.MAX_VALUE);
        } else {
            long j3 = c5978l.tapsense;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        c2285l.yandex.yandex(j2, this.f20807l | 1, bArrSmaato.length, 0, null);
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        List list = (List) this.f20805l;
        int i2 = this.f20807l;
        return c3726l.appmetrica(c6499l, list, i2 == -1 ? c3726l.tapsense.mo2761implements() : i2, i2 == -1 ? c3726l.tapsense.mo2771l() : this.f20806l);
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        C13208l c13208l = (C13208l) this.f20805l;
        interfaceC4725l.mo473while(c13208l.crashlytics, i, this.f20807l, this.f20806l);
    }

    @Override // defpackage.InterfaceC18104l
    public void crashlytics(C18602l c18602l, C6499l c6499l) {
        BinderC4841l binderC4841l = (BinderC4841l) this.f20805l;
        c18602l.smaato(binderC4841l.m1626l(c6499l, c18602l, this.f20807l), this.f20806l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        C5597l c5597l = (C5597l) this.f20805l;
        ((InterfaceC5252l) obj).mo1746package(this.f20807l, this.f20806l, c5597l);
    }

    public /* synthetic */ C10213l(C5597l c5597l, int i, long j, long j2) {
        this.f20805l = c5597l;
        this.f20807l = i;
        this.f20806l = j;
    }

    public /* synthetic */ C10213l(C2285l c2285l, long j, int i) {
        this.f20805l = c2285l;
        this.f20806l = j;
        this.f20807l = i;
    }
}
