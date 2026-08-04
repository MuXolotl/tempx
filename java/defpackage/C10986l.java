package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: lُِٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10986l extends ContentObserver {
    public final /* synthetic */ C17274l crashlytics;
    public final Uri loadAd;
    public final ContentResolver yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10986l(C17274l c17274l, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.crashlytics = c17274l;
        this.yandex = contentResolver;
        this.loadAd = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.crashlytics.subs();
    }
}
