package defpackage;

import android.graphics.Paint;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13601l implements InterfaceC13349l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C4480l f26628l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18449l f26629l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4417l f26630l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4480l f26631l;

    public C13601l() {
        C4417l c4417l = new C4417l();
        c4417l.yandex = AbstractC14707l.yandex;
        c4417l.loadAd = EnumC9931l.f20223l;
        c4417l.crashlytics = C11605l.yandex;
        c4417l.amazon = 0L;
        this.f26630l = c4417l;
        this.f26629l = new C18449l(this);
    }

    public static C4480l amazon(C13601l c13601l, long j, float f, int i) {
        C4480l c4480lYandex = c13601l.f26631l;
        if (c4480lYandex == null) {
            c4480lYandex = AbstractC4311l.yandex();
            c4480lYandex.vip(1);
            c13601l.f26631l = c4480lYandex;
        }
        Paint paint = c4480lYandex.yandex;
        if (!C9735l.crashlytics(c4480lYandex.yandex(), j)) {
            c4480lYandex.billing(j);
        }
        if (c4480lYandex.crashlytics != null) {
            c4480lYandex.isPro(null);
        }
        if (!AbstractC8576l.yandex(c4480lYandex.amazon, null)) {
            c4480lYandex.mopub(null);
        }
        if (c4480lYandex.loadAd != 3) {
            c4480lYandex.purchase(3);
        }
        if (paint.getStrokeWidth() != f) {
            c4480lYandex.remoteconfig(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c4480lYandex.loadAd() != i) {
            c4480lYandex.firebase(i);
        }
        if (c4480lYandex.crashlytics() != 0) {
            c4480lYandex.smaato(0);
        }
        if (!AbstractC8576l.yandex(c4480lYandex.purchase, null)) {
            c4480lYandex.subs(null);
        }
        if (paint.isFilterBitmap()) {
            return c4480lYandex;
        }
        c4480lYandex.admob(1);
        return c4480lYandex;
    }

    public static C4480l yandex(C13601l c13601l, long j, AbstractC3239l abstractC3239l, float f, AbstractC8939l abstractC8939l, int i) {
        C4480l c4480lBilling = c13601l.billing(abstractC3239l);
        if (f != 1.0f) {
            j = C9735l.loadAd(C9735l.amazon(j) * f, j);
        }
        if (!C9735l.crashlytics(c4480lBilling.yandex(), j)) {
            c4480lBilling.billing(j);
        }
        if (c4480lBilling.crashlytics != null) {
            c4480lBilling.isPro(null);
        }
        if (!AbstractC8576l.yandex(c4480lBilling.amazon, abstractC8939l)) {
            c4480lBilling.mopub(abstractC8939l);
        }
        if (c4480lBilling.loadAd != i) {
            c4480lBilling.purchase(i);
        }
        if (c4480lBilling.yandex.isFilterBitmap()) {
            return c4480lBilling;
        }
        c4480lBilling.admob(1);
        return c4480lBilling;
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: abstract */
    public final void mo2064abstract(long j, long j2, long j3, long j4, AbstractC3239l abstractC3239l) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f26630l.crashlytics.billing(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), yandex(this, j, abstractC3239l, 1.0f, null, 3));
    }

    @Override // defpackage.InterfaceC13349l
    public final long admob() {
        return this.f26629l.m4551private();
    }

    @Override // defpackage.InterfaceC13349l
    public final void advert(C9902l c9902l, AbstractC9544l abstractC9544l, float f, AbstractC3239l abstractC3239l, AbstractC8939l abstractC8939l, int i) {
        this.f26630l.crashlytics.purchase(c9902l, crashlytics(abstractC9544l, abstractC3239l, f, abstractC8939l, i, 1));
    }

    @Override // defpackage.InterfaceC13349l
    public final void applovin(long j, float f, float f2, long j2, long j3, float f3, AbstractC3239l abstractC3239l) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f26630l.crashlytics.pro(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, yandex(this, j, abstractC3239l, f3, null, 3));
    }

    public final C4480l billing(AbstractC3239l abstractC3239l) {
        if (AbstractC8576l.yandex(abstractC3239l, C5053l.yandex)) {
            C4480l c4480l = this.f26628l;
            if (c4480l != null) {
                return c4480l;
            }
            C4480l c4480lYandex = AbstractC4311l.yandex();
            c4480lYandex.vip(0);
            this.f26628l = c4480lYandex;
            return c4480lYandex;
        }
        if (!(abstractC3239l instanceof C0404l)) {
            C18725l.billing();
            return null;
        }
        C4480l c4480lYandex2 = this.f26631l;
        if (c4480lYandex2 == null) {
            c4480lYandex2 = AbstractC4311l.yandex();
            c4480lYandex2.vip(1);
            this.f26631l = c4480lYandex2;
        }
        Paint paint = c4480lYandex2.yandex;
        float strokeWidth = paint.getStrokeWidth();
        C0404l c0404l = (C0404l) abstractC3239l;
        C6853l c6853l = c0404l.purchase;
        float f = c0404l.yandex;
        if (strokeWidth != f) {
            c4480lYandex2.remoteconfig(f);
        }
        int iLoadAd = c4480lYandex2.loadAd();
        int i = c0404l.crashlytics;
        if (iLoadAd != i) {
            c4480lYandex2.firebase(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = c0404l.loadAd;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iCrashlytics = c4480lYandex2.crashlytics();
        int i2 = c0404l.amazon;
        if (iCrashlytics != i2) {
            c4480lYandex2.smaato(i2);
        }
        if (!AbstractC8576l.yandex(c4480lYandex2.purchase, c6853l)) {
            c4480lYandex2.subs(c6853l);
        }
        return c4480lYandex2;
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: break */
    public final C18449l mo2065break() {
        return this.f26629l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, mo867final(f));
    }

    public final C4480l crashlytics(AbstractC9544l abstractC9544l, AbstractC3239l abstractC3239l, float f, AbstractC8939l abstractC8939l, int i, int i2) {
        C4480l c4480lBilling = billing(abstractC3239l);
        if (abstractC9544l != null) {
            abstractC9544l.yandex(f, this.f26629l.m4551private(), c4480lBilling);
        } else {
            if (c4480lBilling.crashlytics != null) {
                c4480lBilling.isPro(null);
            }
            long jYandex = c4480lBilling.yandex();
            long j = C9735l.loadAd;
            if (!C9735l.crashlytics(jYandex, j)) {
                c4480lBilling.billing(j);
            }
            if (c4480lBilling.yandex.getAlpha() / 255.0f != f) {
                c4480lBilling.amazon(f);
            }
        }
        if (!AbstractC8576l.yandex(c4480lBilling.amazon, abstractC8939l)) {
            c4480lBilling.mopub(abstractC8939l);
        }
        if (c4480lBilling.loadAd != i) {
            c4480lBilling.purchase(i);
        }
        if (c4480lBilling.yandex.isFilterBitmap() == i2) {
            return c4480lBilling;
        }
        c4480lBilling.admob(i2);
        return c4480lBilling;
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: else */
    public final void mo2066else(long j, float f, long j2, AbstractC3239l abstractC3239l) {
        this.f26630l.crashlytics.crashlytics(f, j2, yandex(this, j, abstractC3239l, 1.0f, null, 3));
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / loadAd();
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: finally */
    public final void mo2067finally(C14115l c14115l, long j, float f, AbstractC8939l abstractC8939l, int i) {
        this.f26630l.crashlytics.adcel(c14115l, j, crashlytics(null, C5053l.yandex, f, abstractC8939l, i, 1));
    }

    @Override // defpackage.InterfaceC13349l
    public final void firebase(C9902l c9902l, long j, float f, AbstractC3239l abstractC3239l) {
        this.f26630l.crashlytics.purchase(c9902l, yandex(this, j, abstractC3239l, f, null, 3));
    }

    @Override // defpackage.InterfaceC13349l
    public final EnumC9931l getLayoutDirection() {
        return this.f26630l.loadAd;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ float inmobi(long j) {
        return AbstractC2812l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return loadAd() * f;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f26630l.yandex.loadAd();
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final void mo2068l(AbstractC9544l abstractC9544l, long j, long j2, long j3, float f, AbstractC3239l abstractC3239l, AbstractC8939l abstractC8939l, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f26630l.crashlytics.billing(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), crashlytics(abstractC9544l, abstractC3239l, f, abstractC8939l, i, 1));
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final void mo2069l(C14115l c14115l, long j, long j2, long j3, float f, AbstractC8939l abstractC8939l, int i) {
        this.f26630l.crashlytics.amazon(c14115l, j, j2, j3, crashlytics(null, C5053l.yandex, f, abstractC8939l, 3, i));
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: lْٓؒ */
    public final long mo2070l() {
        return AbstractC8532l.mopub(this.f26629l.m4551private());
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: lْۥٞ */
    public final void mo2071l(AbstractC9544l abstractC9544l, long j, long j2, float f, AbstractC3239l abstractC3239l, AbstractC8939l abstractC8939l, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f26630l.crashlytics.firebase(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), crashlytics(abstractC9544l, abstractC3239l, f, abstractC8939l, i, 1));
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: lَٖؔ */
    public final void mo2072l(long j, long j2, long j3, float f, AbstractC3239l abstractC3239l, AbstractC8939l abstractC8939l, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f26630l.crashlytics.firebase(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), yandex(this, j, abstractC3239l, f, abstractC8939l, i));
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: lؙٗٙ */
    public final void mo2073l(ArrayList arrayList, long j, float f) {
        this.f26630l.crashlytics.subscription(arrayList, amazon(this, j, f, 1));
    }

    public final void purchase(AbstractC9544l abstractC9544l, long j, long j2, float f, float f2) {
        InterfaceC14859l interfaceC14859l = this.f26630l.crashlytics;
        C4480l c4480lYandex = this.f26631l;
        if (c4480lYandex == null) {
            c4480lYandex = AbstractC4311l.yandex();
            c4480lYandex.vip(1);
            this.f26631l = c4480lYandex;
        }
        Paint paint = c4480lYandex.yandex;
        if (abstractC9544l != null) {
            abstractC9544l.yandex(f2, this.f26629l.m4551private(), c4480lYandex);
        } else if (paint.getAlpha() / 255.0f != f2) {
            c4480lYandex.amazon(f2);
        }
        if (!AbstractC8576l.yandex(c4480lYandex.amazon, null)) {
            c4480lYandex.mopub(null);
        }
        if (c4480lYandex.loadAd != 3) {
            c4480lYandex.purchase(3);
        }
        if (paint.getStrokeWidth() != f) {
            c4480lYandex.remoteconfig(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c4480lYandex.loadAd() != 0) {
            c4480lYandex.firebase(0);
        }
        if (c4480lYandex.crashlytics() != 0) {
            c4480lYandex.smaato(0);
        }
        if (!AbstractC8576l.yandex(c4480lYandex.purchase, null)) {
            c4480lYandex.subs(null);
        }
        if (!paint.isFilterBitmap()) {
            c4480lYandex.admob(1);
        }
        interfaceC14859l.admob(j, j2, c4480lYandex);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / loadAd();
    }

    @Override // defpackage.InterfaceC13349l
    public final void subscription(long j, C11925l c11925l, Function1 function1) {
        c11925l.purchase(this, this.f26630l.loadAd, j, new C2977l(this, function1, 10));
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f26630l.yandex.mo873super();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }

    @Override // defpackage.InterfaceC13349l
    /* JADX INFO: renamed from: volatile */
    public final void mo2074volatile(long j, long j2, long j3, float f, int i) {
        this.f26630l.crashlytics.admob(j2, j3, amazon(this, j, f, i));
    }
}
