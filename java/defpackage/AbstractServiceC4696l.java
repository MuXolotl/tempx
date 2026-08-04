package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: lؘؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC4696l extends Service implements InterfaceC3177l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12418l f9539l = new C12418l(this);

    @Override // defpackage.InterfaceC3177l
    public AbstractC6475l loadAd() {
        return (C5268l) this.f9539l.f24519l;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f9539l.ad(EnumC14812l.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f9539l.ad(EnumC14812l.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC14812l enumC14812l = EnumC14812l.ON_STOP;
        C12418l c12418l = this.f9539l;
        c12418l.ad(enumC14812l);
        c12418l.ad(EnumC14812l.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.f9539l.ad(EnumC14812l.ON_START);
        super.onStart(intent, i);
    }
}
