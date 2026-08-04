package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: lؘؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3215l extends AbstractC16763l {
    public final /* synthetic */ C1085l isPro;
    public final /* synthetic */ AbstractC8016l subs;

    public C3215l(C1085l c1085l, AbstractC8016l abstractC8016l) {
        this.isPro = c1085l;
        this.subs = abstractC8016l;
    }

    @Override // defpackage.AbstractC16763l
    public final void remoteconfig(int i) {
        this.isPro.remoteconfig = true;
        this.subs.amazon(i);
    }

    @Override // defpackage.AbstractC16763l
    public final void vip(Typeface typeface) {
        C1085l c1085l = this.isPro;
        Typeface typefaceCreate = Typeface.create(typeface, c1085l.crashlytics);
        c1085l.vip = typefaceCreate;
        c1085l.remoteconfig = true;
        this.subs.purchase(typefaceCreate, false);
    }
}
