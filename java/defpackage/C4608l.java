package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4608l {
    public final Function1 admob;
    public final boolean amazon;
    public final Function1 billing;
    public final Function1 crashlytics;
    public final HashMap firebase = new HashMap();
    public final Function1 isPro;
    public final Function1 loadAd;
    public final Function1 mopub;
    public final Function1 purchase;
    public final Function1 subs;
    public final String yandex;

    public C4608l(String str, Function1 function1, Function1 function2, boolean z, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8) {
        this.yandex = str;
        this.loadAd = function1;
        this.crashlytics = function2;
        this.amazon = z;
        this.purchase = function3;
        this.billing = function4;
        this.mopub = function5;
        this.admob = function6;
        this.subs = function7;
        this.isPro = function8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4608l)) {
            return false;
        }
        C4608l c4608l = (C4608l) obj;
        return AbstractC8576l.yandex(this.yandex, c4608l.yandex) && AbstractC8576l.yandex(this.loadAd, c4608l.loadAd) && this.crashlytics.equals(c4608l.crashlytics) && this.amazon == c4608l.amazon && AbstractC8576l.yandex(this.purchase, c4608l.purchase) && AbstractC8576l.yandex(this.billing, c4608l.billing) && AbstractC8576l.yandex(this.mopub, c4608l.mopub) && AbstractC8576l.yandex(this.admob, c4608l.admob) && AbstractC8576l.yandex(this.subs, c4608l.subs) && AbstractC8576l.yandex(this.isPro, c4608l.isPro);
    }

    public final int hashCode() {
        int iHashCode = (((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31) + (this.amazon ? 1231 : 1237)) * 31;
        Function1 function1 = this.purchase;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function2 = this.billing;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function3 = this.mopub;
        int iHashCode4 = (iHashCode3 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function1 function4 = this.admob;
        int iHashCode5 = (iHashCode4 + (function4 == null ? 0 : function4.hashCode())) * 31;
        Function1 function5 = this.subs;
        int iHashCode6 = (iHashCode5 + (function5 == null ? 0 : function5.hashCode())) * 31;
        Function1 function6 = this.isPro;
        return iHashCode6 + (function6 != null ? function6.hashCode() : 0);
    }

    public final C15855l loadAd() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = this.yandex;
        c15855l.f31105l = this.loadAd;
        c15855l.f31112l = this.crashlytics;
        c15855l.f31109l = this.amazon;
        c15855l.f31111l = this.purchase;
        c15855l.f31114l = this.billing;
        c15855l.f31106l = this.mopub;
        c15855l.f31107l = this.admob;
        c15855l.f31113l = this.subs;
        c15855l.f31110l = this.isPro;
        return c15855l;
    }

    public final String toString() {
        return "DynamicColor(name=" + this.yandex + ", palette=" + this.loadAd + ", tone=" + this.crashlytics + ", isBackground=" + this.amazon + ", chromaMultiplier=" + this.purchase + ", background=" + this.billing + ", secondBackground=" + this.mopub + ", contrastCurve=" + this.admob + ", toneDeltaPair=" + this.subs + ", opacity=" + this.isPro + ")";
    }

    public final double yandex(C0187l c0187l) {
        return (c0187l.smaato == 2 ? AbstractC12446l.loadAd : AbstractC12446l.yandex).isPro(this, c0187l);
    }
}
