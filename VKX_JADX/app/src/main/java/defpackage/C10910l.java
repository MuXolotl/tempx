package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lًُۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10910l implements InterfaceC2167l {
    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C10910l;
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        return InterfaceC2167l.f4805l;
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        return "undefined";
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }
}
