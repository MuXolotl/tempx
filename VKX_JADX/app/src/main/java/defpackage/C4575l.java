package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lؗؐۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4575l extends AbstractC2069l {
    public final /* synthetic */ AbstractCollection firebase;
    public final /* synthetic */ int isPro;

    public /* synthetic */ C4575l(AbstractCollection abstractCollection, int i) {
        this.isPro = i;
        this.firebase = abstractCollection;
    }

    public static /* synthetic */ void firebase(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC2069l
    public final void loadAd(InterfaceC0207l interfaceC0207l, InterfaceC0207l interfaceC0207l2) {
        switch (this.isPro) {
            case 0:
                if (interfaceC0207l2 instanceof AbstractC10175l) {
                    ((AbstractC10175l) interfaceC0207l2).m2897l(C0941l.yandex, interfaceC0207l);
                    return;
                }
                return;
            default:
                if (interfaceC0207l2 != null) {
                    return;
                }
                firebase(2);
                throw null;
        }
    }

    @Override // defpackage.AbstractC2069l
    public final void yandex(InterfaceC0207l interfaceC0207l) {
        int i = this.isPro;
        AbstractCollection abstractCollection = this.firebase;
        switch (i) {
            case 0:
                C14450l.ads(interfaceC0207l, null);
                ((ArrayList) abstractCollection).add(interfaceC0207l);
                return;
            default:
                if (interfaceC0207l == null) {
                    firebase(0);
                    throw null;
                }
                C14450l.ads(interfaceC0207l, null);
                ((LinkedHashSet) abstractCollection).add(interfaceC0207l);
                return;
        }
    }
}
