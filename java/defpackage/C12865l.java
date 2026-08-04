package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lّۛۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12865l extends AbstractC5534l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C17586l f25313l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C7644l f25314l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C0846l f25315l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C12865l(C7644l c7644l, C17586l c17586l, int i) {
        int i2;
        C16412l c16412l = (C16412l) ((C0511l) c7644l.f15738l).yandex;
        InterfaceC8371l interfaceC8371l = (InterfaceC8371l) c7644l.f15734l;
        C3199l c3199l = C2782l.f6058l;
        C3498l c3498lFirebase = AbstractC18719l.firebase((InterfaceC3588l) c7644l.f15737l, c17586l.f34242l);
        int iOrdinal = c17586l.f34238l.ordinal();
        int i3 = 2;
        if (iOrdinal != 0) {
            i2 = 1;
            if (iOrdinal == 1) {
                i3 = 3;
                i2 = i3;
            } else if (iOrdinal != 2) {
                C18725l.billing();
                throw null;
            }
        } else {
            i2 = i3;
        }
        super(c16412l, interfaceC8371l, c3199l, c3498lFirebase, i2, c17586l.f34246l, i, C1461l.f3652l);
        this.f25314l = c7644l;
        this.f25313l = c17586l;
        this.f25315l = new C0846l(c16412l, new C7646l(18, this));
    }

    @Override // defpackage.Cgoto, defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return this.f25315l;
    }

    @Override // defpackage.AbstractC15719l
    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final List mo3513l() {
        C7644l c7644l = this.f25314l;
        List listRemoteconfig = AbstractC7310l.remoteconfig(this.f25313l, (C14965l) c7644l.f15740l);
        if (listRemoteconfig.isEmpty()) {
            return Collections.singletonList(AbstractC3759l.purchase(this).metrica());
        }
        C15615l c15615l = (C15615l) c7644l.f15736l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listRemoteconfig, 10));
        Iterator it = listRemoteconfig.iterator();
        while (it.hasNext()) {
            arrayList.add(c15615l.premium((C18128l) it.next()));
        }
        return arrayList;
    }
}
