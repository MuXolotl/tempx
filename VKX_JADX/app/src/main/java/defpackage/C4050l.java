package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4050l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C14567l f8342l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f8343l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f8344l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4050l(C14567l c14567l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f8343l = i;
        this.f8342l = c14567l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        boolean z;
        int i = this.f8343l;
        C14567l c14567l = this.f8342l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                return C6539l.yandex((C6539l) this.f8344l, null, c14567l.amazon.yandex(), null, 5);
            default:
                AbstractC2829l.crashlytics(obj);
                C6539l c6539l = (C6539l) this.f8344l;
                C4288l c4288l = c14567l.billing;
                boolean zPurchase = c14567l.purchase(c6539l);
                Map mapLoadAd = c6539l.crashlytics;
                if (mapLoadAd != null) {
                    if (c4288l.billing) {
                        z = false;
                    } else {
                        ArrayList<C1410l> arrayListBilling = AbstractC2847l.billing(c4288l.yandex);
                        ArrayList arrayList = new ArrayList();
                        for (C1410l c1410l : arrayListBilling) {
                            C15120l c15120l = (C15120l) mapLoadAd.get(c1410l.yandex);
                            C8195l c8195l = c15120l != null ? new C8195l(c1410l, c15120l) : null;
                            if (c8195l != null) {
                                arrayList.add(c8195l);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C8195l c8195l2 = (C8195l) it.next();
                                    C1410l c1410l2 = (C1410l) c8195l2.f17098l;
                                    C15120l c15120l2 = (C15120l) c8195l2.f17097l;
                                    boolean zYandex = AbstractC8576l.yandex(c4288l.yandex(), c1410l2.yandex);
                                    int i2 = c1410l2.loadAd;
                                    if (zYandex) {
                                        if (i2 == c15120l2.yandex && AbstractC8576l.yandex((String) c4288l.amazon.getValue(), c15120l2.loadAd)) {
                                            z = false;
                                        }
                                    } else if (i2 == c15120l2.yandex) {
                                        z = false;
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean zAmazon = c14567l.amazon(c6539l);
                if (z) {
                    mapLoadAd = c4288l.loadAd(C14054l.f27396l);
                } else if (zAmazon) {
                    mapLoadAd = c4288l.loadAd(mapLoadAd);
                }
                C18067l c18067l = z ? null : c6539l.yandex;
                if (!zPurchase && !z) {
                    return zAmazon ? C6539l.yandex(c6539l, null, null, c4288l.loadAd(mapLoadAd), 3) : c6539l;
                }
                C18067l c18067lYandex = c14567l.loadAd.yandex(c18067l);
                C17395l c17395l = c14567l.crashlytics;
                AbstractC10999l.mopub(AbstractC11990l.yandex(c17395l.purchase), null, 0, new C3649l(c17395l, c18067lYandex, null), 3);
                c4288l.billing = true;
                return new C6539l(c18067lYandex, null, mapLoadAd);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f8343l;
        C14567l c14567l = this.f8342l;
        switch (i) {
            case 0:
                C4050l c4050l = new C4050l(c14567l, interfaceC14029l, 0);
                c4050l.f8344l = obj;
                return c4050l;
            default:
                C4050l c4050l2 = new C4050l(c14567l, interfaceC14029l, 1);
                c4050l2.f8344l = obj;
                return c4050l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6539l c6539l = (C6539l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f8343l) {
            case 0:
                break;
        }
        return ((C4050l) ads(interfaceC14029l, c6539l)).Signature(Unit.INSTANCE);
    }
}
