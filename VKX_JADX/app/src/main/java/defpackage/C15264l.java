package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔۢۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15264l implements InterfaceC13342l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f29860l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f29861l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f29862l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ EnumC14812l f29863l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C2397l f29864l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ EnumC14812l f29865l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C4910l f29866l;

    public C15264l(EnumC14812l enumC14812l, C10700l c10700l, InterfaceC2262l interfaceC2262l, EnumC14812l enumC14812l2, C2397l c2397l, C4910l c4910l, Function2 function2) {
        this.f29863l = enumC14812l;
        this.f29862l = c10700l;
        this.f29860l = interfaceC2262l;
        this.f29865l = enumC14812l2;
        this.f29864l = c2397l;
        this.f29866l = c4910l;
        this.f29861l = function2;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        EnumC14812l enumC14812l2 = this.f29863l;
        C10700l c10700l = this.f29862l;
        InterfaceC14029l interfaceC14029l = null;
        if (enumC14812l == enumC14812l2) {
            c10700l.f21708l = AbstractC10999l.mopub(this.f29860l, null, 0, new C0384l(this.f29866l, this.f29861l, interfaceC14029l, 29), 3);
            return;
        }
        if (enumC14812l == this.f29865l) {
            InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c10700l.f21708l;
            if (interfaceC7042l != null) {
                interfaceC7042l.ads(null);
            }
            c10700l.f21708l = null;
        }
        if (enumC14812l == EnumC14812l.ON_DESTROY) {
            this.f29864l.subs(Unit.INSTANCE);
        }
    }
}
