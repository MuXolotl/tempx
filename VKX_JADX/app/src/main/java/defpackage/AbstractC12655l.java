package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lّٗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12655l implements InterfaceC11792l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC11792l f24884l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f24885l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final HashSet f24883l = new HashSet();

    public AbstractC12655l(InterfaceC11792l interfaceC11792l) {
        this.f24884l = interfaceC11792l;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f24884l.close();
        synchronized (this.f24885l) {
            hashSet = new HashSet(this.f24883l);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC18108l) it.next()).yandex(this);
        }
    }

    @Override // defpackage.InterfaceC11792l
    /* JADX INFO: renamed from: const */
    public InterfaceC11699l mo1829const() {
        return this.f24884l.mo1829const();
    }

    @Override // defpackage.InterfaceC11792l
    public final int getFormat() {
        return this.f24884l.getFormat();
    }

    @Override // defpackage.InterfaceC11792l
    public InterfaceC18001l[] license() {
        return this.f24884l.license();
    }

    @Override // defpackage.InterfaceC11792l
    public int loadAd() {
        return this.f24884l.loadAd();
    }

    @Override // defpackage.InterfaceC11792l
    public int purchase() {
        return this.f24884l.purchase();
    }

    @Override // defpackage.InterfaceC11792l
    public final Image startapp() {
        return this.f24884l.startapp();
    }

    public final void yandex(InterfaceC18108l interfaceC18108l) {
        synchronized (this.f24885l) {
            this.f24883l.add(interfaceC18108l);
        }
    }
}
