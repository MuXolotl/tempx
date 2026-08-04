package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: lًُٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7928l extends AbstractC13851l {
    public final C13773l billing;

    public AbstractC7928l(Context context, C3307l c3307l) {
        super(context, c3307l);
        this.billing = new C13773l(3, this);
    }

    @Override // defpackage.AbstractC13851l
    public final void amazon() {
        C14513l.tapsense().vip(AbstractC9918l.yandex, getClass().getSimpleName().concat(": unregistering receiver"));
        this.loadAd.unregisterReceiver(this.billing);
    }

    public abstract void billing(Intent intent);

    @Override // defpackage.AbstractC13851l
    public final void crashlytics() {
        C14513l.tapsense().vip(AbstractC9918l.yandex, getClass().getSimpleName().concat(": registering receiver"));
        this.loadAd.registerReceiver(this.billing, purchase());
    }

    public abstract IntentFilter purchase();
}
