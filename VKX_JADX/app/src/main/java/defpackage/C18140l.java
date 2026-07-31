package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: l٘ۗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18140l extends AbstractC12432l {
    public final /* synthetic */ int loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18140l(AbstractC13851l abstractC13851l, int i) {
        super(abstractC13851l);
        this.loadAd = i;
    }

    @Override // defpackage.AbstractC12432l
    public final int amazon() {
        switch (this.loadAd) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // defpackage.InterfaceC4117l
    public final boolean crashlytics(C7718l c7718l) {
        switch (this.loadAd) {
            case 0:
                return c7718l.isPro.crashlytics;
            case 1:
                return c7718l.isPro.purchase;
            case 2:
                return c7718l.isPro.yandex == 2;
            case 3:
                return c7718l.isPro.yandex == 3;
            default:
                return c7718l.isPro.billing;
        }
    }

    @Override // defpackage.AbstractC12432l
    public final boolean purchase(Object obj) {
        boolean zBooleanValue;
        switch (this.loadAd) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                C9415l c9415l = (C9415l) obj;
                return c9415l.purchase || !c9415l.yandex || (Build.VERSION.SDK_INT >= 26 && !c9415l.loadAd);
            case 3:
                C9415l c9415l2 = (C9415l) obj;
                return !c9415l2.yandex || c9415l2.crashlytics || c9415l2.purchase;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
