package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: lّٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16118l extends ViewOutlineProvider {
    public final /* synthetic */ AbstractC2338l yandex;

    public C16118l(AbstractC2338l abstractC2338l) {
        this.yandex = abstractC2338l;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f;
        AbstractC2338l abstractC2338l = this.yandex;
        if (abstractC2338l.f5083l) {
            f = 0.0f;
        } else {
            f = (1.0f - abstractC2338l.f5075l) * AbstractC2338l.f5071l;
        }
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), (int) (view.getMeasuredHeight() + AbstractC2338l.f5071l), f);
    }
}
