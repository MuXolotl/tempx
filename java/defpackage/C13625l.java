package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lْۙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13625l extends AbstractC7469l {
    public final boolean loadAd;
    public final int yandex;

    public C13625l(int i, boolean z) {
        this.yandex = i;
        this.loadAd = z;
    }

    @Override // defpackage.AbstractC7469l
    public final void amazon(Rect rect, View view, RecyclerView recyclerView) {
        int iMopub = recyclerView.getAdapter().mopub() - 1;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.yandex;
        rect.left = childAdapterPosition == 0 ? i : 0;
        if (childAdapterPosition != iMopub && !this.loadAd) {
            i /= 2;
        }
        rect.right = i;
    }
}
