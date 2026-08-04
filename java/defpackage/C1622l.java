package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1622l extends AbstractC14971l implements InterfaceC7150l, InterfaceC3703l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Function1 f3956l;

    public C1622l(Function1 function1) {
        this.f3956l = function1;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C2977l(abstractC10113lAdcel, this, 7));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        InterfaceC6347l interfaceC6347l;
        boolean z;
        AbstractC18026l abstractC18026lSmaato = AbstractC5573l.smaato(this, 2);
        if (abstractC18026lSmaato.f35276l) {
            interfaceC6347l = abstractC18026lSmaato.f35286l;
            z = abstractC18026lSmaato.f35290l;
        } else {
            C6148l c6148l = AbstractC7477l.yandex;
            if (c6148l == null) {
                AbstractC7477l.yandex = new C6148l();
            } else {
                c6148l.yandex();
            }
            C6148l c6148l2 = AbstractC7477l.yandex;
            c6148l2.f12941l = abstractC18026lSmaato.f35281l.f7668l;
            c6148l2.f12958l = AbstractC14707l.mopub(abstractC18026lSmaato.f20590l);
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                this.f3956l.invoke(c6148l2);
                Unit unit = Unit.INSTANCE;
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                interfaceC6347l = c6148l2.f12950l;
                z = c6148l2.f12943l;
            } catch (Throwable th) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th;
            }
        }
        if (z) {
            AbstractC3668l.metrica(interfaceC17593l, interfaceC6347l);
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    public final boolean remoteconfig() {
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f3956l + ")";
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
