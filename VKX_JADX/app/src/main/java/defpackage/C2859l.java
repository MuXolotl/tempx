package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lؔۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2859l implements InterfaceC11483l, Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f6218l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f6219l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6220l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public HashMap f6222l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f6223l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f6224l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C16977l f6227l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int[] f6221l = new int[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object[] f6217l = new Object[0];

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f6226l = new Object();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public ArrayList f6225l = new ArrayList();

    public final C13006l admob() {
        if (this.f6218l) {
            AbstractC2032l.yandex("Cannot start a writer when another writer is pending");
        }
        if (this.f6223l > 0) {
            AbstractC2032l.yandex("Cannot start a writer when a reader is pending");
        }
        this.f6218l = true;
        this.f6219l++;
        return new C13006l(this);
    }

    public final int amazon(C12317l c12317l) {
        if (this.f6218l) {
            AbstractC2032l.yandex("Use active SlotWriter to determine anchor location instead");
        }
        if (!c12317l.yandex()) {
            AbstractC5363l.yandex("Anchor refers to a group that was removed");
        }
        return c12317l.yandex;
    }

    public final void billing() {
        this.f6222l = new HashMap();
    }

    public final boolean firebase(C12317l c12317l) {
        int iPurchase;
        return c12317l.yandex() && (iPurchase = AbstractC0736l.purchase(this.f6225l, c12317l.yandex, this.f6220l)) >= 0 && AbstractC8576l.yandex(this.f6225l.get(iPurchase), c12317l);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6494l(this, 0, this.f6220l);
    }

    public final C5296l mopub() {
        if (this.f6218l) {
            C8339l.smaato("Cannot read while a writer is pending");
            return null;
        }
        this.f6223l++;
        return new C5296l(this);
    }

    public final AbstractC2155l smaato(int i) {
        int i2;
        ArrayList arrayList;
        int iPurchase;
        HashMap map = this.f6222l;
        if (map != null) {
            if (this.f6218l) {
                AbstractC2032l.yandex("use active SlotWriter to crate an anchor for location instead");
            }
            C12317l c12317l = (i < 0 || i >= (i2 = this.f6220l) || (iPurchase = AbstractC0736l.purchase((arrayList = this.f6225l), i, i2)) < 0) ? null : (C12317l) arrayList.get(iPurchase);
            if (c12317l != null) {
                return (AbstractC2155l) map.get(c12317l);
            }
        }
        return null;
    }
}
