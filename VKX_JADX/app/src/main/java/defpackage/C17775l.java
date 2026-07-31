package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* JADX INFO: renamed from: lًٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17775l {
    public final boolean amazon;
    public C9426l billing;
    public final Range crashlytics;
    public final C5342l loadAd;
    public C15083l mopub;
    public final Rational purchase;
    public final C14338l yandex;

    public C17775l(C15736l c15736l, C14338l c14338l, C5342l c5342l) {
        Integer num;
        this.yandex = c14338l;
        this.loadAd = c5342l;
        InterfaceC5389l interfaceC5389l = c15736l.loadAd;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        Object obj = AbstractC0184l.yandex;
        Object objCrashlytics = ((C10861l) interfaceC5389l).crashlytics(key);
        Range range = (Range) (objCrashlytics != null ? objCrashlytics : obj);
        this.crashlytics = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.amazon = z;
        this.purchase = !z ? Rational.ZERO : (Rational) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }
}
