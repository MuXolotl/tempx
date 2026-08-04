package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13267l extends AbstractC6786l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f26046l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f26047l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f26048l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1122l f26049l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final InterfaceC1388l f26050l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final List f26051l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f26052l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f26053l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC13012l f26054l;

    public C13267l(InterfaceC1122l interfaceC1122l, List list, boolean z, List list2, InterfaceC13012l interfaceC13012l, boolean z2, boolean z3, boolean z4, InterfaceC1388l interfaceC1388l, Function0 function0) {
        super(function0);
        this.f26049l = interfaceC1122l;
        this.f26046l = list;
        this.f26052l = z;
        this.f26051l = list2;
        this.f26054l = interfaceC13012l;
        this.f26047l = z2;
        this.f26048l = z3;
        this.f26053l = z4;
        this.f26050l = interfaceC1388l;
    }

    @Override // defpackage.InterfaceC13012l
    public final boolean Signature() {
        return this.f26052l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: catch */
    public final AbstractC6786l mo1765catch() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: extends */
    public final AbstractC6786l mo1767extends() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: for */
    public final AbstractC6786l mo1768for(boolean z) {
        return new C13267l(this.f26049l, this.f26046l, this.f26052l && !z, this.f26051l, this.f26054l, z, this.f26048l, this.f26053l, this.f26050l, null);
    }

    @Override // defpackage.InterfaceC6017l
    public final List getAnnotations() {
        return this.f26051l;
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: package */
    public final InterfaceC1122l mo1616package() {
        return this.f26049l;
    }

    @Override // defpackage.AbstractC6786l
    public final boolean premium() {
        return this.f26048l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: private */
    public final boolean mo1769private() {
        return this.f26053l;
    }

    @Override // defpackage.AbstractC6786l
    public final boolean pro() {
        return this.f26047l;
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC1388l remoteconfig() {
        return this.f26050l;
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC13012l subs() {
        return this.f26054l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: synchronized */
    public final boolean mo1770synchronized() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: throw */
    public final AbstractC6786l mo1771throw(boolean z) {
        InterfaceC1388l interfaceC1388l;
        InterfaceC1388l interfaceC1388lLoadAd;
        InterfaceC1122l interfaceC1122l = this.f26049l;
        boolean z2 = interfaceC1122l instanceof InterfaceC1388l;
        InterfaceC1122l interfaceC1122lLoadAd = interfaceC1122l;
        if (z2) {
            interfaceC1388l = (InterfaceC1388l) interfaceC1122l;
            if (z) {
                interfaceC1122lLoadAd = AbstractC18202l.yandex.loadAd(AbstractC16131l.mopub(interfaceC1388l));
            } else {
                Class clsAdmob = AbstractC16131l.admob(interfaceC1388l);
                if (clsAdmob != null && (interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(clsAdmob)) != null) {
                    interfaceC1122lLoadAd = interfaceC1388l;
                    interfaceC1122lLoadAd = interfaceC1388l;
                    interfaceC1122lLoadAd = interfaceC1388lLoadAd;
                }
            }
        }
        interfaceC1122lLoadAd = interfaceC1388l;
        interfaceC1122lLoadAd = interfaceC1388l;
        interfaceC1122lLoadAd = interfaceC1388l;
        return new C13267l(interfaceC1122lLoadAd, this.f26046l, z, this.f26051l, this.f26054l, false, this.f26048l, this.f26053l, this.f26050l, null);
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: throws */
    public final List mo1617throws() {
        return this.f26046l;
    }
}
