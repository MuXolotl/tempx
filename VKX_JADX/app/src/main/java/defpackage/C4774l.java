package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٍؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4774l extends AbstractC1186l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient AbstractC1186l f9800l;

    public C4774l(AbstractC1186l abstractC1186l) {
        this.f9800l = abstractC1186l;
    }

    @Override // defpackage.AbstractC1186l
    public final AbstractC1186l applovin() {
        return this.f9800l;
    }

    @Override // defpackage.AbstractC1186l, defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9800l.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1186l abstractC1186l = this.f9800l;
        AbstractC12442l.smaato(i, abstractC1186l.size());
        return abstractC1186l.get((abstractC1186l.size() - 1) - i);
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    public final int indexOf(Object obj) {
        AbstractC1186l abstractC1186l = this.f9800l;
        int iLastIndexOf = abstractC1186l.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC1186l.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    /* JADX INFO: renamed from: inmobi */
    public final AbstractC1186l subList(int i, int i2) {
        AbstractC1186l abstractC1186l = this.f9800l;
        AbstractC12442l.adcel(i, i2, abstractC1186l.size());
        return abstractC1186l.subList(abstractC1186l.size() - i2, abstractC1186l.size() - i).applovin();
    }

    @Override // defpackage.AbstractC1186l, defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC1186l abstractC1186l = this.f9800l;
        int iIndexOf = abstractC1186l.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC1186l.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9800l.size();
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return this.f9800l.smaato();
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
