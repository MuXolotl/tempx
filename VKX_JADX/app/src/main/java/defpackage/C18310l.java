package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18310l {
    public boolean admob;
    public boolean amazon;
    public boolean billing;
    public C0327l firebase;
    public C0639l isPro;
    public final C10111l loadAd;
    public C8896l metrica;
    public boolean mopub;
    public boolean purchase;
    public InterfaceC4005l smaato;
    public boolean subs;
    public C8896l vip;
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l yandex;
    public final Object crashlytics = new Object();
    public Function1 remoteconfig = C11192l.f22528l;
    public final CursorAnchorInfo.Builder startapp = new CursorAnchorInfo.Builder();
    public final float[] adcel = C10924l.yandex();
    public final Matrix ads = new Matrix();

    public C18310l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C10111l c10111l) {
        this.yandex = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.loadAd = c10111l;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    public final void yandex() {
        C10111l c10111l = this.loadAd;
        InterfaceC1220l interfaceC1220l = (InterfaceC1220l) c10111l.f20586l;
        InputMethodManager inputMethodManager = (InputMethodManager) interfaceC1220l.getValue();
        View view = (View) c10111l.f20587l;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.remoteconfig;
            float[] fArr = this.adcel;
            function1.invoke(new C10924l(fArr));
            this.yandex.adcel(fArr);
            Matrix matrix = this.ads;
            AbstractC4952l.isVip(matrix, fArr);
            C0639l c0639l = this.isPro;
            InterfaceC4005l interfaceC4005l = this.smaato;
            C0327l c0327l = this.firebase;
            C8896l c8896l = this.vip;
            C8896l c8896l2 = this.metrica;
            boolean z = this.billing;
            boolean z2 = this.mopub;
            boolean z3 = this.admob;
            boolean z4 = this.subs;
            CursorAnchorInfo.Builder builder = this.startapp;
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
                boolean zAmazon = AbstractC6900l.amazon(c8896l, fAmazon, c8896lCrashlytics.loadAd);
                boolean zAmazon2 = AbstractC6900l.amazon(c8896l, fAmazon, c8896lCrashlytics.amazon);
                boolean z5 = c0327l.yandex(iAdmob) == 2;
                int i = (zAmazon || zAmazon2) ? 1 : 0;
                if (!zAmazon || !zAmazon2) {
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
                        int i5 = (c8896l.yandex < f5 ? 1 : 0) & (f3 < c8896l.crashlytics ? 1 : 0) & (c8896l.loadAd < f6 ? 1 : 0) & (f4 < c8896l.amazon ? 1 : 0);
                        if (!AbstractC6900l.amazon(c8896l, f3, f4) || !AbstractC6900l.amazon(c8896l, f5, f6)) {
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
                AbstractC2847l.isVip(builder, c8896l2);
            }
            if (i7 >= 34 && z4) {
                AbstractC5917l.yandex(builder, c0327l, c8896l);
            }
            ((InputMethodManager) interfaceC1220l.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.purchase = false;
        }
    }
}
