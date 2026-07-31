package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import j$.util.Objects;

/* JADX INFO: renamed from: lؕؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3121l extends AbstractC4634l implements Comparable {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final int f6665l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f6666l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f6667l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final int f6668l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final int f6669l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C9205l f6670l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f6671l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final boolean f6672l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final int f6673l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final int f6674l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final boolean f6675l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f6676l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f6677l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f6678l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f6679l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f6680l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f6681l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f6682l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f6683l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final boolean f6684l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final boolean f6685l;

    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0119  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:0x0126  */
    public C3121l(int i, C11916l c11916l, int i2, C9205l c9205l, int i3, boolean z, C16337l c16337l, int i4) {
        int i5;
        int iMopub;
        boolean z2;
        int iMopub2;
        boolean z3;
        boolean z4;
        boolean z5;
        super(i, c11916l, i2);
        this.f6670l = c9205l;
        boolean z6 = c9205l.f18939l;
        AbstractC1186l abstractC1186l = c9205l.license;
        AbstractC1186l abstractC1186l2 = c9205l.adcel;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.f6683l = false;
        this.f6667l = C16717l.isPro(this.f9432l.amazon);
        this.f6680l = AbstractC4338l.tapsense(i3, false);
        int i8 = 0;
        while (true) {
            int size = abstractC1186l2.size();
            i5 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i8 >= size) {
                iMopub = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iMopub = C16717l.mopub(this.f9432l, (String) abstractC1186l2.get(i8), false);
                if (iMopub > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f6682l = i8;
        this.f6676l = iMopub;
        int i9 = this.f9432l.billing;
        int i10 = c9205l.subscription;
        this.f6679l = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f6666l = C16717l.yandex(this.f9432l, c9205l.ads);
        C5978l c5978l = this.f9432l;
        int i11 = c5978l.billing;
        this.f6677l = i11 == 0 || (i11 & 1) != 0;
        this.f6684l = (c5978l.purchase & 1) != 0;
        String str = c5978l.metrica;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.f6675l = z2;
        int i12 = c5978l.f12619package;
        this.f6673l = i12;
        this.f6669l = c5978l.f12622synchronized;
        int i13 = c5978l.isPro;
        this.f6668l = i13;
        this.f6681l = (i13 == -1 || i13 <= c9205l.Signature) && (i12 == -1 || i12 <= c9205l.tapsense) && c16337l.apply(c5978l);
        String[] strArrM3982synchronized = AbstractC15323l.m3982synchronized();
        int i14 = 0;
        while (true) {
            if (i14 < strArrM3982synchronized.length) {
                iMopub2 = C16717l.mopub(this.f9432l, strArrM3982synchronized[i14], false);
                if (iMopub2 <= 0) {
                    i14++;
                }
            } else {
                iMopub2 = 0;
                i14 = Integer.MAX_VALUE;
            }
        }
        this.f6671l = i14;
        this.f6674l = iMopub2;
        for (int i15 = 0; i15 < abstractC1186l.size(); i15++) {
            String str2 = this.f9432l.metrica;
            if (str2 != null && str2.equals(abstractC1186l.get(i15))) {
                i5 = i15;
                this.f6665l = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f6685l = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f6672l = z4;
                C5978l c5978l2 = this.f9432l;
                boolean z7 = this.f6681l;
                C9205l c9205l2 = this.f6670l;
                z5 = c9205l2.f18945l;
                C2171l c2171l = c9205l2.pro;
                if (AbstractC4338l.tapsense(i3, z5) && ((z7 || c9205l2.f18944l) && (c2171l.yandex != 2 || C16717l.remoteconfig(c9205l2, i3, c5978l2)))) {
                    if (AbstractC4338l.tapsense(i3, false) || !z7 || c5978l2.isPro == -1 || c9205l2.f10154package || c9205l2.f10157throws || ((!c9205l2.f18946l && z) || c2171l.yandex == 2 || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.f6678l = i7;
            }
        }
        this.f6665l = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f6685l = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f6672l = z4;
        C5978l c5978l3 = this.f9432l;
        boolean z8 = this.f6681l;
        C9205l c9205l3 = this.f6670l;
        z5 = c9205l3.f18945l;
        C2171l c2171l2 = c9205l3.pro;
        if (AbstractC4338l.tapsense(i3, z5)) {
            if (AbstractC4338l.tapsense(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.f6678l = i7;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3121l c3121l) {
        boolean z = this.f6680l;
        boolean z2 = this.f6681l;
        AbstractC9743l abstractC9743lYandex = (z2 && z) ? C16717l.firebase : C16717l.firebase.yandex();
        boolean z3 = c3121l.f6680l;
        int i = c3121l.f6668l;
        AbstractC12716l abstractC12716lCrashlytics = AbstractC12716l.yandex.crashlytics(z, z3);
        Integer numValueOf = Integer.valueOf(this.f6682l);
        Integer numValueOf2 = Integer.valueOf(c3121l.f6682l);
        C0058l c0058l = C0058l.f956l;
        AbstractC12716l abstractC12716lLoadAd = abstractC12716lCrashlytics.loadAd(numValueOf, numValueOf2, c0058l).yandex(this.f6676l, c3121l.f6676l).yandex(this.f6679l, c3121l.f6679l).loadAd(Integer.valueOf(this.f6666l), Integer.valueOf(c3121l.f6666l), c0058l).crashlytics(this.f6684l, c3121l.f6684l).crashlytics(this.f6677l, c3121l.f6677l).loadAd(Integer.valueOf(this.f6671l), Integer.valueOf(c3121l.f6671l), c0058l).yandex(this.f6674l, c3121l.f6674l).crashlytics(z2, c3121l.f6681l).loadAd(Integer.valueOf(this.f6665l), Integer.valueOf(c3121l.f6665l), c0058l);
        boolean z4 = this.f6670l.f10157throws;
        int i2 = this.f6668l;
        if (z4) {
            abstractC12716lLoadAd = abstractC12716lLoadAd.loadAd(Integer.valueOf(i2), Integer.valueOf(i), C16717l.firebase.yandex());
        }
        AbstractC12716l abstractC12716lLoadAd2 = abstractC12716lLoadAd.crashlytics(this.f6685l, c3121l.f6685l).crashlytics(this.f6672l, c3121l.f6672l).crashlytics(this.f6675l, c3121l.f6675l).loadAd(Integer.valueOf(this.f6673l), Integer.valueOf(c3121l.f6673l), abstractC9743lYandex).loadAd(Integer.valueOf(this.f6669l), Integer.valueOf(c3121l.f6669l), abstractC9743lYandex);
        if (Objects.equals(this.f6667l, c3121l.f6667l)) {
            abstractC12716lLoadAd2 = abstractC12716lLoadAd2.loadAd(Integer.valueOf(i2), Integer.valueOf(i), abstractC9743lYandex);
        }
        return abstractC12716lLoadAd2.purchase();
    }

    @Override // defpackage.AbstractC4634l
    public final boolean loadAd(AbstractC4634l abstractC4634l) {
        int i;
        String str;
        C3121l c3121l = (C3121l) abstractC4634l;
        C5978l c5978l = c3121l.f9432l;
        this.f6670l.getClass();
        C5978l c5978l2 = this.f9432l;
        int i2 = c5978l2.f12619package;
        if (i2 == -1 || i2 != c5978l.f12619package) {
            return false;
        }
        return (this.f6683l || ((str = c5978l2.metrica) != null && TextUtils.equals(str, c5978l.metrica))) && (i = c5978l2.f12622synchronized) != -1 && i == c5978l.f12622synchronized && this.f6685l == c3121l.f6685l && this.f6672l == c3121l.f6672l;
    }

    @Override // defpackage.AbstractC4634l
    public final int yandex() {
        return this.f6678l;
    }
}
