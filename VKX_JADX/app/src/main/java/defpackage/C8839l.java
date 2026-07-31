package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: renamed from: lٌٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8839l extends C12005l {
    public final Path amazon;
    public final /* synthetic */ C1424l purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8839l(C1424l c1424l, Path path, float f) {
        super(c1424l, f, 0.0f);
        this.purchase = c1424l;
        this.amazon = path;
    }

    @Override // defpackage.C12005l, defpackage.AbstractC10033l
    public final void subs(String str) {
        C1424l c1424l = this.purchase;
        if (c1424l.m932l()) {
            C16539l c16539l = (C16539l) c1424l.f3601l;
            if (c16539l.loadAd) {
                ((Canvas) c1424l.f3603l).drawTextOnPath(str, this.amazon, this.yandex, this.loadAd, c16539l.amazon);
            }
            C16539l c16539l2 = (C16539l) c1424l.f3601l;
            if (c16539l2.crashlytics) {
                ((Canvas) c1424l.f3603l).drawTextOnPath(str, this.amazon, this.yandex, this.loadAd, c16539l2.purchase);
            }
        }
        this.yandex = ((C16539l) c1424l.f3601l).amazon.measureText(str) + this.yandex;
    }
}
