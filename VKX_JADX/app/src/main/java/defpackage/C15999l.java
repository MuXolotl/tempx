package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: renamed from: lُٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15999l {
    public long adcel;
    public C3417l admob;
    public boolean amazon;
    public int billing;
    public int crashlytics;
    public C11090l firebase;
    public InterfaceC13490l isPro;
    public InterfaceC16061l loadAd;
    public List mopub;
    public int purchase;
    public EnumC9931l remoteconfig;
    public C11644l smaato;
    public C0327l vip;
    public C3625l yandex;
    public long subs = AbstractC17191l.yandex;
    public int metrica = -1;
    public int startapp = -1;

    public C15999l(C3625l c3625l, C11090l c11090l, InterfaceC16061l interfaceC16061l, int i, boolean z, int i2, int i3, List list) {
        this.yandex = c3625l;
        this.loadAd = interfaceC16061l;
        this.crashlytics = i;
        this.amazon = z;
        this.purchase = i2;
        this.billing = i3;
        this.mopub = list;
        this.firebase = c11090l;
    }

    public final void amazon(InterfaceC13490l interfaceC13490l) {
        long jYandex;
        InterfaceC13490l interfaceC13490l2 = this.isPro;
        if (interfaceC13490l != null) {
            int i = AbstractC17191l.loadAd;
            jYandex = AbstractC17191l.yandex(interfaceC13490l.loadAd(), interfaceC13490l.mo873super());
        } else {
            jYandex = AbstractC17191l.yandex;
        }
        if (interfaceC13490l2 == null) {
            this.isPro = interfaceC13490l;
            this.subs = jYandex;
        } else if (interfaceC13490l == null || this.subs != jYandex) {
            this.isPro = interfaceC13490l;
            this.subs = jYandex;
            this.adcel = (this.adcel << 2) | 1;
            this.smaato = null;
            this.vip = null;
            this.startapp = -1;
            this.metrica = -1;
        }
    }

    public final C0327l billing(EnumC9931l enumC9931l, long j, C6222l c6222l) {
        float fMin = Math.min(c6222l.yandex.mo1547l(), c6222l.amazon);
        C3625l c3625l = this.yandex;
        C11090l c11090l = this.firebase;
        List list = this.mopub;
        if (list == null) {
            list = C2580l.f5619l;
        }
        return new C0327l(new C17555l(c3625l, c11090l, list, this.purchase, this.amazon, this.crashlytics, this.isPro, enumC9931l, this.loadAd, j), c6222l, AbstractC7563l.amazon(j, (((long) AbstractC0509l.loadAd(fMin)) << 32) | (((long) AbstractC0509l.loadAd(c6222l.purchase)) & 4294967295L)));
    }

    public final boolean crashlytics(long j, EnumC9931l enumC9931l) {
        this.adcel = (this.adcel << 2) | 3;
        if (this.billing > 1) {
            C3417l c3417lSubs = AbstractC7209l.subs(this.admob, enumC9931l, this.firebase, this.isPro, this.loadAd);
            this.admob = c3417lSubs;
            j = c3417lSubs.yandex(this.billing, j);
        }
        C0327l c0327l = this.vip;
        if (c0327l != null) {
            C6222l c6222l = c0327l.loadAd;
            C17555l c17555l = c0327l.yandex;
            if (!c6222l.yandex.mo1545l()) {
                EnumC9931l enumC9931l2 = c17555l.admob;
                long j2 = c17555l.isPro;
                if (enumC9931l == enumC9931l2 && (C15519l.loadAd(j, j2) || (C15519l.admob(j) == C15519l.admob(j2) && C15519l.isPro(j) == C15519l.isPro(j2) && C15519l.mopub(j) >= c6222l.purchase && !c6222l.crashlytics))) {
                    if (C15519l.loadAd(j, this.vip.yandex.isPro)) {
                        return false;
                    }
                    this.vip = billing(enumC9931l, j, this.vip.loadAd);
                    return true;
                }
            }
        }
        this.vip = billing(enumC9931l, j, loadAd(j, enumC9931l));
        return true;
    }

    public final C6222l loadAd(long j, EnumC9931l enumC9931l) {
        C11644l c11644lPurchase = purchase(enumC9931l);
        long jAmazon = AbstractC13766l.amazon(j, this.amazon, this.crashlytics, c11644lPurchase.mo1547l());
        boolean z = this.amazon;
        int i = this.crashlytics;
        int i2 = this.purchase;
        return new C6222l(c11644lPurchase, jAmazon, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final void mopub(C3625l c3625l, C11090l c11090l, InterfaceC16061l interfaceC16061l, int i, boolean z, int i2, int i3, List list) {
        this.yandex = c3625l;
        boolean zAmazon = c11090l.amazon(this.firebase);
        this.firebase = c11090l;
        if (!zAmazon) {
            this.adcel <<= 2;
            this.smaato = null;
            this.vip = null;
            this.startapp = -1;
            this.metrica = -1;
        }
        this.loadAd = interfaceC16061l;
        this.crashlytics = i;
        this.amazon = z;
        this.purchase = i2;
        this.billing = i3;
        this.mopub = list;
        this.adcel = (this.adcel << 2) | 2;
        this.smaato = null;
        this.vip = null;
        this.startapp = -1;
        this.metrica = -1;
    }

    public final C11644l purchase(EnumC9931l enumC9931l) {
        C11644l c11644l = this.smaato;
        if (c11644l == null || enumC9931l != this.remoteconfig || c11644l.mo1545l()) {
            this.remoteconfig = enumC9931l;
            C3625l c3625l = this.yandex;
            C11090l c11090lCrashlytics = AbstractC7709l.crashlytics(this.firebase, enumC9931l);
            InterfaceC13490l interfaceC13490l = this.isPro;
            InterfaceC16061l interfaceC16061l = this.loadAd;
            List list = this.mopub;
            if (list == null) {
                list = C2580l.f5619l;
            }
            c11644l = new C11644l(c3625l, c11090lCrashlytics, list, interfaceC13490l, interfaceC16061l);
        }
        this.smaato = c11644l;
        return c11644l;
    }

    public final String toString() {
        String str = this.vip != null ? "<TextLayoutResult>" : "null";
        String strLoadAd = AbstractC17191l.loadAd(this.subs);
        long j = this.adcel;
        C0327l c0327l = this.vip;
        Object c15519l = c0327l != null ? new C15519l(c0327l.yandex.isPro) : "null";
        StringBuilder sbLicense = AbstractC14814l.license("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strLoadAd, ", history=");
        sbLicense.append(j);
        sbLicense.append(", constraints=");
        sbLicense.append(c15519l);
        sbLicense.append(")");
        return sbLicense.toString();
    }

    public final int yandex(int i, EnumC9931l enumC9931l) {
        int i2 = this.metrica;
        int i3 = this.startapp;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jYandex = AbstractC7563l.yandex(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.billing > 1) {
            C3417l c3417lSubs = AbstractC7209l.subs(this.admob, enumC9931l, this.firebase, this.isPro, this.loadAd);
            this.admob = c3417lSubs;
            jYandex = c3417lSubs.yandex(this.billing, jYandex);
        }
        int iLoadAd = AbstractC0509l.loadAd(loadAd(jYandex, enumC9931l).purchase);
        int iSubs = C15519l.subs(jYandex);
        if (iLoadAd < iSubs) {
            iLoadAd = iSubs;
        }
        this.metrica = i;
        this.startapp = iLoadAd;
        return iLoadAd;
    }
}
