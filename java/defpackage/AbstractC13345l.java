package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lْْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13345l {
    public static final C0909l yandex;

    static {
        C8741l c8741l = C8741l.yandex;
        C12406l c12406l = new C12406l(C8741l.loadAd, AbstractC3974l.billing, 0);
        C3498l c3498lMopub = AbstractC3974l.mopub.yandex.mopub();
        C6430l c6430l = C16412l.purchase;
        C0909l c0909l = new C0909l(c12406l, c3498lMopub, c6430l);
        c0909l.f2578l = 4;
        c0909l.f2581l = AbstractC6004l.purchase;
        List listSingletonList = Collections.singletonList(C16687l.m4192l(c0909l, 2, C3498l.purchase("T"), 0, c6430l));
        if (c0909l.f2582l != null) {
            C1759l.isPro(c0909l.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listSingletonList);
        c0909l.f2582l = arrayList;
        c0909l.f2579l = new C2868l(c0909l, arrayList, c0909l.f2580l, c0909l.f2576l);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C0909l.advert(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C5786l) ((InterfaceC4884l) it.next())).f20715l = c0909l.ad();
        }
        yandex = c0909l;
    }
}
