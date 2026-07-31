package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;

/* JADX INFO: renamed from: lًَؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4748l {
    public final C5466l amazon;
    public final C5466l billing;
    public int crashlytics;
    public float loadAd;
    public final float mopub;
    public final C8936l purchase = new C8936l(23);
    public float yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [lؘؗ٘] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lؘؗ٘] */
    public C4748l(float f) {
        final int i = 0;
        this.amazon = new InterfaceC5796l(this) { // from class: lؘؗ٘

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4748l f11704l;

            {
                this.f11704l = this;
            }

            @Override // defpackage.InterfaceC5796l
            public final void yandex(C17270l c17270l) {
                int i2 = i;
                C4748l c4748l = this.f11704l;
                switch (i2) {
                    case 0:
                        PointF pointF = c17270l.yandex;
                        pointF.x += c4748l.yandex;
                        pointF.y += c4748l.loadAd;
                        break;
                    default:
                        PointF pointF2 = c17270l.yandex;
                        float f2 = pointF2.x;
                        pointF2.x = c4748l.crashlytics - pointF2.y;
                        pointF2.y = f2;
                        break;
                }
            }
        };
        final int i2 = 1;
        this.billing = new InterfaceC5796l(this) { // from class: lؘؗ٘

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4748l f11704l;

            {
                this.f11704l = this;
            }

            @Override // defpackage.InterfaceC5796l
            public final void yandex(C17270l c17270l) {
                int i3 = i2;
                C4748l c4748l = this.f11704l;
                switch (i3) {
                    case 0:
                        PointF pointF = c17270l.yandex;
                        pointF.x += c4748l.yandex;
                        pointF.y += c4748l.loadAd;
                        break;
                    default:
                        PointF pointF2 = c17270l.yandex;
                        float f2 = pointF2.x;
                        pointF2.x = c4748l.crashlytics - pointF2.y;
                        pointF2.y = f2;
                        break;
                }
            }
        };
        this.mopub = f;
    }

    public final C5466l yandex(Rect rect) {
        this.yandex = rect.width() * 0.5f;
        this.loadAd = rect.height() * this.mopub;
        return this.amazon;
    }
}
