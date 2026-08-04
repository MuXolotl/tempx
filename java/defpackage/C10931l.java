package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10931l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8954l f22051l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22052l;

    public /* synthetic */ C10931l(C8954l c8954l, int i) {
        this.f22052l = i;
        this.f22051l = c8954l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f22052l;
        C8954l c8954l = this.f22051l;
        switch (i) {
            case 0:
                ((Float) obj).getClass();
                return Float.valueOf(((Number) c8954l.loadAd.invoke()).floatValue());
            case 1:
                C6148l c6148l = (C6148l) obj;
                C15389l c15389l = c8954l.mopub;
                float fAdmob = ((C13765l) c15389l.subs).admob();
                float fPurchase = c15389l.subs().purchase();
                float f = fAdmob < fPurchase ? fPurchase - fAdmob : 0.0f;
                c6148l.vip(f > 0.0f ? (Float.intBitsToFloat((int) (c6148l.f12958l & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & c6148l.f12958l)) : 1.0f);
                c6148l.tapsense(AbstractC5518l.yandex(0.5f, 0.0f));
                return Unit.INSTANCE;
            default:
                C6148l c6148l2 = (C6148l) obj;
                C15389l c15389l2 = c8954l.mopub;
                float fAdmob2 = ((C13765l) c15389l2.subs).admob();
                float fPurchase2 = c15389l2.subs().purchase();
                float f2 = fAdmob2 < fPurchase2 ? fPurchase2 - fAdmob2 : 0.0f;
                c6148l2.vip(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (c6148l2.f12958l & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & c6148l2.f12958l))) : 1.0f);
                c6148l2.tapsense(AbstractC5518l.yandex(0.5f, 0.0f));
                return Unit.INSTANCE;
        }
    }
}
