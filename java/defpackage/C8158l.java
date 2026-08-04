package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lًٞؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8158l extends AbstractC7469l {
    public final int yandex;

    public C8158l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.AbstractC7469l
    public final void amazon(Rect rect, View view, RecyclerView recyclerView) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int i = childLayoutPosition % 2;
        int i2 = this.yandex;
        if (i == 0) {
            rect.left = i2;
            rect.right = i2 / 2;
        } else {
            rect.left = i2 / 2;
            rect.right = i2;
        }
        rect.bottom = i2;
        rect.top = (childLayoutPosition == 0 || childLayoutPosition == 1) ? i2 / 2 : 0;
    }
}
