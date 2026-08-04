package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: lًؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0919l extends AbstractC15029l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f2591l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f2592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0919l(ViewGroup viewGroup, int i) {
        super(1);
        this.f2591l = i;
        this.f2592l = viewGroup;
    }

    @Override // defpackage.AbstractC15029l
    public final C13645l metrica(C12902l c12902l, C13645l c13645l) {
        int i = this.f2591l;
        ViewGroup viewGroup = this.f2592l;
        switch (i) {
            case 0:
                C11103l c11103l = (C11103l) ((C8464l) viewGroup).f1327l.f7703l.amazon;
                if (!c11103l.f22307l.f29462l) {
                    return c13645l;
                }
                long jIsPro = AbstractC3383l.isPro(c11103l.mo2591strictfp(0L));
                int i2 = (int) (jIsPro >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jIsPro & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jSmaato = AbstractC9690l.crashlytics(c11103l).smaato();
                int i4 = (int) (jSmaato >> 32);
                int i5 = (int) (jSmaato & 4294967295L);
                long j = c11103l.f20590l;
                long jIsPro2 = AbstractC3383l.isPro(c11103l.mo2591strictfp((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jIsPro2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (jIsPro2 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? c13645l : new C13645l(AbstractC0290l.smaato((C15496l) c13645l.f26671l, i2, i3, i6, i8), AbstractC0290l.smaato((C15496l) c13645l.f26670l, i2, i3, i6, i8), 27);
            default:
                C9295l c9295l = (C9295l) viewGroup;
                if (c9295l.f19095l) {
                    return c13645l;
                }
                View childAt = c9295l.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c9295l.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c9295l.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c13645l;
                }
                C15496l c15496lLoadAd = C15496l.loadAd(iMax, iMax2, iMax3, iMax4);
                int i9 = c15496lLoadAd.yandex;
                C15496l c15496l = (C15496l) c13645l.f26671l;
                int i10 = c15496lLoadAd.loadAd;
                int i11 = c15496lLoadAd.crashlytics;
                int i12 = c15496lLoadAd.amazon;
                return new C13645l(C1473l.purchase(c15496l, i9, i10, i11, i12), C1473l.purchase((C15496l) c13645l.f26670l, i9, i10, i11, i12), 27);
        }
    }

    @Override // defpackage.AbstractC15029l
    public final C1473l vip(C1473l c1473l, List list) {
        int i = this.f2591l;
        ViewGroup viewGroup = this.f2592l;
        switch (i) {
            case 0:
                return ((C8464l) viewGroup).remoteconfig(c1473l);
            default:
                C9295l c9295l = (C9295l) viewGroup;
                if (c9295l.f19095l) {
                    return c1473l;
                }
                View childAt = c9295l.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c9295l.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c9295l.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? c1473l : c1473l.yandex.ads(iMax, iMax2, iMax3, iMax4);
        }
    }
}
