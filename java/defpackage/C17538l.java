package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lٗۥ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C17538l extends AbstractC9792l implements InterfaceC12657l, InterfaceC11764l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f34146l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f34147l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f34148l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C17538l f34149l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f34150l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final AbstractC18041l f34151l;

    public C17538l(InterfaceC11661l interfaceC11661l, C17538l c17538l, int i, InterfaceC3841l interfaceC3841l, C3498l c3498l, AbstractC18041l abstractC18041l, boolean z, boolean z2, boolean z3, AbstractC18041l abstractC18041l2, InterfaceC5706l interfaceC5706l) {
        super(interfaceC11661l, interfaceC3841l, c3498l, abstractC18041l, interfaceC5706l);
        this.f34146l = i;
        this.f34147l = z;
        this.f34150l = z2;
        this.f34148l = z3;
        this.f34151l = abstractC18041l2;
        this.f34149l = c17538l == null ? this : c17538l;
    }

    @Override // defpackage.AbstractC1281l, defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        return (InterfaceC11661l) super.Signature();
    }

    @Override // defpackage.InterfaceC10389l
    public final C6561l admob() {
        return AbstractC6004l.billing;
    }

    @Override // defpackage.InterfaceC11764l
    /* JADX INFO: renamed from: const */
    public final boolean mo3250const() {
        return false;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.crashlytics(this, obj);
    }

    @Override // defpackage.InterfaceC10900l
    public final InterfaceC10233l isPro(C2201l c2201l) {
        if (c2201l.yandex.purchase()) {
            return this;
        }
        C3010l.mopub();
        return null;
    }

    @Override // defpackage.InterfaceC11661l
    public final Collection license() {
        Collection collectionLicense = ((InterfaceC11661l) super.Signature()).license();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collectionLicense, 10));
        Iterator it = collectionLicense.iterator();
        while (it.hasNext()) {
            arrayList.add((C17538l) ((InterfaceC11661l) it.next()).mo1007finally().get(this.f34146l));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final InterfaceC11661l m4402l() {
        return (InterfaceC11661l) super.Signature();
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final boolean m4403l() {
        return this.f34147l && ((InterfaceC0207l) ((InterfaceC11661l) super.Signature())).mo367while() != 2;
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C17538l mo864l() {
        C17538l c17538l = this.f34149l;
        return c17538l == this ? this : c17538l.mo864l();
    }

    /* JADX INFO: renamed from: lَؙ۠ */
    public C17538l mo645l(C1024l c1024l, C3498l c3498l, int i) {
        return new C17538l(c1024l, null, i, getAnnotations(), c3498l, yandex(), m4403l(), this.f34150l, this.f34148l, this.f34151l, InterfaceC5706l.f12087l);
    }

    @Override // defpackage.InterfaceC11764l
    /* JADX INFO: renamed from: super */
    public final /* bridge */ /* synthetic */ AbstractC0757l mo3252super() {
        return null;
    }
}
