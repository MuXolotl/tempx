package defpackage;

import android.os.Build;
import androidx.car.app.model.Alert;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٔۦٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15315l implements InterfaceC12244l, InterfaceC2763l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C3316l f29928l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10086l f29930l = new C10086l(null, C11007l.billing);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10086l f29929l = new C10086l(null, C1256l.mopub);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C12593l f29931l = new C12593l();

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f29931l;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0271  */
    /* JADX WARN: Code duplicated, block: B:137:0x0297  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:146:0x02be  */
    /* JADX WARN: Code duplicated, block: B:149:0x0307  */
    /* JADX WARN: Code duplicated, block: B:151:0x030d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0316  */
    /* JADX WARN: Code duplicated, block: B:155:0x0325  */
    /* JADX WARN: Code duplicated, block: B:157:0x032f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0334 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final C0327l crashlytics(C11007l c11007l, C1256l c1256l) {
        ArrayList arrayList;
        boolean z;
        int i;
        C0327l c0327l;
        C11644l c11644l;
        int iIsPro;
        int iPurchase;
        C0327l c0327l2;
        C1579l c1579l;
        AbstractC18620l abstractC18620lIsPro;
        C12593l c12593l;
        C9293l c9293lAmazon;
        byte bPro;
        CharSequence charSequence;
        C11090l c11090l;
        Object objAdmob;
        C5667l c5667lAmazon = c11007l.yandex.amazon();
        List listPurchase = c5667lAmazon.f12059l;
        C1343l c1343l = c5667lAmazon.f12058l;
        if (c1343l != null) {
            C1257l c1257l = c1343l.yandex;
            arrayList = new ArrayList();
            C14261l c14261l = c1257l.loadAd;
            if (c14261l.amazon != c14261l.purchase) {
                int i2 = 4;
                while (true) {
                    C9571l c9571l = c14261l.loadAd;
                    if (i2 >= c9571l.loadAd) {
                        break;
                    }
                    if (!AbstractC0676l.admob(c9571l.amazon(i2)) && (objAdmob = c14261l.yandex.admob(i2 / 4)) != null) {
                        long jVip = c14261l.vip(i2);
                        int iAmazon = AbstractC12098l.amazon(jVip);
                        if (iAmazon > c1257l.crashlytics) {
                            iAmazon -= c1257l.crashlytics();
                        }
                        int iCrashlytics = (int) (jVip & 2147483647L);
                        if (iCrashlytics > c1257l.crashlytics) {
                            iCrashlytics -= c1257l.crashlytics();
                        }
                        arrayList.add(new C15012l(objAdmob, iAmazon, iCrashlytics));
                    }
                    i2 += 4;
                }
            }
        } else {
            arrayList = null;
        }
        if ((listPurchase == null || listPurchase.isEmpty()) && (arrayList == null || arrayList.isEmpty())) {
            listPurchase = null;
        } else if (listPurchase == null || listPurchase.isEmpty()) {
            listPurchase = arrayList;
        } else if (arrayList != null && !arrayList.isEmpty()) {
            C10227l c10227lAdmob = AbstractC14055l.admob();
            c10227lAdmob.addAll(listPurchase);
            c10227lAdmob.addAll(arrayList);
            listPurchase = AbstractC14055l.purchase(c10227lAdmob);
        }
        C12593l c12593l2 = (C12593l) AbstractC9620l.admob(this.f29931l);
        C0327l c0327l3 = c12593l2.vip;
        if (c0327l3 != null && (charSequence = c12593l2.crashlytics) != null && AbstractC16648l.adcel(charSequence, c5667lAmazon) && AbstractC8576l.yandex(c12593l2.amazon, listPurchase) && AbstractC8576l.yandex(c12593l2.purchase, c5667lAmazon.f12060l) && c12593l2.mopub == c11007l.crashlytics && c12593l2.admob == c11007l.amazon && c12593l2.firebase == c1256l.loadAd && c12593l2.subs == c1256l.yandex.loadAd() && c12593l2.isPro == c1256l.yandex.mo873super() && C15519l.loadAd(c12593l2.remoteconfig, c1256l.amazon) && AbstractC8576l.yandex(c12593l2.smaato, c1256l.crashlytics) && !c0327l3.loadAd.yandex.mo1545l()) {
            C11090l c11090l2 = c12593l2.billing;
            boolean zAmazon = c11090l2 != null ? c11090l2.amazon(c11007l.loadAd) : false;
            C11090l c11090l3 = c12593l2.billing;
            boolean z2 = c11090l3 != null && (c11090l3 == (c11090l = c11007l.loadAd) || c11090l3.yandex.loadAd(c11090l.yandex));
            if (zAmazon && z2) {
                return c0327l3;
            }
            if (zAmazon) {
                C17555l c17555l = c0327l3.yandex;
                return new C0327l(new C17555l(c17555l.yandex, c11007l.loadAd, c17555l.crashlytics, c17555l.amazon, c17555l.purchase, c17555l.billing, c17555l.mopub, c17555l.admob, c17555l.subs, c17555l.isPro), c0327l3.loadAd, c0327l3.crashlytics);
            }
        }
        C3316l c3316l = this.f29928l;
        if (c3316l == null) {
            c3316l = new C3316l(c1256l.crashlytics, c1256l.yandex, c1256l.loadAd, 1);
            this.f29928l = c3316l;
        }
        boolean z3 = c11007l.purchase;
        C11090l c11090lPurchase = c11007l.loadAd;
        if (z3) {
            C10537l c10537l = c11090lPurchase.yandex.firebase;
            if (c10537l == null || (c9293lAmazon = c10537l.amazon()) == null) {
                c9293lAmazon = AbstractC4189l.yandex.mo3369default().amazon();
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                bPro = AbstractC13950l.m3824switch(c9293lAmazon);
            } else {
                bPro = i3 >= 24 ? AbstractC11965l.pro(c9293lAmazon) : Character.getDirectionality(DecimalFormatSymbols.getInstance(c9293lAmazon.yandex).getZeroDigit());
            }
            c11090lPurchase = c11090lPurchase.purchase(new C11090l(0L, 0L, null, null, 0L, 0L, 0, (bPro == 1 || bPro == 2) ? 2 : 1, 0L, 16711679));
        }
        C11090l c11090l4 = c11090lPurchase;
        C3625l c3625l = new C3625l(c5667lAmazon.f12057l.toString(), listPurchase == null ? C2580l.f5619l : listPurchase);
        boolean z4 = c11007l.amazon;
        boolean z5 = c11007l.crashlytics;
        int iAdmob = Alert.DURATION_SHOW_INDEFINITELY;
        int i4 = z5 ? 1 : Integer.MAX_VALUE;
        long j = c1256l.amazon;
        EnumC9931l enumC9931l = c1256l.loadAd;
        InterfaceC7448l interfaceC7448l = c1256l.yandex;
        InterfaceC16061l interfaceC16061l = c1256l.crashlytics;
        C2580l c2580l = C2580l.f5619l;
        C5991l c5991l = (C5991l) c3316l.f7072l;
        C17555l c17555l2 = new C17555l(c3625l, c11090l4, c2580l, i4, z4, 1, interfaceC7448l, enumC9931l, interfaceC16061l, j);
        int i5 = i4;
        if (c5991l != null) {
            z = z4;
            C15262l c15262l = new C15262l(c17555l2);
            i = i5;
            C1579l c1579l2 = (C1579l) c5991l.f12716l;
            if (c1579l2 == null) {
                if (AbstractC8576l.yandex((C15262l) c5991l.f12715l, c15262l)) {
                    c0327l = (C0327l) c5991l.f12718l;
                }
                if (c0327l != null) {
                    C6222l c6222l = c0327l.loadAd;
                    c0327l2 = new C0327l(c17555l2, c6222l, AbstractC7563l.amazon(j, (((long) ((int) Math.ceil(c6222l.purchase))) & 4294967295L) | (((long) ((int) Math.ceil(c6222l.amazon))) << 32)));
                } else {
                    c11644l = new C11644l(c3625l, AbstractC7709l.crashlytics(c11090l4, enumC9931l), c2580l, interfaceC7448l, interfaceC16061l);
                    iIsPro = C15519l.isPro(j);
                    if (z && C15519l.amazon(j)) {
                        iAdmob = C15519l.admob(j);
                    }
                    iPurchase = iAdmob;
                    if (iIsPro != iPurchase) {
                        iPurchase = AbstractC8576l.purchase((int) Math.ceil(c11644l.mo1547l()), iIsPro, iPurchase);
                    }
                    C6222l c6222l2 = new C6222l(c11644l, AbstractC13628l.billing(0, iPurchase, 0, C15519l.mopub(j)), i, 1);
                    c0327l2 = new C0327l(c17555l2, c6222l2, AbstractC7563l.amazon(j, (((long) ((int) Math.ceil(c6222l2.amazon))) << 32) | (((long) ((int) Math.ceil(c6222l2.purchase))) & 4294967295L)));
                    if (c5991l != null) {
                        c1579l = (C1579l) c5991l.f12716l;
                        if (c1579l != null) {
                            c1579l.crashlytics(new C15262l(c17555l2), c0327l2);
                        } else {
                            c5991l.f12715l = new C15262l(c17555l2);
                            c5991l.f12718l = c0327l2;
                        }
                    }
                }
                if (!c0327l2.equals(c0327l3)) {
                    abstractC18620lIsPro = AbstractC9620l.isPro();
                    if (!abstractC18620lIsPro.billing()) {
                        c12593l = this.f29931l;
                        synchronized (AbstractC9620l.crashlytics) {
                            C12593l c12593l3 = (C12593l) AbstractC9620l.ad(c12593l, this, abstractC18620lIsPro);
                            c12593l3.crashlytics = c5667lAmazon;
                            c12593l3.amazon = listPurchase;
                            c12593l3.purchase = c5667lAmazon.f12060l;
                            c12593l3.mopub = c11007l.crashlytics;
                            c12593l3.admob = c11007l.amazon;
                            c12593l3.billing = c11007l.loadAd;
                            c12593l3.firebase = c1256l.loadAd;
                            c12593l3.subs = c1256l.purchase;
                            c12593l3.isPro = c1256l.billing;
                            c12593l3.remoteconfig = c1256l.amazon;
                            c12593l3.smaato = c1256l.crashlytics;
                            c12593l3.vip = c0327l2;
                            Unit unit = Unit.INSTANCE;
                        }
                        AbstractC9620l.metrica(abstractC18620lIsPro, this);
                        return c0327l2;
                    }
                }
                return c0327l2;
            }
            c0327l = (C0327l) c1579l2.loadAd(c15262l);
            if (c0327l == null || c0327l.loadAd.yandex.mo1545l()) {
            }
            if (c0327l != null) {
                C6222l c6222l3 = c0327l.loadAd;
                c0327l2 = new C0327l(c17555l2, c6222l3, AbstractC7563l.amazon(j, (((long) ((int) Math.ceil(c6222l3.purchase))) & 4294967295L) | (((long) ((int) Math.ceil(c6222l3.amazon))) << 32)));
            } else {
                c11644l = new C11644l(c3625l, AbstractC7709l.crashlytics(c11090l4, enumC9931l), c2580l, interfaceC7448l, interfaceC16061l);
                iIsPro = C15519l.isPro(j);
                if (z) {
                    iAdmob = C15519l.admob(j);
                }
                iPurchase = iAdmob;
                if (iIsPro != iPurchase) {
                    iPurchase = AbstractC8576l.purchase((int) Math.ceil(c11644l.mo1547l()), iIsPro, iPurchase);
                }
                C6222l c6222l4 = new C6222l(c11644l, AbstractC13628l.billing(0, iPurchase, 0, C15519l.mopub(j)), i, 1);
                c0327l2 = new C0327l(c17555l2, c6222l4, AbstractC7563l.amazon(j, (((long) ((int) Math.ceil(c6222l4.amazon))) << 32) | (((long) ((int) Math.ceil(c6222l4.purchase))) & 4294967295L)));
                if (c5991l != null) {
                    c1579l = (C1579l) c5991l.f12716l;
                    if (c1579l != null) {
                        c1579l.crashlytics(new C15262l(c17555l2), c0327l2);
                    } else {
                        c5991l.f12715l = new C15262l(c17555l2);
                        c5991l.f12718l = c0327l2;
                    }
                }
            }
            if (!c0327l2.equals(c0327l3)) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                if (!abstractC18620lIsPro.billing()) {
                    c12593l = this.f29931l;
                    synchronized (AbstractC9620l.crashlytics) {
                        C12593l c12593l4 = (C12593l) AbstractC9620l.ad(c12593l, this, abstractC18620lIsPro);
                        c12593l4.crashlytics = c5667lAmazon;
                        c12593l4.amazon = listPurchase;
                        c12593l4.purchase = c5667lAmazon.f12060l;
                        c12593l4.mopub = c11007l.crashlytics;
                        c12593l4.admob = c11007l.amazon;
                        c12593l4.billing = c11007l.loadAd;
                        c12593l4.firebase = c1256l.loadAd;
                        c12593l4.subs = c1256l.purchase;
                        c12593l4.isPro = c1256l.billing;
                        c12593l4.remoteconfig = c1256l.amazon;
                        c12593l4.smaato = c1256l.crashlytics;
                        c12593l4.vip = c0327l2;
                        Unit unit2 = Unit.INSTANCE;
                        AbstractC9620l.metrica(abstractC18620lIsPro, this);
                        return c0327l2;
                    }
                }
            }
            return c0327l2;
        }
        z = z4;
        i = i5;
        c0327l = null;
        if (c0327l != null) {
            C6222l c6222l5 = c0327l.loadAd;
            c0327l2 = new C0327l(c17555l2, c6222l5, AbstractC7563l.amazon(j, (((long) ((int) Math.ceil(c6222l5.purchase))) & 4294967295L) | (((long) ((int) Math.ceil(c6222l5.amazon))) << 32)));
        } else {
            c11644l = new C11644l(c3625l, AbstractC7709l.crashlytics(c11090l4, enumC9931l), c2580l, interfaceC7448l, interfaceC16061l);
            iIsPro = C15519l.isPro(j);
            if (z) {
                iAdmob = C15519l.admob(j);
            }
            iPurchase = iAdmob;
            if (iIsPro != iPurchase) {
                iPurchase = AbstractC8576l.purchase((int) Math.ceil(c11644l.mo1547l()), iIsPro, iPurchase);
            }
            C6222l c6222l6 = new C6222l(c11644l, AbstractC13628l.billing(0, iPurchase, 0, C15519l.mopub(j)), i, 1);
            c0327l2 = new C0327l(c17555l2, c6222l6, AbstractC7563l.amazon(j, (((long) ((int) Math.ceil(c6222l6.amazon))) << 32) | (((long) ((int) Math.ceil(c6222l6.purchase))) & 4294967295L)));
            if (c5991l != null) {
                c1579l = (C1579l) c5991l.f12716l;
                if (c1579l != null) {
                    c1579l.crashlytics(new C15262l(c17555l2), c0327l2);
                } else {
                    c5991l.f12715l = new C15262l(c17555l2);
                    c5991l.f12718l = c0327l2;
                }
            }
        }
        if (!c0327l2.equals(c0327l3)) {
            abstractC18620lIsPro = AbstractC9620l.isPro();
            if (!abstractC18620lIsPro.billing()) {
                c12593l = this.f29931l;
                synchronized (AbstractC9620l.crashlytics) {
                    C12593l c12593l5 = (C12593l) AbstractC9620l.ad(c12593l, this, abstractC18620lIsPro);
                    c12593l5.crashlytics = c5667lAmazon;
                    c12593l5.amazon = listPurchase;
                    c12593l5.purchase = c5667lAmazon.f12060l;
                    c12593l5.mopub = c11007l.crashlytics;
                    c12593l5.admob = c11007l.amazon;
                    c12593l5.billing = c11007l.loadAd;
                    c12593l5.firebase = c1256l.loadAd;
                    c12593l5.subs = c1256l.purchase;
                    c12593l5.isPro = c1256l.billing;
                    c12593l5.remoteconfig = c1256l.amazon;
                    c12593l5.smaato = c1256l.crashlytics;
                    c12593l5.vip = c0327l2;
                    Unit unit3 = Unit.INSTANCE;
                    AbstractC9620l.metrica(abstractC18620lIsPro, this);
                    return c0327l2;
                }
            }
        }
        return c0327l2;
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        C1256l c1256l;
        C11007l c11007l = (C11007l) this.f29930l.getValue();
        if (c11007l == null || (c1256l = (C1256l) this.f29929l.getValue()) == null) {
            return null;
        }
        return crashlytics(c11007l, c1256l);
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        this.f29931l = (C12593l) abstractC7498l;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        return abstractC7498l3;
    }
}
