package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: renamed from: lٍٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9733l extends AbstractC13851l {
    public volatile boolean admob;
    public final ConnectivityManager billing;
    public final Object mopub;
    public final C10447l subs;

    public C9733l(Context context, C3307l c3307l) {
        super(context, c3307l);
        this.billing = (ConnectivityManager) this.loadAd.getSystemService("connectivity");
        this.mopub = new Object();
        this.subs = new C10447l(1, this);
    }

    @Override // defpackage.AbstractC13851l
    public final void amazon() {
        try {
            C14513l.tapsense().vip(AbstractC14602l.yandex, "Unregistering network callback");
            this.billing.unregisterNetworkCallback(this.subs);
        } catch (IllegalArgumentException e) {
            C14513l.tapsense().ads(AbstractC14602l.yandex, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            C14513l.tapsense().ads(AbstractC14602l.yandex, "Received exception while unregistering network callback", e2);
        }
    }

    @Override // defpackage.AbstractC13851l
    public final void crashlytics() {
        try {
            C14513l.tapsense().vip(AbstractC14602l.yandex, "Registering network callback");
            AbstractC11965l.license(this.billing, this.subs);
        } catch (IllegalArgumentException e) {
            C14513l.tapsense().ads(AbstractC14602l.yandex, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            C14513l.tapsense().ads(AbstractC14602l.yandex, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.AbstractC13851l
    public final Object yandex() {
        return AbstractC14602l.yandex(this.billing, this.admob);
    }
}
