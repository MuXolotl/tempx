package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: renamed from: lَُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C10100l {
    public MediaSessionCompat$Token admob;
    public C13645l billing;
    public final Bundle crashlytics;
    public final MediaBrowser loadAd;
    public Messenger mopub;
    public final Context yandex;
    public final HandlerC0341l amazon = new HandlerC0341l(this);
    public final C11154l purchase = new C11154l(0);

    public C10100l(Context context, ComponentName componentName, C1424l c1424l) {
        this.yandex = context;
        Bundle bundle = new Bundle();
        this.crashlytics = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c1424l.f3602l = this;
        this.loadAd = new MediaBrowser(context, componentName, (C16227l) c1424l.f3603l, bundle);
    }
}
