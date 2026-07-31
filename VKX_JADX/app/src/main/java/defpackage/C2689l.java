package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؔ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2689l extends AbstractC4383l {
    public final C8114l admob;
    public ArrayList isPro;
    public final Path subs;

    public C2689l(List list) {
        super(list);
        this.admob = new C8114l();
        this.subs = new Path();
    }

    @Override // defpackage.AbstractC4383l
    public final boolean admob() {
        ArrayList arrayList = this.isPro;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Override // defpackage.AbstractC4383l
    public final Object purchase(C4529l c4529l, float f) {
        int i;
        float f2;
        C8114l c8114l = (C8114l) c4529l.loadAd;
        C8114l c8114l2 = (C8114l) c4529l.crashlytics;
        if (c8114l2 == null) {
            c8114l2 = c8114l;
        }
        C8114l c8114l3 = this.admob;
        ArrayList arrayList = c8114l3.yandex;
        if (c8114l3.loadAd == null) {
            c8114l3.loadAd = new PointF();
        }
        boolean z = c8114l.crashlytics;
        ArrayList arrayList2 = c8114l.yandex;
        boolean z2 = true;
        c8114l3.crashlytics = z || c8114l2.crashlytics;
        int size = arrayList2.size();
        ArrayList arrayList3 = c8114l2.yandex;
        if (size != arrayList3.size()) {
            AbstractC17968l.loadAd("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new C4550l());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = c8114l.loadAd;
        PointF pointF2 = c8114l2.loadAd;
        c8114l3.yandex(AbstractC7484l.purchase(pointF.x, pointF2.x, f), AbstractC7484l.purchase(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            C4550l c4550l = (C4550l) arrayList2.get(size4);
            C4550l c4550l2 = (C4550l) arrayList3.get(size4);
            PointF pointF3 = c4550l.yandex;
            PointF pointF4 = c4550l.loadAd;
            PointF pointF5 = c4550l.crashlytics;
            PointF pointF6 = c4550l2.yandex;
            PointF pointF7 = c4550l2.loadAd;
            PointF pointF8 = c4550l2.crashlytics;
            ((C4550l) arrayList.get(size4)).yandex.set(AbstractC7484l.purchase(pointF3.x, pointF6.x, f), AbstractC7484l.purchase(pointF3.y, pointF6.y, f));
            ((C4550l) arrayList.get(size4)).loadAd.set(AbstractC7484l.purchase(pointF4.x, pointF7.x, f), AbstractC7484l.purchase(pointF4.y, pointF7.y, f));
            ((C4550l) arrayList.get(size4)).crashlytics.set(AbstractC7484l.purchase(pointF5.x, pointF8.x, f), AbstractC7484l.purchase(pointF5.y, pointF8.y, f));
            size4--;
            z2 = z2;
        }
        boolean z3 = z2;
        ArrayList arrayList4 = this.isPro;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = c8114l3.yandex;
                if (size5 < 0) {
                    break;
                }
                C18467l c18467l = (C18467l) this.isPro.get(size5);
                c18467l.getClass();
                if (arrayList5.size() > 2) {
                    float fFloatValue = ((Float) c18467l.loadAd.amazon()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z4 = c8114l3.crashlytics;
                        int size6 = arrayList5.size() - 1;
                        int i2 = 0;
                        while (size6 >= 0) {
                            C4550l c4550l3 = (C4550l) arrayList5.get(size6);
                            C4550l c4550l4 = (C4550l) arrayList5.get(C18467l.amazon(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z4) ? c4550l4.crashlytics : c8114l3.loadAd;
                            i2 = (((size6 != 0 || z4) ? c4550l4.loadAd : pointF9).equals(pointF9) && c4550l3.yandex.equals(pointF9) && !((c8114l3.crashlytics || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z3)) ? i2 + 2 : i2 + 1;
                            size6--;
                        }
                        C8114l c8114l4 = c18467l.crashlytics;
                        if (c8114l4 == null || c8114l4.yandex.size() != i2) {
                            ArrayList arrayList6 = new ArrayList(i2);
                            for (int i3 = 0; i3 < i2; i3++) {
                                arrayList6.add(new C4550l());
                            }
                            i = 0;
                            c18467l.crashlytics = new C8114l(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i = 0;
                        }
                        C8114l c8114l5 = c18467l.crashlytics;
                        c8114l5.crashlytics = z4;
                        PointF pointF10 = c8114l3.loadAd;
                        c8114l5.yandex(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = c8114l5.yandex;
                        boolean z5 = c8114l3.crashlytics;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < arrayList5.size()) {
                            C4550l c4550l5 = (C4550l) arrayList5.get(i4);
                            C4550l c4550l6 = (C4550l) arrayList5.get(C18467l.amazon(i4 - 1, arrayList5.size()));
                            C4550l c4550l7 = (C4550l) arrayList5.get(C18467l.amazon(i4 - 2, arrayList5.size()));
                            PointF pointF11 = (i4 != 0 || z5) ? c4550l6.crashlytics : c8114l3.loadAd;
                            PointF pointF12 = (i4 != 0 || z5) ? c4550l6.loadAd : pointF11;
                            PointF pointF13 = c4550l5.yandex;
                            PointF pointF14 = c4550l7.crashlytics;
                            int i6 = size5;
                            PointF pointF15 = c4550l5.crashlytics;
                            ArrayList arrayList8 = arrayList5;
                            boolean z6 = (c8114l3.crashlytics || !(i4 == 0 || i4 == arrayList8.size() + (-1))) ? false : z3;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z6) {
                                float f3 = pointF11.x;
                                float f4 = f3 - pointF14.x;
                                float f5 = pointF11.y;
                                float f6 = f5 - pointF14.y;
                                float f7 = pointF15.x - f3;
                                float f8 = pointF15.y - f5;
                                f2 = fFloatValue;
                                float fHypot = (float) Math.hypot(f4, f6);
                                float fHypot2 = (float) Math.hypot(f7, f8);
                                float fMin = Math.min(f2 / fHypot, 0.5f);
                                float fMin2 = Math.min(f2 / fHypot2, 0.5f);
                                float f9 = pointF11.x;
                                float fSignature = AbstractC4338l.Signature(pointF14.x, f9, fMin, f9);
                                float f10 = pointF11.y;
                                float fSignature2 = AbstractC4338l.Signature(pointF14.y, f10, fMin, f10);
                                float fSignature3 = AbstractC4338l.Signature(pointF15.x, f9, fMin2, f9);
                                float fSignature4 = AbstractC4338l.Signature(pointF15.y, f10, fMin2, f10);
                                float f11 = fSignature - ((fSignature - f9) * 0.5519f);
                                float f12 = fSignature2 - ((fSignature2 - f10) * 0.5519f);
                                float f13 = fSignature3 - ((fSignature3 - f9) * 0.5519f);
                                float f14 = fSignature4 - ((fSignature4 - f10) * 0.5519f);
                                C4550l c4550l8 = (C4550l) arrayList7.get(C18467l.amazon(i5 - 1, arrayList7.size()));
                                C4550l c4550l9 = (C4550l) arrayList7.get(i5);
                                c4550l8.loadAd.set(fSignature, fSignature2);
                                c4550l8.crashlytics.set(fSignature, fSignature2);
                                if (i4 == 0) {
                                    c8114l5.yandex(fSignature, fSignature2);
                                }
                                c4550l9.yandex.set(f11, f12);
                                C4550l c4550l10 = (C4550l) arrayList7.get(i5 + 1);
                                c4550l9.loadAd.set(f13, f14);
                                c4550l9.crashlytics.set(fSignature3, fSignature4);
                                c4550l10.yandex.set(fSignature3, fSignature4);
                                i5 += 2;
                            } else {
                                f2 = fFloatValue;
                                C4550l c4550l11 = (C4550l) arrayList7.get(C18467l.amazon(i5 - 1, arrayList7.size()));
                                C4550l c4550l12 = (C4550l) arrayList7.get(i5);
                                PointF pointF16 = c4550l6.loadAd;
                                c4550l11.loadAd.set(pointF16.x, pointF16.y);
                                PointF pointF17 = c4550l6.crashlytics;
                                c4550l11.crashlytics.set(pointF17.x, pointF17.y);
                                PointF pointF18 = c4550l5.yandex;
                                c4550l12.yandex.set(pointF18.x, pointF18.y);
                                i5++;
                            }
                            i4++;
                            size5 = i6;
                            arrayList5 = arrayList8;
                            c8114l3 = c8114l3;
                            fFloatValue = f2;
                            z5 = z5;
                        }
                        c8114l3 = c8114l5;
                    }
                }
                size5--;
            }
        }
        Path path = this.subs;
        path.reset();
        PointF pointF19 = c8114l3.loadAd;
        ArrayList arrayList9 = c8114l3.yandex;
        path.moveTo(pointF19.x, pointF19.y);
        PointF pointF20 = AbstractC7484l.yandex;
        pointF20.set(pointF19.x, pointF19.y);
        for (int i7 = 0; i7 < arrayList9.size(); i7++) {
            C4550l c4550l13 = (C4550l) arrayList9.get(i7);
            PointF pointF21 = c4550l13.yandex;
            PointF pointF22 = c4550l13.loadAd;
            PointF pointF23 = c4550l13.crashlytics;
            if (pointF21.equals(pointF20) && pointF22.equals(pointF23)) {
                path.lineTo(pointF23.x, pointF23.y);
            } else {
                path.cubicTo(pointF21.x, pointF21.y, pointF22.x, pointF22.y, pointF23.x, pointF23.y);
            }
            pointF20.set(pointF23.x, pointF23.y);
        }
        if (c8114l3.crashlytics) {
            path.close();
        }
        return path;
    }
}
