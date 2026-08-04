package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/* JADX INFO: renamed from: lؚۖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7449l extends AbstractC17054l {
    @Override // defpackage.InterfaceC15177l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final C2434l mo1235l() throws C2584l, C10756l, EOFException {
        C1298l c1298l = (C1298l) this.f33215l;
        if (!((Scanner) c1298l.f3346l).hasNext()) {
            C8339l.vip();
            return null;
        }
        new ArrayList();
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                boolean z = true;
                if (!((Scanner) c1298l.f3346l).hasNext()) {
                    C2434l c2434l = new C2434l(null, new C9173l(arrayList, null, 0, null, 0, false, false, null), false, 1);
                    if (((Set) C5008l.premium(c2434l, C1461l.f3665l).f10245l).isEmpty()) {
                        return c2434l;
                    }
                    throw new C10756l(10);
                }
                String strPurchase = c1298l.purchase();
                if (!(strPurchase.indexOf("#") == 0) && strPurchase.length() != strPurchase.trim().length()) {
                    throw C2584l.yandex(strPurchase, 39, "" + strPurchase.length());
                }
                if (strPurchase.length() != 0) {
                    if (strPurchase.indexOf("#") != 0) {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(new C0657l(strPurchase, null, null, null, false, null, null));
                    }
                }
            }
        } catch (C2584l e) {
            Object obj = c1298l.f3349l;
            throw e;
        }
    }
}
