package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12520l extends AbstractC14842l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C12520l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.AbstractC14842l
    public final void loadAd(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.yandex;
        Object obj = this.loadAd;
        switch (i3) {
            case 0:
                C17832l c17832l = (C17832l) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = c17832l.yandex;
                int iComputeVerticalScrollRange = c17832l.subscription.computeVerticalScrollRange();
                int i5 = c17832l.ads;
                c17832l.tapsense = iComputeVerticalScrollRange - i5 > 0 && i5 >= i4;
                int iComputeHorizontalScrollRange = c17832l.subscription.computeHorizontalScrollRange();
                int i6 = c17832l.adcel;
                boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                c17832l.Signature = z;
                boolean z2 = c17832l.tapsense;
                if (z2 || z) {
                    if (z2) {
                        float f = i5;
                        c17832l.smaato = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        c17832l.firebase = Math.min(i5, (i5 * i5) / iComputeVerticalScrollRange);
                    }
                    if (c17832l.Signature) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i6;
                        c17832l.metrica = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                        c17832l.vip = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
                    }
                    int i7 = c17832l.license;
                    if (i7 == 0 || i7 == 1) {
                        c17832l.isPro(1);
                    }
                } else if (c17832l.license != 0) {
                    c17832l.isPro(0);
                }
                break;
            default:
                AbstractC11519l abstractC11519l = (AbstractC11519l) obj;
                if (abstractC11519l.mo1142class()) {
                    float f4 = abstractC11519l.f23168l + i2;
                    abstractC11519l.f23168l = f4;
                    Object obj2 = abstractC11519l.f5279l;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    ((InterfaceC9857l) obj2).yandex(Math.min(f4 / abstractC11519l.f5281l, 1.0f));
                }
                abstractC11519l.mo2421finally();
                break;
        }
    }
}
