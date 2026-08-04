package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lًّۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12465l implements InterfaceC1925l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10584l f24596l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f24597l;

    public AbstractC12465l(C16412l c16412l) {
        this.f24596l = new C10584l(c16412l, new C7646l(1, this), new C6238l(5, this));
    }

    public abstract C1461l amazon();

    public abstract boolean billing(InterfaceC15234l interfaceC15234l);

    public abstract AbstractC18041l crashlytics();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC1925l) && obj.hashCode() == hashCode()) {
            InterfaceC1925l interfaceC1925l = (InterfaceC1925l) obj;
            if (interfaceC1925l.getParameters().size() == getParameters().size()) {
                InterfaceC15234l interfaceC15234lPro = pro();
                InterfaceC15234l interfaceC15234lPro2 = interfaceC1925l.pro();
                if (interfaceC15234lPro2 == null || C8741l.purchase(interfaceC15234lPro) || AbstractC11125l.remoteconfig(interfaceC15234lPro) || C8741l.purchase(interfaceC15234lPro2) || AbstractC11125l.remoteconfig(interfaceC15234lPro2)) {
                    return false;
                }
                return billing(interfaceC15234lPro2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24597l;
        if (i != 0) {
            return i;
        }
        InterfaceC15234l interfaceC15234lPro = pro();
        int iIdentityHashCode = (C8741l.purchase(interfaceC15234lPro) || AbstractC11125l.remoteconfig(interfaceC15234lPro)) ? System.identityHashCode(this) : AbstractC11125l.billing(interfaceC15234lPro).yandex.hashCode();
        this.f24597l = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public abstract Collection loadAd();

    @Override // defpackage.InterfaceC1925l
    /* JADX INFO: renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public final List yandex() {
        return ((C5968l) this.f24596l.invoke()).loadAd;
    }

    public List mopub(List list) {
        return list;
    }
}
