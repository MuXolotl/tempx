package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;

/* JADX INFO: renamed from: lًُۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8355l {
    public boolean admob;
    public boolean amazon;
    public boolean billing;
    public C0327l firebase;
    public C0639l isPro;
    public final C10023l loadAd;
    public boolean mopub;
    public boolean purchase;
    public C8896l remoteconfig;
    public InterfaceC4005l smaato;
    public boolean subs;
    public C8896l vip;
    public final C1123l yandex;
    public final Object crashlytics = new Object();
    public final CursorAnchorInfo.Builder metrica = new CursorAnchorInfo.Builder();
    public final float[] startapp = C10924l.yandex();
    public final Matrix adcel = new Matrix();

    public C8355l(C1123l c1123l, C10023l c10023l) {
        this.yandex = c1123l;
        this.loadAd = c10023l;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    public final void yandex() {
        C10023l c10023l = this.loadAd;
        InputMethodManager inputMethodManagerIsVip = c10023l.isVip();
        View view = (View) c10023l.f20419l;
        if (!inputMethodManagerIsVip.isActive(view) || this.isPro == null || this.smaato == null || this.firebase == null || this.remoteconfig == null || this.vip == null) {
            return;
        }
        float[] fArr = this.startapp;
        C10924l.amazon(fArr);
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.yandex.f3077l.f36159l.getValue();
        if (interfaceC18212l != null) {
            if (!interfaceC18212l.mopub()) {
                interfaceC18212l = null;
            }
            if (interfaceC18212l != null) {
                interfaceC18212l.subs(fArr);
            }
        }
        Unit unit = Unit.INSTANCE;
        C8896l c8896l = this.vip;
        C10924l.isPro(fArr, -c8896l.yandex, -c8896l.loadAd);
        Matrix matrix = this.adcel;
        AbstractC4952l.isVip(matrix, fArr);
        C0639l c0639l = this.isPro;
        InterfaceC4005l interfaceC4005l = this.smaato;
        C0327l c0327l = this.firebase;
        C8896l c8896l2 = this.remoteconfig;
        C8896l c8896l3 = this.vip;
        boolean z = this.billing;
        boolean z2 = this.mopub;
        boolean z3 = this.admob;
        boolean z4 = this.subs;
        CursorAnchorInfo.Builder builder = this.metrica;
        builder.reset();
        builder.setMatrix(matrix);
        long j = c0639l.loadAd;
        C12814l c12814l = c0639l.crashlytics;
        int iMopub = C12814l.mopub(j);
        builder.setSelectionRange(iMopub, C12814l.billing(c0639l.loadAd));
        if (z && iMopub >= 0) {
            int iAdmob = interfaceC4005l.admob(iMopub);
            C8896l c8896lCrashlytics = c0327l.crashlytics(iAdmob);
            float fAmazon = AbstractC8576l.amazon(c8896lCrashlytics.yandex, 0.0f, (int) (c0327l.crashlytics >> 32));
            boolean zAdmob = AbstractC16817l.admob(c8896l2, fAmazon, c8896lCrashlytics.loadAd);
            boolean zAdmob2 = AbstractC16817l.admob(c8896l2, fAmazon, c8896lCrashlytics.amazon);
            boolean z5 = c0327l.yandex(iAdmob) == 2;
            int i = (zAdmob || zAdmob2) ? 1 : 0;
            if (!zAdmob || !zAdmob2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f = c8896lCrashlytics.loadAd;
            float f2 = c8896lCrashlytics.amazon;
            builder.setInsertionMarkerLocation(fAmazon, f, f2, f2, i);
        }
        if (z2) {
            int iMopub2 = c12814l != null ? C12814l.mopub(c12814l.yandex) : -1;
            int iBilling = c12814l != null ? C12814l.billing(c12814l.yandex) : -1;
            if (iMopub2 >= 0 && iMopub2 < iBilling) {
                builder.setComposingText(iMopub2, c0639l.yandex.f7563l.subSequence(iMopub2, iBilling));
                int iAdmob2 = interfaceC4005l.admob(iMopub2);
                int iAdmob3 = interfaceC4005l.admob(iBilling);
                float[] fArr2 = new float[(iAdmob3 - iAdmob2) * 4];
                c0327l.loadAd.yandex(AbstractC2296l.loadAd(iAdmob2, iAdmob3), fArr2);
                int i2 = iMopub2;
                while (i2 < iBilling) {
                    int iAdmob4 = interfaceC4005l.admob(i2);
                    int i3 = (iAdmob4 - iAdmob2) * 4;
                    float f3 = fArr2[i3];
                    float f4 = fArr2[i3 + 1];
                    float f5 = fArr2[i3 + 2];
                    float f6 = fArr2[i3 + 3];
                    int i4 = iBilling;
                    int i5 = (c8896l2.yandex < f5 ? 1 : 0) & (f3 < c8896l2.crashlytics ? 1 : 0) & (c8896l2.loadAd < f6 ? 1 : 0) & (f4 < c8896l2.amazon ? 1 : 0);
                    if (!AbstractC16817l.admob(c8896l2, f3, f4) || !AbstractC16817l.admob(c8896l2, f5, f6)) {
                        i5 |= 2;
                    }
                    int i6 = i5;
                    builder.addCharacterBounds(i2, f3, f4, f5, f6, c0327l.yandex(iAdmob4) == 2 ? i6 | 4 : i6);
                    i2++;
                    iBilling = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            AbstractC2847l.signatures(builder, c8896l3);
        }
        if (i7 >= 34 && z4) {
            AbstractC5917l.loadAd(builder, c0327l, c8896l2);
        }
        c10023l.isVip().updateCursorAnchorInfo(view, builder.build());
        this.purchase = false;
    }
}
