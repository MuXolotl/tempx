package defpackage;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: lُؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3811l implements TypeEvaluator {
    public static final C3811l yandex = new C3811l();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fSignature = AbstractC4338l.Signature(f3, f2, f, f2);
        float fSignature2 = AbstractC4338l.Signature(fPow4, fPow, f, fPow);
        float fSignature3 = AbstractC4338l.Signature(fPow5, fPow2, f, fPow2);
        float fSignature4 = AbstractC4338l.Signature(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fSignature2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fSignature3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fSignature4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fSignature * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
