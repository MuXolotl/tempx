package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: renamed from: lؘِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5719l {
    public boolean admob;
    public final InterfaceC2262l amazon;
    public boolean billing;
    public final C0554l crashlytics;
    public final C10312l loadAd;
    public boolean mopub;
    public C7504l purchase;
    public boolean subs;
    public final C16328l yandex;
    public final CursorAnchorInfo.Builder isPro = new CursorAnchorInfo.Builder();
    public final float[] firebase = C10924l.yandex();
    public final Matrix smaato = new Matrix();

    public C5719l(C16328l c16328l, C10312l c10312l, C0554l c0554l, InterfaceC2262l interfaceC2262l) {
        this.yandex = c16328l;
        this.loadAd = c10312l;
        this.crashlytics = c0554l;
        this.amazon = interfaceC2262l;
    }

    public final CursorAnchorInfo yandex() {
        InterfaceC18212l interfaceC18212l;
        InterfaceC18212l interfaceC18212lLoadAd;
        C0327l c0327lCrashlytics;
        C10312l c10312l = this.loadAd;
        InterfaceC18212l interfaceC18212lPurchase = c10312l.purchase();
        if (interfaceC18212lPurchase != null) {
            if (!interfaceC18212lPurchase.mopub()) {
                interfaceC18212lPurchase = null;
            }
            if (interfaceC18212lPurchase != null && (interfaceC18212l = (InterfaceC18212l) c10312l.amazon.getValue()) != null) {
                if (!interfaceC18212l.mopub()) {
                    interfaceC18212l = null;
                }
                if (interfaceC18212l != null && (interfaceC18212lLoadAd = c10312l.loadAd()) != null) {
                    if (!interfaceC18212lLoadAd.mopub()) {
                        interfaceC18212lLoadAd = null;
                    }
                    if (interfaceC18212lLoadAd != null && (c0327lCrashlytics = c10312l.crashlytics()) != null) {
                        C5667l c5667lAmazon = this.yandex.amazon();
                        float[] fArr = this.firebase;
                        C10924l.amazon(fArr);
                        interfaceC18212lPurchase.subs(fArr);
                        Matrix matrix = this.smaato;
                        AbstractC4952l.isVip(matrix, fArr);
                        C8896l c8896lVip = AbstractC2044l.admob(interfaceC18212l).vip(interfaceC18212lPurchase.mo2593throws(interfaceC18212l, 0L));
                        C8896l c8896lVip2 = AbstractC2044l.admob(interfaceC18212lLoadAd).vip(interfaceC18212lPurchase.mo2593throws(interfaceC18212lLoadAd, 0L));
                        long j = c5667lAmazon.f12061l;
                        C12814l c12814l = c5667lAmazon.f12060l;
                        boolean z = this.billing;
                        boolean z2 = this.mopub;
                        boolean z3 = this.admob;
                        boolean z4 = this.subs;
                        CursorAnchorInfo.Builder builder = this.isPro;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iMopub = C12814l.mopub(j);
                        builder.setSelectionRange(iMopub, C12814l.billing(j));
                        if (z && iMopub >= 0) {
                            C8896l c8896lCrashlytics = c0327lCrashlytics.crashlytics(iMopub);
                            float fAmazon = AbstractC8576l.amazon(c8896lCrashlytics.yandex, 0.0f, (int) (c0327lCrashlytics.crashlytics >> 32));
                            boolean zAdmob = AbstractC16817l.admob(c8896lVip, fAmazon, c8896lCrashlytics.loadAd);
                            boolean zAdmob2 = AbstractC16817l.admob(c8896lVip, fAmazon, c8896lCrashlytics.amazon);
                            boolean z5 = c0327lCrashlytics.yandex(iMopub) == 2;
                            int i = (zAdmob || zAdmob2) ? 1 : 0;
                            if (!zAdmob || !zAdmob2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            int i2 = i;
                            float f = c8896lCrashlytics.loadAd;
                            float f2 = c8896lCrashlytics.amazon;
                            builder.setInsertionMarkerLocation(fAmazon, f, f2, f2, i2);
                        }
                        if (z2) {
                            int iMopub2 = c12814l != null ? C12814l.mopub(c12814l.yandex) : -1;
                            int iBilling = c12814l != null ? C12814l.billing(c12814l.yandex) : -1;
                            if (iMopub2 >= 0 && iMopub2 < iBilling) {
                                builder.setComposingText(iMopub2, c5667lAmazon.f12057l.subSequence(iMopub2, iBilling));
                                float[] fArr2 = new float[(iBilling - iMopub2) * 4];
                                c0327lCrashlytics.loadAd.yandex(AbstractC2296l.loadAd(iMopub2, iBilling), fArr2);
                                int i3 = iMopub2;
                                while (i3 < iBilling) {
                                    int i4 = (i3 - iMopub2) * 4;
                                    float f3 = fArr2[i4];
                                    float f4 = fArr2[i4 + 1];
                                    float f5 = fArr2[i4 + 2];
                                    float f6 = fArr2[i4 + 3];
                                    int i5 = (f3 < c8896lVip.crashlytics ? 1 : 0) & (c8896lVip.yandex < f5 ? 1 : 0) & (c8896lVip.loadAd < f6 ? 1 : 0) & (f4 < c8896lVip.amazon ? 1 : 0);
                                    if (!AbstractC16817l.admob(c8896lVip, f3, f4) || !AbstractC16817l.admob(c8896lVip, f5, f6)) {
                                        i5 |= 2;
                                    }
                                    int i6 = iBilling;
                                    if (c0327lCrashlytics.yandex(i3) == 2) {
                                        i5 |= 4;
                                    }
                                    builder.addCharacterBounds(i3, f3, f4, f5, f6, i5);
                                    i3++;
                                    iBilling = i6;
                                }
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 33 && z3) {
                            AbstractC2847l.signatures(builder, c8896lVip2);
                        }
                        if (i7 >= 34 && z4) {
                            AbstractC5917l.loadAd(builder, c0327lCrashlytics, c8896lVip);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
