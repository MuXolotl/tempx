package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: lَؚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10550l extends Property {
    public final /* synthetic */ int yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10550l(int i, Class cls, String str) {
        super(cls, str);
        this.yandex = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.yandex) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((C2777l) obj).admob);
            case 6:
                return Float.valueOf(((C2777l) obj).subs);
            case 7:
                return Float.valueOf(((AbstractC3371l) obj).loadAd());
            case 8:
                return Float.valueOf(((C0992l) obj).f2727l);
            case 9:
                return Float.valueOf(((SwitchCompat) obj).f216l);
            case 10:
                return Float.valueOf(AbstractC4770l.yandex.admob((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.yandex) {
            case 0:
                C15579l c15579l = (C15579l) obj;
                PointF pointF = (PointF) obj2;
                c15579l.getClass();
                c15579l.yandex = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c15579l.loadAd = iRound;
                int i = c15579l.billing + 1;
                c15579l.billing = i;
                if (i == c15579l.mopub) {
                    AbstractC4770l.yandex(c15579l.purchase, c15579l.yandex, iRound, c15579l.crashlytics, c15579l.amazon);
                    c15579l.billing = 0;
                    c15579l.mopub = 0;
                }
                break;
            case 1:
                C15579l c15579l2 = (C15579l) obj;
                PointF pointF2 = (PointF) obj2;
                c15579l2.getClass();
                c15579l2.crashlytics = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c15579l2.amazon = iRound2;
                int i2 = c15579l2.mopub + 1;
                c15579l2.mopub = i2;
                if (c15579l2.billing == i2) {
                    AbstractC4770l.yandex(c15579l2.purchase, c15579l2.yandex, c15579l2.loadAd, c15579l2.crashlytics, iRound2);
                    c15579l2.billing = 0;
                    c15579l2.mopub = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC4770l.yandex(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC4770l.yandex(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC4770l.yandex(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                C2777l c2777l = (C2777l) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                c2777l.admob = fFloatValue;
                int i3 = (int) (fFloatValue * 5400.0f);
                InterpolatorC3577l interpolatorC3577l = c2777l.purchase;
                ArrayList arrayList = c2777l.loadAd;
                C13855l c13855l = (C13855l) arrayList.get(0);
                float f = c2777l.admob * 1520.0f;
                c13855l.yandex = (-20.0f) + f;
                c13855l.loadAd = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    c13855l.loadAd = (interpolatorC3577l.getInterpolation((i3 - C2777l.firebase[i4]) / 667.0f) * 250.0f) + c13855l.loadAd;
                    c13855l.yandex = (interpolatorC3577l.getInterpolation((i3 - C2777l.smaato[i4]) / 667.0f) * 250.0f) + c13855l.yandex;
                }
                float f2 = c13855l.yandex;
                float f3 = c13855l.loadAd;
                c13855l.yandex = (((f3 - f2) * c2777l.subs) + f2) / 360.0f;
                c13855l.loadAd = f3 / 360.0f;
                for (int i5 = 0; i5 < 4; i5++) {
                    float f4 = (i3 - C2777l.remoteconfig[i5]) / 333.0f;
                    if (f4 >= 0.0f && f4 <= 1.0f) {
                        int i6 = i5 + c2777l.mopub;
                        int[] iArr = c2777l.billing.crashlytics;
                        int length = i6 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i7 = iArr[length];
                        int i8 = iArr[length2];
                        float interpolation = interpolatorC3577l.getInterpolation(f4);
                        C13855l c13855l2 = (C13855l) arrayList.get(0);
                        Integer numValueOf = Integer.valueOf(i7);
                        Integer numValueOf2 = Integer.valueOf(i8);
                        int iIntValue = numValueOf.intValue();
                        float f5 = ((iIntValue >> 24) & 255) / 255.0f;
                        int iIntValue2 = numValueOf2.intValue();
                        float f6 = ((iIntValue2 >> 24) & 255) / 255.0f;
                        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                        float fSignature = AbstractC4338l.Signature(f6, f5, interpolation, f5);
                        float fSignature2 = AbstractC4338l.Signature(fPow4, fPow, interpolation, fPow);
                        float fSignature3 = AbstractC4338l.Signature(fPow5, fPow2, interpolation, fPow2);
                        float fSignature4 = AbstractC4338l.Signature(fPow6, fPow3, interpolation, fPow3);
                        float fPow7 = ((float) Math.pow(fSignature2, 0.45454545454545453d)) * 255.0f;
                        float fPow8 = ((float) Math.pow(fSignature3, 0.45454545454545453d)) * 255.0f;
                        c13855l2.crashlytics = Integer.valueOf(Math.round(((float) Math.pow(fSignature4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fSignature * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                        c2777l.yandex.invalidateSelf();
                    }
                    break;
                }
                c2777l.yandex.invalidateSelf();
                break;
            case 6:
                ((C2777l) obj).subs = ((Float) obj2).floatValue();
                break;
            case 7:
                AbstractC3371l abstractC3371l = (AbstractC3371l) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (abstractC3371l.f7179l != fFloatValue2) {
                    abstractC3371l.f7179l = fFloatValue2;
                    abstractC3371l.invalidateSelf();
                }
                break;
            case 8:
                C0992l c0992l = (C0992l) obj;
                c0992l.getClass();
                c0992l.f2727l = ((Float) obj2).floatValue();
                c0992l.invalidateSelf();
                break;
            case 9:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 10:
                AbstractC4770l.yandex.firebase((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
