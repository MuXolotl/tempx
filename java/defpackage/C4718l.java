package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: lؙؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4718l extends AbstractC15951l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f9579l;

    public C4718l(int i, Class cls, int i2, int i3, int i4) {
        this.f9579l = i4;
        this.f31319l = i;
        this.f31320l = cls;
        this.f31317l = i2;
        this.f31318l = i3;
    }

    @Override // defpackage.AbstractC15951l
    public final boolean admob(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f9579l) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }

    @Override // defpackage.AbstractC15951l
    public final Object amazon(View view) {
        switch (this.f9579l) {
            case 0:
                return Boolean.valueOf(AbstractC17441l.crashlytics(view));
            case 1:
                return AbstractC17441l.yandex(view);
            case 2:
                return AbstractC18305l.loadAd(view);
            default:
                return Boolean.valueOf(AbstractC17441l.loadAd(view));
        }
    }

    @Override // defpackage.AbstractC15951l
    public final void purchase(View view, Object obj) {
        switch (this.f9579l) {
            case 0:
                AbstractC17441l.billing(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC17441l.purchase(view, (CharSequence) obj);
                break;
            case 2:
                AbstractC18305l.crashlytics(view, (CharSequence) obj);
                break;
            default:
                AbstractC17441l.amazon(view, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
