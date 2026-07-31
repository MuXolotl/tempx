package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٟۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18597l implements InterfaceC2167l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f36326l;

    public C18597l(Boolean bool) {
        this.f36326l = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        return Boolean.valueOf(this.f36326l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18597l) && this.f36326l == ((C18597l) obj).f36326l;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f36326l).hashCode();
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        return new C18597l(Boolean.valueOf(this.f36326l));
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        return Boolean.toString(this.f36326l);
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        return Double.valueOf(true != this.f36326l ? 0.0d : 1.0d);
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f36326l;
        if (zEquals) {
            return new C13997l(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final String toString() {
        return String.valueOf(this.f36326l);
    }
}
