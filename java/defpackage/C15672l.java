package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٕٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15672l extends AbstractC6786l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC6786l f30645l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC6786l f30646l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f30647l;

    public C15672l(AbstractC6786l abstractC6786l, AbstractC6786l abstractC6786l2, boolean z, Function0 function0) {
        super(function0);
        this.f30646l = abstractC6786l;
        this.f30645l = abstractC6786l2;
        this.f30647l = z;
    }

    @Override // defpackage.InterfaceC13012l
    public final boolean Signature() {
        return this.f30646l.Signature();
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: catch */
    public final AbstractC6786l mo1765catch() {
        return this.f30645l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: extends */
    public final AbstractC6786l mo1767extends() {
        return this.f30646l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: for */
    public final AbstractC6786l mo1768for(boolean z) {
        AbstractC6786l abstractC6786lMo1768for = this.f30646l.mo1768for(z);
        AbstractC6786l abstractC6786lMo1768for2 = this.f30645l.mo1768for(z);
        return abstractC6786lMo1768for.equals(abstractC6786lMo1768for2) ? abstractC6786lMo1768for : new C15672l(abstractC6786lMo1768for, abstractC6786lMo1768for2, this.f30647l, null);
    }

    @Override // defpackage.InterfaceC6017l
    public final List getAnnotations() {
        return this.f30646l.getAnnotations();
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: package */
    public final InterfaceC1122l mo1616package() {
        return this.f30646l.mo1616package();
    }

    @Override // defpackage.AbstractC6786l
    public final boolean premium() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: private */
    public final boolean mo1769private() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    public final boolean pro() {
        return false;
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC1388l remoteconfig() {
        return this.f30646l.remoteconfig();
    }

    @Override // defpackage.AbstractC6786l
    public final InterfaceC13012l subs() {
        return null;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: synchronized */
    public final boolean mo1770synchronized() {
        return this.f30647l;
    }

    @Override // defpackage.AbstractC6786l
    /* JADX INFO: renamed from: throw */
    public final AbstractC6786l mo1771throw(boolean z) {
        AbstractC6786l abstractC6786lMo1771throw = this.f30646l.mo1771throw(z);
        AbstractC6786l abstractC6786lMo1771throw2 = this.f30645l.mo1771throw(z);
        return abstractC6786lMo1771throw.equals(abstractC6786lMo1771throw2) ? abstractC6786lMo1771throw : new C15672l(abstractC6786lMo1771throw, abstractC6786lMo1771throw2, this.f30647l, null);
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: throws */
    public final List mo1617throws() {
        return this.f30646l.mo1617throws();
    }
}
