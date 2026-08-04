package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: lؙٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14720l extends AbstractC13890l {
    public final /* synthetic */ int admob;
    public final Object subs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14720l(int i, List list) {
        super(list);
        this.admob = i;
        switch (i) {
            case 1:
                super(list);
                this.subs = new PointF();
                break;
            case 2:
                super(list);
                this.subs = new C5798l(1.0f, 1.0f);
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C14360l c14360l = (C14360l) ((C4529l) list.get(i2)).loadAd;
                    if (c14360l != null) {
                        iMax = Math.max(iMax, c14360l.loadAd.length);
                    }
                }
                this.subs = new C14360l(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // defpackage.AbstractC4383l
    public /* bridge */ /* synthetic */ Object billing(C4529l c4529l, float f, float f2, float f3) {
        switch (this.admob) {
            case 1:
                return subs(c4529l, f2, f3);
            default:
                return super.billing(c4529l, f, f2, f3);
        }
    }

    @Override // defpackage.AbstractC4383l
    public final Object purchase(C4529l c4529l, float f) {
        Object obj;
        int i = this.admob;
        Object obj2 = this.subs;
        switch (i) {
            case 0:
                C14360l c14360l = (C14360l) obj2;
                C14360l c14360l2 = (C14360l) c4529l.loadAd;
                C14360l c14360l3 = (C14360l) c4529l.crashlytics;
                int[] iArr = c14360l.loadAd;
                float[] fArr = c14360l.yandex;
                boolean zEquals = c14360l2.equals(c14360l3);
                int[] iArr2 = c14360l2.loadAd;
                if (zEquals || f <= 0.0f) {
                    c14360l.yandex(c14360l2);
                } else if (f >= 1.0f) {
                    c14360l.yandex(c14360l3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = c14360l3.loadAd;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        C8339l.metrica(AbstractC14814l.remoteconfig(iArr3.length, ")", sb));
                        return null;
                    }
                    for (int i2 = 0; i2 < iArr2.length; i2++) {
                        fArr[i2] = AbstractC7484l.purchase(c14360l2.yandex[i2], c14360l3.yandex[i2], f);
                        iArr[i2] = AbstractC17307l.subs(iArr2[i2], f, iArr3[i2]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return c14360l;
            case 1:
                return subs(c4529l, f, f);
            default:
                C5798l c5798l = (C5798l) obj2;
                Object obj3 = c4529l.loadAd;
                if (obj3 == null || (obj = c4529l.crashlytics) == null) {
                    C8339l.smaato("Missing values for keyframe.");
                    return null;
                }
                C5798l c5798l2 = (C5798l) obj3;
                C5798l c5798l3 = (C5798l) obj;
                float fPurchase = AbstractC7484l.purchase(c5798l2.yandex, c5798l3.yandex, f);
                float fPurchase2 = AbstractC7484l.purchase(c5798l2.loadAd, c5798l3.loadAd, f);
                c5798l.yandex = fPurchase;
                c5798l.loadAd = fPurchase2;
                return c5798l;
        }
    }

    public PointF subs(C4529l c4529l, float f, float f2) {
        Object obj;
        PointF pointF = (PointF) this.subs;
        Object obj2 = c4529l.loadAd;
        if (obj2 == null || (obj = c4529l.crashlytics) == null) {
            C8339l.smaato("Missing values for keyframe.");
            return null;
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        float f3 = pointF2.x;
        float fSignature = AbstractC4338l.Signature(pointF3.x, f3, f, f3);
        float f4 = pointF2.y;
        pointF.set(fSignature, AbstractC4338l.Signature(pointF3.y, f4, f2, f4));
        return pointF;
    }
}
