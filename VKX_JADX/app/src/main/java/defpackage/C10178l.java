package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٌَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10178l {
    public final C10086l amazon;
    public final C17893l billing;
    public final C10086l crashlytics;
    public C2566l loadAd;
    public final C3585l purchase;
    public final C2494l yandex;

    public C10178l(String str, long j, C2494l c2494l) {
        this.yandex = c2494l;
        this.loadAd = new C2566l(new C5667l(str, AbstractC2296l.crashlytics(str.length(), j), null, null, null, null, null, 124), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        AbstractC8020l.smaato(bool);
        this.crashlytics = AbstractC8020l.smaato(new C5667l(str, j, null, null, null, null, null, 124));
        this.amazon = AbstractC8020l.smaato(bool);
        this.purchase = new C3585l(29, this);
        this.billing = new C17893l(0, new C2589l[16]);
    }

    public static final void yandex(C10178l c10178l, InterfaceC13142l interfaceC13142l, boolean z, int i) {
        C5667l c5667lLoadAd = c10178l.loadAd();
        if (((C17893l) c10178l.loadAd.yandex().f1691l).f34846l == 0 && C12814l.crashlytics(c5667lLoadAd.f12061l, c10178l.loadAd.f5585l)) {
            if (AbstractC8576l.yandex(c5667lLoadAd.f12060l, c10178l.loadAd.f5578l) && AbstractC8576l.yandex(c5667lLoadAd.f12062l, c10178l.loadAd.f5584l) && AbstractC8576l.yandex(c5667lLoadAd.f12059l, c10178l.loadAd.f5579l)) {
                return;
            }
            C5667l c5667lLoadAd2 = c10178l.loadAd();
            String string = c10178l.loadAd.f5577l.toString();
            C2566l c2566l = c10178l.loadAd;
            long j = c2566l.f5585l;
            C12814l c12814l = c2566l.f5578l;
            c10178l.purchase(c5667lLoadAd2, new C5667l(string, j, c12814l, c2566l.f5584l, AbstractC11173l.loadAd(c12814l, c2566l.f5579l), null, c5667lLoadAd.f12058l, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = ((C17893l) c10178l.loadAd.yandex().f1691l).f34846l != 0;
        String string2 = c10178l.loadAd.f5577l.toString();
        C2566l c2566l2 = c10178l.loadAd;
        long j2 = c2566l2.f5585l;
        C12814l c12814l2 = c2566l2.f5578l;
        C5667l c5667l = new C5667l(string2, j2, c12814l2, c2566l2.f5584l, AbstractC11173l.loadAd(c12814l2, c2566l2.f5579l), null, AbstractC11173l.billing(c10178l.loadAd), 32);
        if (interfaceC13142l == null) {
            if (z3 && z) {
                z2 = true;
            }
            c10178l.purchase(c5667lLoadAd, c5667l, z2);
            c10178l.crashlytics(c5667lLoadAd, c5667l, c10178l.loadAd.yandex(), i);
            return;
        }
        C2566l c2566l3 = new C2566l(c5667l, c10178l.loadAd.yandex(), c5667lLoadAd, null, 8);
        interfaceC13142l.firebase(c2566l3);
        C13545l c13545l = c2566l3.f5577l;
        boolean zAdcel = AbstractC16648l.adcel(c13545l, c5667l);
        boolean zCrashlytics = C12814l.crashlytics(c2566l3.f5585l, c5667l.f12061l);
        C1257l c1257l = c2566l3.f5583l;
        C1343l c1343l = c5667l.f12058l;
        boolean zYandex = AbstractC8576l.yandex(c1257l, c1343l != null ? c1343l.yandex : null);
        if (zAdcel && zCrashlytics && zYandex) {
            c10178l.purchase(c5667lLoadAd, C2566l.admob(c2566l3, 0L, c5667l.f12060l, 13), z);
        } else {
            C5667l c5667lAdmob = C2566l.admob(c10178l.loadAd, 0L, null, 15);
            if (!zAdcel || !zYandex) {
                c10178l.loadAd = new C2566l(new C5667l(c13545l.toString(), c2566l3.f5585l, null, null, null, null, AbstractC11173l.billing(c2566l3), 60), null, null, null, 14);
            } else if (!zCrashlytics) {
                C2566l c2566l4 = c10178l.loadAd;
                long j3 = c2566l3.f5585l;
                c2566l4.mopub(AbstractC2296l.loadAd((int) (j3 >> 32), (int) (4294967295L & j3)));
            }
            if (!zAdcel || !zCrashlytics || !AbstractC8576l.yandex(c5667lAdmob.f12060l, c2566l3.f5578l)) {
                c10178l.loadAd.billing(null);
            }
            c10178l.purchase(c5667lAdmob, C2566l.admob(c10178l.loadAd, 0L, null, 15), true);
        }
        c10178l.crashlytics(c5667lLoadAd, c10178l.loadAd(), c2566l3.yandex(), i);
    }

    public final void amazon(boolean z) {
        this.amazon.setValue(Boolean.valueOf(z));
    }

    public final void crashlytics(C5667l c5667l, C5667l c5667l2, C0458l c0458l, int i) {
        int iInmobi = AbstractC5020l.inmobi(i);
        C2494l c2494l = this.yandex;
        if (iInmobi == 0) {
            AbstractC16829l.purchase(c2494l, c5667l, c5667l2, c0458l, true);
            return;
        }
        if (iInmobi != 1) {
            if (iInmobi == 2) {
                AbstractC16829l.purchase(c2494l, c5667l, c5667l2, c0458l, false);
                return;
            } else {
                C18725l.billing();
                return;
            }
        }
        ((C10086l) c2494l.f5290l).setValue(null);
        C9106l c9106l = (C9106l) c2494l.f5291l;
        c9106l.loadAd.clear();
        c9106l.crashlytics.clear();
    }

    public final C5667l loadAd() {
        return (C5667l) this.crashlytics.getValue();
    }

    public final void purchase(C5667l c5667l, C5667l c5667l2, boolean z) {
        this.crashlytics.setValue(c5667l2);
        C17893l c17893l = this.billing;
        Object[] objArr = c17893l.f34848l;
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C2589l c2589l = (C2589l) objArr[i2];
            boolean z2 = (!z || AbstractC16648l.adcel(c5667l.f12057l, c5667l2) || c5667l.f12060l == null) ? false : true;
            C0554l c0554l = c2589l.yandex;
            long j = c5667l.f12061l;
            C12814l c12814l = c5667l.f12060l;
            long j2 = c5667l2.f12061l;
            C12814l c12814l2 = c5667l2.f12060l;
            if (z2) {
                c0554l.m629case().restartInput((View) c0554l.f1958l);
            } else if (!C12814l.crashlytics(j, j2) || !AbstractC8576l.yandex(c12814l, c12814l2)) {
                c0554l.m629case().updateSelection((View) c0554l.f1958l, C12814l.mopub(j2), C12814l.billing(j2), c12814l2 != null ? C12814l.mopub(c12814l2.yandex) : -1, c12814l2 != null ? C12814l.billing(c12814l2.yandex) : -1);
            }
        }
        amazon(false);
    }

    public final String toString() {
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            return "TextFieldState(selection=" + C12814l.isPro(loadAd().f12061l) + ", text=\"" + ((Object) loadAd().f12057l) + "\")";
        } finally {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        }
    }
}
