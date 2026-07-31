package defpackage;

/* JADX INFO: renamed from: lَِٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11838l extends AbstractC6809l {
    @Override // defpackage.AbstractC6809l
    public final boolean amazon(long j, Object obj) {
        return AbstractC1823l.billing ? AbstractC1823l.vip(j, obj) : AbstractC1823l.metrica(j, obj);
    }

    @Override // defpackage.AbstractC6809l
    public final float billing(long j, Object obj) {
        return Float.intBitsToFloat(this.yandex.getInt(obj, j));
    }

    @Override // defpackage.AbstractC6809l
    public final double isPro(long j, Object obj) {
        return Double.longBitsToDouble(this.yandex.getLong(obj, j));
    }

    @Override // defpackage.AbstractC6809l
    public final void loadAd(Object obj, long j, byte b) {
        if (AbstractC1823l.billing) {
            AbstractC1823l.loadAd(obj, j, b);
        } else {
            AbstractC1823l.crashlytics(obj, j, b);
        }
    }

    @Override // defpackage.AbstractC6809l
    public final void purchase(Object obj, long j, boolean z) {
        if (AbstractC1823l.billing) {
            AbstractC1823l.loadAd(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1823l.crashlytics(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.AbstractC6809l
    public final void smaato(Object obj, long j, double d) {
        this.yandex.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.AbstractC6809l
    public final void subs(Object obj, long j, float f) {
        this.yandex.putInt(obj, j, Float.floatToIntBits(f));
    }
}
