package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8789l extends AbstractC8045l {
    public final int amazon;
    public final Function2 crashlytics;
    public final Function2 loadAd;
    public final Function0 purchase;
    public final int yandex;

    public /* synthetic */ C8789l(int i, C15578l c15578l, int i2, Function0 function0, int i3) {
        this(i, (C15578l) null, (i3 & 4) != 0 ? null : c15578l, i2, function0);
    }

    public C8789l(int i, C15578l c15578l, Function2 function2, int i2, Function0 function0) {
        this.yandex = i;
        this.loadAd = c15578l;
        this.crashlytics = function2;
        this.amazon = i2;
        this.purchase = function0;
    }
}
