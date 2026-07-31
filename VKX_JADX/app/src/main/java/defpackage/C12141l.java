package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12141l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C15615l f24148l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24149l;

    public /* synthetic */ C12141l(C15615l c15615l, int i) {
        this.f24149l = i;
        this.f24148l = c15615l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f24149l;
        C15615l c15615l = this.f24148l;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C7644l c7644l = (C7644l) c15615l.f30483l;
                C3624l c3624lSubs = AbstractC18719l.subs((InterfaceC3588l) c7644l.f15737l, iIntValue);
                boolean z = c3624lSubs.crashlytics;
                C0511l c0511l = (C0511l) c7644l.f15738l;
                return z ? (InterfaceC17477l) ((C1683l) c0511l.subscription).loadAd.invoke(new C16518l(c3624lSubs, null)) : AbstractC9033l.purchase((InterfaceC11865l) c0511l.loadAd, c3624lSubs);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                C7644l c7644l2 = (C7644l) c15615l.f30483l;
                C3624l c3624lSubs2 = AbstractC18719l.subs((InterfaceC3588l) c7644l2.f15737l, iIntValue2);
                if (c3624lSubs2.crashlytics) {
                    return null;
                }
                InterfaceC15234l interfaceC15234lPurchase = AbstractC9033l.purchase((InterfaceC11865l) ((C0511l) c7644l2.f15738l).loadAd, c3624lSubs2);
                if (interfaceC15234lPurchase instanceof C9522l) {
                    return (C9522l) interfaceC15234lPurchase;
                }
                return null;
            default:
                return AbstractC7310l.billing((C18128l) obj, (C14965l) ((C7644l) c15615l.f30483l).f15740l);
        }
    }
}
