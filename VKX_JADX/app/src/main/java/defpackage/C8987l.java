package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: lٌّۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8987l extends C7827l {
    public C8987l(C1473l c1473l, WindowInsets windowInsets) {
        super(c1473l, windowInsets);
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public List<Rect> billing(int i) {
        return this.crashlytics.getBoundingRects(AbstractC13858l.yandex(i));
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public List<Rect> mopub(int i) {
        return this.crashlytics.getBoundingRectsIgnoringVisibility(AbstractC13858l.yandex(i));
    }

    public C8987l(C1473l c1473l, C8987l c8987l) {
        super(c1473l, c8987l);
    }

    @Override // defpackage.C3521l, defpackage.C17212l
    public void adcel() {
    }
}
