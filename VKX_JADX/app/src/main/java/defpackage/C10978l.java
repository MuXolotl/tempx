package defpackage;

/* JADX INFO: renamed from: lُُۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10978l extends AbstractC16431l {
    @Override // defpackage.AbstractC16431l
    public final void purchase(C9555l c9555l, float f, float f2) {
        c9555l.amazon(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C3832l c3832l = new C3832l(0.0f, 0.0f, f3, f3);
        c3832l.billing = 180.0f;
        c3832l.mopub = 90.0f;
        c9555l.billing.add(c3832l);
        C18538l c18538l = new C18538l(c3832l);
        c9555l.yandex(180.0f);
        c9555l.mopub.add(c18538l);
        c9555l.amazon = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        c9555l.loadAd = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        c9555l.crashlytics = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
