package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔۛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15165l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f29756l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f29757l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29758l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f29759l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f29760l;

    public AbstractC15165l(C6756l c6756l, byte b) {
        this.f29759l = c6756l;
        this.f29757l = c6756l.f14166l;
        this.f29756l = c6756l.isEmpty() ? -1 : 0;
        this.f29760l = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f29758l) {
            case 0:
                return this.f29756l >= 0;
            default:
                return this.f29756l >= 0;
        }
    }

    public abstract Object loadAd(int i);

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f29758l;
        AbstractMap abstractMap = this.f29759l;
        Object objYandex = null;
        switch (i) {
            case 0:
                C6756l c6756l = (C6756l) abstractMap;
                if (c6756l.f14166l != this.f29757l) {
                    C8339l.mopub();
                } else if (!hasNext()) {
                    C4875l.firebase();
                } else {
                    int i2 = this.f29756l;
                    this.f29760l = i2;
                    objYandex = yandex(i2);
                    int i3 = this.f29756l + 1;
                    this.f29756l = i3 < c6756l.f14158l ? i3 : -1;
                }
                break;
            default:
                C6756l c6756l2 = (C6756l) abstractMap;
                if (c6756l2.f14166l != this.f29757l) {
                    C8339l.mopub();
                } else if (!hasNext()) {
                    C4875l.firebase();
                } else {
                    int i4 = this.f29756l;
                    this.f29760l = i4;
                    objYandex = loadAd(i4);
                    int i5 = this.f29756l + 1;
                    this.f29756l = i5 < c6756l2.f14158l ? i5 : -1;
                }
                break;
        }
        return objYandex;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f29758l;
        AbstractMap abstractMap = this.f29759l;
        switch (i) {
            case 0:
                C6756l c6756l = (C6756l) abstractMap;
                if (c6756l.f14166l != this.f29757l) {
                    C8339l.mopub();
                } else {
                    AbstractC12442l.ads("no calls to next() since the last call to remove()", this.f29760l >= 0);
                    this.f29757l += 32;
                    c6756l.remove(c6756l.isPro()[this.f29760l]);
                    this.f29756l--;
                    this.f29760l = -1;
                }
                break;
            default:
                C6756l c6756l2 = (C6756l) abstractMap;
                int i2 = c6756l2.f14166l;
                int i3 = this.f29757l;
                if (i2 != i3) {
                    C8339l.mopub();
                } else {
                    int i4 = this.f29760l;
                    if (!(i4 >= 0)) {
                        C8339l.smaato("no calls to next() since the last call to remove()");
                    } else {
                        this.f29757l = i3 + 32;
                        c6756l2.remove(c6756l2.vip()[i4]);
                        this.f29756l--;
                        this.f29760l = -1;
                    }
                }
                break;
        }
    }

    public abstract Object yandex(int i);

    public AbstractC15165l(C6756l c6756l) {
        this.f29759l = c6756l;
        this.f29757l = c6756l.f14166l;
        this.f29756l = c6756l.isEmpty() ? -1 : 0;
        this.f29760l = -1;
    }
}
