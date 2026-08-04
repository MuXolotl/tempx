package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٓٝۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14297l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f27979l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27980l;

    public /* synthetic */ C14297l(int i, Object obj) {
        this.f27980l = i;
        this.f27979l = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f27980l;
        Object obj = this.f27979l;
        switch (i) {
            case 0:
                return new C11521l(1, (Object[]) obj);
            case 1:
                return new C14596l((Iterator) ((Function0) obj).invoke());
            case 2:
                return ((InterfaceC11075l) obj).iterator();
            default:
                return new C11521l((C4955l) obj);
        }
    }
}
