package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10069l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10013l f20542l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18548l f20543l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17726l f20544l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8445l f20545l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C15400l f20546l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f20547l;

    public C10069l(C17726l c17726l, C18548l c18548l, C10013l c10013l, C15400l c15400l, C8445l c8445l) {
        this.f20544l = c17726l;
        this.f20543l = c18548l;
        this.f20542l = c10013l;
        this.f20546l = c15400l;
        this.f20545l = c8445l;
        C11879l c11879l = AbstractC18007l.yandex;
        c11879l.getClass();
        this.f20547l = C11879l.loadAd.incrementAndGet(c11879l);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f20546l.yandex) {
        }
        this.f20545l.yandex();
        this.f20544l.loadAd();
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f20547l;
    }

    public final C9426l yandex() {
        C6558l c6558l = null;
        if (this.f20544l.yandex()) {
            C8936l.firebase(this, " after close.", "Cannot call setTorchOn on ");
            return null;
        }
        C10013l c10013l = this.f20542l;
        C6558l c6558l2 = ((C8203l) c10013l.crashlytics.yandex.yandex).yandex;
        List list = C6558l.loadAd;
        if ((c6558l2 == null || c6558l2.yandex != 1) && (c6558l2 == null || c6558l2.yandex != 0)) {
            c6558l = new C6558l(1);
        }
        return C10013l.loadAd(c10013l, c6558l, null, null, new C12468l(2), null, null, null, 118);
    }
}
