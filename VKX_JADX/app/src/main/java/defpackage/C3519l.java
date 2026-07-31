package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: lٜؕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C3519l extends C1928l {
    public static final C1473l pro = C1473l.admob(WindowInsets.CONSUMED, null);

    public C3519l(C1473l c1473l, WindowInsets windowInsets) {
        super(c1473l, windowInsets);
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public boolean Signature(int i) {
        return this.crashlytics.isVisible(AbstractC17693l.yandex(i));
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public C15496l isPro(int i) {
        return C15496l.crashlytics(this.crashlytics.getInsetsIgnoringVisibility(AbstractC17693l.yandex(i)));
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public C15496l subs(int i) {
        return C15496l.crashlytics(this.crashlytics.getInsets(AbstractC17693l.yandex(i)));
    }

    public C3519l(C1473l c1473l, C3519l c3519l) {
        super(c1473l, c3519l);
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public final void amazon(View view) {
    }
}
