package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lًؘؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0908l implements InterfaceC0629l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2575l;

    @Override // defpackage.InterfaceC0629l
    public final boolean apply(Object obj) {
        switch (this.f2575l) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            case 1:
                return ((String) obj) != null;
            default:
                return true;
        }
    }
}
