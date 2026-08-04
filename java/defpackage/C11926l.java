package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘِٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11926l implements InterfaceC2167l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f23779l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC2167l f23780l;

    public C11926l(String str) {
        this.f23780l = InterfaceC2167l.f4805l;
        this.f23779l = str;
    }

    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11926l)) {
            return false;
        }
        C11926l c11926l = (C11926l) obj;
        return this.f23779l.equals(c11926l.f23779l) && this.f23780l.equals(c11926l.f23780l);
    }

    public final int hashCode() {
        return this.f23780l.hashCode() + (this.f23779l.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        return new C11926l(this.f23779l, this.f23780l.metrica());
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C11926l(String str, InterfaceC2167l interfaceC2167l) {
        this.f23780l = interfaceC2167l;
        this.f23779l = str;
    }
}
