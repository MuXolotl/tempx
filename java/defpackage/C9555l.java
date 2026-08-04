package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍٓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9555l {
    public float amazon;
    public float crashlytics;
    public float loadAd;
    public float purchase;
    public float yandex;
    public final ArrayList billing = new ArrayList();
    public final ArrayList mopub = new ArrayList();

    public C9555l() {
        amazon(0.0f, 270.0f, 0.0f);
    }

    public final void amazon(float f, float f2, float f3) {
        this.yandex = f;
        this.loadAd = 0.0f;
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = (f2 + f3) % 360.0f;
        this.billing.clear();
        this.mopub.clear();
    }

    public final void crashlytics(float f, float f2) {
        C1081l c1081l = new C1081l();
        c1081l.loadAd = f;
        c1081l.crashlytics = f2;
        this.billing.add(c1081l);
        C17429l c17429l = new C17429l(c1081l, this.loadAd, this.crashlytics);
        float fLoadAd = c17429l.loadAd() + 270.0f;
        float fLoadAd2 = c17429l.loadAd() + 270.0f;
        yandex(fLoadAd);
        this.mopub.add(c17429l);
        this.amazon = fLoadAd2;
        this.loadAd = f;
        this.crashlytics = f2;
    }

    public final void loadAd(Matrix matrix, Path path) {
        ArrayList arrayList = this.billing;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18178l) arrayList.get(i)).yandex(matrix, path);
        }
    }

    public final void yandex(float f) {
        float f2 = this.amazon;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.loadAd;
        float f5 = this.crashlytics;
        C3832l c3832l = new C3832l(f4, f5, f4, f5);
        c3832l.billing = this.amazon;
        c3832l.mopub = f3;
        this.mopub.add(new C18538l(c3832l));
        this.amazon = f;
    }
}
