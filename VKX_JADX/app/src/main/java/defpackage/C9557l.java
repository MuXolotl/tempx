package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* JADX INFO: renamed from: lٍٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9557l {
    public C5057l admob;
    public C13568l billing;
    public final Bundle crashlytics;
    public final MediaBrowser loadAd;
    public Messenger mopub;
    public final Context yandex;
    public final HandlerC0341l amazon = new HandlerC0341l(this);
    public final C11154l purchase = new C11154l(0);

    public C9557l(Context context, ComponentName componentName, C18449l c18449l, Bundle bundle) {
        this.yandex = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.crashlytics = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        c18449l.f36009l = this;
        C16227l c16227l = (C16227l) c18449l.f36010l;
        c16227l.getClass();
        this.loadAd = new MediaBrowser(context, componentName, c16227l, bundle2);
    }
}
