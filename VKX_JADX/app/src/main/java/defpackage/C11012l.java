package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11012l extends AbstractC10170l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AbstractC1514l f22186l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f22187l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C15822l f22188l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C16412l f22189l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8031l f22190l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC9921l f22191l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final List f22192l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C3624l f22185l = new C3624l(AbstractC3974l.firebase, C3498l.purchase("Function"));

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C3624l f22184l = new C3624l(AbstractC3974l.subs, C3498l.purchase("KFunction"));

    public C11012l(C16412l c16412l, C8913l c8913l, AbstractC1514l abstractC1514l, int i) {
        super(c16412l, abstractC1514l.yandex(i));
        this.f22189l = c16412l;
        this.f22191l = c8913l;
        this.f22186l = abstractC1514l;
        this.f22187l = i;
        this.f22190l = new C8031l(this);
        this.f22188l = new C15822l(c16412l, this, 0);
        ArrayList arrayList = new ArrayList();
        C8934l c8934l = new C8934l(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(c8934l, 10));
        Iterator it = c8934l.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                break;
            }
            arrayList.add(C16687l.m4192l(this, 2, C3498l.purchase("P" + c16991l.nextInt()), arrayList.size(), this.f22189l));
            arrayList2.add(Unit.INSTANCE);
        }
        arrayList.add(C16687l.m4192l(this, 3, C3498l.purchase("R"), arrayList.size(), this.f22189l));
        this.f22192l = AbstractC16901l.m4213const(arrayList);
        AbstractC1514l abstractC1514l2 = this.f22186l;
        if (abstractC1514l2.equals(C1015l.amazon) || abstractC1514l2.equals(C9392l.amazon) || abstractC1514l2.equals(C0097l.amazon)) {
            return;
        }
        abstractC1514l2.equals(C4988l.amazon);
    }

    @Override // defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        return this.f22191l;
    }

    @Override // defpackage.InterfaceC17477l
    public final /* bridge */ /* synthetic */ Collection adcel() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        return AbstractC6004l.purchase;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.InterfaceC10233l
    public final InterfaceC5706l billing() {
        return InterfaceC5706l.f12087l;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: final */
    public final /* bridge */ /* synthetic */ C5786l mo751final() {
        return null;
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return C2782l.f6058l;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        return this.f22192l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo752l() {
        return 2;
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
        return this.f22190l;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new */
    public final /* bridge */ /* synthetic */ InterfaceC7637l mo756new() {
        return C3198l.loadAd;
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l pro(C14945l c14945l) {
        return this.f22188l;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        return 4;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: throws */
    public final boolean mo757throws() {
        return false;
    }

    public final String toString() {
        return getName().loadAd();
    }

    @Override // defpackage.InterfaceC5436l
    public final boolean vip() {
        return false;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo758volatile() {
        return false;
    }
}
