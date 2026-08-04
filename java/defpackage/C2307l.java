package defpackage;

/* JADX INFO: renamed from: lؔؐٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2307l extends AbstractC0342l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile double f5004l;

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object amazon(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ void billing(Object obj) {
        this.f5004l = ((Double) obj).doubleValue();
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object crashlytics(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object purchase() {
        return Double.valueOf(this.f5004l);
    }

    @Override // defpackage.AbstractC0342l
    public final /* synthetic */ Object yandex() {
        return Double.valueOf(-3.0d);
    }
}
