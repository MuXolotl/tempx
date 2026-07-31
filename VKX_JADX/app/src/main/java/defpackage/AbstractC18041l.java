package defpackage;

import java.util.List;

/* JADX INFO: renamed from: l٘ٛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18041l implements InterfaceC2853l, InterfaceC13789l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f35335l;

    /* JADX INFO: renamed from: class */
    public abstract AbstractC14318l mo3847class();

    /* JADX INFO: renamed from: else */
    public abstract AbstractC18041l mo1else(C14945l c14945l);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC18041l)) {
            return false;
        }
        AbstractC18041l abstractC18041l = (AbstractC18041l) obj;
        if (mo1342throw() == abstractC18041l.mo1342throw()) {
            return AbstractC7209l.firebase(C13772l.f26883l, mo3847class(), abstractC18041l.mo3847class());
        }
        return false;
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        InterfaceC3841l interfaceC3841l;
        C16017l c16017lMo1340package = mo1340package();
        C14513l c14513l = AbstractC3791l.loadAd;
        InterfaceC13922l interfaceC13922l = AbstractC3791l.yandex[0];
        C7687l c7687l = (C7687l) c14513l.advert(c16017lMo1340package);
        return (c7687l == null || (interfaceC3841l = c7687l.yandex) == null) ? C2782l.f6058l : interfaceC3841l;
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f35335l;
        if (i != 0) {
            return i;
        }
        if (AbstractC11748l.subs(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo1342throw() ? 1 : 0) + ((inmobi().hashCode() + (mo1339native().hashCode() * 31)) * 31);
        }
        this.f35335l = iHashCode;
        return iHashCode;
    }

    public abstract List inmobi();

    /* JADX INFO: renamed from: native */
    public abstract InterfaceC1925l mo1339native();

    /* JADX INFO: renamed from: package */
    public abstract C16017l mo1340package();

    /* JADX INFO: renamed from: public */
    public abstract InterfaceC7637l mo1341public();

    /* JADX INFO: renamed from: throw */
    public abstract boolean mo1342throw();
}
