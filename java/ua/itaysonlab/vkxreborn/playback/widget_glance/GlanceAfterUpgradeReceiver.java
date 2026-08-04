package ua.itaysonlab.vkxreborn.playback.widget_glance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC10586l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC1295l;
import defpackage.C18662l;
import defpackage.C4647l;
import defpackage.InterfaceC14029l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class GlanceAfterUpgradeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(AbstractC1295l.crashlytics(), AbstractC11463l.yandex));
        AbstractC10999l.mopub(c18662lYandex, null, 0, new C4647l(context, c18662lYandex, goAsync(), (InterfaceC14029l) null, 18), 3);
    }
}
