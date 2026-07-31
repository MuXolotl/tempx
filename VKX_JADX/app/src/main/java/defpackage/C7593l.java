package defpackage;

/* JADX INFO: renamed from: lؚۢۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7593l extends AbstractC6809l {
    @Override // defpackage.AbstractC6809l
    public final void admob(Object obj, long j, double d) {
        this.yandex.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.AbstractC6809l
    public final float crashlytics(long j, Object obj) {
        return Float.intBitsToFloat(this.yandex.getInt(obj, j));
    }

    @Override // defpackage.AbstractC6809l
    public final void firebase(Object obj, long j, float f) {
        this.yandex.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.AbstractC6809l
    public final void mopub(Object obj, long j, byte b) {
        if (AbstractC10611l.mopub) {
            AbstractC10611l.crashlytics(obj, j, b);
        } else {
            AbstractC10611l.amazon(obj, j, b);
        }
    }

    @Override // defpackage.AbstractC6809l
    public final void purchase(Object obj, long j, boolean z) {
        if (AbstractC10611l.mopub) {
            AbstractC10611l.crashlytics(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC10611l.amazon(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.AbstractC6809l
    public final boolean remoteconfig(long j, Object obj) {
        return AbstractC10611l.mopub ? AbstractC10611l.remoteconfig(j, obj) : AbstractC10611l.vip(j, obj);
    }

    @Override // defpackage.AbstractC6809l
    public final double yandex(long j, Object obj) {
        return Double.longBitsToDouble(this.yandex.getLong(obj, j));
    }
}
