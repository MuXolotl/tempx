package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍٍۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9444l {
    public final int admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int firebase;
    public final int isPro;
    public final int loadAd;
    public final C10038l metrica;
    public final int mopub;
    public final int purchase;
    public final int remoteconfig;
    public final float smaato;
    public final int subs;
    public final String vip;
    public final List yandex;

    public C9444l(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C10038l c10038l) {
        this.yandex = list;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = i5;
        this.mopub = i6;
        this.admob = i7;
        this.subs = i8;
        this.isPro = i9;
        this.firebase = i10;
        this.smaato = f;
        this.remoteconfig = i11;
        this.vip = str;
        this.metrica = c10038l;
    }

    public static C9444l yandex(C13143l c13143l, boolean z, C10038l c10038l) {
        boolean z2;
        C14513l c14513lAdcel;
        int i = 4;
        try {
            if (z) {
                c13143l.m3568throw(4);
            } else {
                c13143l.m3568throw(21);
            }
            int iSignatures = c13143l.signatures() & 3;
            int iSignatures2 = c13143l.signatures();
            int i2 = c13143l.loadAd;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iSignatures2) {
                    break;
                }
                c13143l.m3568throw(1);
                int iM3567synchronized = c13143l.m3567synchronized();
                for (int i6 = 0; i6 < iM3567synchronized; i6++) {
                    int iM3567synchronized2 = c13143l.m3567synchronized();
                    i5 += iM3567synchronized2 + 4;
                    c13143l.m3568throw(iM3567synchronized2);
                }
                i4++;
            }
            c13143l.m3562for(i2);
            byte[] bArr = new byte[i5];
            C10038l c10038l2 = c10038l;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strYandex = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iSignatures2) {
                int iSignatures3 = c13143l.signatures() & 63;
                int iM3567synchronized3 = c13143l.m3567synchronized();
                int i19 = i3;
                C10038l c10038lSubscription = c10038l2;
                while (i19 < iM3567synchronized3) {
                    boolean z3 = z2;
                    int iM3567synchronized4 = c13143l.m3567synchronized();
                    int i20 = iSignatures;
                    System.arraycopy(AbstractC16763l.yandex, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(c13143l.yandex, c13143l.loadAd, bArr, i21, iM3567synchronized4);
                    if (iSignatures3 == 32 && i19 == 0) {
                        c10038lSubscription = AbstractC16763l.subscription(i21, i21 + iM3567synchronized4, bArr);
                    } else {
                        if (iSignatures3 == 33 && i19 == 0) {
                            C11849l c11849lAds = AbstractC16763l.ads(bArr, i21, i21 + iM3567synchronized4, c10038lSubscription);
                            i7 = c11849lAds.yandex + 1;
                            i8 = c11849lAds.mopub;
                            int i22 = c11849lAds.admob;
                            i10 = c11849lAds.crashlytics + 8;
                            i11 = c11849lAds.amazon + 8;
                            int i23 = c11849lAds.firebase;
                            i9 = i22;
                            int i24 = c11849lAds.smaato;
                            int i25 = c11849lAds.remoteconfig;
                            float f2 = c11849lAds.subs;
                            int i26 = c11849lAds.isPro;
                            C18741l c18741l = c11849lAds.loadAd;
                            if (c18741l != null) {
                                strYandex = AbstractC14501l.yandex(c18741l.yandex, c18741l.loadAd, c18741l.crashlytics, c18741l.amazon, c18741l.purchase, c18741l.billing);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iSignatures3 == 39 && i19 == 0 && (c14513lAdcel = AbstractC16763l.adcel(i21, i21 + iM3567synchronized4, bArr)) != null && c10038lSubscription != null) {
                            i3 = 0;
                            i15 = c14513lAdcel.f28392l == ((C7275l) ((AbstractC1186l) c10038lSubscription.f20463l).get(0)).loadAd ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iM3567synchronized4;
                    c13143l.m3568throw(iM3567synchronized4);
                    i19++;
                    z2 = z3;
                    iSignatures = i20;
                    i = 4;
                }
                i17++;
                c10038l2 = c10038lSubscription;
                i = 4;
            }
            return new C9444l(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iSignatures + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strYandex, c10038l2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C17655l.yandex(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
