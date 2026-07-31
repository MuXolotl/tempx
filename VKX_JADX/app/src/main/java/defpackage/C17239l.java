package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٗٛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17239l implements InterfaceC18636l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1220l f33458l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1220l f33459l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4543l f33460l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C14187l f33461l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C17535l f33462l;

    public C17239l(C4543l c4543l) {
        this.f33460l = c4543l;
        final int i = 0;
        this.f33459l = AbstractC9968l.crashlytics(3, new Function0(this) { // from class: lٜ٘ٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C17239l f35350l;

            {
                this.f35350l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C17239l c17239l = this.f35350l;
                switch (i2) {
                    case 0:
                        C4543l c4543l2 = c17239l.f33460l;
                        InterfaceC14665l interfaceC14665l = c4543l2.f9186l;
                        return new C4102l(c4543l2.f9185l, c17239l);
                    default:
                        return new C16796l(c17239l, c17239l.f33460l.f9187l);
                }
            }
        });
        final int i2 = 1;
        this.f33458l = AbstractC9968l.crashlytics(3, new Function0(this) { // from class: lٜ٘ٙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C17239l f35350l;

            {
                this.f35350l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C17239l c17239l = this.f35350l;
                switch (i3) {
                    case 0:
                        C4543l c4543l2 = c17239l.f33460l;
                        InterfaceC14665l interfaceC14665l = c4543l2.f9186l;
                        return new C4102l(c4543l2.f9185l, c17239l);
                    default:
                        return new C16796l(c17239l, c17239l.f33460l.f9187l);
                }
            }
        });
        InterfaceC9955l interfaceC9955l = c4543l.f9184l;
        this.f33462l = interfaceC9955l.getAttributes();
        this.f33461l = interfaceC9955l.mo1553throw();
        c4543l.getParameters();
        interfaceC9955l.getParameters();
    }

    @Override // defpackage.InterfaceC18636l
    public final InterfaceC17320l adcel() {
        return (C16796l) this.f33458l.getValue();
    }

    @Override // defpackage.InterfaceC18636l
    public final InterfaceC14280l billing() {
        return (C4102l) this.f33459l.getValue();
    }

    @Override // defpackage.InterfaceC18636l
    public final C17535l getAttributes() {
        return this.f33462l;
    }

    @Override // defpackage.InterfaceC18636l
    /* JADX INFO: renamed from: throw */
    public final C14187l mo1553throw() {
        return this.f33461l;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f33460l.f9181l;
    }

    @Override // defpackage.InterfaceC18636l
    /* JADX INFO: renamed from: while */
    public final Object mo1554while(Object obj, C11310l c11310l, AbstractC0283l abstractC0283l) {
        C4543l c4543l = this.f33460l;
        c4543l.getClass();
        Object objMopub = AbstractC15560l.mopub(c4543l, obj, c11310l, abstractC0283l);
        return objMopub == EnumC9342l.f19165l ? objMopub : Unit.INSTANCE;
    }
}
