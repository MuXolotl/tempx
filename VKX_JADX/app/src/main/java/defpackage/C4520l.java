package defpackage;

import android.content.Context;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؖۦۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4520l extends AbstractC8412l {
    public C4520l(Context context) {
        super(context);
        C6361l c6361l = this.f17412l;
        C13509l c13509l = new C13509l();
        c13509l.yandex = c6361l;
        Context context2 = getContext();
        C2777l c2777l = new C2777l(c6361l);
        C6260l c6260l = new C6260l(context2, c6361l);
        c6260l.f13219l = c13509l;
        c6260l.f13218l = c2777l;
        c2777l.yandex = c6260l;
        c6260l.f13220l = C5669l.yandex(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(c6260l);
        setProgressDrawable(new C15728l(getContext(), c6361l, c13509l));
    }

    public int getIndicatorDirection() {
        return this.f17412l.isPro;
    }

    public int getIndicatorInset() {
        return this.f17412l.subs;
    }

    public int getIndicatorSize() {
        return this.f17412l.admob;
    }

    public void setIndicatorDirection(int i) {
        this.f17412l.isPro = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        C6361l c6361l = this.f17412l;
        if (c6361l.subs != i) {
            c6361l.subs = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        C6361l c6361l = this.f17412l;
        if (c6361l.admob != iMax) {
            c6361l.admob = iMax;
            c6361l.yandex();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.AbstractC8412l
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.f17412l.yandex();
    }
}
