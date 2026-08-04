package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.List;

/* JADX INFO: renamed from: lؓٝ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1992l extends WindowInsetsAnimation$Callback {
    public final /* synthetic */ AbstractActivityC13543l yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1992l(AbstractActivityC13543l abstractActivityC13543l) {
        super(0);
        this.yandex = abstractActivityC13543l;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.yandex.f26557l = false;
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.yandex.f26557l = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        int iMin = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        int i = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()).bottom;
        AbstractActivityC13543l abstractActivityC13543l = this.yandex;
        if (abstractActivityC13543l.f26559l) {
            if (i != 0) {
                float f = i;
                iMin = (int) (((1.0f - (Math.min(iMin, i) / f)) * f) + iMin);
            }
            abstractActivityC13543l.f5599l.crashlytics(iMin);
            abstractActivityC13543l.f5599l.setPadding(0, 0, 0, iMin);
        }
        return windowInsets;
    }
}
