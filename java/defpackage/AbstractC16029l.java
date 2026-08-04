package defpackage;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: renamed from: lؙٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16029l extends AbstractC8481l implements NavigableSet, SortedSet, Iterable {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ int f31418l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public transient AbstractC16029l f31419l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient Comparator f31420l;

    public AbstractC16029l(Comparator comparator) {
        this.f31420l = comparator;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f31420l;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        AbstractC16029l c13949l = this.f31419l;
        if (c13949l == null) {
            C13949l c13949l2 = (C13949l) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(c13949l2.f31420l);
            if (c13949l2.isEmpty()) {
                c13949l = C0058l.f957l != comparatorReverseOrder ? new C13949l(C13708l.f26763l, comparatorReverseOrder) : C13949l.f27246l;
            } else {
                c13949l = new C13949l(c13949l2.f27247l.applovin(), comparatorReverseOrder);
            }
            this.f31419l = c13949l;
            c13949l.f31419l = this;
        }
        return c13949l;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        C13949l c13949l = (C13949l) this;
        return c13949l.ad(0, c13949l.advert(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: pro, reason: merged with bridge method [inline-methods] */
    public final C13949l subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        AbstractC12442l.admob(this.f31420l.compare(obj, obj2) <= 0);
        C13949l c13949l = (C13949l) this;
        C13949l c13949lAd = c13949l.ad(c13949l.isVip(obj, z), c13949l.f27247l.size());
        return c13949lAd.ad(0, c13949lAd.advert(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        C13949l c13949l = (C13949l) this;
        return c13949l.ad(c13949l.isVip(obj, true), c13949l.f27247l.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        C13949l c13949l = (C13949l) this;
        return c13949l.ad(0, c13949l.advert(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        C13949l c13949l = (C13949l) this;
        return c13949l.ad(c13949l.isVip(obj, z), c13949l.f27247l.size());
    }
}
