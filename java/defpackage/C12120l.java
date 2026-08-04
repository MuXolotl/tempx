package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Objects;

/* JADX INFO: renamed from: lِۛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12120l extends AbstractC4634l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final boolean f24101l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f24102l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f24103l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final boolean f24104l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final int f24105l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f24106l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f24107l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int f24108l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final boolean f24109l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f24110l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final boolean f24111l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f24112l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final int f24113l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f24114l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final String f24115l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f24116l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f24117l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C9205l f24118l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f24119l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f24120l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f24121l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final boolean f24122l;

    /* JADX WARN: Code duplicated, block: B:137:0x0194  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    public C12120l(int i, C11916l c11916l, int i2, C9205l c9205l, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iMopub;
        int i6;
        boolean z4;
        String strCrashlytics;
        int i7;
        C5978l c5978l;
        int i8;
        int i9;
        int i10;
        C5978l c5978l2;
        int i11;
        int i12;
        int i13;
        super(i, c11916l, i2);
        this.f24118l = c9205l;
        boolean z5 = c9205l.f18943l;
        AbstractC1186l abstractC1186l = c9205l.remoteconfig;
        AbstractC1186l abstractC1186l2 = c9205l.metrica;
        int i14 = z5 ? 24 : 16;
        int i15 = 0;
        this.f24109l = false;
        if (!z || (((i11 = (c5978l2 = this.f9432l).license) != -1 && i11 > c9205l.yandex) || ((i12 = c5978l2.pro) != -1 && i12 > c9205l.loadAd))) {
            z2 = false;
        } else {
            float f = c5978l2.isVip;
            if ((f == -1.0f || f <= c9205l.crashlytics) && ((i13 = c5978l2.isPro) == -1 || i13 <= c9205l.amazon)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f24114l = z2;
        if (!z || (((i8 = (c5978l = this.f9432l).license) != -1 && i8 < c9205l.purchase) || ((i9 = c5978l.pro) != -1 && i9 < c9205l.billing))) {
            z3 = false;
        } else {
            float f2 = c5978l.isVip;
            if ((f2 == -1.0f || f2 >= c9205l.mopub) && ((i10 = c5978l.isPro) == -1 || i10 >= c9205l.admob)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f24103l = z3;
        this.f24106l = AbstractC4338l.tapsense(i3, false);
        C5978l c5978l3 = this.f9432l;
        float f3 = c5978l3.isVip;
        this.f24117l = f3 != -1.0f && f3 >= 10.0f;
        this.f24112l = c5978l3.isPro;
        int i16 = c5978l3.license;
        this.f24119l = (i16 == -1 || (i7 = c5978l3.pro) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            int size = abstractC1186l2.size();
            i5 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i17 >= size) {
                iMopub = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iMopub = C16717l.mopub(this.f9432l, (String) abstractC1186l2.get(i17), false);
                if (iMopub > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f24102l = i17;
        this.f24120l = iMopub;
        int i18 = this.f9432l.billing;
        int i19 = c9205l.startapp;
        AbstractC9743l abstractC9743l = C16717l.firebase;
        this.f24113l = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        int i20 = this.f9432l.billing;
        this.f24110l = i20 == 0 || (i20 & 1) != 0;
        this.f24121l = C16717l.mopub(this.f9432l, str, C16717l.isPro(str) == null);
        C5978l c5978l4 = this.f9432l;
        String str2 = c5978l4.metrica;
        int i21 = i3 & 384;
        if (i21 == 256 && (strCrashlytics = AbstractC4727l.crashlytics(c5978l4)) != null) {
            str2 = strCrashlytics;
        }
        for (int i22 = 0; i22 < abstractC1186l.size(); i22++) {
            if (str2 != null && str2.equals(abstractC1186l.get(i22))) {
                i5 = i22;
                break;
            }
        }
        this.f24116l = i5;
        this.f24107l = C16717l.yandex(this.f9432l, c9205l.vip);
        this.f24104l = i21 == 128 || i21 == 256;
        boolean z6 = i21 == 128;
        this.f24101l = z6;
        this.f24122l = (i3 & 64) == 64;
        this.f24115l = str2;
        if (str2 != null) {
            i6 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.f24108l = i6;
        if (z6) {
            C1591l c1591l = this.f9432l.inmobi;
            if (c1591l != null) {
                int i23 = c1591l.crashlytics;
                z4 = (i23 == 7 || i23 == 6) ? true : z4;
            } else {
                C1591l c1591l2 = C1591l.admob;
            }
            z4 = false;
        } else {
            z4 = false;
        }
        this.f24111l = z4;
        boolean z7 = this.f24114l;
        C9205l c9205l2 = this.f24118l;
        C5978l c5978l5 = this.f9432l;
        if ((c5978l5.billing & 16384) == 0 && AbstractC4338l.tapsense(i3, c9205l2.f18945l) && (z7 || c9205l2.f18947l)) {
            i15 = (!AbstractC4338l.tapsense(i3, false) || !this.f24103l || !z7 || c5978l5.isPro == -1 || c9205l2.f10154package || c9205l2.f10157throws || (i14 & i3) == 0) ? 1 : 2;
        }
        this.f24105l = i15;
    }

    public static int crashlytics(C12120l c12120l, C12120l c12120l2) {
        AbstractC12716l abstractC12716lCrashlytics = AbstractC12716l.yandex.crashlytics(c12120l.f24106l, c12120l2.f24106l);
        Integer numValueOf = Integer.valueOf(c12120l.f24102l);
        Integer numValueOf2 = Integer.valueOf(c12120l2.f24102l);
        C0058l c0058l = C0058l.f956l;
        return abstractC12716lCrashlytics.loadAd(numValueOf, numValueOf2, c0058l).yandex(c12120l.f24120l, c12120l2.f24120l).yandex(c12120l.f24113l, c12120l2.f24113l).loadAd(Integer.valueOf(c12120l.f24107l), Integer.valueOf(c12120l2.f24107l), c0058l).crashlytics(c12120l.f24110l, c12120l2.f24110l).yandex(c12120l.f24121l, c12120l2.f24121l).crashlytics(c12120l.f24117l, c12120l2.f24117l).crashlytics(c12120l.f24114l, c12120l2.f24114l).crashlytics(c12120l.f24103l, c12120l2.f24103l).loadAd(Integer.valueOf(c12120l.f24116l), Integer.valueOf(c12120l2.f24116l), c0058l).crashlytics(c12120l.f24104l, c12120l2.f24104l).crashlytics(c12120l.f24122l, c12120l2.f24122l).purchase();
    }

    @Override // defpackage.AbstractC4634l
    public final boolean loadAd(AbstractC4634l abstractC4634l) {
        C12120l c12120l = (C12120l) abstractC4634l;
        if (!this.f24109l && !Objects.equals(this.f24115l, c12120l.f24115l)) {
            return false;
        }
        this.f24118l.getClass();
        return this.f24104l == c12120l.f24104l && this.f24122l == c12120l.f24122l;
    }

    @Override // defpackage.AbstractC4634l
    public final int yandex() {
        return this.f24105l;
    }
}
