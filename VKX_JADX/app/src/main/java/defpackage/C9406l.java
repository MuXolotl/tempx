package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: lًٍۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9406l extends AbstractC16819l {
    public final /* synthetic */ int loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9406l(Unsafe unsafe, int i) {
        super(unsafe);
        this.loadAd = i;
    }

    @Override // defpackage.AbstractC16819l
    public final boolean ads() {
        switch (this.loadAd) {
        }
        return false;
    }

    @Override // defpackage.AbstractC16819l
    public final double amazon(long j, Object obj) {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(mopub(j, obj));
    }

    @Override // defpackage.AbstractC16819l
    public final boolean crashlytics(long j, Object obj) {
        switch (this.loadAd) {
            case 0:
                return AbstractC0357l.mopub ? AbstractC0357l.loadAd(j, obj) : AbstractC0357l.crashlytics(j, obj);
            default:
                return AbstractC0357l.mopub ? AbstractC0357l.loadAd(j, obj) : AbstractC0357l.crashlytics(j, obj);
        }
    }

    @Override // defpackage.AbstractC16819l
    public final void firebase(Object obj, long j, byte b) {
        switch (this.loadAd) {
            case 0:
                if (!AbstractC0357l.mopub) {
                    AbstractC0357l.smaato(obj, j, b);
                } else {
                    AbstractC0357l.firebase(obj, j, b);
                }
                break;
            default:
                if (!AbstractC0357l.mopub) {
                    AbstractC0357l.smaato(obj, j, b);
                } else {
                    AbstractC0357l.firebase(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC16819l
    public final void isPro(Object obj, long j, boolean z) {
        switch (this.loadAd) {
            case 0:
                if (!AbstractC0357l.mopub) {
                    AbstractC0357l.smaato(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC0357l.firebase(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC0357l.mopub) {
                    AbstractC0357l.smaato(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC0357l.firebase(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC16819l
    public final float purchase(long j, Object obj) {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(billing(j, obj));
    }

    @Override // defpackage.AbstractC16819l
    public final void remoteconfig(Object obj, long j, float f) {
        switch (this.loadAd) {
            case 0:
                vip(j, obj, Float.floatToIntBits(f));
                break;
            default:
                vip(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.AbstractC16819l
    public final void smaato(Object obj, long j, double d) {
        switch (this.loadAd) {
            case 0:
                metrica(j, Double.doubleToLongBits(d), obj);
                break;
            default:
                metrica(j, Double.doubleToLongBits(d), obj);
                break;
        }
    }
}
