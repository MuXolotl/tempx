package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘۘۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5921l implements Closeable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C14025l f12464l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C12382l f12465l;

    static {
        C12382l c12382l;
        try {
            Class.forName("java.nio.file.Files");
            c12382l = new C18513l();
        } catch (ClassNotFoundException unused) {
            c12382l = new C12382l();
        }
        f12465l = c12382l;
        String str = C14025l.f27330l;
        f12464l = C6162l.adcel(System.getProperty("java.io.tmpdir"), false);
        new C18131l(C18131l.class.getClassLoader());
    }

    public abstract void adcel(C14025l c14025l, boolean z);

    public final void ads(C14025l c14025l) {
        C11129l c11129lPurchase = AbstractC6900l.purchase(new amazon(this, c14025l, null, 0));
        while (c11129lPurchase.hasNext()) {
            adcel((C14025l) c11129lPurchase.next(), false);
        }
    }

    public abstract void billing(C14025l c14025l, C14025l c14025l2);

    /* JADX INFO: renamed from: continue */
    public abstract InterfaceC10506l mo691continue(C14025l c14025l, boolean z);

    /* JADX INFO: renamed from: default */
    public abstract InterfaceC14991l mo692default(C14025l c14025l);

    public abstract List inmobi(C14025l c14025l);

    public final boolean isVip(C14025l c14025l) {
        return mo694private(c14025l) != null;
    }

    public final void mopub(C14025l c14025l) {
        C11315l c11315l = new C11315l();
        while (c14025l != null && !isVip(c14025l)) {
            c11315l.addFirst(c14025l);
            c14025l = c14025l.crashlytics();
        }
        Iterator<E> it = c11315l.iterator();
        while (it.hasNext()) {
            vip((C14025l) it.next());
        }
    }

    /* JADX INFO: renamed from: package */
    public InterfaceC11075l mo693package(C14025l c14025l) {
        return new C17798l(4, new purchase(c14025l, this, null));
    }

    /* JADX INFO: renamed from: private */
    public abstract C18402l mo694private(C14025l c14025l);

    public abstract List signatures(C14025l c14025l);

    /* JADX INFO: renamed from: switch */
    public abstract C13007l mo695switch(C14025l c14025l);

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C18402l m1876synchronized(C14025l c14025l) {
        C18402l c18402lMo694private = mo694private(c14025l);
        if (c18402lMo694private != null) {
            return c18402lMo694private;
        }
        C8876l.billing(c14025l, "no such file: ");
        return null;
    }

    /* JADX INFO: renamed from: throw */
    public abstract C13007l mo696throw(C14025l c14025l);

    public abstract void vip(C14025l c14025l);

    public abstract InterfaceC10506l yandex(C14025l c14025l);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
