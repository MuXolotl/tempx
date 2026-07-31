package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9501l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15389l f19379l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19380l;

    public /* synthetic */ C9501l(C15389l c15389l, int i) {
        this.f19380l = i;
        this.f19379l = c15389l;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fSmaato;
        int i = this.f19380l;
        C15389l c15389l = this.f19379l;
        switch (i) {
            case 0:
                Object value = ((C10086l) c15389l.purchase).getValue();
                if (value != null) {
                    return value;
                }
                float fAdmob = ((C13765l) c15389l.subs).admob();
                C10086l c10086l = (C10086l) c15389l.crashlytics;
                if (Float.isNaN(fAdmob)) {
                    return c10086l.getValue();
                }
                float fBilling = c15389l.subs().billing(c10086l.getValue());
                if (Float.isNaN(fBilling) || fAdmob == fBilling) {
                    return c10086l.getValue();
                }
                Object objYandex = c15389l.subs().yandex(fAdmob);
                return objYandex == null ? c10086l.getValue() : objYandex;
            case 1:
                float fBilling2 = c15389l.subs().billing(((C10086l) c15389l.amazon).getValue());
                float fBilling3 = c15389l.subs().billing(((C8610l) c15389l.mopub).getValue()) - fBilling2;
                float fAbs = Math.abs(fBilling3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fSmaato = 1.0f;
                } else {
                    fSmaato = (c15389l.smaato() - fBilling2) / fBilling3;
                    if (fSmaato < 1.0E-6f) {
                        fSmaato = 0.0f;
                    } else if (fSmaato > 0.999999f) {
                        fSmaato = 1.0f;
                    }
                }
                return Float.valueOf(fSmaato);
            case 2:
                return c15389l.subs();
            default:
                return new C8195l(c15389l.subs(), ((C8610l) c15389l.mopub).getValue());
        }
    }
}
