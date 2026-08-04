package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15537l implements InterfaceC2167l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f30347l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f30348l;

    public C15537l(String str, ArrayList arrayList) {
        this.f30348l = str;
        ArrayList arrayList2 = new ArrayList();
        this.f30347l = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15537l)) {
            return false;
        }
        C15537l c15537l = (C15537l) obj;
        String str = c15537l.f30348l;
        String str2 = this.f30348l;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f30347l.equals(c15537l.f30347l);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30348l;
        return this.f30347l.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        return this;
    }
}
