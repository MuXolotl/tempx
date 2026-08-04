package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌؘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8459l extends AbstractC5287l {
    public final /* synthetic */ Function0 crashlytics;
    public final /* synthetic */ Function0 loadAd;

    public C8459l(Function0 function0, Function0 function1) {
        this.loadAd = function0;
        this.crashlytics = function1;
    }

    @Override // defpackage.AbstractC5287l
    public final void loadAd(Drawable drawable) {
        Function0 function0 = this.loadAd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.AbstractC5287l
    public final void yandex(Drawable drawable) {
        Function0 function0 = this.crashlytics;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
