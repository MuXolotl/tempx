package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4782l extends AbstractC7469l {
    public final List loadAd;
    public final Paint yandex;

    public C4782l() {
        Paint paint = new Paint();
        this.yandex = paint;
        this.loadAd = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.AbstractC7469l
    public final void billing(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.yandex;
        paint.setStrokeWidth(dimension);
        Iterator it = this.loadAd.iterator();
        while (it.hasNext()) {
            ((AbstractC5736l) it.next()).getClass();
            paint.setColor(AbstractC14093l.crashlytics(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m184l()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).adcel.subs(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).adcel.amazon(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).adcel.billing(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).adcel.mopub(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
