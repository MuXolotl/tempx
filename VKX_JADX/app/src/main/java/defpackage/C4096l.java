package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: lؙؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4096l extends ViewOutlineProvider {
    public final /* synthetic */ int yandex;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C6535l c6535l;
        Outline outline2;
        switch (this.yandex) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                if (!(view instanceof C6535l) || (outline2 = (c6535l = (C6535l) view).f13614l) == null) {
                    return;
                }
                outline.set(outline2);
                float f = c6535l.f13619l;
                if (f == 0.0f && c6535l.f13616l == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) c6535l.f13616l);
                return;
            default:
                if (view != null) {
                    throw new ClassCastException();
                }
                view.getClass();
                throw new ClassCastException();
        }
    }
}
