package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؘّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10113l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f20591l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f20592l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f20590l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f20594l = AbstractC7357l.yandex;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f20593l = 0;

    public /* synthetic */ Object Signature() {
        return null;
    }

    /* JADX INFO: renamed from: catch */
    public int mo1458catch() {
        return (int) (this.f20590l & 4294967295L);
    }

    /* JADX INFO: renamed from: class */
    public void mo1459class(long j, float f, C11925l c11925l) {
        mo883interface(j, f, null);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m2886continue() {
        this.f20592l = AbstractC8576l.purchase((int) (this.f20590l >> 32), C15519l.isPro(this.f20594l), C15519l.admob(this.f20594l));
        int iPurchase = AbstractC8576l.purchase((int) (this.f20590l & 4294967295L), C15519l.subs(this.f20594l), C15519l.mopub(this.f20594l));
        this.f20591l = iPurchase;
        int i = this.f20592l;
        long j = this.f20590l;
        this.f20593l = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iPurchase - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m2887default(long j) {
        if (C4999l.loadAd(this.f20590l, j)) {
            return;
        }
        this.f20590l = j;
        m2886continue();
    }

    /* JADX INFO: renamed from: interface */
    public abstract void mo883interface(long j, float f, Function1 function1);

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m2888new(long j) {
        if (C15519l.loadAd(this.f20594l, j)) {
            return;
        }
        this.f20594l = j;
        m2886continue();
    }

    /* JADX INFO: renamed from: switch */
    public int mo1466switch() {
        return (int) (this.f20590l >> 32);
    }

    /* JADX INFO: renamed from: throw */
    public abstract int mo884throw(AbstractC12914l abstractC12914l);
}
