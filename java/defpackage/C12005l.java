package defpackage;

import android.graphics.Canvas;

/* JADX INFO: renamed from: lِٝۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C12005l extends AbstractC10033l {
    public final /* synthetic */ C1424l crashlytics;
    public float loadAd;
    public float yandex;

    public C12005l(C1424l c1424l, float f, float f2) {
        this.crashlytics = c1424l;
        this.yandex = f;
        this.loadAd = f2;
    }

    @Override // defpackage.AbstractC10033l
    public void subs(String str) {
        C1424l c1424l = this.crashlytics;
        Canvas canvas = (Canvas) c1424l.f3603l;
        if (c1424l.m932l()) {
            C16539l c16539l = (C16539l) c1424l.f3601l;
            if (c16539l.loadAd) {
                canvas.drawText(str, this.yandex, this.loadAd, c16539l.amazon);
            }
            C16539l c16539l2 = (C16539l) c1424l.f3601l;
            if (c16539l2.crashlytics) {
                canvas.drawText(str, this.yandex, this.loadAd, c16539l2.purchase);
            }
        }
        this.yandex = ((C16539l) c1424l.f3601l).amazon.measureText(str) + this.yandex;
    }
}
