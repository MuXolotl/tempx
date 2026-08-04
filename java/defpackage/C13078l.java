package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: lْؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13078l extends AbstractC11402l {
    public final /* synthetic */ int loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13078l(Unsafe unsafe, int i) {
        super(unsafe);
        this.loadAd = i;
    }

    @Override // defpackage.AbstractC11402l
    public final byte amazon(long j, Object obj) {
        switch (this.loadAd) {
            case 0:
                return AbstractC1900l.mopub ? AbstractC1900l.admob(j, obj) : AbstractC1900l.subs(j, obj);
            default:
                return AbstractC1900l.mopub ? AbstractC1900l.admob(j, obj) : AbstractC1900l.subs(j, obj);
        }
    }

    @Override // defpackage.AbstractC11402l
    public final float billing(long j, Object obj) {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(mopub(j, obj));
    }

    @Override // defpackage.AbstractC11402l
    public final boolean crashlytics(long j, Object obj) {
        switch (this.loadAd) {
            case 0:
                if (AbstractC1900l.mopub) {
                    if (AbstractC1900l.admob(j, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC1900l.subs(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC1900l.mopub) {
                    if (AbstractC1900l.admob(j, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC1900l.subs(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.AbstractC11402l
    public final void firebase(Object obj, long j, boolean z) {
        switch (this.loadAd) {
            case 0:
                if (!AbstractC1900l.mopub) {
                    AbstractC1900l.remoteconfig(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1900l.smaato(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC1900l.mopub) {
                    AbstractC1900l.remoteconfig(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1900l.smaato(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC11402l
    public final double purchase(long j, Object obj) {
        switch (this.loadAd) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(admob(j, obj));
    }

    @Override // defpackage.AbstractC11402l
    public final void remoteconfig(Object obj, long j, double d) {
        switch (this.loadAd) {
            case 0:
                startapp(j, Double.doubleToLongBits(d), obj);
                break;
            default:
                startapp(j, Double.doubleToLongBits(d), obj);
                break;
        }
    }

    @Override // defpackage.AbstractC11402l
    public final void smaato(Object obj, long j, byte b) {
        switch (this.loadAd) {
            case 0:
                if (!AbstractC1900l.mopub) {
                    AbstractC1900l.remoteconfig(obj, j, b);
                } else {
                    AbstractC1900l.smaato(obj, j, b);
                }
                break;
            default:
                if (!AbstractC1900l.mopub) {
                    AbstractC1900l.remoteconfig(obj, j, b);
                } else {
                    AbstractC1900l.smaato(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC11402l
    public final boolean subscription() {
        switch (this.loadAd) {
        }
        return false;
    }

    @Override // defpackage.AbstractC11402l
    public final void vip(Object obj, long j, float f) {
        switch (this.loadAd) {
            case 0:
                metrica(j, obj, Float.floatToIntBits(f));
                break;
            default:
                metrica(j, obj, Float.floatToIntBits(f));
                break;
        }
    }
}
