package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11045l implements InterfaceC13921l {
    public boolean adcel;
    public boolean admob;
    public final /* synthetic */ C11919l ads;
    public C15519l amazon;
    public InterfaceC10346l billing;
    public final Function1 crashlytics;
    public boolean firebase;
    public Object isPro;
    public final C12418l loadAd;
    public long metrica;
    public boolean mopub;
    public InterfaceC6797l purchase;
    public boolean remoteconfig;
    public C16855l smaato;
    public long startapp = AbstractC18114l.yandex();
    public boolean subs;
    public long vip;
    public final int yandex;

    public C11045l(C11919l c11919l, int i, C12418l c12418l, Function1 function1) {
        this.ads = c11919l;
        this.yandex = i;
        this.loadAd = c12418l;
        this.crashlytics = function1;
    }

    public final void admob() {
        long jYandex = AbstractC18114l.yandex();
        long jLoadAd = C4663l.loadAd(jYandex, this.startapp);
        long j = jLoadAd >> 1;
        C6760l c6760l = C9658l.f19699l;
        if ((((int) jLoadAd) & 1) != 0) {
            if (j > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else {
                j = j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
            }
        }
        this.metrica = j;
        long j2 = this.vip - j;
        this.vip = j2;
        this.startapp = jYandex;
        AbstractC11880l.m3277interface(j2, "compose:lazy:prefetch:available_time_nanos");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01df  */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final boolean amazon(C8807l c8807l) {
        ?? r12;
        List list;
        int i = this.yandex;
        long j = i;
        AbstractC11880l.m3277interface(j, "compose:lazy:prefetch:execute:item");
        InterfaceC3074l interfaceC3074l = (InterfaceC3074l) ((C10554l) this.ads.f23763l).loadAd.invoke();
        if (!this.admob) {
            int iYandex = interfaceC3074l.yandex();
            if (i >= 0 && i < iYandex) {
                Object objLoadAd = interfaceC3074l.loadAd(i);
                Object obj = this.isPro;
                if (obj != null && !objLoadAd.equals(obj)) {
                    loadAd();
                    return false;
                }
                Object objCrashlytics = interfaceC3074l.crashlytics(i);
                C12418l c12418l = this.loadAd;
                C10609l c10609l = (C10609l) c12418l.f24521l;
                if (c12418l.f24518l != objCrashlytics || c10609l == null) {
                    C13660l c13660l = (C13660l) c12418l.f24519l;
                    Object objMopub = c13660l.mopub(objCrashlytics);
                    Object obj2 = objMopub;
                    if (objMopub == null) {
                        C10609l c10609l2 = new C10609l();
                        c10609l2.purchase = -1;
                        c13660l.vip(objCrashlytics, c10609l2);
                        obj2 = c10609l2;
                    }
                    c10609l = (C10609l) obj2;
                    c12418l.f24518l = objCrashlytics;
                    c12418l.f24521l = c10609l;
                }
                purchase();
                long jYandex = c8807l.yandex();
                this.vip = jYandex;
                this.startapp = AbstractC18114l.yandex();
                this.metrica = 0L;
                AbstractC11880l.m3277interface(jYandex, "compose:lazy:prefetch:available_time_nanos");
                if (!purchase()) {
                    if (mopub(this.vip, c10609l.yandex + c10609l.loadAd)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            billing(objLoadAd, objCrashlytics, c10609l);
                            Unit unit = Unit.INSTANCE;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!purchase()) {
                        return true;
                    }
                }
                if (this.billing != null) {
                    if (!mopub(this.vip, c10609l.crashlytics)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        InterfaceC10346l interfaceC10346l = this.billing;
                        if (interfaceC10346l == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.purchase = interfaceC10346l.apply();
                        this.billing = null;
                        this.subs = true;
                        Unit unit2 = Unit.INSTANCE;
                        Trace.endSection();
                        admob();
                        c10609l.crashlytics = C10609l.yandex(this.metrica, c10609l.crashlytics);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.firebase) {
                    if (this.vip <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        InterfaceC6797l interfaceC6797l = this.purchase;
                        if (interfaceC6797l == null) {
                            throw AbstractC1757l.m1043volatile("Should precompose before resolving nested prefetch states");
                        }
                        C10700l c10700l = new C10700l();
                        interfaceC6797l.loadAd(new C10489l(c10700l, 1));
                        List list2 = (List) c10700l.f21708l;
                        this.smaato = list2 != null ? new C16855l(this, list2) : null;
                        this.firebase = true;
                        Unit unit3 = Unit.INSTANCE;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                C16855l c16855l = this.smaato;
                if (c16855l != null) {
                    int i2 = c10609l.purchase;
                    boolean z = this.remoteconfig;
                    List[] listArr = c16855l.loadAd;
                    int i3 = c16855l.crashlytics;
                    List list3 = c16855l.yandex;
                    if (i3 < list3.size()) {
                        if (c16855l.billing.admob) {
                            AbstractC14825l.crashlytics("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((C14541l) list3.get(i4)).amazon = i2;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (c16855l.crashlytics < list3.size()) {
                                try {
                                    if (listArr[c16855l.crashlytics] == null) {
                                        if (c8807l.yandex() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = c16855l.crashlytics;
                                        C14541l c14541l = (C14541l) list3.get(i5);
                                        Function1 function1 = c14541l.yandex;
                                        if (function1 == null) {
                                            list = C2580l.f5619l;
                                        } else {
                                            C8929l c8929l = new C8929l(c14541l, c14541l.amazon);
                                            function1.invoke(c8929l);
                                            ArrayList arrayList = c8929l.loadAd;
                                            c14541l.billing = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i5] = list;
                                    }
                                    List list4 = listArr[c16855l.crashlytics];
                                    while (c16855l.amazon < list4.size()) {
                                        C11045l c11045l = (C11045l) list4.get(c16855l.amazon);
                                        if (z) {
                                            C11045l c11045l2 = c11045l instanceof C11045l ? c11045l : null;
                                            if (c11045l2 != null) {
                                                r12 = 1;
                                                c11045l2.remoteconfig = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        c16855l.purchase = r12;
                                        if (c11045l.crashlytics(c8807l)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        c16855l.amazon += r12;
                                    }
                                    c16855l.amazon = 0;
                                    c16855l.crashlytics++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Unit unit5 = Unit.INSTANCE;
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                C16855l c16855l2 = this.smaato;
                if (c16855l2 != null && c16855l2.purchase) {
                    admob();
                    AbstractC11880l.m3277interface(j, "compose:lazy:prefetch:execute:item");
                    C16855l c16855l3 = this.smaato;
                    if (c16855l3 != null) {
                        c16855l3.purchase = false;
                    }
                }
                C15519l c15519l = this.amazon;
                if (!this.mopub && c15519l != null) {
                    if (!mopub(this.vip, c10609l.amazon)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = c15519l.yandex;
                        if (this.admob) {
                            AbstractC14825l.yandex("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.mopub) {
                            AbstractC14825l.yandex("Request was already measured!");
                        }
                        this.mopub = true;
                        InterfaceC6797l interfaceC6797l2 = this.purchase;
                        if (interfaceC6797l2 == null) {
                            throw AbstractC1757l.m1043volatile("performComposition() must be called before performMeasure()");
                        }
                        int iAmazon = interfaceC6797l2.amazon();
                        for (int i6 = 0; i6 < iAmazon; i6++) {
                            interfaceC6797l2.purchase(i6, j2);
                        }
                        Unit unit6 = Unit.INSTANCE;
                        Trace.endSection();
                        admob();
                        c10609l.amazon = C10609l.yandex(this.metrica, c10609l.amazon);
                        Function1 function2 = this.crashlytics;
                        if (function2 != null) {
                            function2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                C16855l c16855l4 = this.smaato;
                if (this.mopub && this.firebase && c16855l4 != null) {
                    List list5 = c16855l4.yandex;
                    int size2 = list5.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((C14541l) list5.get(i7)).purchase);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = c10609l.purchase;
                    c10609l.purchase = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list5.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((C14541l) list5.get(i9)).billing);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        c10609l.amazon = 0L;
                    }
                }
                return false;
            }
        }
        loadAd();
        return false;
    }

    public final void billing(Object obj, Object obj2, C10609l c10609l) {
        InterfaceC10346l c2494l;
        InterfaceC10346l interfaceC10346l = this.billing;
        if (interfaceC10346l == null) {
            C11919l c11919l = this.ads;
            Function2 function2Yandex = ((C10554l) c11919l.f23763l).yandex(this.yandex, obj, obj2);
            C9117l c9117lYandex = ((C2768l) c11919l.f23767l).yandex();
            if (c9117lYandex.f18732l.m1386native()) {
                c9117lYandex.smaato(obj, function2Yandex, true);
                c2494l = new C2494l(c9117lYandex, obj, 2);
            } else {
                c2494l = new C3797l(c9117lYandex, obj, 29);
            }
            interfaceC10346l = c2494l;
            this.billing = interfaceC10346l;
            this.isPro = obj;
        }
        this.adcel = false;
        while (!interfaceC10346l.mo1191l() && !this.adcel) {
            interfaceC10346l.billing(new C15263l(this, c10609l, 15));
        }
        admob();
        boolean z = this.adcel;
        long j = this.metrica;
        if (z) {
            c10609l.loadAd = C10609l.yandex(j, c10609l.loadAd);
        } else {
            c10609l.yandex = C10609l.yandex(j, c10609l.yandex);
        }
    }

    @Override // defpackage.InterfaceC13921l
    public final void cancel() {
        if (this.admob) {
            return;
        }
        this.admob = true;
        loadAd();
    }

    public final boolean crashlytics(C8807l c8807l) {
        boolean zAmazon;
        if (!this.ads.f23764l) {
            return false;
        }
        if (this.remoteconfig) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zAmazon = amazon(c8807l);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zAmazon = amazon(c8807l);
        }
        AbstractC11880l.m3277interface(-1L, "compose:lazy:prefetch:execute:item");
        return zAmazon;
    }

    public final void loadAd() {
        InterfaceC10346l interfaceC10346l = this.billing;
        if (interfaceC10346l != null) {
            interfaceC10346l.cancel();
        }
        this.billing = null;
        InterfaceC6797l interfaceC6797l = this.purchase;
        if (interfaceC6797l != null) {
            interfaceC6797l.yandex();
        }
        this.purchase = null;
        this.smaato = null;
    }

    public final boolean mopub(long j, long j2) {
        if (this.remoteconfig) {
            j2 = 0;
        }
        return j > j2;
    }

    public final boolean purchase() {
        InterfaceC10346l interfaceC10346l;
        return this.subs || ((interfaceC10346l = this.billing) != null && interfaceC10346l.mo1191l());
    }

    public final String toString() {
        C15519l c15519l = this.amazon;
        boolean zPurchase = purchase();
        boolean z = this.mopub;
        boolean z2 = this.admob;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.yandex);
        sb.append(", constraints = ");
        sb.append(c15519l);
        sb.append(", isComposed = ");
        sb.append(zPurchase);
        sb.append(", isMeasured = ");
        sb.append(z);
        sb.append(", isCanceled = ");
        return AbstractC5020l.Signature(sb, z2, " }");
    }

    @Override // defpackage.InterfaceC13921l
    public final void yandex() {
        this.remoteconfig = true;
    }
}
