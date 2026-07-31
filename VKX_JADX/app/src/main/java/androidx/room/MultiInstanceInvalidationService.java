package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.BinderC4934l;
import defpackage.RemoteCallbackListC15118l;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f475l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LinkedHashMap f474l = new LinkedHashMap();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final RemoteCallbackListC15118l f473l = new RemoteCallbackListC15118l(this);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final BinderC4934l f476l = new BinderC4934l(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f476l;
    }
}
