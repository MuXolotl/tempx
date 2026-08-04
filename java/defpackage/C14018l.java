package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* JADX INFO: renamed from: lًٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14018l extends AbstractC3159l {
    public final C13703l crashlytics;
    public final /* synthetic */ int loadAd;

    public /* synthetic */ C14018l(C13703l c13703l, int i) {
        this.loadAd = i;
        this.crashlytics = c13703l;
    }

    @Override // defpackage.AbstractC3159l
    public final void yandex(Paint paint) {
        int i = this.loadAd;
        int i2 = 255;
        float f = 1.0f;
        C13703l c13703l = this.crashlytics;
        switch (i) {
            case 0:
                if (this.yandex) {
                    this.yandex = false;
                    int iIntValue = ((Integer) c13703l.isPro.yandex).intValue();
                    int iIntValue2 = ((Integer) c13703l.firebase.yandex).intValue();
                    float f2 = iIntValue / 255.0f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    } else if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    float f3 = iIntValue2 / 255.0f;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    } else if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    float f4 = f2 * f3;
                    if (f4 < 0.0f) {
                        f = 0.0f;
                    } else if (f4 <= 1.0f) {
                        f = f4;
                    }
                    int i3 = (int) (f * 0.85f * 255.0f);
                    if (i3 < 0) {
                        i2 = 0;
                    } else if (i3 <= 255) {
                        i2 = i3;
                    }
                    paint.setAlpha(i2);
                }
                break;
            default:
                C14965l c14965l = c13703l.amazon;
                if (this.yandex) {
                    this.yandex = false;
                    int iIntValue3 = ((Integer) c13703l.billing.yandex).intValue();
                    c14965l.getClass();
                    int[] iArr = new int[8];
                    for (int i4 = 0; i4 < 8; i4++) {
                        float f5 = (float) (((-Math.cos(((double) ((float[]) ((C8945l) c14965l.f29441l).subs())[i4]) * 3.141592653589793d)) / 2.0d) + 0.5d);
                        if (f5 < 0.0f) {
                            f5 = 0.0f;
                        } else if (f5 > 1.0f) {
                            f5 = 1.0f;
                        }
                        float f6 = (iIntValue3 >> 24) & 255;
                        float f7 = (iIntValue3 >> 16) & 255;
                        float f8 = (iIntValue3 >> 8) & 255;
                        float f9 = iIntValue3 & 255;
                        iArr[i4] = Color.argb((int) AbstractC4338l.Signature(0.0f, f6, f5, f6), (int) AbstractC4338l.Signature(0.0f, f7, f5, f7), (int) AbstractC4338l.Signature(0.0f, f8, f5, f8), (int) AbstractC4338l.Signature(0.0f, f9, f5, f9));
                    }
                    paint.setShader(new RadialGradient(0.0f, 0.0f, 1.0f, iArr, (float[]) ((C8945l) c14965l.f29441l).subs(), Shader.TileMode.CLAMP));
                }
                break;
        }
    }
}
