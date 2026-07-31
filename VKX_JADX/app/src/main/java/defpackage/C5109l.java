package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lؗۘٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5109l {
    public final C3384l amazon;
    public final Serializable billing;
    public final C3384l crashlytics;
    public final C3384l loadAd;
    public final C3384l purchase;
    public final /* synthetic */ int yandex;

    /* JADX WARN: Multi-variable type inference failed */
    public C5109l(C5109l[] c5109lArr) {
        int i = 0;
        this.yandex = 0;
        this.billing = c5109lArr;
        int length = c5109lArr.length;
        C3384l[] c3384lArr = new C3384l[length];
        for (int i2 = 0; i2 < length; i2++) {
            c3384lArr[i2] = ((C5109l[]) this.billing)[i2].loadAd();
        }
        int i3 = 1;
        this.loadAd = new C3384l(1, new C16146l(c3384lArr, i));
        int length2 = ((C5109l[]) this.billing).length;
        C3384l[] c3384lArr2 = new C3384l[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            c3384lArr2[i4] = ((C5109l[]) this.billing)[i4].amazon();
        }
        this.crashlytics = new C3384l(0, new C5869l(c3384lArr2, i));
        int length3 = ((C5109l[]) this.billing).length;
        C3384l[] c3384lArr3 = new C3384l[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            c3384lArr3[i5] = ((C5109l[]) this.billing)[i5].crashlytics();
        }
        this.amazon = new C3384l(1, new C16146l(c3384lArr3, i3));
        int length4 = ((C5109l[]) this.billing).length;
        C3384l[] c3384lArr4 = new C3384l[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            c3384lArr4[i6] = ((C5109l[]) this.billing)[i6].yandex();
        }
        this.purchase = new C3384l(0, new C5869l(c3384lArr4, i3));
    }

    public final C3384l amazon() {
        int i = this.yandex;
        return this.crashlytics;
    }

    public final C3384l crashlytics() {
        int i = this.yandex;
        return this.amazon;
    }

    public final C3384l loadAd() {
        int i = this.yandex;
        return this.loadAd;
    }

    public final String toString() {
        int i = this.yandex;
        Object obj = this.billing;
        switch (i) {
            case 0:
                return AbstractC8669l.m2416switch((C5109l[]) obj, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) obj;
                return str != null ? AbstractC15560l.Signature("RectRulers(", str, ")") : super.toString();
        }
    }

    public final C3384l yandex() {
        int i = this.yandex;
        return this.purchase;
    }

    public C5109l(String str) {
        this.yandex = 1;
        this.billing = str;
        this.loadAd = new C3384l(1, null);
        this.crashlytics = new C3384l(0, null);
        this.amazon = new C3384l(1, null);
        this.purchase = new C3384l(0, null);
    }
}
