package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: lًؙُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C7827l extends C17333l {
    public static final C1473l ad = C1473l.admob(WindowInsets.CONSUMED, null);

    public C7827l(C1473l c1473l, WindowInsets windowInsets) {
        super(c1473l, windowInsets);
    }

    @Override // defpackage.C3519l, defpackage.C3521l, defpackage.C17212l
    public boolean Signature(int i) {
        return this.crashlytics.isVisible(AbstractC13858l.yandex(i));
    }

    @Override // defpackage.C3519l, defpackage.C3521l, defpackage.C17212l
    public C15496l isPro(int i) {
        return C15496l.crashlytics(this.crashlytics.getInsetsIgnoringVisibility(AbstractC13858l.yandex(i)));
    }

    @Override // defpackage.C3519l, defpackage.C3521l, defpackage.C17212l
    public C15496l subs(int i) {
        return C15496l.crashlytics(this.crashlytics.getInsets(AbstractC13858l.yandex(i)));
    }

    public C7827l(C1473l c1473l, C7827l c7827l) {
        super(c1473l, c7827l);
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public void startapp(View view) {
    }
}
