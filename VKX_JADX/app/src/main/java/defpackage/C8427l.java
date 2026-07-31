package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٌۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8427l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Function2 f17435l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public EnumC7283l f17436l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C15389l f17437l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f17438l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        boolean z = true;
        if (!interfaceC7448l.mo992import() || !this.f17438l) {
            C8195l c8195l = (C8195l) this.f17435l.invoke(new C4999l((((long) abstractC10113lAdcel.f20592l) << 32) | (((long) abstractC10113lAdcel.f20591l) & 4294967295L)), new C15519l(j));
            this.f17437l.vip((C18416l) c8195l.f17098l, c8195l.f17097l);
            this.f17438l = true;
        }
        if (!interfaceC7448l.mo992import() && !this.f17438l) {
            z = false;
        }
        this.f17438l = z;
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new Ctransient(interfaceC7448l, this, abstractC10113lAdcel, 17));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f17438l = false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
