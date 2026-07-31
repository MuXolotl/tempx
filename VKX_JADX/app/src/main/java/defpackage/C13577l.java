package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: lْۖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13577l implements InterfaceC5066l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C13577l f26594l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f26595l;

    public C13577l() {
        this.f26595l = new Object();
        new Handler(Looper.getMainLooper(), new C4627l(0, this));
    }

    @Override // defpackage.InterfaceC5066l
    public String isPro() {
        return "attempted to overwrite the existing value '" + this.f26595l + '\'';
    }

    public void yandex() {
        synchronized (this.f26595l) {
        }
    }

    public C13577l(Object obj) {
        this.f26595l = obj;
    }
}
