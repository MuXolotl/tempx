package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٍؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1729l extends AbstractC1186l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient int f4129l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1186l f4130l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f4131l;

    public C1729l(AbstractC1186l abstractC1186l, int i, int i2) {
        this.f4130l = abstractC1186l;
        this.f4129l = i;
        this.f4131l = i2;
    }

    @Override // defpackage.AbstractC5511l
    public final int admob() {
        return this.f4130l.firebase() + this.f4129l + this.f4131l;
    }

    @Override // defpackage.AbstractC5511l
    public final int firebase() {
        return this.f4130l.firebase() + this.f4129l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC12442l.smaato(i, this.f4131l);
        return this.f4130l.get(i + this.f4129l);
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    /* JADX INFO: renamed from: inmobi */
    public final AbstractC1186l subList(int i, int i2) {
        AbstractC12442l.adcel(i, i2, this.f4131l);
        int i3 = this.f4129l;
        return this.f4130l.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.AbstractC1186l, defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC5511l
    public final Object[] mopub() {
        return this.f4130l.mopub();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4131l;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return true;
    }

    @Override // defpackage.AbstractC1186l, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
