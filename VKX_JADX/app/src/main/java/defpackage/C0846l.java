package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0846l implements InterfaceC3841l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f2496l = {new C0544l(C0846l.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2278l f2497l;

    public C0846l(C16412l c16412l, Function0 function0) {
        this.f2497l = new C2278l(c16412l, function0);
    }

    @Override // defpackage.InterfaceC3841l
    public boolean isEmpty() {
        InterfaceC13922l interfaceC13922l = f2496l[0];
        return ((List) this.f2497l.invoke()).isEmpty();
    }

    @Override // defpackage.InterfaceC3841l
    public final boolean isPro(C2312l c2312l) {
        return loadAd(c2312l) != null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC13922l interfaceC13922l = f2496l[0];
        return ((List) this.f2497l.invoke()).iterator();
    }

    @Override // defpackage.InterfaceC3841l
    public final InterfaceC1910l loadAd(C2312l c2312l) {
        Object next;
        Iterator it = iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC8576l.yandex(((InterfaceC1910l) next).mopub(), c2312l)) {
                return (InterfaceC1910l) next;
            }
        }
        next = null;
        return (InterfaceC1910l) next;
    }
}
