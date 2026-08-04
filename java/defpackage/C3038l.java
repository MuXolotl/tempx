package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lؔۥۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3038l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f6550l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Iterator f6551l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3549l f6552l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f6553l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f6554l;

    public C3038l(C3549l c3549l, Iterator it) {
        this.f6552l = c3549l;
        this.f6551l = it;
        this.f6553l = ((C17230l) AbstractC9620l.admob(c3549l.f7456l)).amazon;
        this.f6550l = this.f6554l;
        this.f6554l = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6554l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (((C17230l) AbstractC9620l.admob(this.f6552l.f7456l)).amazon != this.f6553l) {
            C8339l.mopub();
            return null;
        }
        this.f6550l = this.f6554l;
        Iterator it = this.f6551l;
        this.f6554l = it.hasNext() ? it.next() : null;
        Object obj = this.f6550l;
        if (obj != null) {
            return obj;
        }
        C18073l.admob();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3549l c3549l = this.f6552l;
        if (((C17230l) AbstractC9620l.admob(c3549l.f7456l)).amazon != this.f6553l) {
            C8339l.mopub();
            return;
        }
        Object obj = this.f6550l;
        if (obj == null) {
            C18073l.admob();
            return;
        }
        c3549l.remove(obj);
        this.f6550l = null;
        Unit unit = Unit.INSTANCE;
        this.f6553l = ((C17230l) AbstractC9620l.admob(c3549l.f7456l)).amazon;
    }
}
