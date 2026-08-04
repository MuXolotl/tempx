package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍۧ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9973l implements InterfaceC10376l {
    public final C11916l loadAd;
    public final InterfaceC10376l yandex;

    public C9973l(InterfaceC10376l interfaceC10376l, C11916l c11916l) {
        this.yandex = interfaceC10376l;
        this.loadAd = c11916l;
    }

    @Override // defpackage.InterfaceC10376l
    public final int Signature() {
        return this.yandex.Signature();
    }

    @Override // defpackage.InterfaceC10376l
    public final Object ad() {
        return this.yandex.ad();
    }

    @Override // defpackage.InterfaceC10376l
    public final int adcel(int i) {
        return this.yandex.adcel(i);
    }

    @Override // defpackage.InterfaceC10376l
    public final void admob() {
        this.yandex.admob();
    }

    @Override // defpackage.InterfaceC10376l
    public final int ads(long j, List list) {
        return this.yandex.ads(j, list);
    }

    @Override // defpackage.InterfaceC10376l
    public final void advert() {
        this.yandex.advert();
    }

    public final boolean equals(Object obj) {
        if (yandex(obj) && (obj instanceof C9973l)) {
            return this.loadAd.equals(((C9973l) obj).loadAd);
        }
        return false;
    }

    @Override // defpackage.InterfaceC10376l
    public final C11916l firebase() {
        return this.loadAd;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC10376l
    public final void isPro(long j, long j2, long j3, List list, InterfaceC7405l[] interfaceC7405lArr) {
        this.yandex.isPro(j, j2, j3, list, interfaceC7405lArr);
    }

    @Override // defpackage.InterfaceC10376l
    public final void isVip() {
        this.yandex.isVip();
    }

    @Override // defpackage.InterfaceC10376l
    public final int length() {
        return this.yandex.length();
    }

    @Override // defpackage.InterfaceC10376l
    public final boolean license(int i, long j) {
        return this.yandex.license(i, j);
    }

    @Override // defpackage.InterfaceC10376l
    public final C5978l metrica(int i) {
        return this.loadAd.amazon[this.yandex.adcel(i)];
    }

    @Override // defpackage.InterfaceC10376l
    public final void pro(float f) {
        this.yandex.pro(f);
    }

    @Override // defpackage.InterfaceC10376l
    public final boolean remoteconfig(long j, AbstractC7995l abstractC7995l, List list) {
        return this.yandex.remoteconfig(j, abstractC7995l, list);
    }

    @Override // defpackage.InterfaceC10376l
    public final int signatures(int i) {
        return this.yandex.signatures(i);
    }

    @Override // defpackage.InterfaceC10376l
    public final int smaato() {
        return this.yandex.smaato();
    }

    @Override // defpackage.InterfaceC10376l
    public final void startapp() {
        this.yandex.startapp();
    }

    @Override // defpackage.InterfaceC10376l
    public final boolean subs(int i, long j) {
        return this.yandex.subs(i, j);
    }

    @Override // defpackage.InterfaceC10376l
    public final int subscription() {
        return this.yandex.subscription();
    }

    @Override // defpackage.InterfaceC10376l
    public final C5978l tapsense() {
        return this.loadAd.amazon[this.yandex.subscription()];
    }

    @Override // defpackage.InterfaceC10376l
    public final void vip(boolean z) {
        this.yandex.vip(z);
    }

    public final boolean yandex(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9973l) {
            return this.yandex.equals(((C9973l) obj).yandex);
        }
        return false;
    }
}
