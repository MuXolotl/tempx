package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lَؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10093l {
    public final int amazon;
    public final /* synthetic */ AbstractC4620l billing;
    public final /* synthetic */ AbstractC4620l crashlytics;
    public boolean loadAd;
    public final Bundle purchase;
    public Boolean yandex;

    public AbstractC10093l(AbstractC4620l abstractC4620l, int i, Bundle bundle) {
        this.billing = abstractC4620l;
        Boolean bool = Boolean.TRUE;
        this.crashlytics = abstractC4620l;
        this.yandex = bool;
        this.loadAd = false;
        this.amazon = i;
        this.purchase = bundle;
    }

    public final void amazon() {
        synchronized (this) {
            this.yandex = null;
        }
    }

    public final void crashlytics() {
        amazon();
        AbstractC4620l abstractC4620l = this.crashlytics;
        synchronized (abstractC4620l.remoteconfig) {
            abstractC4620l.remoteconfig.remove(this);
        }
    }

    public abstract void loadAd(C10602l c10602l);

    public abstract boolean yandex();
}
