package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lٟؗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5230l extends AbstractC2069l {
    public final /* synthetic */ LinkedHashSet firebase;
    public final /* synthetic */ InterfaceC9407l isPro;
    public final /* synthetic */ boolean smaato;

    public C5230l(InterfaceC9407l interfaceC9407l, LinkedHashSet linkedHashSet, boolean z) {
        this.isPro = interfaceC9407l;
        this.firebase = linkedHashSet;
        this.smaato = z;
    }

    public static /* synthetic */ void firebase(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC2069l
    public final void isPro(InterfaceC0207l interfaceC0207l, Collection collection) {
        if (interfaceC0207l == null) {
            firebase(3);
            throw null;
        }
        if (!this.smaato || interfaceC0207l.mo367while() == 2) {
            interfaceC0207l.mo365l(collection);
        }
    }

    @Override // defpackage.AbstractC2069l
    public final void loadAd(InterfaceC0207l interfaceC0207l, InterfaceC0207l interfaceC0207l2) {
        if (interfaceC0207l2 != null) {
            return;
        }
        firebase(2);
        throw null;
    }

    @Override // defpackage.AbstractC2069l
    public final void yandex(InterfaceC0207l interfaceC0207l) {
        if (interfaceC0207l == null) {
            firebase(0);
            throw null;
        }
        C14450l.ads(interfaceC0207l, new C6238l(13, this));
        this.firebase.add(interfaceC0207l);
    }
}
