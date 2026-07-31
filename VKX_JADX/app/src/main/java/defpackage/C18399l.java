package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18399l extends Animatable2.AnimationCallback {
    public final /* synthetic */ Function0 loadAd;
    public final /* synthetic */ Function0 yandex;

    public C18399l(Function0 function0, Function0 function1) {
        this.yandex = function0;
        this.loadAd = function1;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.loadAd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Function0 function0 = this.yandex;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
