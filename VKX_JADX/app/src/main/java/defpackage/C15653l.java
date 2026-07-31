package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15653l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8954l f30599l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30600l;

    public /* synthetic */ C15653l(C8954l c8954l, int i) {
        this.f30600l = i;
        this.f30599l = c8954l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f30600l;
        C8954l c8954l = this.f30599l;
        switch (i) {
            case 0:
                return Boolean.valueOf(((EnumC9129l) c8954l.billing.getValue()) != EnumC9129l.f18765l);
            default:
                C15389l c15389l = c8954l.mopub;
                if (((C10086l) c15389l.purchase).getValue() != null) {
                    return (EnumC9129l) ((C8610l) c15389l.mopub).getValue();
                }
                float fAdmob = ((C13765l) c15389l.subs).admob();
                if (Float.isNaN(fAdmob)) {
                    return c8954l.amazon();
                }
                float fBilling = c15389l.subs().billing(c8954l.amazon());
                if (Float.isNaN(fBilling) || fAdmob == fBilling) {
                    return c8954l.amazon();
                }
                EnumC9129l enumC9129l = (EnumC9129l) c15389l.subs().yandex(fAdmob);
                return enumC9129l == null ? c8954l.amazon() : enumC9129l;
        }
    }
}
