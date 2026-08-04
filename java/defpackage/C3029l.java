package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: lؔۥٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3029l implements InterfaceC14145l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile boolean f6543l = false;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ConcurrentHashMap f6542l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final LinkedBlockingQueue f6541l = new LinkedBlockingQueue();

    @Override // defpackage.InterfaceC14145l
    public final synchronized InterfaceC6272l isPro(String str) {
        C0903l c0903l;
        c0903l = (C0903l) this.f6542l.get(str);
        if (c0903l == null) {
            c0903l = new C0903l(str, this.f6541l, this.f6543l);
            this.f6542l.put(str, c0903l);
        }
        return c0903l;
    }
}
