package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؕؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3205l extends AbstractC14782l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final float f6864l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f6865l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float f6866l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float f6867l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f6868l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f6869l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f6870l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f6871l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC9544l f6872l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final float f6873l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f6874l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC9544l f6875l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final float f6876l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final float f6877l;

    public C3205l(String str, List list, int i, AbstractC9544l abstractC9544l, float f, AbstractC9544l abstractC9544l2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f6869l = str;
        this.f6868l = list;
        this.f6865l = i;
        this.f6872l = abstractC9544l;
        this.f6871l = f;
        this.f6875l = abstractC9544l2;
        this.f6866l = f2;
        this.f6867l = f3;
        this.f6874l = i2;
        this.f6870l = i3;
        this.f6876l = f4;
        this.f6873l = f5;
        this.f6864l = f6;
        this.f6877l = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3205l.class != obj.getClass()) {
            return false;
        }
        C3205l c3205l = (C3205l) obj;
        return this.f6869l.equals(c3205l.f6869l) && AbstractC8576l.yandex(this.f6872l, c3205l.f6872l) && this.f6871l == c3205l.f6871l && AbstractC8576l.yandex(this.f6875l, c3205l.f6875l) && this.f6866l == c3205l.f6866l && this.f6867l == c3205l.f6867l && this.f6874l == c3205l.f6874l && this.f6870l == c3205l.f6870l && this.f6876l == c3205l.f6876l && this.f6873l == c3205l.f6873l && this.f6864l == c3205l.f6864l && this.f6877l == c3205l.f6877l && this.f6865l == c3205l.f6865l && AbstractC8576l.yandex(this.f6868l, c3205l.f6868l);
    }

    public final int hashCode() {
        int iAdmob = AbstractC14814l.admob(this.f6869l.hashCode() * 31, 31, this.f6868l);
        AbstractC9544l abstractC9544l = this.f6872l;
        int iMopub = AbstractC9029l.mopub((iAdmob + (abstractC9544l != null ? abstractC9544l.hashCode() : 0)) * 31, this.f6871l, 31);
        AbstractC9544l abstractC9544l2 = this.f6875l;
        return AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub((((AbstractC9029l.mopub(AbstractC9029l.mopub((iMopub + (abstractC9544l2 != null ? abstractC9544l2.hashCode() : 0)) * 31, this.f6866l, 31), this.f6867l, 31) + this.f6874l) * 31) + this.f6870l) * 31, this.f6876l, 31), this.f6873l, 31), this.f6864l, 31), this.f6877l, 31) + this.f6865l;
    }
}
