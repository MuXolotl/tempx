package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: renamed from: l٘ؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17665l extends AbstractC14229l {
    public final C18450l amazon;
    public final C2350l crashlytics;
    public final C8662l loadAd;

    public C17665l(int i, C8662l c8662l, C2350l c2350l, C18450l c18450l) {
        super(i);
        this.crashlytics = c2350l;
        this.loadAd = c8662l;
        this.amazon = c18450l;
        if (i == 2 && c8662l.crashlytics) {
            C8339l.metrica("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.AbstractC14229l
    public final void amazon(Status status) {
        this.amazon.getClass();
        this.crashlytics.crashlytics(AbstractC5578l.amazon(status));
    }

    @Override // defpackage.AbstractC14229l
    public final void billing(C5633l c5633l, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) c5633l.f11985l;
        C2350l c2350l = this.crashlytics;
        map.put(c2350l, boolValueOf);
        c2350l.yandex.yandex(new C7847l(c5633l, c2350l));
    }

    @Override // defpackage.AbstractC14229l
    public final int crashlytics(C3714l c3714l) {
        return this.loadAd.loadAd;
    }

    @Override // defpackage.AbstractC14229l
    public final boolean loadAd(C3714l c3714l) {
        return this.loadAd.crashlytics;
    }

    @Override // defpackage.AbstractC14229l
    public final void mopub(C3714l c3714l) throws DeadObjectException {
        C2350l c2350l = this.crashlytics;
        try {
            C8662l c8662l = this.loadAd;
            ((C10147l) c8662l.purchase).yandex.accept(c3714l.billing, c2350l);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            amazon(AbstractC14229l.admob(e2));
        } catch (RuntimeException e3) {
            c2350l.crashlytics(e3);
        }
    }

    @Override // defpackage.AbstractC14229l
    public final void purchase(Exception exc) {
        this.crashlytics.crashlytics(exc);
    }

    @Override // defpackage.AbstractC14229l
    public final C9138l[] yandex(C3714l c3714l) {
        return (C9138l[]) this.loadAd.amazon;
    }
}
