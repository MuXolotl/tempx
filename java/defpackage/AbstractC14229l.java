package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lٓٙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14229l {
    public final int yandex;

    public AbstractC14229l(int i) {
        this.yandex = i;
    }

    public static Status admob(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void amazon(Status status);

    public abstract void billing(C5633l c5633l, boolean z);

    public abstract int crashlytics(C3714l c3714l);

    public abstract boolean loadAd(C3714l c3714l);

    public abstract void mopub(C3714l c3714l);

    public abstract void purchase(Exception exc);

    public abstract C9138l[] yandex(C3714l c3714l);
}
