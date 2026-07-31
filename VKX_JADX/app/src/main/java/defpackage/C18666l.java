package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18666l {
    public final C6264l amazon;
    public final int billing;
    public final C3654l crashlytics;
    public final boolean loadAd;
    public C18666l purchase;
    public final AbstractC14971l yandex;

    public C18666l(AbstractC14971l abstractC14971l, boolean z, C3654l c3654l, C6264l c6264l) {
        this.yandex = abstractC14971l;
        this.loadAd = z;
        this.crashlytics = c3654l;
        this.amazon = c6264l;
        this.billing = c3654l.f7685l;
    }

    public static /* synthetic */ List isPro(int i, C18666l c18666l) {
        return c18666l.subs((i & 1) != 0 ? !c18666l.loadAd : false, (i & 2) == 0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean adcel() {
        if (metrica() || !isPro(4, this).isEmpty()) {
            return false;
        }
        C3654l c3654lLicense = this.crashlytics.license();
        while (c3654lLicense != null) {
            C6264l c6264lAdvert = c3654lLicense.advert();
            if (c6264lAdvert != null && c6264lAdvert.f13223l) {
                if (c3654lLicense == null) {
                    return true;
                }
                return false;
            }
            c3654lLicense = c3654lLicense.license();
        }
        c3654lLicense = null;
        if (c3654lLicense == null) {
            return true;
        }
        return false;
    }

    public final C8896l admob() {
        AbstractC18026l abstractC18026lAmazon = amazon();
        if (abstractC18026lAmazon != null) {
            if (!abstractC18026lAmazon.mo2643l().f29462l) {
                abstractC18026lAmazon = null;
            }
            if (abstractC18026lAmazon != null) {
                return AbstractC9690l.loadAd(abstractC18026lAmazon, true);
            }
        }
        return C8896l.purchase;
    }

    public final void ads(ArrayList arrayList, C6264l c6264l) {
        if (this.amazon.f13226l) {
            return;
        }
        subscription(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C18666l c18666l = (C18666l) arrayList.get(size2);
            if (!c18666l.startapp()) {
                c6264l.admob(c18666l.amazon);
                c18666l.ads(arrayList, c6264l);
            }
        }
    }

    public final AbstractC18026l amazon() {
        AbstractC18026l abstractC18026lSmaato;
        if (!metrica()) {
            InterfaceC3703l interfaceC3703lBilling = billing();
            return (interfaceC3703lBilling == null || (abstractC18026lSmaato = AbstractC5573l.smaato(interfaceC3703lBilling, 8)) == null) ? (C11103l) this.crashlytics.f7703l.amazon : abstractC18026lSmaato;
        }
        C18666l c18666lSmaato = smaato();
        if (c18666lSmaato != null) {
            return c18666lSmaato.amazon();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final InterfaceC3703l billing() {
        ?? LoadAd;
        boolean z;
        ?? r0;
        boolean z2 = this.amazon.f13223l;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        C3654l c3654l = this.crashlytics;
        if (!z2) {
            AbstractC14971l abstractC14971l = (AbstractC14971l) c3654l.f7703l.mopub;
            if ((abstractC14971l.f29457l & 8) != 0) {
                loop3: while (abstractC14971l != null) {
                    if ((abstractC14971l.f29450l & 8) != 0) {
                        LoadAd = abstractC14971l;
                        ?? c17893l = 0;
                        while (true) {
                            if (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC3703l) {
                                    if (((InterfaceC3703l) LoadAd).remoteconfig()) {
                                        r4 = LoadAd;
                                    }
                                } else if ((LoadAd.f29450l & 8) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                                    int i = 0;
                                    while (abstractC14971l2 != null) {
                                        if ((abstractC14971l2.f29450l & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                LoadAd = LoadAd;
                                                c17893l = c17893l;
                                                c17893l = c17893l;
                                                LoadAd = abstractC14971l2;
                                            } else {
                                                if (c17893l == 0) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l.crashlytics(abstractC14971l2);
                                            }
                                        } else {
                                            LoadAd = LoadAd;
                                            c17893l = c17893l;
                                        }
                                        abstractC14971l2 = abstractC14971l2.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                    if (i == 1) {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    } else {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                    }
                    if ((abstractC14971l.f29457l & 8) == 0) {
                        break;
                    }
                    abstractC14971l = abstractC14971l.f29460l;
                }
            }
        } else {
            AbstractC14971l abstractC14971l3 = (AbstractC14971l) c3654l.f7703l.mopub;
            if ((abstractC14971l3.f29457l & 8) != 0) {
                LoadAd = 0;
                while (abstractC14971l3 != null) {
                    if ((abstractC14971l3.f29450l & 8) != 0) {
                        AbstractC14971l abstractC14971lLoadAd = abstractC14971l3;
                        C17893l c17893l2 = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof InterfaceC3703l) {
                                InterfaceC3703l interfaceC3703l = (InterfaceC3703l) abstractC14971lLoadAd;
                                if (interfaceC3703l.remoteconfig()) {
                                    if (interfaceC3703l.mo491l()) {
                                        r0 = LoadAd;
                                        r0 = LoadAd;
                                        return interfaceC3703l;
                                    }
                                    if (LoadAd == 0) {
                                        r0 = interfaceC3703l;
                                    }
                                }
                                r0 = LoadAd;
                                z = false;
                                LoadAd = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                LoadAd = LoadAd;
                                if ((abstractC14971lLoadAd.f29450l & 8) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i2 = 0;
                                    for (AbstractC14971l abstractC14971l4 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l4 != null; abstractC14971l4 = abstractC14971l4.f29460l) {
                                        if ((abstractC14971l4.f29450l & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                abstractC14971lLoadAd = abstractC14971l4;
                                            } else {
                                                if (c17893l2 == null) {
                                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l2.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l2.crashlytics(abstractC14971l4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                LoadAd = LoadAd;
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                        }
                    }
                    if ((abstractC14971l3.f29457l & 8) == 0) {
                        break;
                    }
                    abstractC14971l3 = abstractC14971l3.f29460l;
                    LoadAd = LoadAd;
                }
                r4 = LoadAd;
            }
        }
        return (InterfaceC3703l) r4;
    }

    public final void crashlytics(C3654l c3654l, ArrayList arrayList) {
        C17893l c17893lIsVip = c3654l.isVip();
        Object[] objArr = c17893lIsVip.f34848l;
        int i = c17893lIsVip.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l2 = (C3654l) objArr[i2];
            if (c3654l2.m1386native() && !c3654l2.f7684l) {
                if (c3654l2.f7703l.admob(8)) {
                    arrayList.add(AbstractC8320l.yandex(c3654l2, this.loadAd));
                } else {
                    crashlytics(c3654l2, arrayList);
                }
            }
        }
    }

    public final C6264l firebase() {
        boolean zStartapp = startapp();
        C6264l c6264l = this.amazon;
        if (!zStartapp) {
            return c6264l;
        }
        C6264l c6264lBilling = c6264l.billing();
        ads(new ArrayList(), c6264lBilling);
        return c6264lBilling;
    }

    public final C18666l loadAd(C6402l c6402l, Function1 function1) {
        C6264l c6264l = new C6264l();
        c6264l.f13223l = false;
        c6264l.f13226l = false;
        function1.invoke(c6264l);
        C18666l c18666l = new C18666l(new C0395l(function1), false, new C3654l(true, this.billing + (c6402l != null ? 1000000000 : 2000000000)), c6264l);
        c18666l.purchase = this;
        return c18666l;
    }

    public final boolean metrica() {
        return this.purchase != null;
    }

    public final C8896l mopub() {
        AbstractC18026l abstractC18026lAmazon = amazon();
        if (abstractC18026lAmazon != null) {
            if (!abstractC18026lAmazon.mo2643l().f29462l) {
                abstractC18026lAmazon = null;
            }
            if (abstractC18026lAmazon != null) {
                return AbstractC9690l.crashlytics(abstractC18026lAmazon).mo2592synchronized(abstractC18026lAmazon, true);
            }
        }
        return C8896l.purchase;
    }

    public final void purchase(ArrayList arrayList, ArrayList arrayList2) {
        subscription(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C18666l c18666l = (C18666l) arrayList.get(size2);
            if (c18666l.startapp()) {
                arrayList2.add(c18666l);
            } else if (!c18666l.amazon.f13226l) {
                c18666l.purchase(arrayList, arrayList2);
            }
        }
    }

    public final C8896l remoteconfig() {
        Object objBilling = billing();
        if (objBilling == null) {
            return ((C11103l) this.crashlytics.f7703l.amazon).m4475l();
        }
        AbstractC14971l abstractC14971l = ((AbstractC14971l) objBilling).f29454l;
        Object objMopub = this.amazon.f13225l.mopub(AbstractC16601l.loadAd);
        if (objMopub == null) {
            objMopub = null;
        }
        boolean z = objMopub != null;
        if (!abstractC14971l.f29454l.f29462l) {
            return C8896l.purchase;
        }
        if (z) {
            return AbstractC5573l.smaato(abstractC14971l, 8).m4475l();
        }
        AbstractC18026l abstractC18026lSmaato = AbstractC5573l.smaato(abstractC14971l, 8);
        return AbstractC9690l.crashlytics(abstractC18026lSmaato).mo2592synchronized(abstractC18026lSmaato, true);
    }

    public final C18666l smaato() {
        C3654l c3654lLicense;
        C18666l c18666l = this.purchase;
        if (c18666l != null) {
            return c18666l;
        }
        C3654l c3654l = this.crashlytics;
        boolean z = this.loadAd;
        if (!z) {
            c3654lLicense = null;
            break;
        }
        c3654lLicense = c3654l.license();
        while (true) {
            if (c3654lLicense == null) {
                c3654lLicense = null;
                break;
            }
            C6264l c6264lAdvert = c3654lLicense.advert();
            if (c6264lAdvert != null && c6264lAdvert.f13223l) {
                break;
            }
            c3654lLicense = c3654lLicense.license();
        }
        if (c3654lLicense == null) {
            for (C3654l c3654lLicense2 = c3654l.license(); c3654lLicense2 != null; c3654lLicense2 = c3654lLicense2.license()) {
                if (c3654lLicense2.f7703l.admob(8)) {
                    c3654lLicense = c3654lLicense2;
                }
            }
            c3654lLicense = null;
        }
        if (c3654lLicense == null) {
            return null;
        }
        return AbstractC8320l.yandex(c3654lLicense, z);
    }

    public final boolean startapp() {
        return this.loadAd && this.amazon.f13223l;
    }

    public final List subs(boolean z, boolean z2) {
        if (!z && this.amazon.f13226l) {
            return C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList();
        if (!startapp()) {
            return subscription(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        purchase(arrayList, arrayList2);
        return arrayList2;
    }

    public final List subscription(ArrayList arrayList, boolean z) {
        if (metrica()) {
            return C2580l.f5619l;
        }
        crashlytics(this.crashlytics, arrayList);
        if (z) {
            C6264l c6264l = this.amazon;
            C13660l c13660l = c6264l.f13225l;
            Object objMopub = c13660l.mopub(AbstractC0424l.isVip);
            if (objMopub == null) {
                objMopub = null;
            }
            C6402l c6402l = (C6402l) objMopub;
            if (c6402l != null && c6264l.f13223l && !arrayList.isEmpty()) {
                arrayList.add(loadAd(c6402l, new C3006l(28, c6402l)));
            }
            C4707l c4707l = AbstractC0424l.yandex;
            if (c13660l.crashlytics(c4707l) && !arrayList.isEmpty() && c6264l.f13223l) {
                Object objMopub2 = c13660l.mopub(c4707l);
                if (objMopub2 == null) {
                    objMopub2 = null;
                }
                List list = (List) objMopub2;
                String str = list != null ? (String) AbstractC16901l.m4217extends(list) : null;
                if (str != null) {
                    arrayList.add(0, loadAd(null, new C3006l(29, str)));
                }
            }
        }
        return arrayList;
    }

    public final C6264l vip() {
        return this.amazon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final C8896l yandex(AbstractC18026l abstractC18026l) {
        ?? LoadAd;
        C18666l c18666lSmaato = smaato();
        if (c18666lSmaato == null) {
            return C8896l.purchase;
        }
        AbstractC14971l abstractC14971l = (AbstractC14971l) c18666lSmaato.crashlytics.f7703l.mopub;
        if ((abstractC14971l.f29457l & 8) == 0) {
            LoadAd = 0;
            break;
        }
        loop0: while (true) {
            if (abstractC14971l != null) {
                if ((abstractC14971l.f29450l & 8) != 0) {
                    LoadAd = abstractC14971l;
                    ?? c17893l = 0;
                    while (LoadAd != 0) {
                        if (LoadAd instanceof InterfaceC3703l) {
                            if (((InterfaceC3703l) LoadAd).remoteconfig()) {
                                break loop0;
                            }
                        } else if ((LoadAd.f29450l & 8) != 0 && (LoadAd instanceof AbstractC11340l)) {
                            AbstractC14971l abstractC14971l2 = ((AbstractC11340l) LoadAd).f22875l;
                            int i = 0;
                            while (abstractC14971l2 != null) {
                                if ((abstractC14971l2.f29450l & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        LoadAd = LoadAd;
                                        c17893l = c17893l;
                                        c17893l = c17893l;
                                        LoadAd = abstractC14971l2;
                                    } else {
                                        if (c17893l == 0) {
                                            c17893l = new C17893l(0, new AbstractC14971l[16]);
                                        }
                                        if (LoadAd != 0) {
                                            c17893l.crashlytics(LoadAd);
                                            LoadAd = 0;
                                        }
                                        c17893l.crashlytics(abstractC14971l2);
                                    }
                                } else {
                                    LoadAd = LoadAd;
                                    c17893l = c17893l;
                                }
                                abstractC14971l2 = abstractC14971l2.f29460l;
                                LoadAd = LoadAd;
                                c17893l = c17893l;
                            }
                            if (i == 1) {
                                LoadAd = LoadAd;
                                c17893l = c17893l;
                            } else {
                                LoadAd = LoadAd;
                                c17893l = c17893l;
                            }
                        }
                        LoadAd = AbstractC5573l.loadAd(c17893l);
                    }
                }
                if ((abstractC14971l.f29457l & 8) != 0) {
                    abstractC14971l = abstractC14971l.f29460l;
                }
            }
            LoadAd = 0;
            break;
        }
        InterfaceC3703l interfaceC3703l = (InterfaceC3703l) LoadAd;
        AbstractC18026l abstractC18026lSmaato = interfaceC3703l != null ? AbstractC5573l.smaato(interfaceC3703l, 8) : null;
        return abstractC18026lSmaato == null ? c18666lSmaato.yandex(abstractC18026l) : abstractC18026lSmaato.mo2592synchronized(abstractC18026l, true);
    }
}
