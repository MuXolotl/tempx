package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lًٝۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8153l extends AbstractC4901l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f17034l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final ArrayList f17035l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C2868l f17036l;

    public C8153l(C16412l c16412l, InterfaceC4920l interfaceC4920l, C3498l c3498l, boolean z, int i) {
        super(c16412l, interfaceC4920l, c3498l, InterfaceC5706l.f12087l);
        this.f17034l = z;
        C8934l c8934lAdcel = AbstractC8576l.adcel(0, i);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934lAdcel, 10));
        Iterator it = c8934lAdcel.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                this.f17035l = arrayList;
                List listLoadAd = AbstractC17653l.loadAd(this);
                int i2 = AbstractC3759l.yandex;
                this.f17036l = new C2868l(this, listLoadAd, Collections.singleton(AbstractC11125l.crashlytics(this).subs().purchase()), c16412l);
                return;
            }
            int iNextInt = c16991l.nextInt();
            arrayList.add(C16687l.m4192l(this, 1, C3498l.purchase("T" + iNextInt), iNextInt, c16412l));
        }
    }

    @Override // defpackage.InterfaceC17477l
    public final Collection adcel() {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        return AbstractC6004l.purchase;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: final */
    public final C5786l mo751final() {
        return null;
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return C2782l.f6058l;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        return this.f17035l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo752l() {
        return 1;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘِٞ */
    public final AbstractC5645l mo753l() {
        return null;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lْٗٔ */
    public final boolean mo755l() {
        return false;
    }

    @Override // defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        return this.f17036l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new */
    public final /* bridge */ /* synthetic */ InterfaceC7637l mo756new() {
        return C3198l.loadAd;
    }

    @Override // defpackage.AbstractC11832l
    public final /* bridge */ /* synthetic */ InterfaceC7637l pro(C14945l c14945l) {
        return C3198l.loadAd;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        return 1;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        return this.f17034l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: throws */
    public final boolean mo757throws() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // defpackage.AbstractC4901l, defpackage.InterfaceC5436l
    public final boolean vip() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo758volatile() {
        return false;
    }
}
