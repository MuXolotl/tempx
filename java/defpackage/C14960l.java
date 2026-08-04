package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* JADX INFO: renamed from: lٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14960l extends AbstractC7928l {
    public final ConnectivityManager mopub;

    public C14960l(Context context, C3307l c3307l) {
        super(context, c3307l);
        this.mopub = (ConnectivityManager) this.loadAd.getSystemService("connectivity");
    }

    @Override // defpackage.AbstractC7928l
    public final void billing(Intent intent) {
        if (AbstractC8576l.yandex(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C14513l.tapsense().vip(AbstractC14602l.yandex, "Network broadcast received");
            loadAd(AbstractC14602l.yandex(this.mopub, false));
        }
    }

    @Override // defpackage.AbstractC7928l
    public final IntentFilter purchase() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // defpackage.AbstractC13851l
    public final Object yandex() {
        return AbstractC14602l.yandex(this.mopub, false);
    }
}
