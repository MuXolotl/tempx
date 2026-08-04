package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4623l extends AbstractC14782l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final float f9387l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float f9388l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float f9389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f9390l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f9391l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final List f9392l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final float f9393l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f9394l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final List f9395l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float f9396l;

    public C4623l(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.f9391l = str;
        this.f9390l = f;
        this.f9387l = f2;
        this.f9394l = f3;
        this.f9393l = f4;
        this.f9396l = f5;
        this.f9388l = f6;
        this.f9389l = f7;
        this.f9395l = list;
        this.f9392l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C4623l)) {
            C4623l c4623l = (C4623l) obj;
            return AbstractC8576l.yandex(this.f9391l, c4623l.f9391l) && this.f9390l == c4623l.f9390l && this.f9387l == c4623l.f9387l && this.f9394l == c4623l.f9394l && this.f9393l == c4623l.f9393l && this.f9396l == c4623l.f9396l && this.f9388l == c4623l.f9388l && this.f9389l == c4623l.f9389l && AbstractC8576l.yandex(this.f9395l, c4623l.f9395l) && AbstractC8576l.yandex(this.f9392l, c4623l.f9392l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9392l.hashCode() + AbstractC14814l.admob(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(this.f9391l.hashCode() * 31, this.f9390l, 31), this.f9387l, 31), this.f9394l, 31), this.f9393l, 31), this.f9396l, 31), this.f9388l, 31), this.f9389l, 31), 31, this.f9395l);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4720l(this);
    }
}
