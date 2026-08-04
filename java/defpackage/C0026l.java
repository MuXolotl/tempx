package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lؑؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0026l extends AbstractC14229l {
    public final Object amazon;
    public final /* synthetic */ int crashlytics;
    public final C2350l loadAd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0026l(C12648l c12648l, C2350l c2350l) {
        this(4, c2350l);
        this.crashlytics = 1;
        this.amazon = c12648l;
    }

    @Override // defpackage.AbstractC14229l
    public final void amazon(Status status) {
        this.loadAd.crashlytics(new C3890l(status));
    }

    @Override // defpackage.AbstractC14229l
    public final /* bridge */ /* synthetic */ void billing(C5633l c5633l, boolean z) {
        int i = this.crashlytics;
    }

    @Override // defpackage.AbstractC14229l
    public final int crashlytics(C3714l c3714l) {
        int i = this.crashlytics;
        Object obj = this.amazon;
        switch (i) {
            case 0:
                return ((C10988l) obj).yandex.f3249l;
            default:
                C10988l c10988l = (C10988l) c3714l.isPro.get((C12648l) obj);
                if (c10988l != null) {
                    return c10988l.yandex.f3249l;
                }
                return -1;
        }
    }

    public final void firebase(C3714l c3714l) {
        switch (this.crashlytics) {
            case 0:
                C10988l c10988l = (C10988l) this.amazon;
                C1196l c1196l = c10988l.yandex;
                ((InterfaceC11545l) ((C13904l) c1196l.f3254l).f27204l).accept(c3714l.billing, this.loadAd);
                C12648l c12648l = (C12648l) ((C18096l) c1196l.f3253l).loadAd;
                if (c12648l != null) {
                    c3714l.isPro.put(c12648l, c10988l);
                }
                break;
            default:
                C10988l c10988l2 = (C10988l) c3714l.isPro.remove((C12648l) this.amazon);
                if (c10988l2 == null) {
                    this.loadAd.amazon(Boolean.FALSE);
                } else {
                    ((InterfaceC11545l) ((C13904l) c10988l2.loadAd.f34133l).f27203l).accept(c3714l.billing, this.loadAd);
                    ((C18096l) c10988l2.yandex.f3253l).loadAd = null;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC14229l
    public final boolean loadAd(C3714l c3714l) {
        int i = this.crashlytics;
        Object obj = this.amazon;
        switch (i) {
            case 0:
                return ((C10988l) obj).yandex.f3250l;
            default:
                C10988l c10988l = (C10988l) c3714l.isPro.get((C12648l) obj);
                return c10988l != null && c10988l.yandex.f3250l;
        }
    }

    @Override // defpackage.AbstractC14229l
    public final void mopub(C3714l c3714l) throws DeadObjectException {
        try {
            firebase(c3714l);
        } catch (DeadObjectException e) {
            amazon(AbstractC14229l.admob(e));
            throw e;
        } catch (RemoteException e2) {
            amazon(AbstractC14229l.admob(e2));
        } catch (RuntimeException e3) {
            this.loadAd.crashlytics(e3);
        }
    }

    @Override // defpackage.AbstractC14229l
    public final void purchase(Exception exc) {
        this.loadAd.crashlytics(exc);
    }

    @Override // defpackage.AbstractC14229l
    public final C9138l[] yandex(C3714l c3714l) {
        int i = this.crashlytics;
        Object obj = this.amazon;
        switch (i) {
            case 0:
                return (C9138l[]) ((C10988l) obj).yandex.f3252l;
            default:
                C10988l c10988l = (C10988l) c3714l.isPro.get((C12648l) obj);
                if (c10988l == null) {
                    return null;
                }
                return (C9138l[]) c10988l.yandex.f3252l;
        }
    }

    public C0026l(int i, C2350l c2350l) {
        super(i);
        this.loadAd = c2350l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0026l(C10988l c10988l, C2350l c2350l) {
        this(3, c2350l);
        this.crashlytics = 0;
        this.amazon = c10988l;
    }

    private final /* bridge */ /* synthetic */ void isPro(C5633l c5633l, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void subs(C5633l c5633l, boolean z) {
    }
}
